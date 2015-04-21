<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="Connection.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
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
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        Connection.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String fname_1id=  request.getParameter("fname16");
            java.lang.String fname_1idTemp = null;
        if(!fname_1id.equals("")){
         fname_1idTemp  = fname_1id;
        }
        String lname_2id=  request.getParameter("lname18");
            java.lang.String lname_2idTemp = null;
        if(!lname_2id.equals("")){
         lname_2idTemp  = lname_2id;
        }
        String email_3id=  request.getParameter("email20");
            java.lang.String email_3idTemp = null;
        if(!email_3id.equals("")){
         email_3idTemp  = email_3id;
        }
        String pwd_4id=  request.getParameter("pwd22");
            java.lang.String pwd_4idTemp = null;
        if(!pwd_4id.equals("")){
         pwd_4idTemp  = pwd_4id;
        }
        java.lang.String register13mtemp = sampleServiceProxyid.register(fname_1idTemp,lname_2idTemp,email_3idTemp,pwd_4idTemp);
if(register13mtemp == null){
%>
<%=register13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(register13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 24:
        gotMethod = true;
        String username_5id=  request.getParameter("username33");
            java.lang.String username_5idTemp = null;
        if(!username_5id.equals("")){
         username_5idTemp  = username_5id;
        }
        String pwd_6id=  request.getParameter("pwd35");
            java.lang.String pwd_6idTemp = null;
        if(!pwd_6id.equals("")){
         pwd_6idTemp  = pwd_6id;
        }
        modelclasses.User login24mtemp = sampleServiceProxyid.login(username_5idTemp,pwd_6idTemp);
if(login24mtemp == null){
%>
<%=login24mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userid:</TD>
<TD>
<%
if(login24mtemp != null){
java.lang.String typeuserid27 = login24mtemp.getUserid();
        String tempResultuserid27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserid27));
        %>
        <%= tempResultuserid27 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastlogin:</TD>
<TD>
<%
if(login24mtemp != null){
java.lang.String typelastlogin29 = login24mtemp.getLastlogin();
        String tempResultlastlogin29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastlogin29));
        %>
        <%= tempResultlastlogin29 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">username:</TD>
<TD>
<%
if(login24mtemp != null){
java.lang.String typeusername31 = login24mtemp.getUsername();
        String tempResultusername31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeusername31));
        %>
        <%= tempResultusername31 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 37:
        gotMethod = true;
        String uid_7id=  request.getParameter("uid40");
            java.lang.String uid_7idTemp = null;
        if(!uid_7id.equals("")){
         uid_7idTemp  = uid_7id;
        }
        String proid_8id=  request.getParameter("proid42");
            java.lang.String proid_8idTemp = null;
        if(!proid_8id.equals("")){
         proid_8idTemp  = proid_8id;
        }
        java.lang.String addproducttocart37mtemp = sampleServiceProxyid.addproducttocart(uid_7idTemp,proid_8idTemp);
if(addproducttocart37mtemp == null){
%>
<%=addproducttocart37mtemp %>
<%
}else{
        String tempResultreturnp38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addproducttocart37mtemp));
        %>
        <%= tempResultreturnp38 %>
        <%
}
break;
case 44:
        gotMethod = true;
        String uid_9id=  request.getParameter("uid47");
            java.lang.String uid_9idTemp = null;
        if(!uid_9id.equals("")){
         uid_9idTemp  = uid_9id;
        }
        modelclasses.Product[] fetchMyproducts44mtemp = sampleServiceProxyid.fetchMyproducts(uid_9idTemp);
if(fetchMyproducts44mtemp == null){
%>
<%=fetchMyproducts44mtemp %>
<%
}else{
        String tempreturnp45 = null;
        if(fetchMyproducts44mtemp != null){
        java.util.List listreturnp45= java.util.Arrays.asList(fetchMyproducts44mtemp);
        tempreturnp45 = listreturnp45.toString();
        }
        %>
        <%=tempreturnp45%>
        <%
}
break;
case 49:
        gotMethod = true;
        String uid_10id=  request.getParameter("uid52");
            java.lang.String uid_10idTemp = null;
        if(!uid_10id.equals("")){
         uid_10idTemp  = uid_10id;
        }
        modelclasses.Order[] fetchorderdata49mtemp = sampleServiceProxyid.fetchorderdata(uid_10idTemp);
if(fetchorderdata49mtemp == null){
%>
<%=fetchorderdata49mtemp %>
<%
}else{
        String tempreturnp50 = null;
        if(fetchorderdata49mtemp != null){
        java.util.List listreturnp50= java.util.Arrays.asList(fetchorderdata49mtemp);
        tempreturnp50 = listreturnp50.toString();
        }
        %>
        <%=tempreturnp50%>
        <%
}
break;
case 54:
        gotMethod = true;
        String uid_11id=  request.getParameter("uid57");
            java.lang.String uid_11idTemp = null;
        if(!uid_11id.equals("")){
         uid_11idTemp  = uid_11id;
        }
        modelclasses.Sellinghistory[] fetchSellingHistory54mtemp = sampleServiceProxyid.fetchSellingHistory(uid_11idTemp);
if(fetchSellingHistory54mtemp == null){
%>
<%=fetchSellingHistory54mtemp %>
<%
}else{
        String tempreturnp55 = null;
        if(fetchSellingHistory54mtemp != null){
        java.util.List listreturnp55= java.util.Arrays.asList(fetchSellingHistory54mtemp);
        tempreturnp55 = listreturnp55.toString();
        }
        %>
        <%=tempreturnp55%>
        <%
}
break;
case 59:
        gotMethod = true;
        String catname_12id=  request.getParameter("catname62");
            java.lang.String catname_12idTemp = null;
        if(!catname_12id.equals("")){
         catname_12idTemp  = catname_12id;
        }
        java.lang.String insertcatalog59mtemp = sampleServiceProxyid.insertcatalog(catname_12idTemp);
if(insertcatalog59mtemp == null){
%>
<%=insertcatalog59mtemp %>
<%
}else{
        String tempResultreturnp60 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertcatalog59mtemp));
        %>
        <%= tempResultreturnp60 %>
        <%
}
break;
case 64:
        gotMethod = true;
        String uid_13id=  request.getParameter("uid67");
            java.lang.String uid_13idTemp = null;
        if(!uid_13id.equals("")){
         uid_13idTemp  = uid_13id;
        }
        String catId_14id=  request.getParameter("catId69");
            java.lang.String catId_14idTemp = null;
        if(!catId_14id.equals("")){
         catId_14idTemp  = catId_14id;
        }
        String proname_15id=  request.getParameter("proname71");
            java.lang.String proname_15idTemp = null;
        if(!proname_15id.equals("")){
         proname_15idTemp  = proname_15id;
        }
        String prodesc_16id=  request.getParameter("prodesc73");
            java.lang.String prodesc_16idTemp = null;
        if(!prodesc_16id.equals("")){
         prodesc_16idTemp  = prodesc_16id;
        }
        String proprice_17id=  request.getParameter("proprice75");
            java.lang.String proprice_17idTemp = null;
        if(!proprice_17id.equals("")){
         proprice_17idTemp  = proprice_17id;
        }
        String proqty_18id=  request.getParameter("proqty77");
            java.lang.String proqty_18idTemp = null;
        if(!proqty_18id.equals("")){
         proqty_18idTemp  = proqty_18id;
        }
        java.lang.String insertproduct64mtemp = sampleServiceProxyid.insertproduct(uid_13idTemp,catId_14idTemp,proname_15idTemp,prodesc_16idTemp,proprice_17idTemp,proqty_18idTemp);
if(insertproduct64mtemp == null){
%>
<%=insertproduct64mtemp %>
<%
}else{
        String tempResultreturnp65 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertproduct64mtemp));
        %>
        <%= tempResultreturnp65 %>
        <%
}
break;
case 79:
        gotMethod = true;
        modelclasses.Catalog[] fetchcatlogs79mtemp = sampleServiceProxyid.fetchcatlogs();
if(fetchcatlogs79mtemp == null){
%>
<%=fetchcatlogs79mtemp %>
<%
}else{
        String tempreturnp80 = null;
        if(fetchcatlogs79mtemp != null){
        java.util.List listreturnp80= java.util.Arrays.asList(fetchcatlogs79mtemp);
        tempreturnp80 = listreturnp80.toString();
        }
        %>
        <%=tempreturnp80%>
        <%
}
break;
case 82:
        gotMethod = true;
        String procatid_19id=  request.getParameter("procatid85");
            java.lang.String procatid_19idTemp = null;
        if(!procatid_19id.equals("")){
         procatid_19idTemp  = procatid_19id;
        }
        String uid_20id=  request.getParameter("uid87");
            java.lang.String uid_20idTemp = null;
        if(!uid_20id.equals("")){
         uid_20idTemp  = uid_20id;
        }
        modelclasses.Product[] fetchproducts82mtemp = sampleServiceProxyid.fetchproducts(procatid_19idTemp,uid_20idTemp);
if(fetchproducts82mtemp == null){
%>
<%=fetchproducts82mtemp %>
<%
}else{
        String tempreturnp83 = null;
        if(fetchproducts82mtemp != null){
        java.util.List listreturnp83= java.util.Arrays.asList(fetchproducts82mtemp);
        tempreturnp83 = listreturnp83.toString();
        }
        %>
        <%=tempreturnp83%>
        <%
}
break;
case 89:
        gotMethod = true;
        String proid_21id=  request.getParameter("proid92");
            java.lang.String proid_21idTemp = null;
        if(!proid_21id.equals("")){
         proid_21idTemp  = proid_21id;
        }
        java.lang.String deleteproduct89mtemp = sampleServiceProxyid.deleteproduct(proid_21idTemp);
if(deleteproduct89mtemp == null){
%>
<%=deleteproduct89mtemp %>
<%
}else{
        String tempResultreturnp90 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteproduct89mtemp));
        %>
        <%= tempResultreturnp90 %>
        <%
}
break;
case 94:
        gotMethod = true;
        String uid_22id=  request.getParameter("uid97");
            java.lang.String uid_22idTemp = null;
        if(!uid_22id.equals("")){
         uid_22idTemp  = uid_22id;
        }
        double gettotalorder94mtemp = sampleServiceProxyid.gettotalorder(uid_22idTemp);
        String tempResultreturnp95 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(gettotalorder94mtemp));
        %>
        <%= tempResultreturnp95 %>
        <%
break;
case 99:
        gotMethod = true;
        String uid_23id=  request.getParameter("uid102");
            java.lang.String uid_23idTemp = null;
        if(!uid_23id.equals("")){
         uid_23idTemp  = uid_23id;
        }
        java.lang.String generateOrder99mtemp = sampleServiceProxyid.generateOrder(uid_23idTemp);
if(generateOrder99mtemp == null){
%>
<%=generateOrder99mtemp %>
<%
}else{
        String tempResultreturnp100 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(generateOrder99mtemp));
        %>
        <%= tempResultreturnp100 %>
        <%
}
break;
case 104:
        gotMethod = true;
        String uid_24id=  request.getParameter("uid107");
            java.lang.String uid_24idTemp = null;
        if(!uid_24id.equals("")){
         uid_24idTemp  = uid_24id;
        }
        modelclasses.Cart[] fetchcartdata104mtemp = sampleServiceProxyid.fetchcartdata(uid_24idTemp);
if(fetchcartdata104mtemp == null){
%>
<%=fetchcartdata104mtemp %>
<%
}else{
        String tempreturnp105 = null;
        if(fetchcartdata104mtemp != null){
        java.util.List listreturnp105= java.util.Arrays.asList(fetchcartdata104mtemp);
        tempreturnp105 = listreturnp105.toString();
        }
        %>
        <%=tempreturnp105%>
        <%
}
break;
case 109:
        gotMethod = true;
        String uid_25id=  request.getParameter("uid112");
            java.lang.String uid_25idTemp = null;
        if(!uid_25id.equals("")){
         uid_25idTemp  = uid_25id;
        }
        double gettotalcart109mtemp = sampleServiceProxyid.gettotalcart(uid_25idTemp);
        String tempResultreturnp110 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(gettotalcart109mtemp));
        %>
        <%= tempResultreturnp110 %>
        <%
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