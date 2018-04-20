<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AJAX</title>

<script type="text/javascript">


function brincarComServidor() {
	var xmlhttp;
	xmlhttp=new XMLHttpRequest();
	
	xmlhttp.onreadystatechange=function() {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)  {
	    document.getElementById("visualizar").innerHTML=xmlhttp.responseText;
	    }
	  }
	valor = document.getElementById("text").value;
	xmlhttp.open("GET","Ajax?text="+valor,true);
	xmlhttp.send();
}

function novaMensagem() {
	var xmlhttp;
	xmlhttp=new XMLHttpRequest();
	
	xmlhttp.onreadystatechange=function() {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)  {
	    document.getElementById("visualizar").innerHTML=xmlhttp.responseText;
	    }
	  }
	//valor = document.getElementById("text").value;
	xmlhttp.open("POST","Ajax",true);
	xmlhttp.send();
}

</script>
</head>
<body>


<h1 id="visualizar"></h1>
<input type="text" id="text" /> <br>
<input type="button" value="salvar texto" onclick="brincarComServidor();" /><br>
<input type="button" value="pedir texto" onclick="novaMensagem();" />


</body>
</html>