<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add_Account</title>

<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/datepicker3.css" rel="stylesheet">
<link href="../css/bootstrap-table.css" rel="stylesheet">
<link href="../css/styles.css" rel="stylesheet">
<link href="../css/table.css" rel="stylesheet">
<link href="../css/font-awesome.min.css" rel="stylesheet">


<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

 <!-- library -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">
      <!-- CSS -->
      <!-- <link href="lib/css/compiled.min.css" rel="stylesheet"> -->
      <!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script> -->
      <!-- Bootstrap core CSS -->
      <!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->
      <!-- Material Design Bootstrap -->
      <link href="../lib/css/mdb.min.css" rel="stylesheet">
      <!-- Your custom styles (optional) -->
      <link href="../lib/css/style.css" rel="stylesheet">
      
      <!-- JQuery -->
      <script type="text/javascript" src="../lib/js/jquery-3.1.1.min.js"></script>
      <!-- Bootstrap tooltips -->
      <script type="text/javascript" src="../lib/js/tether.min.js"></script>
      <!-- MDB core JavaScript -->
      <script type="text/javascript" src="../lib/js/mdb.min.js"></script>
 <!--/libary -->

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> User <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="login.html"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg>Login</a></li>
							<li><a href="#"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul>
					</li>
				</ul>
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<ul class="nav menu">
			<li><a href="index.html"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg>Trang chủ</a></li>
			<li><a href="account.html"><svg class="glyph stroked calendar"><use xlink:href="#stroked-calendar"></use></svg>Account</a></li>
			<li ><a href="category.html"><svg class="glyph stroked pencil"><use xlink:href="#stroked-pencil"></use></svg>Category</a></li>
			<li class="active"><a href="menu.html"><svg class="glyph stroked line-graph"><use xlink:href="#stroked-line-graph"></use></svg>Menu</a></li>
			<li><a href="subject.html"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg>Subject</a></li>
			<li><a href="problem.html"><svg class="glyph stroked app-window"><use xlink:href="#stroked-app-window"></use></svg>Problem</a></li>
			<li><a href="editorial.html"><svg class="glyph stroked star"><use xlink:href="#stroked-star"></use></svg>Editorial</a></li>
			<li><a href="tutorial.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Tutorial</a></li>
			<li><a href="testcase.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Testcase</a></li>
			<li><a href="tutorialcode.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>TutorialCode</a></li>
			<li><a href="user.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>User</a></li>
			<li><a href="submit.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Submit</a></li>
			<li><a href="code.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Code</a></li>
			<li><a href="status.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Status</a></li>
			<li><a href="leaderboad.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Leaderboad</a></li>
			<li><a href="decentralization.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Decentralization</a></li>
		</ul>

	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Menu</h1>
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Add menu</div>
					<div class="panel-body">
						<div class="col-md-6">
							<html:form action="/add-menu.do" method="post">

								<div class="form-group">
									<label>Name</label>
									<html:text styleClass="form-control" 
										property="name" ></html:text>
									<label>positive</label>
									<html:text styleClass="form-control"
										  property="positive"></html:text>
								</div>
								<html:submit styleClass="btn btn-primary">Add</html:submit>
								<button type="reset" class="btn btn-default">Cancel</button></div>								
								
							</html:form>
					</div>
				</div>
			</div><!-- /.col-->
		</div><!-- /.row -->
		
	</div><!--/.main-->

	
	<script src="../js/jquery-1.11.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/chart.min.js"></script>
	<script src="../js/chart-data.js"></script>
	<script src="../js/easypiechart.js"></script>
	<script src="../js/easypiechart-data.js"></script>
	<script src="../js/bootstrap-datepicker.js"></script>
	<script src="../js/bootstrap-table.js"></script>
	<script>
		!function ($) {
			$(document).on("click","ul.nav li.parent > a > span.icon", function(){		  
				$(this).find('em:first').toggleClass("glyphicon-minus");	  
			}); 
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>	
</body>

</html>
