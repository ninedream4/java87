<<<<<<< HEAD
<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<html>
	<body>
	
		<h3> NullPointerException page</h3>
		<%	Exception exception = (Exception)request.getAttribute("exception");	%>
		<%="Java Code�� �̿��� ���� Message ���� ::" +  exception.getMessage() %><br/>
		EL�� �̿��� ���� Message ���� :: ${ exception.message }<br/> 
		
		<hr/>
		<br/>
		<%=  request.getRequestURI() %>
		<br/>
		<%=  request.getRequestURL() %>
		
	</body>
=======
<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<html>
	<body>
	
		<h3> NullPointerException page</h3>
		<%	Exception exception = (Exception)request.getAttribute("exception");	%>
		<%="Java Code�� �̿��� ���� Message ���� ::" +  exception.getMessage() %><br/>
		EL�� �̿��� ���� Message ���� :: ${ exception.message }<br/> 
		
		<hr/>
		<br/>
		<%=  request.getRequestURI() %>
		<br/>
		<%=  request.getRequestURL() %>
		
	</body>
>>>>>>> c0c5aebdf4ad3318dac58698ad1f3b4fb788f8aa
</html>