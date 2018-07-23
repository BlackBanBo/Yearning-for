<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品表</title>
</head>
<body>
	
</body>
<script>
var data = {index:1,pageSize:5}

console.log(data)
$.ajax({
    url:"ProductionController/getProductionList.action",
    type:"post",
    dataType:"json",
    data:data,
    success:function(data){
        console.log(data)
    }
})
</script>
</html>