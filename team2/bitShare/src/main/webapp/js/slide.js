
$(function(){
	
	for(var j=1; j<=6; j++){		
		var $mainRow = $("#mainRow"); //mainRow = document.getElementById("mainRow");
		mainRow.className = "row";

		var slideDiv = document.createElement("div");
				slideDiv.className = "col-md-4 portfolio-item";
				
				var aTag = document.createElement("a");
				aTag.href = "javascript:fn()";
				aTag.className = "portfolio-link";
				$("aTag").data("toggle", "modal");
					var outerDiv = document.createElement("div");
					outerDiv.className = "caption";
					
					var innerDiv = document.createElement("div");
					innerDiv.className = "caption-content";
						
					var iTag = document.createElement("i");
					iTag.className = "fa fa-search-plus fa-3x";
							
					var img = document.createElement("img");
					
					img.src = "img/java/"+j+".jpg";
					
					img.className = "img-responsive";
					img.alt="";
							
			innerDiv.appendChild(iTag);
			outerDiv.appendChild(innerDiv);
			
			aTag.appendChild(outerDiv);
			aTag.appendChild(img);
			slideDiv.appendChild(aTag);
			mainRow.appendChild(slideDiv);
			aTag.after("드디어 됬다아!!!!!!!!!!!");

		$("#mainRow").on("click",function(){
			$("#modalView").modal();
		});			
	}
});
