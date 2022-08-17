<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Hotels.Goa"%>
<%@page import="Hotels.Shimla"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String choice=request.getParameter("jump");

if (choice.equals("Shimla") || choice.equals("shimla"))
{
Shimla shimla=new Shimla();
shimla.shimlaHotel();
}

else if(choice.equals("Goa") || choice.equals("goa"))
{
Goa goa = new Goa();
goa.goaHotel();
}

else
{
	out.println("No hotel avaiable");
}
out.println("Please Check on Console");
%>

</body>
</html>