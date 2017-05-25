<template>
	<div class="from">
    <el-col :span="15">
      <el-form :model="ruleForm" :ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="公司名称" prop="name">
          <el-input v-model="ruleForm.name" :readonly="true"></el-input>
        </el-form-item>
        <el-form-item label="买方公司编号" prop="buyerid">
          <el-input v-model="ruleForm.buyerid" :readonly="true"></el-input>
        </el-form-item>
        <el-form-item label="卖方公司编号" prop="sellerid">
          <el-input v-model="ruleForm.sellererid" :readonly="true"></el-input>
        </el-form-item>
        <el-form-item label="联系电话" prop="tel">
          <el-input v-model="ruleForm.tel" :readonly="true"></el-input>
        </el-form-item>
        <el-form-item label="邮箱地址" prop="email">
          <el-input v-model="ruleForm.email" :readonly="true"></el-input>
        </el-form-item>
        <el-form-item label="公司地址" prop="address">
          <el-input type="textarea" v-model="ruleForm.address" :readonly="true"></el-input>
        </el-form-item>
        </br></br>
        <el-form-item>
          <el-button type="success" v-on:click="updatepage"><i class ="iconfont icon - icon-adit"></i> 修改</el-button>
          <el-button type="danger" @click="deleteForm('ruleForm')"><i class ="iconfont icon - icon-delete"></i> 删除</el-button>
          <el-button type="info" v-on:click="companypage"><i class ="iconfont icon - icon-return"></i> 返回</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        ruleForm: {
          name: '',
          buyerid: '',
          sellerid: '',
          tel: '',
          email: '',
          address: ''
        }
      }
    },
    methods: {
      companypage() {
        window.location('#/company')
      },
      updatepage() {
        window.location('#/company/update')
      },
      resetForm(formName) {
        this.$refs[formName].resetFields()
      },
      deleteForm(formName) {
        this.$confirm('此操作将永久删除该文件, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$message({
            type: 'success',
            message: '删除成功!'
          })
          window.location('#/company')
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除'
          })
        })
      }
    }
  }
</script>

<style scoped>

</style>
