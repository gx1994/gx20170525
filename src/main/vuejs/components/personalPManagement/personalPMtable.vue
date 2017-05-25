<!--
   人员案件管理中分页查询表
-->

<template>
<div class="casetable" >
  <el-table
    :data="tableData"
    border
    height="300"
    class="table"
    style="width: 100%"
    padding-left="0"
    z-index="11">
    <el-table-column
      prop="number"
      label="编号"
      width="150"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="name"
      label="员工姓名"
      width="250"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="projectName1"
      label="最近一个月内的项目名称"
      width="392"
      header-align="center">
    </el-table-column>
    <el-table-column
      label="操作"
      width="316"
      header-align="center">
      <template scope="scope">
        <el-button @click="handleClick" type="info" size="small" icon="search">案件查看/案件月营业额预测</el-button>
      </template>
    </el-table-column>
  </el-table>
  </div>
</template>
<style type="text/css">
.casetable{
  padding-top: 15px;
  padding-left: 10px;
}
</style>

<script type="text/javascript">
  export default {
    methods: {
      handleClick() {
        console.log(1)
      }
    },

    data() {
      return {
        tableData: [{
          number: '1',
          name: '王小虎',
          projectName1: 'UCL人员外包管理软件项目'
        }, {
          number: '2',
          name: '王大花',
          projectName1: '日立项目'
        }, {
          number: '3',
          name: '王小虎',
          projectName1: 'UCL人员外包管理软件项目'
        }, {
          number: '3',
          name: '王小虎',
          projectName1: 'UCL人员外包管理软件项目'
        }, {
          number: '3',
          name: '王小虎',
          projectName1: 'UCL人员外包管理软件项目'
        }, {
          number: '3',
          name: '王小虎',
          projectName1: 'UCL人员外包管理软件项目'
        }, {
          number: '4',
          name: '王小虎',
          projectName1: 'UCL人员外包管理软件项目'
        }]
      }
    }
  }
</script>
