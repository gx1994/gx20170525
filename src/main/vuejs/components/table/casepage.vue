<!-- 
人员案件管理系统的分页表
1. 表格
2. 页码页数
-->
<template>
<div class="page">
  <div class="utable">
    <utable></utable>
  </div>
  <div class="pages">
    <pages></pages>
    </div>
</div>
</template>
<script type="text/javascript">
  import utable from 'components/table/case_table'
  import pages from 'components/table/Pagination'

  export default {
    components: {
      utable,
      pages
    }
  }

</script>
<style type="text/css">
  .page{
  width: 100%;
  
  }

</style>
