<template>
  <div class="login">
    <form class="logform">
      <span class="log-heading">用户登录</span>
      <div class="form-group">
            <input type="email" class="form-control" id="inputEmail3" placeholder="用户名或电子邮件">
            <i class="iconfont icon-guanjiaowangtubiao01"></i>
          </div>
          <div class="form-group help">
            <input type="password" class="form-control" id="inputPassword3" placeholder="密　码">
            <i class="iconfont icon-mima"></i>
            <a href="#" class="fa fa-question-circle"></a>
          </div>
          <div class="form-group">
            <div class="main-checkbox">
              <input type="checkbox" value="None" id="checkbox1" name="check">
              <label for="checkbox1"></label>
            </div>
            <span class="text">记住密码</span>
            <button type="submit" class="btn btn-default">登录</button>
          </div>
        </form>
  </div>
</template>
<script type="text/javascript">
  
</script>
<style type="text/css">
  .login {
    background-color: #00b4ef;
    font-family: "Microsoft YaHei","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif;
    width: 100%;
    height: 500px;
    margin-top: 50px;
    position:relative;
  }
  .logform{
    width: 33.33%;
    margin: auto 0;
    background: #fff;
    padding-bottom: 40px;
    border-radius: 15px;
    text-align: center;
    position:absolute;
    top:50%;
    left:50%;
    margin-top:-12.5%;
    margin-left:-17.5%;
  }
  .logform .log-heading{
    display: block;
    font-size: 35px;
    font-weight: 700;
    padding: 35px 0;
    border-bottom: 1px solid #f0f0f0;
    margin-bottom: 30px;
  }
  .logform .form-group{
    padding: 0 40px;
    margin: 0 0 25px 0;
    position: relative;
  }
  .logform .form-control{
    background: #f0f0f0;
    border: none;
    border-radius: 20px;
    box-shadow: none;
    padding: 0 20px 0 45px;
    height: 40px;
    transition: all 0.3s ease 0s;
  }
  .logform .form-control:focus{
    background: #e0e0e0;
    box-shadow: none;
    outline: 0 none;
  }
  .logform .form-group i{
    position: absolute;
    top: 12px;
    left: 60px;
    font-size: 17px;
    color: #c8c8c8;
    transition : all 0.5s ease 0s;
  }
  .logform .form-control:focus + i{
    color: #00b4ef;
  }
  .logform .fa-question-circle{
    display: inline-block;
    position: absolute;
    top: 12px;
    right: 60px;
    font-size: 20px;
    color: #808080;
    transition: all 0.5s ease 0s;
  }
  .logform .fa-question-circle:hover{
    color: #000;
  }
  .logform .main-checkbox{
    float: left;
    width: 20px;
    height: 20px;
    background: #11a3fc;
    border-radius: 50%;
    position: relative;
    margin: 5px 0 0 5px;
    border: 1px solid #11a3fc;
  }
  .logform .main-checkbox label{
    width: 20px;
    height: 20px;
    position: absolute;
    top: 0;
    left: 0;
    cursor: pointer;
  }
  .logform .main-checkbox label:after{
    content: "";
    width: 10px;
    height: 5px;
    position: absolute;
    top: 5px;
    left: 4px;
    border: 3px solid #fff;
    border-top: none;
    border-right: none;
    background: transparent;
    opacity: 0;
    -webkit-transform: rotate(-45deg);
    transform: rotate(-45deg);
  }
  .logform .main-checkbox input[type=checkbox]{
    visibility: hidden;
  }
  .logform .main-checkbox input[type=checkbox]:checked + label:after{
    opacity: 1;
  }
  .logform .text{
    float: left;
    margin-left: 7px;
    line-height: 20px;
    padding-top: 5px;
    text-transform: capitalize;
  }
  .logform .btn{
    float: right;
    font-size: 14px;
    color: #fff;
    background: #00b4ef;
    border-radius: 30px;
    padding: 10px 25px;
    border: none;
    text-transform: capitalize;
    transition: all 0.5s ease 0s;
  }
</style>
