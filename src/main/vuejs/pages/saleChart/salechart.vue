<template>
  <div class="salechart">
    <div class="container">
      <breadcrumb>
        <breadcrumbitem>
          <router-link to="/" exact><i class="iconfont icon-homepage"></i> 主页</router-link>
        </breadcrumbitem>
        <breadcrumbitem label="营业额报表" to="#/components"></breadcrumbitem>
      </breadcrumb>
      <div class="charttype">
        <el-tabs v-model="activeName2" type="card" @tab-click="handleClick">
          <el-tab-pane name="first">
            <div class="tabpane" slot="label">
              <i class="iconfont icon-icon-report"></i>
              员工个人营业额
            </div>
            <div class="search">
              <div class="searchtitle">
                 <i class="iconfont icon-user"></i>
                  选择图表条件
              </div>
              <div class="condition">
                <el-form :inline="true" :model="formInline" class="demo-form-inline">
                 <div class="separate">姓名选择： </div>
                  
                  <el-form-item label="活动区域">
                    <el-select v-model="formInline.region" placeholder="活动区域">
                      <el-option label="区域一" value="shanghai"></el-option>
                      <el-option label="区域二" value="beijing"></el-option>
                    </el-select>
                  </el-form-item>
                  <el-form-item label="审批人">
                    <el-input v-model="formInline.user" placeholder="审批人"></el-input>
                  </el-form-item>
                  <div class="separate">时间选择： </div>
                  <el-form-item label="开始时间">
                    <el-date-picker
                      v-model="formInline.start"
                      type="month"
                      placeholder="选择月">
                    </el-date-picker>
                  </el-form-item>
                  <el-form-item label="结束时间">
                    <el-date-picker
                      v-model="formInline.end"
                      type="month"
                      placeholder="选择月">
                    </el-date-picker>
                  </el-form-item>
                  <br>
                  <el-form-item label="选择年份">
                    <el-date-picker
                      v-model="formInline.year"
                      type="year"
                      placeholder="选择年份">
                    </el-date-picker>
                  </el-form-item>
                  <el-form-item label="选择季度">
                    <el-select v-model="formInline.quarter"  placeholder="第一季度(1月-3月)">
                      <el-option label="第一季度(1月-3月)" value="1"></el-option>
                      <el-option label="第二季度(4月-6月)" value="2"></el-option>
                      <el-option label="第三季度(7月-9月)" value="3"></el-option>
                      <el-option label="第四季度(10月-12月)" value="4"></el-option>
                    </el-select>
                  </el-form-item>
                </el-form>
              </div>
            </div>
          </el-tab-pane>
          <el-tab-pane label="配置管理" name="second">
            <div class="tabpane" slot="label">
              <i class="iconfont icon-baobiao"></i>
              单个案件营业额
            </div>
            <div class="search">
              <div class="searchtitle">
                 <i class="iconfont icon-user"></i>
                  选择图表条件
              </div>
              <div class="condition">
                <el-form :inline="true" :model="formInline" class="demo-form-inline">
                 <div class="separate">选择案件名称： </div>
                  
                  <el-form-item label="活动区域">
                    <el-select v-model="formInline.region" placeholder="活动区域">
                      <el-option label="区域一" value="shanghai"></el-option>
                      <el-option label="区域二" value="beijing"></el-option>
                    </el-select>
                  </el-form-item>
                  <el-form-item label="审批人">
                    <el-input v-model="formInline.user" placeholder="审批人"></el-input>
                  </el-form-item>
                  <div class="separate">时间选择： </div>
                  <el-radio class="radio" v-model="formInline.time" label="time">
                    <el-form-item label="开始时间">
                    <el-date-picker
                      v-model="formInline.start"
                      type="month"
                      placeholder="选择月">
                    </el-date-picker>
                  </el-form-item>
                  </el-radio>
                  
                  
                  <el-form-item label="结束时间">
                    <el-date-picker
                      v-model="formInline.end"
                      type="month"
                      placeholder="选择月">
                    </el-date-picker>
                  </el-form-item>
                  
                  <br>
                   <el-radio class="radio" v-model="formInline.time" label="season">
                  <el-form-item label="选择年份">
                    <el-date-picker
                      v-model="formInline.year"
                      type="year"
                      placeholder="选择年份">
                    </el-date-picker>
                  </el-form-item>
                 
                  <el-form-item label="选择季度">
                    <el-select v-model="formInline.quarter"  placeholder="第一季度(1月-3月)">
                      <el-option label="第一季度(1月-3月)" value="1"></el-option>
                      <el-option label="第二季度(4月-6月)" value="2"></el-option>
                      <el-option label="第三季度(7月-9月)" value="3"></el-option>
                      <el-option label="第四季度(10月-12月)" value="4"></el-option>
                    </el-select>
                  </el-form-item>
                  </el-radio>
                </el-form>
              </div>
            </div>
          </el-tab-pane>
          <el-tab-pane label="角色管理" name="third">
            <div class="tabpane" slot="label">
              <i class="iconfont icon-weifenxiaopcjiemianzhuanhuan"></i>
              营业部总营业额
            </div>
          </el-tab-pane>
        </el-tabs>
      </div>
    </div>
  </div>
</template>
<script type="text/javascript">
  import { breadcrumb, breadcrumbitem } from 'components/breadcrumb'
  export default {
    components: {
      breadcrumb,
      breadcrumbitem
    },
    data() {
      return {
        activeName2: 'first',
        formInline: {
          user: '',
          region: '',
          start: '',
          end: '',
          year: '',
          quarter: '',
          time: 'time'
        }
      }
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event)
      },
      onSubmit() {
        console.log('submit!')
      }
    }
  }
</script>
<style type="text/css">
  .separate {
    margin: 2px;
    padding: 2px 5px;
    background-color: rgba(0, 0, 0, 0.2);
    width:120px;
    text-align: center;
    border-radius: 5px;
  }
  .charttype {
    margin-top: 10px;
  }
  .tabpane {
    display: inline-block;
    padding: 10px;

  }
  .tabpane i {
    font-size: 2.5em;
  }
  .charttype .el-tabs__item {
   height: 60px;
  }
</style>
