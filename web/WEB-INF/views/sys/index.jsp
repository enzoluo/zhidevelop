<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>智发展</title>
    <link rel="stylesheet" href="resource/public/bootstrap/css/bootstrap.min.css">
    <script src="resource/public/js/jquery-3.2.1.min.js"></script>
    <script src="resource/public/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="resource/css/sys/sys.css">
</head>
<body>
<!--menu-top start-->
<div class="menu-top">
    <div class="menu-logo"><a href="/work"><img src="resource/images/sys/zhidevelop.png"></a></div>
    <div class="link">
        <a href="javascript:void(0)" id="one"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-indent-left">组织架构</span></a>
        <a href="javascript:void(0)" id="two"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-home">门户引擎</span></a>
        <a href="javascript:void(0)" id="three"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-refresh">流程引擎</span></a>
        <a href="javascript:void(0)"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-search">搜索引擎</span></a>
        <a href="javascript:void(0)"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-envelope">消息中心</span></a>
        <a href="javascript:void(0)"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-th-large">应用中心</span></a>
        <a href="javascript:void(0)"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-phone">移动办公</span></a>
        <a href="javascript:void(0)"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-cog">集成中心</span></a>
        <a href="javascript:void(0)"><span style="color:white;font-size:14px;" class="glyphicon glyphicon-eye-open">运维中心</span></a>
    </div>
    <script type="text/javascript">
        var height = $(".link").height();
        var a = $(".link a");
        a.each(function(i){
            $(a[i]).css("line-height",height+"px");
            $(this).click(function(){
                for(var i = 0; i < a.length; i++){
                    $(a[i]).removeAttr("class");
                }
                $(this).attr("class","enter-color");
            });
        });
    </script>
</div>
<!--menu-top end-->

<!--menu-content start-->
<div class="menu-content" id="content">

</div>
<!--menu-content end-->

<!--menu-left start-->
<div class="menu-left" id="left">

</div>
<!--menu-left end-->

<script src="resource/js/sys/sys.js"></script>
</body>
</html>