<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleWebservicemathProxyid" scope="session" class="com.simplemathsolver.webservices.WebservicemathProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleWebservicemathProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleWebservicemathProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleWebservicemathProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.simplemathsolver.webservices.Webservicemath getWebservicemath10mtemp = sampleWebservicemathProxyid.getWebservicemath();
if(getWebservicemath10mtemp == null){
%>
<%=getWebservicemath10mtemp %>
<%
}else{
        if(getWebservicemath10mtemp!= null){
        String tempreturnp11 = getWebservicemath10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String n_1id=  request.getParameter("n16");
        int n_1idTemp  = Integer.parseInt(n_1id);
        java.lang.String checkprime13mtemp = sampleWebservicemathProxyid.checkprime(n_1idTemp);
if(checkprime13mtemp == null){
%>
<%=checkprime13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(checkprime13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String no_2id=  request.getParameter("no21");
        int no_2idTemp  = Integer.parseInt(no_2id);
        boolean isPrime18mtemp = sampleWebservicemathProxyid.isPrime(no_2idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(isPrime18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 23:
        gotMethod = true;
        String num_3id=  request.getParameter("num26");
        int num_3idTemp  = Integer.parseInt(num_3id);
        java.lang.String findprimeseries23mtemp = sampleWebservicemathProxyid.findprimeseries(num_3idTemp);
if(findprimeseries23mtemp == null){
%>
<%=findprimeseries23mtemp %>
<%
}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(findprimeseries23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>