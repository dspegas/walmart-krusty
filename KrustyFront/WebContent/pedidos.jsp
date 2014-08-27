<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>DataTables example</title>
<style type="text/css" title="currentStyle">
@import "resources/css/demo_table.css";
</style>
<script type="text/javascript" language="javascript"
	src="resources/js/jquery.js"></script>
<script type="text/javascript" language="javascript"
	src="resources/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		var oTable = $('#PedidoPorStatus').dataTable(
						{
							"processing" : true,
							"ajax" : {
								"url" : "/KrustyFront/KrustyServlet",
								"type" : "GET"
							}
						});
	});
</script>
</head>
<body id="dt_pedidoStatus">

	<div id="dynamic">
		<table cellpadding="0" cellspacing="0" border="0" class="display" id="PedidoPorStatus">
			<thead>
				<tr>
					<th width="10%">Id Pedido</th>
					<th width="10%">Status</th>
				</tr>
			</thead>
		</table>
	</div>
</body>

</html>