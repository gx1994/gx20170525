<template>
  <div>
    <breadcrumb>
        <breadcrumbitem>
          <router-link to="/" exact><i class="iconfont icon-homepage"></i> 主页</router-link>
        </breadcrumbitem>
        <breadcrumbitem label="公司信息管理" ></breadcrumbitem>
      </breadcrumb>
  </div>
</template>

<script type="text/javascript">
  import { breadcrumb, breadcrumbitem } from 'components/breadcrumb'
  export default {
    components: {
      breadcrumb,
      breadcrumbitem
    }
  }
</script>

<style type="text/css">

</style>
