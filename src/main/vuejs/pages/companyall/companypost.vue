<template>
  <el-dialog title="添加公司信息" v-model="show" top="10%" size="large" >
    <el-form :model="form" :rules="rules" ref="ruleForm" label-width="120px">
      <el-col :span="24">
      <el-form-item label="公司编号" prop="company_id">
        <el-input v-model="form.company_id" placeholder="公司自动生成ID":disabled="true"></el-input>
      </el-form-item>
      </el-col>
      <el-col :span="24">
      <el-form-item label="作为买方公司编号" prop="buy_from_company_id">
        <el-input v-model="form.buy_from_company_id" placeholder="买方公司自动生成ID":disabled="true"></el-input>
      </el-form-item>
      </el-col>
      <el-col :span="24">
      <el-form-item label="作为卖方公司编号" prop="sale_to_company_id">
        <el-input v-model="form.sale_to_company_id" placeholder="卖方公司自动生成ID":disabled="true"></el-input>
      </el-form-item>
      </el-col>
      <el-col :span="24">
      <el-form-item label="添加公司名称" prop="company_name">
        <el-input v-model="form.company_name"></el-input>
      </el-form-item>
      </el-col>
      <el-col :span="24">
      <el-form-item label="添加公司联系电话" prop="company_tel">
        <el-input v-model="form.company_tel"  type="number"></el-input>
      </el-form-item>
      </el-col>
      <el-col :span="24">
      <el-form-item label="添加公司具体地址" prop="company_address">
        <el-input v-model="form.company_address" placeholder="请添加公司具体地址"></el-input>
      </el-form-item>
      </el-col>
      <el-col :span="24">
      <el-form-item label="添加公司邮件地址" prop="company_mail">
        <el-input v-model="form.company_mail" placeholder="请添加公司邮箱地址"></el-input>
      </el-form-item>
      </el-col>
      </el-form>
    <div slot="footer" class="dialog-footer">
      <el-button @click="display">取 消</el-button>
      <el-button type="primary" @click="AddCompany">保存</el-button>
    </div>
  </el-dialog>
</template>
<script type="text/javascript">
  export default {
    data() {
      return {
        // 表单获取数据
        form: {
          company_id: '',
          buy_from_company_id: '',
          sale_to_company_id: '',
          company_name: '',
          company_tel: '',
          company_address: '',
          company_mail: ''
        },
        // 表单验证规则如下
        // trigger: blur 输完后检验 change： 实时检验
        rules: {
          company_name: [
            { required: true, message: '请输入公司名称', trigger: 'blur' },
            { min: 2, max: 10, message: '名称长度在 2 到 10 个字符', trigger: 'blur' }
          ],
          company_tel: [
            { required: true, message: '请输入公司联系电话', trigger: 'blur' },
            { min: 9, max: 11, message: '请输入正确的电话形式', trigger: 'blur' }
          ],
          company_address: [
            { type: 'text', required: true, message: '请选输入公司具体地址', trigger: 'change' }
          ],
          company_mail: [
            { required: true, message: '请填写邮件地址', trigger: 'blur' },
            { type: 'email', message: '请输入正确的邮箱地址', trigger: 'blur' }
          ]
        }
      }
    },
    props: {
      show: {
        type: Boolean,
        default() {
          return false
        }
      }
    },
    methods: {
      display: function () {
        this.$message({
          showClose: true,
          message: '该操作取消成功'
        })
        this.show = false
        this.$emit('display')
      },
      handleRemove(file, fileList) {
        console.log(file, fileList)
      },
      handlePreview(file) {
        console.log(file)
      },
      AddCompany() {
        this.$message({
          showClose: true,
          message: '公司信息保存成功',
          type: 'success'
        })
        console.log('sublime')
        let url = './api/company/add'
        this.$http.post(url, this.form)
        .then((response) => {
          this.$set('form', {})
        }, (response) => {
          console.log('error')
        })
        this.show = false
      }
    }
  }
</script>
<style type="text/css">
  
</style>
