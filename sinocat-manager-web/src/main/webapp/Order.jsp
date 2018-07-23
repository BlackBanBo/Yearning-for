<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单表</title>
</head>
<body>
	
</body>
<script>
var data = {orderId:1}
var data ={}
console.log(data)
$.ajax({
    url:"OrderController/getOrderInfoByOrderId.action",
    type:"post",
    dataType:"json",
    data:{orderId:1},
    success:function(data){
        console.log(data);
    }
})
var order={totalPrice:1000,address:{id:1},user:{u_id:1},
	productionList:[{id:1,production:{name:'hah'}},{id:2,production:{name:'haha2'}}]
		}

$.ajax({
    url:"OrderController/insertOrder.action",
    type:"post",
    contentType : 'application/json;charset=utf-8', 
    dataType:"json",
    data: JSON.stringify(order),
    success:function(data){
        console.log(data);
    }
})
</script>
</html>