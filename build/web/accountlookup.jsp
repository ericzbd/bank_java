<%----------------------------------------------------------------------------
* Class: CIST 2373
* Semester: Spring 2015
* Instructor: Ron Enz
* Description: Lab 2
* Due: 2/4/2015
* @author Eric Horne

----------------------------------------------------------------------------%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Account Lookup</title>
<meta charset="utf-8">
<style>
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
<body>
   
<form name="eric2" action="" method="get" onsubmit="validate();">
Account #: <input type="text" name="account" align="right"/><br>
Customer ID: <input type="text" name="id" align="right" /><br>
Type: <input type="text" name="type" align="right"/><br>
Balance: <input type="text" name="balance" align="right" /><br>

<input id="mylookup" type="submit" value="Lookup">
<input type="reset" value="Clear">
</form>
<script type="text/javascript">
   
     
        function validate(){
                var c;
                c = document.eric2.account.value;
              
                  if( c < 90000 || c > 99999 || isNaN(c)){
                    alert("Try entering a number between 90000 and 99999 =P");  
                  c.focus() ;
                  return false;
                }
             
                
        }
             
    </script>
</body>
</html>
