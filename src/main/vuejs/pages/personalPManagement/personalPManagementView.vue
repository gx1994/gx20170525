<template>
  <div class="home">
    <div class="container">
     <div class="bar">
     <el-row>
     <el-col :span="5" :pull="1"><div class="staffNumber">员工编号：110</div></el-col>
     <el-col :span="5"><div class="staffName">员工姓名：天天</div></el-col>
     </el-row>
     </div>
     <div class="line2" ></div>
     <div class="content">
     	<vsearchform1></vsearchform1>
     	<div class="line4" ></div>
        <vtable1></vtable1>
     </div>
     <div class="line3" ></div>
    </div>
  </div>
</template>

<script type="text/javascript">
  import vsearchform1 from 'components/personalPManagement/personalPMsearchform1'
  import vtable1 from 'components/personalPManagement/personalPMtable1'
  export default {
    components: {
      vsearchform1,
      vtable1
    }
  }
</script>
<style type="text/css">
  .staffNumber{
    margin-top: 15px;
 }
  .staffName{
    margin-top: 15px;
 }
  .line2 {
  width: 99%;
    height: 0px;
    border-bottom: 1px;
    margin-left: 10px;
    margin-top: 10px;
    border-style: dashed;
    border-color:rgb(25%,35%,45%) #909090 ;
}
 .bar{
	height: 50px;
    filter:progid:DXImageTransform.Microsoft.Shadow(color=#C0C0C0,direction=270,strength=4);
    box-shadow:0px 2px 5px  #C0C0C0; 
    border-radius:15px;
}
  .content{
  	height:700px;
  	z-index: 10;
  	background:rgba(230, 230, 250,0.5);
    filter:progid:DXImageTransform.Microsoft.Shadow(color=#C0C0C0,direction=180,strength=4);
    box-shadow:0px 0px 10px  #C0C0C0; 
    border-radius:15px;
    margin-top: 10px;
  }
  .content1 {
  	padding-top: 5px;
  	float: left;
  	margin-left: 19px;
  }
</style>
