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
	你好<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="设备名称" id="name">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="语音IP" id="ONUVoiceIP">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="ss节点" id="SSnodeID">
	  <span class="input-group-btn">
		<button id="informationONU" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div>
	<script type="text/javascript">
		$(function(){
		
			$.ajax({
				url: "${ctx.basePath}/informationOfTerminal/pageAll?ascOrDesc='asc'&pageIndex=1&pageSize=5",
				success:function(result){	
					console.log(result);
				}
			});
			
			$("#informationONU").click(function(){
				var name = $("#name").val();
				var ONUVoiceIP = $("#ONUVoiceIP").val();
				var SSnodeID = $("#SSnodeID").val();
				$.ajax({
				url: "${ctx.basePath}/infotmationONU/info?ascOrDesc=asc&pageIndex=1&pageSize=10&name="+name+"&ONUVoiceIP="+ONUVoiceIP+"&SSnodeID="+SSnodeID,
				success:function(result){	
					console.log(result);
				}
			});
			});
		});
	</script>
</body>
</html>
