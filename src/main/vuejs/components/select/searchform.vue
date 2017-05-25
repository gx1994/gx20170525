<template>
  <div class="box">
    <div class="casetitle"></div>
    <div class="searchform">
    <el-form :inline="true" :model="formInline" class="demo-form-inline">
    <el-row :gutter="20">
  <el-col :span="8">
  <div class="grid-content bg-purple">
      <el-form-item label="员工姓名">
      <el-select v-model="formInline.region" placeholder="员工姓名">
      <el-option label="天天" value="tiantian"></el-option>
      <el-option label="猪八戒" value="zhubajie"></el-option>
      <el-option label="孙悟空" value="sunwukong"></el-option>
      </el-select>
      </el-form-item>
  </div>
  </el-col>
  <el-col :span="9">
  <div class="grid-content bg-purple-light">
      <el-form-item label="输入员工工号/员工姓名">
      <el-input v-model="formInline.user" placeholder="员工工号/员工姓名"></el-input>
      </el-form-item>
  </div>
  </el-col>
  <el-col :span="7">
  <div class="grid-content bg-purple">
      <el-form-item>
      <el-button type="primary" @click="onSubmit" size="small" icon="search">查询</el-button>
      </el-form-item>
  </div>
  </el-col>
  </el-row>
 </el-form>
    </div>
    <div class="print">
      
    </div>
  </div>
</template>
<script type="text/javascript">
</script>
<style type="text/css">
.searchform{
  margin-top: 10px;
  margin-left: 10px;
  float: left;
  width: 100%;
}
.searchform el-button{
  float: right;
  margin-right: 100px;
}
.box
{
　　width:200px;
　　height:200px;
　　background:#09F;
　　-moz-border-radius:8px;/*8px是圆角的角度，值越大则圆角效果越明显，如果修改此项，请修改以下两项的值，使之相同*/
　　-webkit-border-radius:8px;
　　border-radius: 8px;
}
</style>
<script>
  export default {
    data() {
      return {
        formInline: {
          user: '',
          region: ''
        }
      }
    },
    methods: {
      onSubmit() {
        console.log('submit!')
      }
    }
  }
</script>
