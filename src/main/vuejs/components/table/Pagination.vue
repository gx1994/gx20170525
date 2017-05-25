<template>
  <div class="block">
  <el-row :gutter="20">
   <el-col :span="4">
    <!--<span class="demonstration">页数</span>-->
   </el-col>
    <el-col :span="20">
    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentPage2"
      :page-sizes="[50, 150, 250, 300]"
      :page-size="5"
      layout="sizes, prev, pager, next"
      :total="500">
    </el-pagination>
    </el-col>
    </el-row>
  </div>
</template>
<style type="text/css">
.block{
  width: auto;
  margin-left: 10px;
  margin-top: 10px;
  z-index: 10;
}
</style>
<script>
  export default {
    methods: {
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`)
      },
      handleCurrentChange(val) {
        this.currentPage = val
        console.log(`当前页: ${val}`)
      }
    },
    data() {
      return {
        currentPage1: 5,
        currentPage2: 5,
        currentPage3: 5,
        currentPage4: 4
      }
    }
  }
</script>
