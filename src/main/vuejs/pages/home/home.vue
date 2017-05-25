<template>
  <div class="home">
    <vheader></vheader>
    <vslide></vslide>        
    <router-view></router-view>
    <vfooter></vfooter>
  </div>
</template>

<script type="text/javascript">
  import vslide from 'components/slide/Slide'
  import vheader from 'components/header/header'
  import vfooter from 'components/footer/footer'
  export default {
    components: {
      vslide,
      vheader,
      vfooter
    }
  }
</script>
