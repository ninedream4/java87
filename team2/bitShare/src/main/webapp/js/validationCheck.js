 $(document).ready(function() {
$("#addUserform").validate({
	rules:{
		email:{required:true, email:true	},
		pwd:{required:true},
		pwd2:{required:true, equalTo:"#pwd"}
	},
	message:{
		email:{	
				required:"Email을 입력하세요",
				email:"Email 형식이 아닙니다"
    },
    	pwd: {
    			required:"password를 입력하시오"    	
    },
    	pwd2:{
    			required:"password를 다시 입력하시오",
    			equalTo: "password가 다릅니다."
    	}
    
    }
	
})
 });