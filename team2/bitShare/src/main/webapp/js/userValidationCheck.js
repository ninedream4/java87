$(document).ready(function() {

	$("#addUserForm").validate({		
		onkeyup:false,
		rules:{
			email: {required:true, email:true	},
			pwd:{ required:true},
			confirmPwd:{required:true, equalTo:"#pwd"}				
			},
		messages :{
				email:{
					    required:"Email을 입력하세요",
			            email:"Email 형식이 아닙니다",
			             /*remote : jQuery.format("{0}는 이미 있는 아이디입니다.")*/
				},
				 pwd:{
					 required:"패스워드를 입력하세요"			            
			    },
			    pwdConfirm:{
			    	required:"패스워드를 다시 입력하세요",
		            equalTo:"패스워드가 다릅니다"
		        }
	
		},
		submitHandler: function(frm){
			frm.submit();
		}
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