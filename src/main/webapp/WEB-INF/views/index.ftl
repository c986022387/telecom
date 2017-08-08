<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    
    <link rel="stylesheet" type="text/css" href="${ctx.basePath}/static/zui/css/zui.min.css" />
    <link rel="stylesheet" type="text/css" href="${ctx.basePath}/static/zui/lib/datetimepicker/datetimepicker.css"/>
    <script src="/volcano/static/js/jquery.min.js"></script>
</head>
<body>
	你好
	
	<script type="text/javascript">
		$(function(){
		
			$.ajax({
				url: "${ctx.basePath}/informationOfTerminal/pageAll?ascOrDesc='desc'&pageIndex=1&pageSize=5",
				success:function(result){	
					console.log(result);			
				}
			});
		});
	</script>
</body>
</html>
