<template>
  <div id="vcom-calendar" class="vcom-calendar">
    <div class="caheader">
      <div class="cahead">
        {{ year }} - {{ month }} - {{ currentDay }}
      </div>
      <div class="weeks">
        <span v-for="week in weeks" class="week">
          {{ week }}
        </span>
      </div>
    </div>
    <div class="days">
      <span class="day" v-for="day in days" track-by="$index">
          <span v-if="day.isToday" class="today" :data-month=" day.year - day.month - day.day ">
            {{ day.day }}
          </span>
          <span v-if="day.isPreMonth || day.isNextMonth" class="not-this-month" :data-month=" day.year - day.month- day.day">
            {{ day.day }}
          </span>
          <span v-if="day.isThisMonthDay && !day.isToday" class="this-month-day" :data-month="day.year - day.month - day.day">
            {{ day.day }}
          </span>
      </span>
    </div>
    </div>
</template>
<style scoped>
  .vcom-calendar {
    width: 200px;
    height: auto;
    margin-top: 5px;
    overflow: hidden;
    -webkit-border-radius: 10px;
    border-radius: 10px;
    -webkit-box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2);
    box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2);
  }
  .vcom-calendar .caheader {
    width: 100%;
    background-color: #2ecc71;
  }
  .vcom-calendar .cahead {
    text-align: center;
    font-size: 15px;
    padding: 5px 0;
    color: #ffffff;
    letter-spacing: 1px;

    text-shadow: 1px 1px 1px rgba(0, 0, 0, .1);
  }
  .vcom-calendar .weeks {
    display: block;
    width: 100%;
    overflow: auto;
    padding: 5px 0;
    text-align: center;
    font-size: 13px;
  }
  .vcom-calendar .weeks .week {
    width: 14.28571%;
    display: block;
    color: #ffffff;
    float: left;
    font-size: 13px;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
  }
  .vcom-calendar .days {
    width: 100%;
    height: auto;
    overflow: auto;

    background-color: #ffffff;

    position: relative;
  }
  .vcom-calendar .days .day span{
    width: 28.54px;
    display: block;
    float: left;
    height: 20px;
    font-size: 12px;
    text-align: center;
    line-height: 20px;
    color: #333333;
    background-color: #fefefe;
    font-weight: bold;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    border-right: 1px solid #f0f0f0;
    border-bottom: 1px solid #f0f0f0;
  }
  .vcom-calendar .days .day .this-month-day:hover{
    background-color: #e1e1e1;
    cursor: pointer;
    color: #ffffff;
  }
  .vcom-calendar .days .day .today {
    border-bottom: 3px solid #2ecc71;
    color: #2ecc71;
  }
  .vcom-calendar .days .day .not-this-month {
    background-color: #f9f9f9;
    color: #999999;
  }

  .vcom-calendar .input-group {
    background-color: #f9f9f9;

    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
  }

  .vcom-calendar .input-group select {

  }
</style>
<script>
// 可以调整日历矩阵大小
  const MATRIX_MAX = 7 * 6
  const WEEKS = ['日', '一', '二', '三', '四', '五', '六']

  let bMonthRe = /^1?$|3|5|7|8|10|12/

  export default {
    data () {
      return {
        'time': new Date(),
        'weeks': WEEKS
      }
    },

    computed: {
      isRunYear () {
        return ((this.year % 4 === 0) && (this.year % 100 !== 0))
      },

      selectYears () {
        return this._getRangeList(2099, 1900)
      },

      selectMonths () {
        return this._getRangeList(12)
      },

      dayData () {
        return [
          this.year,
          this.month,
          this.currentDay
        ].join('-')
      },

      firstDayWeek () {
        return new Date(
          this.year
          , this.month - 1
          , 1
        )
        .getDay()
      },

      year () {
        return this.time.getFullYear()
      },

      month () {
        return this.time.getMonth() + 1
      },

      days () {
        return this.getDaysList()
      },

      currentDay () {
        return this.time.getDate()
      }
    },

    events: {

    },

    methods: {
      _getPreMonthDays (month, offset) {
        if (offset === 0) {
          return []
        } else if (month === 1) {
          return this.getDays(12).slice(-offset)
        } else {
          return this.getDays(month - 1).slice(-offset)
        }
      },

      _getNextMonthDays (month, offset) {
        if (month === 12) {
          return this.getDays(1).slice(0, offset)
        } else {
          return this.getDays(month + 1).slice(0, offset)
        }
      },

      _getRangeList (range, start) {
        var i = start || 1
        var _list = []
        for (;i <= range; i++) {
          _list.push(i)
        }
        return _list
      },
      getDays (month) {
        if (bMonthRe.test(month)) {
          return this._getRangeList(31)
        } else if (month === 2) {
          if (this.isRunYear) {
            return this._getRangeList(29)
          } else {
            return this._getRangeList(28)
          }
        } else {
          return this._getRangeList(30)
        }
      },
      getDaysList () {
        let _needConcatLength = this.getDays(this.month).length + this.firstDayWeek
        // debugger;
        let _initList = this._getPreMonthDays(this.month, this.firstDayWeek)
            .map((preMonthday) => {
              return {
                'year': this.month === 1 ? this.year - 1 : this.year,
                'month': this.month === 1 ? 12 : this.month - 1,
                'day': preMonthday,
                'isPreMonth': true
              }
            })

        if (MATRIX_MAX <= _needConcatLength) {
          // 如果日历矩阵长度小于_needConcatLength
          let _thisMonthDaysList = this.getDays(this.month).slice(
            0
            , this.getDays(this.month).length - (_needConcatLength - MATRIX_MAX)
          )
          return _initList
            .concat(_thisMonthDaysList.map((day) => {
              let _dateObj = {
                'year': this.year,
                'month': this.month,
                'isThisMonthDay': true,
                'day': day
              }
              if (day === this.currentDay) {
                _dateObj.isToday = true
              }
              return _dateObj
            }))
        } else {
          return _initList
          .concat(this.getDays(this.month).map((day) => {
            let _dateObj = {
              'year': this.year,
              'month': this.month,
              'isThisMonthDay': true,
              'day': day
            }
            if (day === this.currentDay) {
              _dateObj.isToday = true
            }
            return _dateObj
          }))
          .concat(
            this._getNextMonthDays(
              this.month
              , MATRIX_MAX - _needConcatLength
            ).map((nextMonthDay) => {
              return {
                'year': this.month === 12 ? this.year + 1 : this.year,
                'month': this.month === 12 ? 1 : this.month + 1,
                'day': nextMonthDay,
                'isNextMonth': true
              }
            })
          )
        }
      }
    }
  }
</script>
