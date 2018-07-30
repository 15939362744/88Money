$(document).ready(function() {

    $('#loginForm').validate({
        debug:true,
        rules:{
            user_no: {
                required: true
            },
            user_password: {
                required: true
            }
        },
        messages:{
            user_no: {
                required: '请输入用户名'
            },
            user_password: {
                required: '请输入密码'
            }
        },
        submitHandler:function(form){

            $(form).ajaxSubmit({
                method:$("#fm1").attr("method"),
                xhrFields: {withCredentials: true},
                data:$("#fm1").serialize(),
                success: function(r){
                    if(r.code == 0){
                        location.href = 'index.html';
                    }else{
                        alert("登录失败");
                    }
                }
            });
        }
    });

});


function changeYzm(){
    $('#yanzheng').attr('src', 'captcha.jpg?' + new Date());
}


