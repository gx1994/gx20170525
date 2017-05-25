<template>
  <div class="home">
    <div class="container">
    <vselect></vselect>
    <vtable></vtable>
    </div>
  </div>
</template>

<script type="text/javascript">
  import vtable from 'components/table/casepage'
  import vselect from 'components/select/searchform'
  
  export default {
    components: {
      vtable,
      vselect
    }
  }
</script>
<style type="text/css">
  
</style>
