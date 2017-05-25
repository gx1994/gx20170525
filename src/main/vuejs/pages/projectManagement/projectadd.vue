<template>       
    <div class="container">
    <div class="projectcontent">
    <div class="projectTitle"><h2>新增案件管理</h2></div>
    <div class="underline"></div>
    <div class="basicInformation">
    	<projectMincreaseP></projectMincreaseP>
    </div>
    
    </div>
    </div>
</template>
<script type="text/javascript">
  import projectMincreaseP from 'components/projectManagement/projectMincreaseP'
  export default {
    components: {
      projectMincreaseP
    }
  }
</script>
<style type="text/css">
  .projectTitle{
  	margin-top: 5px;
  	margin-left: 5px;
  	float: left;
  	background-color: #4db3ff;
  	color: #ffffff;
  	height: 30px;
  	width: 150px;
  	line-height: 30px;
  }
  .underline{
  	width: 100%;
    height: 40px;
    border-bottom: 1px;
    margin-left: 10px;
    margin-top: 1px;
    margin-bottom: 8px;
    border-style: dashed;
    border-color:rgb(25%,35%,45%) #909090 ;
  }
  .basicInformation{

  }
</style>
