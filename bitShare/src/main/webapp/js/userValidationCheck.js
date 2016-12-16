$(document).ready(function() {
	$("#checkEmail").click(function(){
		var param=$("#email").val();
		$.post('/user/checkDuplication',{"email":param},function(data){
			alert("success:"+data);
			if(data==false){
			   $('#errorEmail').show();			   
			}else{			
				  $('#succsessEmail').show();
			}
		});
	});
	$('#email').on('keyup', function() {
	    var re = /([A-Z0-9a-z_-][^@])+?@[^$#<>?]+?\.[\w]{2,4}/.test(this.value);
	    if(!re) {
	        $('#errorEmail').show();
	    } else {
	        $('#errorEmail').hide();
	    }
	}),
	$("#confirmPwd").keyup(function(event){
		var pwd = $("#pwd").val();
		if (pwd==$(this).val()){
			  $('#errorPwd').hide();
		}else{
			  $('#errorPwd').show();
		}		
	});
	
});
