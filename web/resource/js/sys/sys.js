$(function(){
    $("#content").load("sysmain.html");
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
    $("#content").load("sysmain.html");
}
function two(){
    $("#content").load("zb02.html");
}
function three(){
    $("#content").load("zb03.html");
}