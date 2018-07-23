<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单模拟</title>
<style>
	div{
		display:inline-block;
	}
</style>
</head>
<body>
	<div id="head"></div>
</body>
<script type="text/javascript">

	var inHtml="";
	var jdata;
	$.ajax({
		url:"getMenus.action",
		type:"post",
		dataType:"json",
		data:{},
		success:function(data){
			jdata=data;
			for(var i=0;i<data.length;i++){
				if(data[i].m_parentid==1){
					inHtml += '&nbsp&nbsp<span class="menu" id="'+data[i].m_id+'"><div>'+data[i].m_name+'</div></span>&nbsp&nbsp';
				}
			}
			console.log(jdata);
			$("#head").html(inHtml);
			$(".menu").on("mouseover",function(){
				var sele = "<div class='zmenu'>";
				var id = this.id;
				for(var i=0;i<jdata.length;i++){
					if(jdata[i].m_parentid == id){
						sele+="<a href='#' id="+jdata[i].m_id+" >"+jdata[i].m_name+"</a><br />";
					}
				}
				sele+="</div>";
				$(this).append(sele);
			});
			$(".menu").on("mouseout",function(){
				$(".zmenu").remove();
			});
		},
		error:function(){
			console.log("系统错误");
		}
	});
	
	
	
</script>
</html>