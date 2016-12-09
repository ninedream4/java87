$(document).ready(function() {


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