$(function(){
     $("#contentUpload").click(function(){
    	 	var progressbox     = $('#progressbox');
    	    var progressbar     = $('#myBar');
    	    var statustxt   = $('#statustxt');
    	    var submitbutton    = $("#contentUpload");
    	    var output  = $("#output");
    	    var completed   = '0%';
    	    var status = $('#statustxt');

         $('#addContentForm').ajaxForm({
             beforeSubmit: function(arr, $form, options) { 
            	 submitbutton.attr('disabled','');
            	 status.empty();
                 var percentVal = '0%';
                 progressbar.width(percentVal);
                 statustxt.html(percentVal).css('text-align', 'center');
            	 return true;
             },
             uploadProgress: function(event, position, total, percentComplete) { //on progress
            	 percentVal = percentComplete.toString() + '%';
            	 var percentVal = percentComplete + '%';
            	 progressbar.width(percentVal);
            	 statustxt.html(percentVal).css('text-align', 'center');
             },
             success: function(response,status){
                 //성공후 서버에서 받은 데이터 처리
                 submitbutton.removeAttr('disabled');
             },
             error: function(){
                 //에러발생을 위한 code페이지
             }                               
         });   
         
     });
})