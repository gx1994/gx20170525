<template>
<div class="weather">
  <div class="weather-body">
    <div class="weather-title">{{location}}</div>
    <div class="weather-data">
      <div class="weather-du">{{temp}}<sup>c</sup></div>
      <div class="weather-img tq" v-bind:class="icon"></div>
    </div>
  </div>
  <div class="weather-forecast" v-for="item in forecastWeather">
    <div class="weather-cell">
      <div class="weather-bd">{{item.data}}</div>
        <div class="weather-hd" v-bind:class="item.icon"></div>
      <div class="weather-ft">{{item.temp_max}} / {{item.temp_min}}</div>
    </div>
  </div>
</div>
</template>

<script type="text/ecmascript-6">
  export default {
    data() {
      return {
        location: '东京涩谷',      // 位置描述
        currentweather: null, // 当前天气返回信息
        temp: null,         // 当前天气的温度
        icon: null,        // 天气图标
        description: null, // 天气描述
        weatherInfo: null,
        forecastWeather: null  // 预测天气信息
      }
    },
    methods: {
      tempconversion(fahrenheit) { // 华氏温度转换为摄氏度
        let celsiustemp = 0
        celsiustemp = Math.ceil(fahrenheit - 273.15)
        return celsiustemp
      },
      operationData(list) {
        let weatherList = []
        let weather = []
        let start = 10
        let wlist = []
        let data = null
        let tempMin = null
        let tempMax = null
        let icon = null// 次日12:00为准
        for (; start < list.length; start = start + 9) {
          wlist = list[start]
          data = wlist.dt_txt.slice(5, 10)
          tempMin = this.tempconversion(wlist.main.temp_min)
          tempMax = this.tempconversion(wlist.main.temp_max)
          icon = 't' + wlist.weather[0].icon.slice(0, 2) + 'd'
          weather = {
            'data': data,
            'icon': icon,
            'temp_min': tempMin,
            'temp_max': tempMax
          }
          weatherList.push(weather)
        }
        return weatherList
      },
      loadCurrentWeather() {
        let currenttemp = 0
        let furl = 'http://api.openweathermap.org/data/2.5/weather?q=Tokyo,jp&mode=json&lang=ucl&appid=c55c9b9ae9e4afbedd6dc24e07d8828f'
        this.$http.get(furl).then((response) => {
          this.currentweather = response.data
          currenttemp = this.currentweather.main.temp
          this.temp = this.tempconversion(currenttemp)
          this.icon = 't' + this.currentweather.weather[0].icon
        }, (response) => {
          console.log('error')
        })
      },
      loadForecastWeather() {
        let curl = 'http://api.openweathermap.org/data/2.5/forecast?q=Tokyo,jp&mode=json&lang=ucl&appid=c55c9b9ae9e4afbedd6dc24e07d8828f'
        this.$http.get(curl).then((response) => {
          this.weatherInfo = response.data
          this.forecastWeather = this.operationData(this.weatherInfo.list)
        }, (response) => {
          console.log('error')
        })
      }
    },
    mounted() {
      this.loadCurrentWeather()
      this.loadForecastWeather()
    }
  }

</script>
<style scoped>
  .weather {
    width: 200px;
    height: auto;
    margin-top: 5px;
    overflow: hidden;
    -webkit-border-radius: 10px;
    border-radius: 10px;
    -webkit-box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2);
    box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2);
  }
  .weather-body {
    height: 130px;
    border-bottom:1px dashed #C8C7C7;
  }
  .weather-body .weather-title {
    width: 200px; 
    height: 20px;
    background-color: #a5caf7; /* title 颜色*/ 
    text-align: center;
    font-size: 16px;
    padding: 5px 0;
    color: #ffffff;
    letter-spacing: 1px;
    text-shadow: 1px 1px 1px rgba(0, 0, 0, .1);
  }
  .weather-body .weather-du {
    float: left;
    width: 90px;
    height: 90px;
    font-weight: 600;
    text-align: center;
    color: #828081;
    font:normal bold 40px/90px arial,sans-serif;
  }
  .weather-body .weather-img {
    float: left;
    border-radius: 50%;
    background-position: center center;
    background-size: 50% 50%;
    background-color: rgba(100, 100, 100, 0.1);
    width: 90px;
    height: 90px;
    margin: 5px 10px 0 10px;
    overflow: hidden;
  }
  .weather-cell {
    height: 25px;
    margin: 5px;
    font-size: 12px;
    line-height: 25px;
    border-bottom: 1px dashed #00a3cf; 
  }
  .weather-bd, .weather-hd,.weather-ft{
    float: left;
    display: flex;
    display: -webkit-flex;
  }
  .weather-ft{
    float: right;
  }
  .weather-hd {
    margin-left: 30px;
  }
  .weather-hd {
    background-color: rgba(100, 100, 100, 0.1);
    background-position: center center;
    width: 1.5rem !important;
    height: 1.5rem;
    display: flex;
    display: -webkit-flex;
    justify-content: center;
    align-items: center;
    border-radius: 4px;
  }
</style>
