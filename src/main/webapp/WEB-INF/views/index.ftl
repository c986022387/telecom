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

InfomationOfTerminal：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="逻辑ID" id="logicID">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="终端唯一标识符" id="terminalUniqueIdentifier">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="型号" id="typeNumber">
	  <span class="input-group-btn"></span>
	  <input type="text" class="form-control" placeholder="软件版本" id="versionOfSoftware">
	  <span class="input-group-btn">
		<button id="informationOfTerminal" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>

	InfomationONU：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="设备名称" id="name">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="语音IP" id="ONUVoiceIP">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="ss节点" id="SSnodeID">
	  <span class="input-group-btn">
		<button id="informationONU" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	
	FTTB_IP_IMS：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="IMS_OLT" id="IMS_OLT">
	  <span class="input-group-btn">
		<button id="FTTB_IP_IMS" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	FTTB_IP_NGN：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="NGN_OLT" id="NGN_OLT">
	  <span class="input-group-btn">
		<button id="FTTB_IP_NGN" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	FTTH_IP：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="FTTH_IP_OLT" id="FTTH_IP_OLT">
	  <span class="input-group-btn">
		<button id="FTTH_IP" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	InformationOLT：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="InformationOLT_OLT" id="InformationOLT_OLT">
	  <span class="input-group-btn">
		<button id="InformationOLT" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	InformationPON：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="InformationPON_deviceName" id="InformationPON_deviceName">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="InformationPON_sVlan" id="InformationPON_sVlan">
	  <span class="input-group-btn">
		<button id="InformationPON" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	UP_LINK：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="UP_LINK_oltDeviceName" id="UP_LINK_oltDeviceName">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="UP_LINK_serviceName" id="UP_LINK_serviceName">
	  <span class="input-group-btn">
		<button id="UP_LINK" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	CongestionDetailOfPON：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="maximumBandwidthRatio_Out" id="maximumBandwidthRatio_Out">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="maximumBandwidthRatio_In" id="maximumBandwidthRatio_In">
	  <span class="input-group-btn">
		<button id="CongestionDetailOfPON" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	CongestionDetailOfUpLink：<br>
	<div class="input-group" >
	  <input type="text" class="form-control" placeholder="maximumBandwidthRatio_Out" id="maximumBandwidthRatio_Out2">
	  <span class="input-group-addon fix-border fix-padding"></span>
	  <input type="text" class="form-control" placeholder="maximumBandwidthRatio_In" id="maximumBandwidthRatio_In2">
	  <span class="input-group-btn">
		<button id="CongestionDetailOfUpLink" class="btn btn-default" type="button">搜索</button>
	  </span>
	</div><br><br>
	
	<div id="json"></div>
	<script type="text/javascript">
		$(function(){
			
			$("#informationONU").click(function(){
				var name = $("#name").val();
				var ONUVoiceIP = $("#ONUVoiceIP").val();
				var SSnodeID = $("#SSnodeID").val();
				$.ajax({
					url: "${ctx.basePath}/infotmationONU/info?ascOrDesc=asc&pageIndex=1&pageSize=5&name="+name+"&ONUVoiceIP="+ONUVoiceIP+"&SSnodeID="+SSnodeID,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			
			$("#informationOfTerminal").click(function(){
				var logicID = $("#logicID").val();
				var terminalUniqueIdentifier = $("#terminalUniqueIdentifier").val();
				var typeNumber = $("#typeNumber").val();
				var versionOfSoftware = $("#versionOfSoftware").val();
				$.ajax({
					url: "${ctx.basePath}/informationOfTerminal/info?ascOrDesc=asc&pageIndex=1&pageSize=5&logicID="+logicID+"&terminalUniqueIdentifier="+terminalUniqueIdentifier+"&typeNumber="+typeNumber+"&versionOfSoftware="+versionOfSoftware,
					success:function(result){	
						console.log(result);
						$("#json").append(JSON.stringify(result));
					}
				});
			});
			
			$("#FTTB_IP_IMS").click(function(){
				var IMS_OLT = $("#IMS_OLT").val();
				$.ajax({
					url: "${ctx.basePath}/ims/info?ascOrDesc=asc&pageIndex=1&pageSize=10&olt="+IMS_OLT,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			$("#FTTB_IP_NGN").click(function(){
				var NGN_OLT = $("#NGN_OLT").val();
				$.ajax({
					url: "${ctx.basePath}/ngn/info?ascOrDesc=asc&pageIndex=1&pageSize=10&olt="+NGN_OLT,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			$("#FTTH_IP").click(function(){
				var FTTH_IP_OLT = $("#FTTH_IP_OLT").val();
				$.ajax({
					url: "${ctx.basePath}/ftth/info?ascOrDesc=asc&pageIndex=1&pageSize=10&olt="+FTTH_IP_OLT,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			$("#InformationOLT").click(function(){
				var InformationOLT_OLT = $("#InformationOLT_OLT").val();
				$.ajax({
					url: "${ctx.basePath}/olt/info?ascOrDesc=asc&pageIndex=1&pageSize=10&olt="+InformationOLT_OLT,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			$("#InformationPON").click(function(){
				var InformationPON_deviceName = $("#InformationPON_deviceName").val();
				var InformationPON_sVlan = $("#InformationPON_sVlan").val();
				$.ajax({
					url: "${ctx.basePath}/pon/info?ascOrDesc=asc&pageIndex=1&pageSize=10&deviceName=" + InformationPON_deviceName + "&sVlan=" + InformationPON_sVlan,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			$("#UP_LINK").click(function(){
				var UP_LINK_oltDeviceName = $("#UP_LINK_oltDeviceName").val();
				var UP_LINK_serviceName = $("#UP_LINK_serviceName").val();
				$.ajax({
					url: "${ctx.basePath}/up_link/info?ascOrDesc=asc&pageIndex=1&pageSize=10&oltDeviceName=" + UP_LINK_oltDeviceName + "&serviceName=" + UP_LINK_serviceName,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			$("#CongestionDetailOfPON").click(function(){
				var maximumBandwidthRatio_Out = $("#maximumBandwidthRatio_Out").val();
				var maximumBandwidthRatio_In = $("#maximumBandwidthRatio_In").val();
				$.ajax({
					url: "${ctx.basePath}/congestionDetailOfPON/info?ascOrDesc=asc&pageIndex=1&pageSize=10&maximumBandwidthRatio_In=" + maximumBandwidthRatio_In + "&maximumBandwidthRatio_Out=" + maximumBandwidthRatio_Out,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
			$("#CongestionDetailOfUpLink").click(function(){
				var maximumBandwidthRatio_Out = $("#maximumBandwidthRatio_Out2").val();
				var maximumBandwidthRatio_In = $("#maximumBandwidthRatio_In2").val();
				$.ajax({
					url: "${ctx.basePath}/congestionDetailOfUpLink/info?ascOrDesc=asc&pageIndex=1&pageSize=10&maximumBandwidthRatio_In=" + maximumBandwidthRatio_In + "&maximumBandwidthRatio_Out=" + maximumBandwidthRatio_Out,
					success:function(result){	
						console.log(result);
					}
				});
			});
			
		});
	</script>
</body>
</html>
