<template>
  <el-table
    :data="tableData4"
    border
    style="width: 99%"
    :default-sort = "{prop: 'date', order: 'descending'}"
    height="550">
    <el-table-column
      fixed
      prop="year"
      label="年份"
      sortable
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      fixed
      prop="month"
      label="月份"
      sortable
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="Bforecast"
      label="売掛预测金额"
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="Sforecast"
      label="買掛预测金额"
      width="120"
      header-align="center">
    </el-table-column>
     <el-table-column label="基本信息" header-align="center" style="color:#000000;">
    <el-table-column
      prop="project_name"
      label="案件名称"
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="acompany_name"
      label="买方公司名称"
      width="300"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="totallmoney"
      label="营业总额"
      width="120"
      header-align="center">
    </el-table-column>
    </el-table-column>
    <el-table-column label="売掛" header-align="center">
    <el-table-column
      prop="Bmonthly"
      label="月額"
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="Bprice"
      label="単価"
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="Btask_time"
      label="工数"
      width="120"
      header-align="center">
    </el-table-column>
    </el-table-column>
    <el-table-column label="買掛" header-align="center">
    <el-table-column
      prop="Smonthly"
      label="月額"
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="Sprice"
      label="単価"
      width="120"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="Stask_time"
      label="工数"
      width="120"
      header-align="center">
    </el-table-column>
    </el-table-column>
    <el-table-column
      fixed="right"
      label="操作"
      width="100"
      header-align="center">
      <template scope="scope">
        <el-button  @click="handleClick"type="success" size="small" icon="edit">修改</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script>
  export default {
    methods: {
      handleClick() {
        console.log(1)
      }
    },
    data() {
      return {
        tableData4: [{
          year: '2015',
          month: '05',
          Bforecast: '10000',
          Sforecast: '20000',
          project_name: '这是一个案件名称',
          acompany_name: '这是一个公司名称',
          totallmoney: '300000',
          Bmonthly: '2',
          Bprice: '10000',
          Btask_time: '3',
          Smonthly: '4',
          Sprice: '22222',
          Stask_time: '1'
        }, {
          year: '2013',
          month: '02',
          Bforecast: '10000',
          Sforecast: '20000',
          project_name: '这是一个案件名称',
          acompany_name: '这是一个公司名称',
          totallmoney: '300000',
          Bmonthly: '2',
          Bprice: '10000',
          Btask_time: '3',
          Smonthly: '4',
          Sprice: '22222',
          Stask_time: '1'
        }, {
          year: '2012',
          month: '11',
          Bforecast: '10000',
          Sforecast: '20000',
          project_name: '这是一个案件名称',
          acompany_name: '这是一个公司名称',
          totallmoney: '300000',
          Bmonthly: '2',
          Bprice: '10000',
          Btask_time: '3',
          Smonthly: '4',
          Sprice: '22222',
          Stask_time: '1'
        }, {
          year: '2019',
          month: '02',
          Bforecast: '10000',
          Sforecast: '20000',
          project_name: '这是一个案件名称',
          acompany_name: '这是一个公司名称',
          totallmoney: '300000',
          Bmonthly: '2',
          Bprice: '10000',
          Btask_time: '3',
          Smonthly: '4',
          Sprice: '22222',
          Stask_time: '1'
        }, {
          year: '2015',
          month: '12',
          Bforecast: '10000',
          Sforecast: '20000',
          project_name: '这是一个案件名称',
          acompany_name: '这是一个公司名称',
          totallmoney: '300000',
          Bmonthly: '2',
          Bprice: '10000',
          Btask_time: '3',
          Smonthly: '4',
          Sprice: '22222',
          Stask_time: '1'
        }, {
          year: '2025',
          month: '05',
          Bforecast: '10000',
          Sforecast: '20000',
          project_name: '这是一个案件名称',
          acompany_name: '这是一个公司名称',
          totallmoney: '300000',
          Bmonthly: '2',
          Bprice: '10000',
          Btask_time: '3',
          Smonthly: '4',
          Sprice: '22222',
          Stask_time: '1'
        }, {
          year: '2003',
          month: '11',
          Bforecast: '10000',
          Sforecast: '20000',
          project_name: '这是一个案件名称',
          acompany_name: '这是一个公司名称',
          totallmoney: '300000',
          Bmonthly: '2',
          Bprice: '10000',
          Btask_time: '3',
          Smonthly: '4',
          Sprice: '22222',
          Stask_time: '1'
        }]
      }
    }
  }
</script>
