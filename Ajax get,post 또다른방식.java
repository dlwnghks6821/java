<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--<form method="get" action="MethodServlet" id="frmSignin"> -->
 <table>
   <tr><td align=right>���̵�</td><td><input type=text name=userid size=12></td>
   <tr><td align=right>��й�ȣ</td><td><input type=text name=passwd size=12></td>
  
   </td>
   
   </table>
 
  <input type="button" id="btnLogin" value="Login">

</body>

<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
//AJAX
$(document)
.on('click','#btnLogin',function(){
	 $.post("MethodServlet",
	    		{userid:$('input[name=userid]').val(),passwd:$('input[name=passwd]').val()},
	    		function(txt){
	    	 	  alert(txt)
	    		  },
	    	'text');
	
    })
    //get����� ����ϴ� �Ǵٸ� ���(��ü ���·� ������ ������)
	//����
	
 
    //.fail(function(){})//�����Ҷ� ����//
    //.always(function(){})//���� �ߴ� �����ߴ� ����// 
    
    //post ���//
	//$.post("MethodServlet",{userid:$('input[name=userid]').val(),passwd:$('input[name=psswd]').val()})
	//function(txt){
  	//alert(txt)
	//},'text');//
	//.done(function(){})//�����ϸ� ����
	//.fail(function(){})//�����Ҷ� ����//
	//.always(function(){})//���� �ߴ� �����ߴ� ����// 
	// error : fail ==>always//
	// no error : function ==>done ==> always//


</script>
</html>