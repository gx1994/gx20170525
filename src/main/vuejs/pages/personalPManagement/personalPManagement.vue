<template>
  <div class="home">
    <div class="container">
     <vsearchform></vsearchform>
    <vcasepage></vcasepage>
    </div>
  </div>
</template>

<script type="text/javascript">
  import vcasepage from 'components/personalPManagement/personalPMpage'
  import vsearchform from 'components/personalPManagement/personalPMsearchform'
  
  export default {
    components: {
      vcasepage,
      vsearchform
    }
  }
</script>
<style type="text/css">
  
</style>
