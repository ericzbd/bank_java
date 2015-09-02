<%-- 
    Document   : accountlist
    Created on : Mar 4, 2015, 2:10:05 AM
    Author     : Eric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
form { background-color:#83F52C;
	font-family: Arial, sans-serif;
	width: 350px; 
    padding: 10px;	}
label { float: left;
	width: 100px; 
	display: block; 
        clear: left;
	text-align: right; 
	padding-right: 10px;
	margin-top: 10px; }
input, textarea { margin-top: 10px; 
                 float: right contour
                 } 
</style>
</head>

     
      
<h2>Please type your login id and password</h2>

 <form name="eric1" action="http://localhost:8080/ChattBank/LoginServlet" method="get" onsubmit="validate();">

<br/>Login ID:  <input type="text" name="idtb" />
<br/>Password: <input type="password" name="passwordtb" /> 
  <div><center>
          <input id="mysubmit" type="submit" value="Submit" onsubmit="validate();"/>
<input type="reset"></center>

 </form>
<script type="text/javascript">
   
     
        function validate(){
                var a;
                a = document.eric1.idtb.value;
                var b;
                b = document.eric1.passwordtb.value;                
                    if( a === "" ||
                    isNaN( a )  ||
                    a < 3000 ||
                    a > 3999){
                      alert("Try entering a number between 3000 and 3999 =P");  
                      a.focus() ;
                      return false;
                    }
                 
                

                  if( b === "" || b === null) {
                  alert("Try entering a password or something =P");  
                  b.focus() ;
                  return false;
                }
             
                
        }
             
    </script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accounts</title>
    </head>
    <body>
        <h1>Here are your accounts</h1>
    </body>
</html>
