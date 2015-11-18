<!DOCTYPE html>
<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<html lang="en">
<head>
<!--	<meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>System Election</title>
<link rel="icon" href="<%=request.getContextPath()%>/images/favicon.ico"
	type="image/x-icon" />
<%@ include file="/WEB-INF/jsp/include/include.jsp"%>
</head>
<body>
	<header id="site_head">
		<%@ include file="/WEB-INF/jsp/include/header.jsp"%>
	</header>

	<div class="container">

		<table>
			<tr>
				<td>
					<menu>
							<%@ include file="/WEB-INF/jsp/include/menu.jsp"%>
					</menu>
				</td>
				<td>
					<div class="containerBody">
						<decorator:body />
					</div>					
				</td>
			</tr>
		</table>

		<footer>
			<%@ include file="/WEB-INF/jsp/include/footer.jsp"%>
		</footer>
	</div>

</body>

</html>

