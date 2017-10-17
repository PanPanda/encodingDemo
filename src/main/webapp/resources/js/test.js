function get() {
    console.log($("#before").html());

    $.ajax({
        //url:"/hello?param=" + $("#before").html(),

        url:"/getMsg?param=" + encodeURI(encodeURI($("#before").html())),
        type:"GET",
        contentType:"application/x-www-form-urlencoded; charset=utf-8",
        success:function(result){
            $("#after").val(result);
        }
    });
}


function postMsg() {
    var param = $("#before").html();

    $.ajax({
        url:"/postMsg",
        //contentType:"application/json; charset=utf-8",
        data:{
            "param":param
        },
        dataType:"json",
        type:"POST",
        success:function(result){
            console.log(result);
            $("#after").val(result.result);
        },
        error:function(){
        }
    });
}