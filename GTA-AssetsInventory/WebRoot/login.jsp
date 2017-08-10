<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link rel="shortcut icon" href="assets/img/favicon.ico">
<link rel="stylesheet" href="assets/css/core.css" />
<link rel="stylesheet" href="assets/css/menu.css" />
<link rel="stylesheet" href="assets/css/amazeui.css" />
<link rel="stylesheet" href="assets/css/component.css" />
<link rel="stylesheet" href="assets/css/page/form.css" />
</head>
<body>
	<div class="account-pages">
		<div class="wrapper-page">
			<div class="text-center">
			<span class="logo">国泰安资产盘点后台</span>
			</div>

			<div class="m-t-40 card-box">
				<div class="text-center">
					<h4 class="text-uppercase font-bold m-b-0">登 录</h4>
				</div>
				<div class="panel-body">
					<s:form action="login" cssclass="am-form">
						<div class="am-g">
							<div class="am-form-group">
								<input name="Username" type="text" style="width: 100%;height: 100%;" class="am-radius" placeholder="用户名">
							</div>

							<div class="am-form-group form-horizontal m-t-20">
								<input name="Password" type="password" style="width: 100%;height: 100%;" class="am-radius" placeholder="密码">
							</div>

							<div class="am-form-group ">
								<s:submit  cssClass="am-btn am-btn-primary am-radius"
									style="width: 100%;height: 100%;" value="登  录"></s:submit>
							</div>
							</div>
					</s:form>
							<s:fielderror fieldName="msg" ></s:fielderror><!-- 显示错误信息 -->
							<div class="am-form-group ">
								<a class="text-muted"><i class="fa fa-lock m-r-5"></i> 忘记密码请RTX联系-企业信息化_吴春灵</a>
							</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
