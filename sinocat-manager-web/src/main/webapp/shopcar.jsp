<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<link type="text/css" rel="stylesheet" href="style/base.css">
<link rel="stylesheet" type="text/css" href="style/shopcar.css">
<link rel="stylesheet" type="text/css" href="source/bootstrap-3.3.6-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="source/font-awesome-4.5.0/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="style/slider.css">
<link rel="stylesheet" type="text/css" href="style/mystyle.css">
<link rel="SHORTCUT ICON" href="image/favicon.ico" />
<title>购物车</title>
<script type="text/javascript" src="js/jquery-1.7.1.js"></script>
<script type="text/javascript" src="js/common.js"></script>
</head>

	<body>
		<!-- Header -->
		<div class="allcontain">
			<div class="header">
				<ul class="socialicon">
					<li>
						<a href="#">
							<i class="fa fa-facebook"></i>
						</a>
					</li>
					<li>
						<a href="#">
							<i class="fa fa-twitter"></i>
						</a>
					</li>
					<li>
						<a href="#">
							<i class="fa fa-google-plus"></i>
						</a>
					</li>
					<li>
						<a href="#">
							<i class="fa fa-pinterest"></i>
						</a>
					</li>
				</ul>
				<ul class="givusacall">
					<li>Give us a call : +66666666 </li>
				</ul>
				<ul class="logreg">
					<li>
						<a href="#">Login </a>
					</li>
					<li>
						<a href="#">
							<span class="register">Register</span>
						</a>
					</li>
				</ul>
			</div>
			<!-- Navbar Up -->
			<nav class="topnavbar navbar-default topnav">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed toggle-costume" data-toggle="collapse" data-target="#upmenu" aria-expanded="false">
							<span class="sr-only"> Toggle navigaion</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand logo" href="#">
							<img src="image/logo1.png" alt="logo">
						</a>
					</div>
				</div>
				<div class="collapse navbar-collapse" id="upmenu">
					<ul class="nav navbar-nav" id="navbarontop">
					</ul>
				</div>
			</nav>
		</div>
		<!--_______________________________________ Carousel__________________________________ -->
		<div class="allcontain">
			<div id="carousel-up" class="carousel slide" data-ride="carousel">
				<div class="carousel-inner " role="listbox">
					<div class="item active">
						<img src="image/oldcar.jpg" alt="oldcar">
						<div class="carousel-caption">
							<h2>Porsche 356</h2>
							<p>Lorem ipsum dolor sit amet, consectetur ,
								<br> sed do eiusmod tempor incididunt ut labore </p>
						</div>
					</div>
					<div class="item">
						<img src="image/porche.jpg" alt="porche">
						<div class="carousel-caption">
							<h2>Porche</h2>
							<p>Lorem ipsum dolor sit amet, consectetur ,
								<br> sed do eiusmod tempor incididunt ut labore </p>
						</div>
					</div>
					<div class="item">
						<img src="image/benz.jpg" alt="benz">
						<div class="carousel-caption">
							<h2>Car</h2>
							<p>Lorem ipsum dolor sit amet, consectetur ,
								<br> sed do eiusmod tempor incididunt ut labore </p>
						</div>
					</div>
				</div>
				<nav class="navbar navbar-default midle-nav">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed textcostume" data-toggle="collapse" data-target="#navbarmidle" aria-expanded="false">
							<h1>SEARCH TEXT</h1>
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					</div>
					<div class="collapse navbar-collapse" id="navbarmidle">
						<div class="searchtxt">
							<h1>SEARCH TEXT</h1>
						</div>
						<form class="navbar-form navbar-left searchformmargin" role="search">
							<div class="form-group">
								<input type="text" class="form-control searchform" placeholder="Enter Keyword">
							</div>
						</form>
						<ul class="nav navbar-nav navbarborder">
							<li class="li-category">
								<a class="btn  dropdown-toggle btn-costume" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Brand
									<span class="glyphicon glyphicon-chevron-down downicon"></span>
								</a>
								<ul class="dropdown-menu" id="car_pp">
								</ul>
							</li>
							<li class="li-minyear">
								<a class="btn  dropdown-toggle btn-costume" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Series
									<span class="glyphicon glyphicon-chevron-down downicon"></span>
								</a>
								<ul class="dropdown-menu" id="car_xl">
								</ul>
							</li>
							<li class="li-maxyear">
								<a class="btn dropdown-toggle btn-costume" id="dropdownMenu3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Model
									<span class="glyphicon glyphicon-chevron-down downicon"></span>
								</a>
								<ul class="dropdown-menu" id="car_xh">
								</ul>
							</li>
							<li class="li-slideprice">
								<p>
									<label class="slidertxt" for="amount">Price </label>
									<input class="priceslider" type="text" id="amount" readonly="readonly">
								</p>
								<div id="slider-range"></div>

							</li>
							<li class="li-search">
								<button class="searchbutton">
									<span class="glyphicon glyphicon-search "></span>
								</button>
							</li>
						</ul>
					</div>
				</nav>
			</div>
		</div>
		<div class="allcontain">
		<div class="wrap">
			<form method="post" action="order.html"> 
			<div class="container">
				<div class="cart clear">
			   		<div class="shadow">
			        <table width="100%" border="0">
			            <tr>
			                <td width="85%">
			                  <h3 class="fl">购买到的产品</h3></li>
			                </td>
			                <td width="10%"> <input type="checkbox" class="checkbox"  name="check_all" id="check_all" > </td>
			            </tr>
			        </table>
			       <div class="c_list cb">
			       	<ul>
			        	<li>
			            	<table>
			                	<tr>
			                    	<td width="15%"><img src="image/cart_img.jpg" width="52" height="44"></td>
			                        <td width="65%">
			                        	<p>新奇士脐橙，8斤，甜中带微</p>
			                            <p><span class="lse">￥198.00</span> <span class="pl15">数量：<input type="text" name="num" class="num"> 包</span></p>
			                        </td>
			                        <td width="10%" valign="middle"><a href="#" class="del">删除</a></td>
			                        <td width="10%"> <input type="checkbox" class="checkbox"  name="check_item" id="check_item"></td>
			                    </tr>
			                </table>
			              </li>
			             
			              <li> 
			               <table>
			                	<tr>
			                    	<td width="15%"><img src="image/cart_img.jpg" width="52" height="44"></td>
			                        <td width="65%">
			                        	<p>新奇士脐橙，8斤，甜中带微</p>
			                            <p><span class="lse">￥198.00</span> <span class="pl15">数量：<input type="text" name="num" class="num"> 包</span></p>
			                        </td>
			                        <td width="10%" valign="middle"><a href="#" class="del">删除</a></td>
			                        <td width="10%"> <input type="checkbox" class="checkbox"  name="check_item" id="check_item"></td>
			                    </tr>
			                </table>
			                </li>
			                
			                <li>
			                <table>
			                	<tr>
			                    	<td width="15%"><img src="image/cart_img.jpg" width="52" height="44"></td>
			                        <td width="65%">
			                        	<p>新奇士脐橙，8斤，甜中带微</p>
			                            <p><span class="lse">￥198.00</span> <span class="pl15">数量：<input type="text" name="num" class="num"> 包</span></p>
			                        </td>
			                        <td width="10%" valign="middle"><a href="#" class="del">删除</a></td>
			                        <td width="10%"> <input type="checkbox" class="checkbox"  name="check_item" id="check_item"></td>
			                    </tr>
			                </table>
			                </li>
			                <li>
			                <table>
			                	<tr>
			                    	<td width="15%"><img src="image/cart_img.jpg" width="52" height="44"></td>
			                        <td width="65%">
			                        	<p>新奇士脐橙，8斤，甜中带微</p>
			                            <p><span class="lse">￥198.00</span> <span class="pl15">数量：<input type="text" name="num" class="num"> 包</span></p>
			                        </td>
			                        <td width="10%" valign="middle"><a href="#" class="del">删除</a></td>
			                        <td width="10%"> <input type="checkbox" class="checkbox"  name="check_item" id="check_item"></td>
			                    </tr>
			                </table>
			                </li>
			                <li>
			                <table>
			                	<tr>
			                    	<td width="15%"><img src="image/cart_img.jpg" width="52" height="44"></td>
			                        <td width="65%">
			                        	<p>新奇士脐橙，8斤，甜中带微</p>
			                            <p><span class="lse">￥198.00</span> <span class="pl15">数量：<input type="text" name="num" class="num"> 包</span></p>
			                        </td>
			                        <td width="10%" valign="middle"><a href="#" class="del">删除</a></td>
			                        <td width="10%"> <input type="checkbox" class="checkbox"  name="check_item" id="check_item"></td>
			                    </tr>
			                </table>
			                </li>
			                <li>
			                <table>
			                	<tr>
			                    	<td width="15%"><img src="image/cart_img.jpg" width="52" height="44"></td>
			                        <td width="65%">
			                        	<p>新奇士脐橙，8斤，甜中带微</p>
			                            <p><span class="lse">￥198.00</span> <span class="pl15">数量：<input type="text" name="num" class="num"> 包</span></p>
			                        </td>
			                        <td width="10%" valign="middle"><a href="#" class="del">删除</a></td>
			                        <td width="10%"> <input type="checkbox" class="checkbox"  name="check_item" id="check_item"></td>
			                    </tr>
			                </table>
			                </li>
			        </ul>
			       </div>  
			    </div>  
			    </div>
			</div>
			<div class="cart_bg">
				<table id="shopfoot" width="100%" border="0">
				    <tr>
				    	<td width="3%"></td>
				        <td width="25%"><input type="checkbox" class="checkbox" id="box_all"></td>
				        <td width="49%">
				            <p> <span class="pl15">金额合计：</span><span class="ff6">￥198.00</span></p>
				        </td>
				        <td width="20%"><button class="submit">去结算</button></td>
				        <td width="3%"></td>
				    </tr>
				</table>
			</div> 
			</form>
			<div class="shop_cart">
			<a href="cart.html">
				<img src="image/shop_cart.png" class="cart_img">
			    <p>购物车</p>
			</a>
			</div>
		</div>
		<div class="footer">
			<div class="copyright">
				&copy; Copy right 2018 |
				<a href="#">Privacy </a>|
				<a href="#">Policy</a>
			</div>
			<div class="atisda">
				Designed by
				<a href="#">Web Garen Morbid - Web Agency </a>
			</div>
		</div>
		</div>

		<script type="text/javascript" src="source/bootstrap-3.3.6-dist/js/jquery.js"></script>
		<script type="text/javascript" src="source/bootstrap-3.3.6-dist/js/bootstrap.js"></script>
		<script type="text/javascript" src="source/bootstrap-3.3.6-dist/js/jquery.1.11.js"></script>

		<script>
			$(window).resize(function () {
				var new_height = $("#image_border").height();
				$("#googleMap").height(new_height);
			});

			$(window).load(function () {
				var new_height = $("#image_border").height();
				$("#googleMap").height(new_height);
				google.maps.event.addDomListener(window, 'load', initialize());
			});

		</script>
		<script>
			var cars = null;
			$.ajax({
				url: "getAllCars.action",
				type: "post",
				contentType: "application/x-www-form-urlencoded; charset=utf-8",
				dataType: "json",
				data: {

				},
				success: function (data) {
					cars = data;
					for (var index = 0; index < cars.length; index++) {
						if (cars[index].parent_id == '1') {
							$("#car_pp").append("<li><a class='car_pp' id='" + cars[index].c_id + "'>" + cars[index].c_type + "</a></li>");
						}
					}

					addChoose();
				},
				error: function () {
					console.log("与服务器连接失败！");
				}
			});

			function addChoose() {
				$(".car_pp").each(function (i) {
					$(this).click(function (j) {
						$("#dropdownMenu2").text('Series');
						$("#dropdownMenu2").append('<span class="glyphicon glyphicon-chevron-down downicon"></span>');
						$('.car_xl').parent().empty();
						$("#dropdownMenu3").text('Model');
						$("#dropdownMenu3").append('<span class="glyphicon glyphicon-chevron-down downicon"></span>');
						$('.car_xh').parent().empty();
						for (var index = 0; index < cars.length; index++) {
							if (cars[index].parent_id == $(this).attr("id")) {
								$("#dropdownMenu1").text($(this).text());
								$("#dropdownMenu1").append('<span class="glyphicon glyphicon-chevron-down downicon"></span>');
								$("#car_xl").append("<li><a class='car_xl' id='" + cars[index].c_id + "'>" + cars[index].c_type + "</a></li>");
							}
						}

						$(".car_xl").each(function (a) {
							$(this).click(function (b) {
								$("#dropdownMenu3").text('Model');
								$("#dropdownMenu3").append('<span class="glyphicon glyphicon-chevron-down downicon"></span>');
								$('.car_xh').parent().empty();
								for (var index = 0; index < cars.length; index++) {
									if (cars[index].parent_id == $(this).attr("id")) {
										$("#dropdownMenu2").text($(this).text());
										$("#dropdownMenu2").append('<span class="glyphicon glyphicon-chevron-down downicon"></span>');
										$("#car_xh").append("<li><a class='car_xh' id='" + cars[index].c_id + "'>" + cars[index].c_type + "</a></li>");
									}
								}

								$(".car_xh").each(function (c) {
									$(this).click(function (d) {
										$("#dropdownMenu3").text($(this).text());
										$("#dropdownMenu3").append('<span class="glyphicon glyphicon-chevron-down downicon"></span>');
									});
								});
							});
						});
					});
				});
			}
		</script>

		<script type="text/javascript">
			var inHtml = "";
			var jdata;
			var menus = $("#navbarontop");

			$.ajax({
				url: "getMenus.action",
				type: "post",
				dataType: "json",
				data: {},
				success: function (data) {
					jdata = data;
					for (var i = 0; i < data.length; i++) {
						if (data[i].m_parentid == 1) {
							inHtml += '<li class="menu" id=' + data[i].m_id + '><a href="' + data[i].m_url + '">' + data[i].m_name + '</a></li>';
						}
					}

					menus.html(inHtml);

					$(".menu").each(function () {
						var id = this.id;
						for (var i = 0; i < jdata.length; i++) {
							if (jdata[i].m_parentid == id) {
								if ($(this).attr("class") != "menu dropdown") {
									$(this).attr("class","menu dropdown");
									$(this).html('<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">'+$(this).find("a").text()+'<span class="caret"></span></a><ul class="dropdown-menu dropdowncostume"></url>');
								}

								$(this).find("ul").append('<li><a href="' + jdata[i].m_url + '">' + jdata[i].m_name + '</a></li>');
							}
						}
					});
				},
				error: function () {
					console.log("系统错误");
				}
			});
		</script>
	</body>

</html>
