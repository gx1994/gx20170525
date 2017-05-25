# ISOPM
## 项目目前用的技术
1. 前端
   vue2+vue-router+vue-resouce+element
2. 后端
  springboot

## 安装
```
npm install  
//运行
npm run dev
```

## 项目布局
```
|-- build                            // webpack配置文件
|-- config                           // 项目打包路径
|-- src                              // 代码目录
   |--main                           // 源码
      |--java                        //java 资源
        |--jp.co.ucl.ISOPM
          |--Application.java          // 主函数
          |--api                       //相当于controller 控制器 
          |--dao                       //数据访问层 
          |--entity                    // 实体类
      |--resourse                    //资源目录
         |--static                   // webpack 编译后的文件
         |--application.properties   // spring boot配置文件                
      |--vuejs                       //vue 前端代码
         |--assets                   //css js img 资源
         |--copmonents               // 组件
         |--pages                    // 页面
         |--router                   // vue-router 配置
         |--store                    // vuex
    |-- test                         // 测试代码
       |--java                       // java 测试
       |--resource                   // 测试资源
|--static                            //  静态资源
|-- .babelrc                         // ES6语法编译配置
|-- .editorconfig                    // 代码编写规格
|-- .gitignore                       // 忽略的文件
|-- .eslintrc.js                     // eslint 的配置文件
|-- index.html                       // 入口html文件
|-- package.json                     // 项目及工具的依赖配置文件
|-- README.md                        // 说明
|-- history-log.md                   // 项目历史更改说明
```