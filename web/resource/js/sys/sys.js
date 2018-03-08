$(function(){
    $("#content").load("sysMenu/sysmain.html");
    $("#left").load("sysMenu/leftmenu/organization.html");
    $("#one").click(function(){
        one();
    });
    $("#two").click(function(){
        two();
    });
    $("#three").click(function () {
        three();
    });


});
function one(){
    $("#content").load("sysMenu/sysmain.html");
    $("#left").load("sysMenu/leftmenu/organization.html");
}
function two(){
    $("#content").load("sysMenu/zb02.html");
}
function three(){
    $("#content").load("sysMenu/zb03.html");
}