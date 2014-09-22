<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>World of Prime numbers</title>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>

<script type="text/javascript">
$(document).ready(function()
{
   $("#btcheckprime").click(function () 
              {            
                        
               
               var no = $("#tbcheckprime").val();
               

               if(no == null || no == "" )
               {
                  alert('First Name cannot be blank');
                  return false;
               }else if(no >1000 || no < 1)
           	   {
            	   alert('Please insert a number between 1 to 1000.');
           			return false;
           	   }else if(isNaN(no))
           	   {
           		   alert('Only nummerics are allowed.');
           		   return false;
           	   }else{
           		 return true;  
           	   };
       
     });
   
   $("#btfindprime").click(function () 
           {            
                     
            
            var num = $("#tbfindprime").val();
            

            if(num == null || num == "" )
            {
               alert('First Name cannot be blank');
               return false;
            }else if(num >1000 || num <1)
        	   {
         	   alert('Please insert a number between 1 to 1000.');
        			return false;
        	   }else if(isNaN(num))
        	   {
        		   alert('Only nummerics are allowed.');
        		   return false;
        	   }else{
        		 return true;  
        	   };
    
  });

});
</script>


</head>
<body>
	<form id="formcheckprime" action="IsnumPrime" method="post">
		<table>
		<tr>
			<td>
				<span>Please enter a number to check if it's prime or not : </span>
				<input type="text" name="tbcheckprime" id="tbcheckprime" />
				<input id="btcheckprime" type="submit" value="Check"/>
			</td>
		</tr>
		</table>
	</form>
	
	<form id="formfindprime" action="Findprimeseries" method="post">
		<table>
		<tr>
			<td>
				<span>Please enter a number to find a prime series from 1 upto the number : </span>
				<input type="text" name="tbfindprime" id="tbfindprime" />
				<input id="btfindprime" type="submit" value="Find"/>
			</td>
		</tr>
		</table>
	</form>
	<% if(request.getAttribute("result")!= null){ %>
		Result : <%= request.getAttribute("result") %>
	<% }%>
</body>
</html>