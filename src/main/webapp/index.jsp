 <%@ include file="header.jsp" %>
 <%
 if(session.getAttribute("user")!=null)
{
    out.print("Hello "+session.getAttribute("user")+",");
}
 %>
 Welcome to Vulnerable Web App !<br/><br/>
 Can You Break the App ?
 <br/><br/>
 
 An intentional vulnerable Web Application.
 <br/><br/>
 
  <%@ include file="footer.jsp" %>