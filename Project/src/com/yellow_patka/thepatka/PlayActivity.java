<!DOCTYPE html>
<html>
 <head>
 	<title>1st Homework - DOM</title>
 	<style type="text/css">
 	 	#boxesCount{
 	 		
 	 	}
 		#boxes{
 			width: 90%;
 			height: 600px;
 			border: 1px solid #BBB;
 			margin: 10px auto;
 		}
 		.box{
 			width: 20px;
 			height: 20px;
 			border: 1px solid #BBB;
 		}
 	</style>
 </head>
 <body>
  <input id='boxesCount' style='border: 1px solid #BBB;' size='30' placeholder='The count of the boxes you want to create'><input type='submit' onClick='boxesCreate()' value='Go!'>
  <div id='boxes'>

  </div>
  <script type="text/javascript">
 	 function boxesCreate(){
 	 	var count = document.getElementById("boxesCount").value;
 	 	var startTime = new Date();
 	 	for(var i=1; i<=bo