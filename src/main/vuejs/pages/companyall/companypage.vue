<template>
  <div class="container">
    <vcompanyP></vcompanyP>
    <vcompanyS></vcompanyS>
    <vcompany></vcompany>
  </div>
</template>

<script type="text/javascript">
  import vcompanyS from 'components/company/companysearch'
  import vcompanyP from 'components/company/companypath'
  import vcompany from 'components/company/companytable'
  
  export default {
    components: {
      vcompanyS,
      vcompanyP,
      vcompany
    }
  }
</script>
<style type="text/css">
  
</style>
