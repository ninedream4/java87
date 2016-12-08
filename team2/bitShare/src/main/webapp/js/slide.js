var mainRow = document.getElementById("mainRow");
mainRow.className = "row";

var slideDiv = document.createElement("div");
		slideDiv.className = "col-sm-4 slidelist-item";
		
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
			img.src = "img/java/1.jpg";
			img.className = "img-responsive";
			img.alt="";
	
	innerDiv.appendChild(iTag);
	outerDiv.appendChild(innerDiv);
	
	aTag.appendChild(outerDiv);
	aTag.appendChild(img);
	slideDiv.appendChild(aTag);
	mainRow.appendChild(slideDiv);
	function fn() {
    	$("#modalView").modal();
    }