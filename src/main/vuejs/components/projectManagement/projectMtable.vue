<!--
   人员案件管理中分页查询表
-->

<template>
<div class="casetable" >
  <el-table
    :data="tableData"
    border
    height="500"
    class="table"
    style="width: 100%"
    padding-left="0"
    z-index="11">
    <el-table-column
      prop="projrct_id"
      label="编号"
      width="150"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="projectTime"
      label="案件起始时间"
      width="230"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="projectName"
      label="案件名称"
      width="260"
      header-align="center">
    </el-table-column>
    <el-table-column
      prop="comanyB"
      label="买方公司"
      width="210"
      header-align="center">
    </el-table-column>
    <el-table-column
      label="操作"
      width="240"
      header-align="center">
      <template scope="scope">
        <el-button @click="onSubmit" type="success" size="mini" icon="edit">修改</el-button>
        <el-button @click="open2" type="danger" size="mini" icon="delete">删除</el-button>
      </template>
  </el-table-column>
  </el-table>
  </div>
</template>
<style type="text/css">
.casetable{
  padding-top: 15px;
  padding-left: 10px;
}
</style>

<script type="text/javascript">
  export default {
    methods: {
      handleClick() {
        console.log(1)
      },
      open2() {
        this.$confirm('此操作将永久删除该案件信息, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$message({
            type: 'success',
            message: '删除成功!'
          })
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除'
          })
        })
      }
    },

    data() {
      return {
        tableData: [{
          number: '1',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '2',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '3',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '4',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '5',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '6',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }, {
          number: '7',
          projectTime: '2017/3/2-2017/3/4',
          projectName: 'UCL人员外包管理软件项目',
          comanyB: 'A公司'
        }]
      }
    }
  }
</script>
