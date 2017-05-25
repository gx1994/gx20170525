<template>
  <ul class="breadcrumb">
    <slot></slot>
  </ul>
</template>
<script>
export default {
  computed: {
    $items() {
      return this.$children
    }
  }
}
</script>
