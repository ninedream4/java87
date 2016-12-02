$.validator.setDefaults({
	onkeyup:true
});

$(document).ready(function(){
	$("#addUserForm").validate({
		rules:{
			email: {required:true, email:true},
			pwd:{ required:true},
			confirmPwd:{required:true, equalTo:"#pwd"}				
			},
		messages :{
				email:{
					    required:"Email을 입력하세요",
			            email:"Email 형식이 아닙니다"
				},
				 pwd:{
					 required:"패스워드를 입력하세요"			            
			    },
			    pwdConfirm:{
			    	required:"패스워드를 다시 입력하세요",
		            equalTo:"패스워드가 다릅니다"
		        }
	
		}
	});
});