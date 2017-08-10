<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>国泰安资产盘点后台</title>
<link rel="shortcut icon" href="assets/img/favicon.ico">
<link rel="stylesheet" href="assets/css/amazeui.css" />
<link rel="stylesheet" href="assets/css/core.css" />
<link rel="stylesheet" href="assets/css/menu.css" />
<link rel="stylesheet" href="assets/css/index.css" />
<link rel="stylesheet" href="assets/css/admin.css" />
<link rel="stylesheet" href="assets/css/page/typography.css" />
<link rel="stylesheet" href="assets/css/page/form.css" />
<link rel="stylesheet" href="assets/css/component.css" />
</head>
<body>
	<!-- Begin page -->
	<header class="am-topbar am-topbar-fixed-top">
		<div class="am-topbar-left am-hide-sm-only">
			<a href="index" class="logo">${username }<i
				class="zmdi zmdi-layers"></i></a>
		</div>
	</header>
	<!-- end page -->


	<!-- ========== Left Sidebar Start ========== -->
	<div class="admin-sidebar am-offcanvas  am-padding-0"
		id="admin-offcanvas">
		<div class="am-offcanvas-bar admin-offcanvas-bar">
			<!-- User -->
			<div class="user-box am-hide-sm-only">
				<div class="user-img">
					<img src="assets/img/tx.png" alt="user-img" title="Mat Helme"
						class="img-circle img-thumbnail img-responsive">
					<div class="user-status offline">
						<i class="am-icon-dot-circle-o" aria-hidden="true"></i>
					</div>
				</div>
				<h5>
					<a href="loginoff">注销</a>
				</h5>
				<ul class="list-inline">
					<li><a href="#"> <i class="fa fa-cog" aria-hidden="true"></i>
					</a></li>

					<li><a href="" class="text-custom"> <i class="fa fa-cog"
							aria-hidden="true"></i>
					</a></li>
				</ul>
			</div>
			<!-- End User -->

			<ul class="am-list admin-sidebar-list">
				<li class="admin-parent"><a class="am-cf"
					data-am-collapse="{target: '#collapse-nav1'}"> <span
						class="am-icon-table"></span> 盘点任务 <span
						class="am-icon-angle-right am-fr am-margin-right"></span>
				</a>
					<ul class="am-list am-collapse admin-sidebar-sub am-in"
						id="collapse-nav1">
						<li><a href="index" class="am-cf">创建盘点任务</a></li>
						<li><a href="table_complete">查看盘点任务</a></li>
					</ul></li>
				<li class="admin-parent"><a class="am-cf"
					data-am-collapse="{target: '#collapse-nav2'}"><i
						class="am-icon-line-chart" aria-hidden="true"></i> 盘点分析 <span
						class="am-icon-angle-right am-fr am-margin-right"></span></a>
					<ul class="am-list am-collapse admin-sidebar-sub am-in"
						id="collapse-nav2">
						<li><a href="chart_line" class="am-cf">盘点状态</a></li>
					</ul></li>
				<li class="admin-parent"><a class="am-cf"
					data-am-collapse="{target: '#collapse-nav5'}"><span
						class="am-icon-file"></span> 系统设置<span
						class="am-icon-angle-right am-fr am-margin-right"></span></a>
					<ul class="am-list am-collapse admin-sidebar-sub am-in"
						id="collapse-nav5">
						<li><a href="form_basic">修改密码</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	<!-- ============================================================== -->
	<!-- Start right Content here -->
	<div class="content-page">
		<div class="content">
		<!-- col start -->
				<div class="am-u-md-6">
					<div class="card-box">
						<h4 class="header-title m-t-0 m-b-30">修改当前用户密码</h4>
						<form action="changePSWD" class="am-form am-form-horizontal">
							<input type="hidden" name="Username" value=${username } >
						  <div class="am-form-group">
						    <label for="doc-ipt-3" class="am-u-sm-3 am-form-label am-text-right am-padding-right-0">旧密码</label>
						    <div class="am-u-sm-9">
						      <input type="password" name="Password" id="doc-ipt-3" placeholder="请输入旧密码">
						    </div>
						  </div>
						
						  <div class="am-form-group">
						    <label for="doc-ipt-pwd-2" class="am-u-sm-3 am-form-label am-text-right am-padding-right-0">新密码</label>
						    <div class="am-u-sm-9">
						      <input type="password" name="newPSWD" id="doc-ipt-pwd-2" placeholder="设置一个新密码吧">
						    </div>
						  </div>
						  <div class="am-form-group">
						    <label for="doc-ipt-pwd-3" class="am-u-sm-3 am-form-label am-text-right am-padding-right-0">确认新密码</label>
						    <div class="am-u-sm-9">
						      <input type="password"  name="anewPSWD" id="doc-ipt-pwd-3" placeholder="再次输入新密码">
						    </div>
						  </div>
						  <div class="am-form-group">
						    <div class="am-u-sm-10 am-u-sm-offset-3">
						      <button type="submit" class="am-btn am-btn-default">修改</button>
						    </div>
						  </div>
						</form>
						<s:fielderror fieldName="UserMsg" ></s:fielderror><!-- 显示错误信息 -->
					</div>
				</div>
				<!-- col end -->
		
		</div>
	</div>
	<script type="text/javascript">
	alert("密码修改成功");
	</script>
	<script type="text/javascript" src="assets/js/jquery-2.1.0.js"></script>
	<script type="text/javascript" src="assets/js/amazeui.min.js"></script>
	<script type="text/javascript" src="assets/js/app.js"></script>
	<script type="text/javascript" src="assets/js/blockUI.js"></script>
	<script type="text/javascript" src="assets/js/charts/echarts.min.js"></script>
	<script type="text/javascript" src="assets/js/charts/indexChart.js"></script>

</body>

</html>
