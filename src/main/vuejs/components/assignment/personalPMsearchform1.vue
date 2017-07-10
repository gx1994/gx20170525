<template>
<div >
<el-form :inline="true" :model="formInline" class="demo-form-inline" style="margin-top: 10px;" icon="user">
 <el-col :span="3" :xs="5" :sm="6" >
 <i class="iconfont icon-guanjiaowangtubiao01" style="float:left;margin-left:15px;margin-top:5px;background:#4db3ff;font-size:20px;color:#ffffff;" >预测金额录入</i>

  </el-col></br></br>
  <el-col :span="4">
  <el-form-item label="年份：">
    <el-select v-model="formInline.projectYear" placeholder="请选择" >
      <el-option label="2018年" value="2018年"></el-option>
      <el-option label="2017年" value="2017年"></el-option>
      <el-option label="2016年" value="2016年"></el-option>
      <el-option label="2015年" value="2015年"></el-option>
    </el-select>
  </el-form-item>
  </el-col>
  <el-col :span="4">
  <el-form-item label="月份：">
    <el-select v-model="formInline.projectMonth" placeholder="请选择" >
      <el-option label="1月" value="1月"></el-option>
      <el-option label="2月" value="2月"></el-option>
      <el-option label="3月" value="3月"></el-option>
      <el-option label="4月" value="4月"></el-option>
      <el-option label="5月" value="5月"></el-option>
      <el-option label="6月" value="6月"></el-option>
    </el-select>
  </el-form-item>
  </el-col>
  <el-col :span="5" >
  <el-form-item label="売掛预测金额：">
  <el-input
  placeholder="売掛预测金额"
  icon="edit"
  v-model="input1"
  :on-icon-click="handleIconClick"
  >
  </el-input>
  </el-form-item >
  </el-col>
   <el-col :span="5">
  <el-form-item label="買掛预测金额：">
  <el-input
  placeholder="買掛预测金额"
  icon="edit"
  v-model="input1"
  :on-icon-click="handleIconClick"
  >
  </el-input>
  </el-form-item>
  </el-col>
   <el-col :span="5" >
  <el-form-item>
    <el-button type="primary" @click="onSubmit" icon="plus" style="width: 220px;margin-top:35px;">录入数据</el-button>
  </el-form-item>
  </el-col>
  <el-col :span="23">
  <div class="line1" ></div>
  </el-col>
   <el-col :span="3" >
   <h2 style="float:left;font-size:18px;margin-left:15px;background:#4db3ff;color:#ffffff;">个人详细情况</h2> 
   </el-col>
   <el-col :span="3"style="float:right;" >
   <i class="iconfont icon-guanjiaowangtubiao01">打印</i> 
   </el-col>
    <el-col :span="4" style="float:right;">
   <i class="iconfont icon-guanjiaowangtubiao01">导出数据</i> 
   </el-col>
</el-form>

</div>
</template>

<script>
  export default {
    data() {
      return {
        formInline: {
          projectYear: '',
          projectMonth: ''
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
</style>
