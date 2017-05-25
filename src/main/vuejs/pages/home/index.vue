<template>
  <div class="container">
    <div class="homeWelcomne">
      <div class="hometitle">
        <i class="iconfont icon-huanying"></i>
      </div>
      <div class="welmessage">
        <h2>{{salutation}}</h2>
        <p>欢迎登录系统</p>
      </div>
    </div>
    <div class="shortcut">
      <div class="hometitle">
        <i class="iconfont icon-kuaisu"></i>
      </div>
      <el-row :key="index" type="flex" class="row-bg" justify="space-around">
        <el-col :span="5" v-for="(item, index) in shortcut" class="shortcutitem">
          <a href="">
            <img :src=item.imgUrl><div>{{item.title}}</div>
          </a>
        </el-col>
      </el-row>
    </div>
  </div>
</template>
<script type="text/javascript">
  import checkproject from 'assets/images/home/checkproject.png'
  import addproject from 'assets//images/home/addproject.png'
  import chart from 'assets/images/home/chart.png'
  import staff from 'assets/images/home/staff.png'
  export default {
    data() {
      return {
        input: '',
        salutation: '',
        shortcut: [
          {
            title: '查看案件',
            imgUrl: checkproject
          },
          {
            title: '添加案件',
            imgUrl: addproject
          },
          {
            title: '查看报表',
            imgUrl: chart
          },
          {
            title: '查看员工信息',
            imgUrl: staff
          }
        ]
      }
    },
    methods: {
      getSalutation: function() {
        let hour = new Date().getHours()
        if (hour < 6) {
          this.salutation = '凌晨好'
        } else if (hour < 9) {
          this.salutation = '早上好'
        } else if (hour < 12) {
          this.salutation = '上午好'
        } else if (hour < 14) {
          this.salutation = '中午好'
        } else if (hour < 17) {
          this.salutation = '下午好'
        } else if (hour < 19) {
          this.salutation = '傍晚好'
        } else if (hour < 22) {
          this.salutation = '晚上好'
        }
      }
    },
    mounted() {
      this.getSalutation()
    }
  }
</script>
<style type="text/css">
  .hometitle {
    width: 100%;
    height: 40px;
    border-bottom: 2px;
    border-style: dashed;
    border-color: blue rgb(25%,35%,45%) #909090 red;
  }
  .hometitle i{
    float: left;
    color: #555;
    line-height: 40px;
    margin-left: 20px;
    font-size: 35px;
  }
  .welmessage {
    height: 150px;
    border-bottom: 2px;
    border-style: dashed;
    border-color: blue rgb(25%,35%,45%) #909090 red;
    border-radius: 50px;
  }
  .welmessage h2 {
    font-weight: 600;
    font: 2em/2.5em Helvetica, 'Hiragino Sans GB', 'Microsoft Yahei', '微软雅黑', Arial, sans-serif;;
  }
  .welmessage p {
    font-size: 1.5em;
  }
  .shortcut .row-bg {
    margin-top: 100px;
  }
  .shortcutitem img {
    width: 100px;
    height: 100px;
  }
</style>
