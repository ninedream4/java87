<<<<<<< HEAD
<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<html>
	<body>
	
		<h3> NullPointerException page</h3>
		<%	Exception exception = (Exception)request.getAttribute("exception");	%>
		<%="Java Code을 이용한 예외 Message 보기 ::" +  exception.getMessage() %><br/>
		EL을 이용한 예외 Message 보기 :: ${ exception.message }<br/> 
		
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
		<%="Java Code을 이용한 예외 Message 보기 ::" +  exception.getMessage() %><br/>
		EL을 이용한 예외 Message 보기 :: ${ exception.message }<br/> 
		
		<hr/>
		<br/>
		<%=  request.getRequestURI() %>
		<br/>
		<%=  request.getRequestURL() %>
		
	</body>
>>>>>>> c0c5aebdf4ad3318dac58698ad1f3b4fb788f8aa
</html>