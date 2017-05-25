<template>
  <div class="staff">        
    <div class="container">
      <breadcrumb>
        <breadcrumbitem>
          <router-link to="/" exact><i class="iconfont icon-homepage"></i> 主页</router-link>
        </breadcrumbitem>
        <breadcrumbitem label="人员信息管理" to="#/components"></breadcrumbitem>
      </breadcrumb>
      <div class="search">
        <div class="searchtitle">
          <i class="iconfont icon-user"></i>
          查找人员管理
        </div>
        <div class="condition">
          <el-form :inline="true" :model="stafftable" class="conditionform">
            <el-form-item label="人员姓名">
              <el-select v-model="stafftable.staffName" placeholder="王五">
                <el-option label="张三" value="shanghai"></el-option>
                <el-option label="李四" value="beijing"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label=" "label-width='50px'>
              <el-input v-model="stafftable.staffId" placeholder="请输入员工姓名或id" icon="search" :on-icon-click="handleIconClick"></el-input>
            </el-form-item>
            <el-form-item　label=" "label-width='50px'>
              <el-button type="primary" @click="onSubmit">查询</el-button>
            </el-form-item>
          </el-form> 
          <el-button type="primary" class="buttonc" @click="dialogFormVisible =!dialogFormVisible"><i class="iconfont icon-addstaff"></i> 添加员工信息</el-button>
          <staffpost :show = "dialogFormVisible" v-on:display="displaydiolog"></staffpost>
        </div>
        <div class="function">
          <ul>
            <li><i class="iconfont icon-print"></i>打印</li>
            <li><i class="iconfont icon-export"></i>导出数据</li>
            <li><i class="iconfont icon-renovate"></i>刷新</li>
          </ul>
        </div>
       
      </div>
      <el-table :data="curTableData" height="350" borderstyle="width: 100%" class="stafftable">
        <el-table-column prop="staffId" label="员工工号" width="180">
        </el-table-column>
        <el-table-column prop="staffName" label="姓名" width="180"></el-table-column>
        <el-table-column prop="staffTel" label="电话"> </el-table-column>
        <el-table-column prop="staffMail" label="邮箱地址"> </el-table-column>
        <el-table-column prop="company" label="所属公司"> </el-table-column>
        <el-table-column label="操作">
          <template scope="scope">
            <el-button @click="handleClick" type="text" size="small">查看</el-button>
            <el-button type="text" size="small">编辑</el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage1"
        :page-sizes="[10, 20, 50, 100]"
        :page-size="internalPageSize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total">
      </el-pagination>
    </div>
  </div>
</template>
<script type="text/javascript">
  import { breadcrumb, breadcrumbitem } from 'components/breadcrumb'
  import staffpost from 'pages/staff/staffpost'
  export default {
    components: {
      breadcrumb,
      breadcrumbitem,
      staffpost
    },
    data() {
      return {
        stafftable: [],
        internalPageSize: 10, // 每页数据个数
        currentPage: 1, // 当前页数
        dialogFormVisible: false
      }
    },
    methods: {
      onSubmit() {
        console.log('submit!')
      },
      handleSizeChange(val) {           // element 分页自带方法 获取每一页数据数
        this.internalPageSize = val
      },
      handleCurrentChange(val) { // 获取当前页
        this.currentPage = val
      },
      displaydiolog() {
        this.dialogFormVisible = false
      }
    },
    computed: {
      total() {
        return this.stafftable.length // 数据总数
      },
      curTableData() {   // 分页
        let from = this.internalPageSize * (this.currentPage - 1)
        let to = from + this.internalPageSize
        return this.stafftable.slice(from, to)
      }
    },
    created() {
      let url = './api/staff/'
      this.$http.get(url).then((response) => {
        this.stafftable = response.data
      }, (response) => {
        console.log('error')
      })
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
  .stafftable {
    margin-top: 10px;
  }
  .create {
    display: inline-block;
    padding: 18px 25px;
    text-align: center;
    text-decoration: none;
    background-color: #20a0ff;
    text-shadow: 1px 1px 1px rgba(255,255,255, .22);
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    border-radius: 50%;
    color: #fff;
    -webkit-box-shadow: 1px 1px 1px rgba(0,0,0, .29), inset 1px 1px 1px rgba(255,255,255, .44);
    -moz-box-shadow: 1px 1px 1px rgba(0,0,0, .29), inset 1px 1px 1px rgba(255,255,255, .44);
    box-shadow: 1px 1px 1px rgba(0,0,0, .29), inset 1px 1px 1px rgba(255,255,255, .44);

    -webkit-transition: all 0.15s ease;
    -moz-transition: all 0.15s ease;
    -o-transition: all 0.15s ease;
    -ms-transition: all 0.15s ease;
    transition: all 0.15s ease;
  }
  .buttonc {
    float: right;
    margin-right: 100px;
    margin-top: -20px;
  }

</style>
