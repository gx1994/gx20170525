<template>
<div class="searchfrom">
<el-form :inline="true" :model="formInline" class="demo-form-inline" style="margin-top: 10px;" icon="user">
 <el-col :span="3" :xs="5" :sm="6" >
 <i class="iconfont icon-guanjiaowangtubiao01" >按人员查找该人员案件信息</i>
 <div class="line" ></div>
  </el-col></br></br>
  <el-col :span="7" :xs="8" :sm="6" >
  <el-form-item label="员工姓名：">
    <el-select v-model="formInline.staffName" placeholder="请选择" >
      <el-option label="天天" value="tiantian"></el-option>
      <el-option label="猪八戒" value="zhubajie"></el-option>
       <el-option label="沙僧" value="shaseng"></el-option>
    </el-select>
  </el-form-item>
  </el-col>
  <el-col :span="6" :offset="3" :xs="8" :sm="6" >
  <el-form-item label="请输入员工姓名/员工编号">
  <el-input
  placeholder="请输入员工姓名/员工编号"
  icon="search"
  v-model="input1"
  :on-icon-click="handleIconClick"
  style="width: 300px;">
  </el-input>
  </el-form-item>
  </el-col>
   <el-col :span="4" :offset="2" >
  <el-form-item>
    <el-button type="primary" @click="onSubmit" icon="search" style="width: 150px;margin-top:35px;">查询</el-button>
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
</el-form>

</div>
</template>

<script>
  export default {
    data() {
      return {
        formInline: {
          state1: '',
          staffName: '',
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
  height: 130px;
   filter:progid:DXImageTransform.Microsoft.Shadow(color=#C0C0C0,direction=270,strength=4);
  box-shadow:0px 5px 10px  #C0C0C0; 
  border-bottom-right-radius:15px;
  border-bottom-left-radius:15px;
}
</style>
