<!-- 
人员案件管理系统的分页表
1. 表格
2. 页码页数
-->
<template>
<div >
  <div>
    <utable></utable>
  </div>
    <pages></pages> 
</div>
</template>
<script type="text/javascript">
  import utable from 'components/assignment/personalPMtable'
  import pages from 'components/assignment/personalPMpagination'

  export default {
    components: {
      utable,
      pages
    }
  }

</script>
<style type="text/css">
</style>
