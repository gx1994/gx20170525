<template>
  <div class="company">
    <el-table :data="curTableData" height="350" borderstyle="width: 100%" class="companytable">
      <el-table-column prop="buy_from_company_id" label="买方公司编号" width="180">
      </el-table-column>
      <el-table-column prop="sale_to_company_id" label="卖方公司编号" width="180"></el-table-column>
      <el-table-column prop="company_name" label="公司名称"> </el-table-column>
      <el-table-column prop="company_tel" label="公司电话"> </el-table-column>
      <el-table-column prop="project_amount" label="项目个数"> </el-table-column>
      <el-table-column label="操作">
        <template scope="scope">
          <el-button v-on:click="checkpage" type="text" size="small">查看</el-button>
          <el-button v-on:click="updatepage" type="text" size="small">编辑</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentPage1"
      :page-sizes="[10, 20, 50, 100]"
      :page-size="internalPageSize"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total">
    </el-pagination>
  </div>
</template>

<script>
  const ERR_OK = 0
  export default {
    data() {
      return {
        companytable: [],
        internalPageSize: 10, // 每页数据个数
        currentPage: 1        // 当前页数
      }
    },
    methods: {
      checkpage() {
        window.location('#/company/check')
      },
      updatepage() {
        window.location('#/company/update')
      },
      handleSizeChange(val) {           // element 分页自带方法 获取每一页数据数
        this.internalPageSize = val
      },
      handleCurrentChange(val) { // 获取当前页
        this.currentPage = val
      }
    },
    computed: {
      total() {
        return this.companytable.length // 数据总数
      },
      curTableData() {   // 分页
        let from = this.internalPageSize * (this.currentPage - 1)
        let to = from + this.internalPageSize
        return this.companytable.slice(from, to)
      }
    },
    created() {
      let url = '/api/company'
      this.$http.get(url).then((response) => {
        if (response.body.errno === ERR_OK) {
          this.companytable = response.body.data
        }
      }, (response) => {
        console.log('error')
      })
    }
  }
</script>

<style type="text/css">
  .companytable {
    margin-top: 10px;
  }

</style>
