<!-- 
案件管理系统的分页表
1. 表格
2. 页码页数
-->
<template>
<div >
  <div>
    <PMtable></PMtable>
  </div>
    <PMpages></PMpages> 
</div>
</template>
<script type="text/javascript">
  import PMtable from 'components/projectmanagement/projectMtable'
  import PMpages from 'components/projectmanagement/projectMpagination'

  export default {
    components: {
      PMtable,
      PMpages
    }
  }

</script>
<style type="text/css">
</style>
