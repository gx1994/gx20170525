<template>
  <el-dialog title="添加人员信息" v-model="show" top="10%" size="large" >
    <el-form :model="form" :rules="rules" ref="ruleForm" label-width="120px">
      <el-form-item label="员工姓名" prop="name">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="员工性别" prop="sex">
        <el-radio-group v-model="form.sex">
          <el-radio label="男"></el-radio>
          <el-radio label="女"></el-radio>
        </el-radio-group>
      </el-form-item>
      <el-form-item label="员工国籍" prop="citizenship">
        <el-select v-model="form.citizenship" placeholder="请选择员工国籍" >
          <el-option label="日本" value="Japan"></el-option>
          <el-option label="中国" value="China"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="员工生日" prop="birthday">
        <el-date-picker
          v-model="form.birthday"
          type="date"
          placeholder="选择日期"
          :picker-options="pickerOptions0">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="联系电话" prop="telephone">
        <el-input v-model="form.telephone"  type="number"></el-input>
      </el-form-item>
      <el-form-item label="邮箱地址" prop="email">
        <el-input v-model="form.email"></el-input>
      </el-form-item>
      <el-form-item label="所属公司" prop="company">
        <el-select v-model="form.company" placeholder="请选择员工所属公司" >
          <el-option v-for="item in companyoptions"
            :label="item.label"
            :value="item.value">
          </el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="入职时间" prop="entrytime">
        <el-date-picker
          v-model="form.entrytime"
          placeholder="选择日期"
          :picker-options="pickerOptions0">
        </el-date-picker>
      </el-form-item>
        <el-form-item label="所属部门">
          <el-input v-model="form.department"></el-input>
        </el-form-item>
        <el-form-item>
          <el-upload
            action="//jsonplaceholder.typicode.com/posts/"
            :on-preview="handlePreview"
            :on-remove="handleRemove"
            :file-list="fileList">
           <el-button size="small" type="primary">点击上传</el-button>
           <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
         </el-upload>
        </el-form-item>
      </el-form>
    <div slot="footer" class="dialog-footer">
      <el-button @click="display">取 消</el-button>
      <el-button type="primary" @click="createstaff">确 定</el-button>
    </div>
  </el-dialog>
</template>
<script type="text/javascript">
  export default {
    data() {
      return {
        // 表单获取数据
        form: {
          name: '',
          sex: '',
          citizenship: '',
          birthday: '',
          telephone: '',
          email: '',
          company: '',
          entrytime: '',
          fileList: [{
            name: '',
            url: ''
          }]
        },
        // 表单验证规则如下
        // trigger: blur 输完后检验 change： 实时检验
        rules: {
          name: [
            { required: true, message: '请输入姓名', trigger: 'blur' },
            { min: 2, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
          ],
          sex: [
            { required: true, message: '请选择性别', trigger: 'change' }
          ],
          citizenship: [
            { required: true, message: '请选择员工国籍', trigger: 'change' }
          ],
          birthday: [
            { type: 'date', required: true, message: '请选择日期', trigger: 'change' }
          ],
          telephone: [
            { required: true, message: '请输入联系电话', trigger: 'blur' },
            { min: 9, max: 11, message: '请输入正确的电话形式', trigger: 'blur' }
          ],
          email: [
            { required: true, message: '请填写邮件地址', trigger: 'blur' },
            { type: 'email', message: '请输入正确的邮箱地址', trigger: 'blur' }
          ],
          company: [
            { required: true, message: '请填写员工所属公司', trigger: 'blur' }
          ],
          entrytime: [
            { type: 'date', required: true, message: '请选择日期', trigger: 'change' }
          ]
        },
        // 选择日期的范围
        pickerOptions0: {
          disabledDate(time) {
            return time.getTime() > Date.now() - 8.64e7
          }
        },
        // 获取员工公司列表
        // 应该从数据库中获取
        companyoptions: [{
          value: 'haoyunlai',
          label: '好运来'
        }, {
          value: 'haoxianglai',
          label: '好想来'
        }, {
          value: 'laibulai',
          label: '来不来'
        }, {
          value: 'bulia',
          label: '不来'
        }, {
          value: 'nizou',
          label: '你走'
        }]
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
        this.show = false
        this.$emit('display')
        this.$message({
          showClose: true,
          message: '该操作取消成功'
        })
      },
      handleRemove(file, fileList) {
        console.log(file, fileList)
      },
      handlePreview(file) {
        console.log(file)
      },
      createstaff() {
        this.$message({
          showClose: true,
          message: '公司信息保存成功',
          type: 'success'
        })
        console.log('sublime')
        let url = './api/staff/create'
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
