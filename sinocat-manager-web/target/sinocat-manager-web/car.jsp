<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选车</title>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" type="text/javascript"></script>
<style>
*{
	font-size: 25px;
}
div{
	margin: 50px auto;
	text-align: center;
}
</style>
</head>
<body>
<div>
<form action="selectCar.action" method="post">
	品牌：
	<select type="select" name="car_pp" id="car_pp" >
		<option value ="default">请选择</option>
	</select> — 
	车系：
	<select type="select" name="car_xl" id="car_xl" >
		<option value ="default">请选择</option>
	</select> — 
	型号：
	<select type="select" name="car_xh" id="car_xh" >
		<option value ="default">请选择</option>
	</select>
</form>
</div>
</body>
<script>
var cars = null;
$.ajax({
	url: "getAllCars.action",
	type: "post",
	contentType: "application/x-www-form-urlencoded; charset=utf-8",
	dataType: "json",
	data: {
		
	},
	success: function(data){
		cars = data;
		for(var index=0;index<cars.length;index++){
			if(cars[index].parent_id=='1'){
				$("#car_pp").append("<option value ='"+cars[index].c_id+"'>"+cars[index].c_type+"</option>");
			}
		}
	},
	error: function(){
		console.log("与服务器连接失败！");
	}
});

$("#car_pp").change(function(){
	$("#car_xl").html("<option value ='default'>请选择</option>");
	$("#car_xh").html("<option value ='default'>请选择</option>");
	for(var index=0;index<cars.length;index++){
		if(cars[index].parent_id==$(this).val()){
			$("#car_xl").append("<option value ='"+cars[index].c_id+"'>"+cars[index].c_type+"</option>");
		}
	}
});

$("#car_xl").change(function(){
	$("#car_xh").html("<option value ='default'>请选择</option>");
	for(var index=0;index<cars.length;index++){
		if(cars[index].parent_id==$(this).val()){
			$("#car_xh").append("<option value ='"+cars[index].c_id+"'>"+cars[index].c_type+"</option>");
		}
	}
});

</script>
</html>