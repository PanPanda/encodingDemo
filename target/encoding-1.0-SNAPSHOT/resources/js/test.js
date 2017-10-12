function get() {
    $.ajax({
        url:"/hello?param=" + encodeURI(encodeURI($("#before").html())),
        type:"GET",
        contentType:"application/x-www-form-urlencoded; charset=utf-8",
        success:function(result){
            $("#after").val(result);
        }
    });
}


function post() {
    $.ajax({
        url:"",
        contentType:"",
        data:"",
        dataType:"",
        type:"POST",
        success:function(result){
            $("#after").val(result);
        }
    });
}