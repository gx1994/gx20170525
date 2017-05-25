<template>
  <li>
    <a v-if="!hasSlot" :href="to">{{ label }}</a>
    <slot></slot>
  </li>
</template>
<script>
export default {
  props: {
    label: {
      type: String
    },
    to: {
      type: String,
      default: ''
    }
  },
  computed: {
    hasSlot() {
      if (this.isEmpty(this.$slots)) return false
      return true
    }
  },
  methods: {
    isEmpty (obj) {
      if (obj === null) return true
      if (obj.length > 0) return false
      if (obj.length === 0) return true
      if (typeof obj !== 'object') return true
      let flag = true
      Object.keys(obj).every((key) => {
        if (Object.prototype.hasOwnProperty.call(obj, key)) {
          flag = false
          return false
        }
        return true
      })
      return flag
    }
  },
  mounted() {
    const index = this.$parent.$items.indexOf(this)
    const itemsNum = this.$parent.$items.length
    if (itemsNum !== index + 1) {
      this.separator = this.$parent.separator
    }
  }
}
</script>

