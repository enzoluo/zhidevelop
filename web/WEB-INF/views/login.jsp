<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Neat Admin Template</title>
    <meta name="description" content="">

    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1">

    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/jquery.fancybox.css">
    <link rel="stylesheet" href="css/login.css">
    <style type="text/css">
        .capslock {
            border: 1px solid orange;
            width: 120px;
            height: 25px;
            color: orange;
            font-family: 微软雅黑;
            font-size: 10px;
            line-height: 25px;
            position: absolute;
        }
    </style>
    <script src="resource/public/js/jquery-1.8.2.min.js"></script>
    <script src="resource/js/login/zhibo.js"></script>
</head>
<body class='login_body'>
<div class="wrap">
    <h3>&nbsp;&nbsp;&nbsp;&nbsp;Welcome to the login page</h3>
    <form autocomplete="off" method="post" class="validate">
        <div class="login">
            <div class="email">
                <label for="loginName">LoginName</label>
                <div class="email-input">
                    <div class="control-group">
                        <div class="input-prepend"><span class="add-on"><i class="icon-user"></i></span>
                            <input type="text" id="loginName" name="loginName"></div>
                    </div>
                </div>
            </div>
            <div class="pw">
                <label for="password">Password</label>
                <div class="pw-input">
                    <div class="control-group">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-lock"></i></span>
                            <input type="password" id="password" name="password">
                        </div>
                    </div>
                </div>
            </div>
            <script type="text/javascript">capitalTip("password")</script>
            <!--<div class="remember">
                <label class="checkbox" style="margin-top: 4px;">
                    <input type="checkbox" value="1" name="remember"> Remember me on this computer
                </label>
            </div>-->
            <div class="remember">
                <label class="checkbox" id="login-msg" style="margin-top: 4px;color: red;display:none;">
                    Incorrect username or password.
                </label>
            </div>
        </div>
        <div class="submit">
            <a href="#">Lost password?</a>
            <button class="btn btn-red5" type="button" onclick="login();">Login</button>
        </div>
        <div class="login social">
            <div class="btn-row">
                <a href="#" class="btn btn-social btn-twitter"><img src="img/twitter.png" alt="">Sign in with
                    Twitter</a>
                <a href="#" class="btn btn-social btn-fb"><img src="img/facebook.png" alt="">Sign in with Facebook</a>
            </div>
            <div class="btn-row">
                <a href="#" class="btn btn-social btn-dr"><img src="img/dribble.png" alt="">Sign in with Dribble</a>
                <a href="#" class="btn btn-social btn-fo"><img src="img/forrst.png" alt="">Sign in with Forrst</a>
            </div>
        </div>
    </form>
    <div class="social-shadow-hider"></div>
    <div class="social-toggle">
        <a href="#" class='toggle-social'>Sign in with social network <b class="caret"></b></a>
    </div>
</div>
<script type="text/javascript">
    function login() {
        // paramter check
        var loginName = $("#loginName").val();
        var password = $("#password").val();

        $.ajax({
            type: 'post',
            url: '/login',
            dataType: 'json',
            data: {
                "loginName": $("#loginName").val(),
                "password": $("#password").val(),
            },
            success: function (data) {
               var status = data.msg;
               if(status == "success"){
                   window.location.href="work.do";
               }else {
                   console.log(status);
                    $("#login-msg").css("display","block");
               }
            },
            error: function () {
                alert("error");
            }

        });
    }
</script>
<script src="js/jquery.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/jquery.metadata.js"></script>
<script src="js/error.js"></script>
</body>
</html>