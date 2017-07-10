import Vue from 'vue'
import Router from 'vue-router'

import home from 'pages/home/home'
import index from 'pages/home/index'

import login from 'pages/login/login'

import staff from 'pages/staff/staff'

import assignment from 'pages/assignment/assignment'
import assignmentView from 'pages/assignment/assignmentView'

import cases from 'pages/cases/cases'
import casesAdd from 'pages/cases/casesAdd'
import test from 'pages/cases/test'

import companyAll from 'pages/companyall/companypage'
import companyAdd from 'pages/companyall/companyadd'
import companyCheck from 'pages/companyall/companycheck'
import companyUpdate from 'pages/companyall/companyupdate'
import company from 'pages/companyall/company'
import addCompany from 'pages/companyall/addcompany'
import checkCompany from 'pages/companyall/checkcompany'
import updateCompany from 'pages/companyall/updatecompany'

Vue.use(Router)

const router = new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      title: '主页',
      component: home,
      children: [
        {
          path: '',
          component: index
        },
        {
          path: 'staff',
          name: 'staff',
          title: '人员信息管理',
          component: staff
        },
        {
          path: 'assignment',
          name: 'assignment',
          title: '人员案件管理',
          component: assignment,
          children: [{
            path: 'view',
            name: 'assignmentView',
            title: '人员案件查看',
            component: assignmentView
          }]
        },
        {
          path: 'case',
          name: 'case',
          title: '案件管理',
          component: cases,
          children: [{
            path: 'caseAdd',
            name: 'projectadd',
            title: '增加案件',
            component: casesAdd
          }]
        },
        {
          path: 'company',
          name: 'company',
          title: '公司信息管理',
          component: company,
          children: [
            {
              path: 'company1',
              name: 'companyall',
              title: '公司信息管理',
              component: companyAll   // 3个组件组成与上一个相同的页面，用于尝试数据传输成功与否
            },
            {
              path: 'add',
              name: 'addompany',
              title: '新增公司',
              component: addCompany
            },
            {
              path: 'add1',
              name: 'companyadd',
              title: '新增公司',
              component: companyAdd
            },
            {
              path: 'test',
              name: 'test',
              title: '新增公司',
              component: test
            },
            {
              path: 'check',
              name: 'checkcompany',
              title: '查看公司',
              component: checkCompany
            },
            {
              path: 'check1',
              name: 'companycheck',
              title: '查看公司',
              component: companyCheck   // 3个组件组成与上一个相同的页面，用于尝试数据传输成功与否
            },
            {
              path: 'update',
              name: 'updatecompany',
              title: '查看公司',
              component: updateCompany
            },
            {
              path: 'update1',
              name: 'companyupdate',
              title: '查看公司',
              component: companyUpdate   // 3个组件组成与上一个相同的页面，用于尝试数据传输成功与否
            }
          ]
        }
      ]
    },
    {
      path: '/login',
      name: 'login',
      title: '登录',
      component: login
    }
  ]
})
export default router
