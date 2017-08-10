<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
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
		<!-- Start content -->
		<div class="content">
			<div class="am-g">
				<!-- Row start -->
				<div class="am-u-sm-12">
					<div class="card-box">

						<h4 class="header-title m-t-0 m-b-30">盘点任务状态</h4>
						<div class="am-scrollable-horizontal am-text-ms"
							style="font-family: '微软雅黑';">
							<table class="am-table   am-text-nowrap">
								<thead>
									<tr>
										<th>任务号</th>
										<th>任务名称</th>
										<th>盘点开始时间</th>
										<th>盘点结束时间</th>
										<th>盘点方式</th>
										<th>备注</th>
										<th>状态</th>
									</tr>
								</thead>
								<tbody>
									<s:iterator value="#tasklist">
										<tr>
										<td><s:property value="Taskid" /></td>
										<td><s:property value="TaskName" /></td>
										<td><s:property value="TaskStartDate" /></td>
										<td><s:property value="TaskEndDate" /></td>
										<td><s:property value="Type" /></td>
										<td><s:property value="Remarks" /></td>
										<td><span class="label label-success">已发布</span></td>
										</tr>
									</s:iterator>
									
								</tbody>
							</table>
						</div>
					</div>


				</div>
			</div>
		</div>
	</div>
	<!-- Row end -->




	<a href="admin-offcanvas"
		class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"> </a>

	<script type="text/javascript" src="assets/js/jquery-2.1.0.js"></script>
	<script type="text/javascript" src="assets/js/amazeui.min.js"></script>
	<script type="text/javascript" src="assets/js/app.js"></script>
	<script type="text/javascript" src="assets/js/blockUI.js"></script>
	<script type="text/javascript" src="assets/js/charts/echarts.min.js"></script>
	<script type="text/javascript" src="assets/js/charts/indexChart.js"></script>

</body>

</html>
