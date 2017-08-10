<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
			<div class="am-u-md-3" style="width: 100%;">

				<div class="card-box">

					<h4 class="header-title m-t-0 m-b-30">盘点进度</h4>
					<div class="widget-box-2">
						<div class="widget-detail-2">
							<span class="badge  pull-left m-t-20  am-round"
								style="color: #fff; background: #0e90d2;">${pro }% <i
								class="zmdi zmdi-trending-up"></i>
							</span>
							<p class="text-muted m-b-25">已盘点：${proed }</p>
						</div>
						<div class="am-progress am-progress-xs am-margin-bottom-0">
							<div class="am-progress-bar" style="width: ${pro }%"></div>
						</div>
					</div>
				</div>

			</div>
		</div>
		<!-- Row start -->
		<div class="am-g">
			<div class="am-u-sm-12">
				<form class="am-form">
					<table class="am-table am-table-striped am-table-hover table-main">
						<thead>
							<tr>
								<th class="table-type">资产编号</th>
								<th class="table-type">资产名称</th>
								<th class="table-type">采购时间</th>
								<th class="table-type">配置说明</th>
								<th class="table-type">价格</th>
								<th class="table-type">使用状态</th>
								<th class="table-type">存放地点</th>
								<th class="table-type">使用部门</th>
								<th class="table-type">使用人</th>
								<th class="table-type">备注</th>
								<th class="table-type">盘点状态</th>
								<th class="table-type">盘点人</th>
								<th class="table-set">操作</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="#aiTaskList" status="stuts">
								<tr>
									<s:iterator><td><s:property/></td></s:iterator>
									<td>
									
										<div class="am-btn-toolbar">
											<div class="am-btn-group am-btn-group-xs">
											<a href="assets/img/aiimages/tyy.jpg"  target="_black" class="am-btn am-btn-default am-btn-xs am-text-secondary">
											<span class="am-icon-pencil-square-o">资产图片</span></a>
											<style> .am-icon-pencil-square-o:hover{width:450px; height:300px;background:url("assets/img/aiimages/tyy.jpg");}
											</style>
											</div>
										</div>
									</td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
					<div class="am-cf">
						共 <s:property value="#aiTaskList.size()"/> 条记录
						<div class="am-fr">
							<ul class="am-pagination">
								<li class="am-disabled"><a href="#">«</a></li>
								<li class="am-active"><a href="#">1</a></li>
								<li><a href="#">»</a></li>
							</ul>
						</div>
					</div>
					<hr />
				</form>
			</div>
		</div>
	</div>
	<!-- col end -->
	<script type="text/javascript" src="assets/js/jquery-2.1.0.js"></script>
	<script type="text/javascript" src="assets/js/amazeui.min.js"></script>
	<script type="text/javascript" src="assets/js/app.js"></script>
	<script type="text/javascript" src="assets/js/blockUI.js"></script>
	<script type="text/javascript" src="assets/js/charts/echarts.min.js"></script>
	<script type="text/javascript" src="assets/js/charts/indexChart.js"></script>
	
</body>

</html>
