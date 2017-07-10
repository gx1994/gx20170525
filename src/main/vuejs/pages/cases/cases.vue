<template>
  <div class="home">
    <div class="container">
     <PMsearchform></PMsearchform>
     <Pcasepage></Pcasepage>
    </div>
  </div>
</template>

<script type="text/javascript">
  import PMsearchform from 'components/cases/projectMsearchform'
  import Pcasepage from 'components/cases/projectMpage'
  export default {
    components: {
      PMsearchform,
      Pcasepage
    }
  }
</script>
<style type="text/css">
  
</style>
