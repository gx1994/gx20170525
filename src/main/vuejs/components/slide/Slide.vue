<!-- 
左侧边栏
1. 个人中心
2. 日历
3. 天气
-->

<template>
  <div class="leftbar">
    <div class="slidetitle">
      <h2>个人中心</h2></div>
    <div class="persontag"> 
      <div class="avatar">
        <img class="pavatar" src="http://static.galileo.xiaojukeji.com/static/tms/default_header.png" />
      </div>
      <div class="pepdet">
        <p class="pepname">李小雅</p>
        <p>李小雅</p>
        <p>江苏话务一部三组</p>
      </div>
      <div class="clear"></div>
      <button class="enter">进入个人中心</button>
      <button class="signout">退出系统</button>
    </div>

    <div class="slidetitle">
      <h2>日历</h2>
    </div>
    <calendar></calendar>
    <div class="slidetitle">
      <h2>天气</h2>
    </div>
    <weather></weather>
  </div>
</template>
<script type="text/javascript">
  import calendar from 'components/slide/calendar'
  import weather from 'components/slide/weather'

  export default {
    components: {
      calendar,
      weather
    }
  }

</script>
<style type="text/css">
  .leftbar {
    background: none repeat scroll 0 0 #FFFFFF;
    border-right: 1px solid #C8C7C7;
    height: auto !important;
    height:800px;
    float: left;
    min-height: 800px;
    padding:0 10px;
    width: 220px;
  }
  .slidetitle {
    margin-top: 5px; 
    line-height:20px;
    border-bottom:1px dashed #C8C7C7;
  }
  .slidetitle h2 {
    margin: 0;
    margin-top: 5px;
    text-align: left;
    font-size: 14px;
  }
  .persontag {
    padding-bottom: 10px;
  }
  .persontag .avatar {
    float: left;
    width: 70px;
    height: 70px;
    padding: 2px;
    margin-top: 20px;
    background-color: #ececec;
    box-shadow: 0px 0px 1px rgba(0,0,0,0.4);
    -moz-border-radius: 35px;
    -webkit-border-radius: 35px;
    border-radius: 35px; 
  }
  .persontag .pavatar {
    width: 70px;
    height: 70px;
    display: inline-block;
    border-radius: 50%; /* relative value */
    -moz-border-radius: 50%;
    -webkit-border-radius: 50%;
    transition: linear 0.25s;
  }
  .persontag .pepdet {
    float: left;
    padding-left: 25px;
    padding-top: 5px;
    text-align: left;
  }
  .persontag .pepdet p {
    font-size: 12px;
    color: #000;
  }
  .persontag .pepdet .pepname {
    color: #000000;
    font-size: 16px;
    padding-bottom: 10px;
    font-family: "Microsoft YaHei";
  }
  .persontag .clear {
    clear: both;
  }
  
  

</style>
