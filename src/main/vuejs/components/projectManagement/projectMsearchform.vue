<template>
<div class="searchfrom">
<el-form :inline="true" :model="formInline" class="demo-form-inline" style="margin-top: 10px;" icon="user">
 <el-col :span="1" :xs="5" :sm="6" >
 <i class="iconfont icon-guanjiaowangtubiao01" >按条件查找案件信息</i>
 <div class="line" ></div>
  </el-col></br></br>
  <el-col :span="6">
  <el-form-item label="案件名称：">
    <el-select v-model="formInline.projectName" placeholder="请选择" >
      <el-option label="A案件" value="A案件"></el-option>
      <el-option label="B案件" value="B案件"></el-option>
       <el-option label="C案件" value="C案件"></el-option>
    </el-select>
  </el-form-item>
  </el-col>
  <el-col :span="6">
  <el-form-item label="案件所属公司：">
    <el-select v-model="formInline.BcampanyName" placeholder="请选择" >
      <el-option label="A公司" value="A公司"></el-option>
      <el-option label="B公司" value="B公司"></el-option>
       <el-option label="C公司" value="C公司"></el-option>
    </el-select>
  </el-form-item>
  </el-col>

<el-col :span="6">
  <el-form-item label="案件起始时间：">
    <el-date-picker
      v-model="value6"
      type="daterange"
      placeholder="选择日期范围">
    </el-date-picker>
   </el-form-item>
  </el-col>

  <el-col :span="4" :offset="1">
  <el-form-item>
    <el-button type="primary" @click="onSubmit" icon="search" style="width: 150px;margin-top: 35px;">查询</el-button>
  </el-form-item>
  </el-col>

   
  <el-col :span="23">
  <div class="line1" ></div>
  </el-col>
   <el-col :span="2" >
   <i class="iconfont icon-guanjiaowangtubiao01">打印</i> 
   </el-col>
    <el-col :span="2">
   <i class="iconfont icon-guanjiaowangtubiao01">导出数据</i> 
   </el-col>
    <el-col :span="2">
   <i class="iconfont icon-guanjiaowangtubiao01">刷新</i> 
   </el-col>
    <el-col :span="16" >
   <i class="iconfont icon-guanjiaowangtubiao01" style="float:right"><router-link to="/projectmanagement/projectadd">新增案件信息</router-link></i> 
   </el-col>
</el-form>

</div>
</template>

<script>
  export default {
    data() {
      return {
        formInline: {
          state1: '',
          projectName: '',
          BcampanyName: '',
          input1: ''
        }
      }
    },
    methods: {
      handleIconClick(ev) {
        console.log(ev)
      },
      onSubmit() {
        console.log('submit!')
      },
      handleSelect(item) {
        console.log(item)
      }
    }
  }
</script>

<style type="text/css">
.line{
  width: 100%;
    height: 0px;
    border-bottom: 1px;
    margin-left: 10px;
    margin-top: 5px;
    border-style: dashed;
    border-color:rgb(25%,35%,45%) #909090 ;
}
 .line1{
    width: 100%;
    height: 0px;
    border-bottom: 1px;
    margin-left: 10px;
    margin-top: 1px;
    margin-bottom: 8px;
    border-style: dashed;
    border-color:rgb(25%,35%,45%) #909090 ;
 }
 .searchfrom{
  height: 160px;
   filter:progid:DXImageTransform.Microsoft.Shadow(color=#C0C0C0,direction=270,strength=4);
  box-shadow:0px 5px 10px  #C0C0C0; 
  border-bottom-right-radius:15px;
  border-bottom-left-radius:15px;
}
</style>
