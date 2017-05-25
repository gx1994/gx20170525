<template>
  <div class="search">
    <div class="searchtitle">
      <i class="iconfont icon-user"></i>
      查找公司信息
    </div>
    <div class="condition">
      <el-form :inline="true" :model="companytable" class="conditionform">
        <el-form-item label="公司名称">
          <el-select v-model="value" clearable placeholder="请选择">
            <el-option label="上海" value="shanghai"></el-option>
            <el-option label="北京" value="beijing"></el-option>
            <el-option
              v-for="item in options"
              :label="item.label"
              :value="item.value">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label=" "label-width='50px'>
          <el-input v-model="companytable.input" placeholder="公司名称/公司编号" style="width: 300px;" type="text"></el-input>
        </el-form-item>
        <el-form-item　label=" "label-width='10px'>
          <el-button type="primary" @click="onSubmit"><i class ="iconfont icon - icon-search"></i> 查询</el-button>
        </el-form-item>
        <el-form-item　label=" "label-width='50px'>
          <el-button type="primary" v-on:click="addpage">
          <i class ="iconfont icon - icon-add"></i> 添加新公司信息</el-button>
        </el-form-item>
      </el-form>  
    </div>
    <div class="function">
      <ul>
        <li>
          <i class="iconfont icon-print"></i>
          打印
        </li>
        <li>
          <i class="iconfont icon-export"></i>
          导出数据
        </li>
        <li>
          <i class="iconfont icon-renovate"></i>
          刷新
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        input: '',
        companytable: [],
        options: [{
          value: '选项1',
          label: '黄金糕'
        }, {
          value: '选项2',
          label: '双皮奶'
        }, {
          value: '选项3',
          label: '蚵仔煎'
        }, {
          value: '选项4',
          label: '龙须面'
        }, {
          value: '选项5',
          label: '北京烤鸭'
        }],
        value: ''
      }
    },
    methods: {
      onSubmit() {
        console.log('submit!')
      },
      addpage() {
        window.location('#/company/add')
      }
    }
}
</script>

<style scoped>
  .search {
    text-align: left;
    height: 100px;
    -webkit-border-radius: 20px;
    border-radius: 20px;
    -webkit-box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2);
    box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2);
    margin-top: 5px;
    padding: 10px 10px 15px 15px;
  }
  .search .searchtitle {
    display: block;
    height: 15px;
    border-bottom: 1px dashed #C8C7C7;
    line-height: 15px;
    font-size: 1.1em;
    padding-bottom: 5px;
  }
  .search .condition {
    border-top: 1px dashed #C8C7C7;
    padding-top: 10px;
    margin-top: 2px;
    margin-bottom: 2px;
    padding-left: 5px;
  }
  .search .conditionform {
    height: 45px;
  }
  .function li {
    padding-top: 5px;
    display: inline-block;
    margin-right: 30px;
  }
  .function li i {
    font-size: 1.5em;
  }
  .function li:first-child {
    padding-left: 20px;
  }
</style>
