<template>
  <div class="company">        
    <div class="container">
      <breadcrumb>
        <breadcrumbitem>
          <router-link to="/" exact><i class="iconfont icon-homepage"></i> 主页</router-link>
        </breadcrumbitem>
        <breadcrumbitem>
          <router-link to="../company" exact>公司信息管理</router-link>
        </breadcrumbitem>
        <breadcrumbitem label="新增公司信息"></breadcrumbitem>
      </breadcrumb>
      <div class="from">
        <el-col :span="15">
          <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
            <el-form-item label="公司名称" prop="company_name">
              <el-input v-model="ruleForm.company_name"></el-input>
            </el-form-item>
            <el-form-item label="买方公司编号" prop="buy_from_company_id">
              <el-input v-model="ruleForm.buy_from_company_id"></el-input>
            </el-form-item>
            <el-form-item label="卖方公司编号" prop="sale_to_company_id">
              <el-input v-model="ruleForm.sale_to_company_id"></el-input>
            </el-form-item>
            <el-form-item label="联系电话" prop="company_tel">
              <el-input v-model="ruleForm.company_tel"></el-input>
            </el-form-item>
            <el-form-item label="邮箱地址" prop="company_email">
              <el-input v-model="ruleForm.company_email"></el-input>
            </el-form-item>
            <el-form-item label="公司地址" prop="company_address">
              <el-input type="textarea" v-model="ruleForm.company_address"></el-input>
            </el-form-item>
            </br></br>
            <el-form-item>
              <el-button type="success" @click="submitForm('ruleForm')"><i class ="iconfont icon - icon-yesdanchuang"></i> 确定</el-button>
              <el-button type="warning" @click="resetForm('ruleForm')"><i class ="iconfont icon - icon-loop"></i> 重置</el-button>
              <el-button type="info" v-on:click="companypage"><i class ="iconfont icon - icon-canceldanchuang"></i> 取消</el-button>
            </el-form-item>
          </el-form>
        </el-col>
      </div>
      
    </div>
  </div>
</template>

<script>
  import { breadcrumb, breadcrumbitem } from 'components/breadcrumb'
  
  export default {
    components: {
      breadcrumb,
      breadcrumbitem
    },
    data() {
      return {
        internalPageSize: 10, // 每页数据个数
        currentPage: 1,        // 当前页数
        ruleForm: {
          company_name: '',
          buy_from_company_id: '',
          sale_to_company_id: '',
          company_tel: '',
          company_email: '',
          company_address: ''
        },
        rules: {
          company_name: [
            { required: true, message: '请输入公司名称', trigger: 'blur' },
            { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
          ],
          company_tel: [
            { required: true, message: '请填写联系电话', trigger: 'blur' }
          ],
          company_email: [
            { required: true, message: '请填写邮箱', trigger: 'blur' }
          ],
          company_address: [
            { required: true, message: '请填写公司地址', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      companypage() {
        window.location('#/company')
      },
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            alert('添加成功!')
            window.location('#/company')
          } else {
            console.log('error submit!!')
            return false
          }
        })
      },
      resetForm(formName) {
        this.$refs[formName].resetFields()
      }
    }
  }
</script>

<style scoped>

</style>
