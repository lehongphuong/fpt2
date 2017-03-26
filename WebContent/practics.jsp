<%@page import="model.bean.Status"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- Required meta tags always come first -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <meta http-equiv="x-ua-compatible" content="ie=edge">
      <title>Học lập trình trực tuyến</title>
      <link href="https://cdn.hrcdn.net/hackerrank/assets/favicon-5bb50091f1911aa90950eca8b575d496.ico" rel="shortcut icon" type="image/vnd.microsoft.icon" />
      <!-- Font Awesome -->
      <!-- w3 school -->
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

      <!-- <link rel="stylesheet" href="css/font-awesome.min.css"> -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

      <!-- CSS -->
      <link href="css/compiled.min.css" rel="stylesheet">
      <!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script> -->
      <!-- Bootstrap core CSS -->
      <!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->
      <!-- Material Design Bootstrap -->
      <link href="css/mdb.min.css" rel="stylesheet">
      <!-- Your custom styles (optional) -->
      <link href="css/style.css" rel="stylesheet">
      <!-- Customizer -->
    <link rel="stylesheet" href="https://mdbootstrap.com/live/_MDB/css/customizer.min.css">

      <!-- miror coded -->
      <link rel=stylesheet href="lib/codemirror.css">
      <link rel=stylesheet href="doc/docs.css">
      <script src="lib/codemirror.js"></script>
      <script src="mode/xml/xml.js"></script>
      <script src="mode/javascript/javascript.js"></script>
      <script src="mode/css/css.js"></script>
      <script src="mode/htmlmixed/htmlmixed.js"></script>
      <script src="addon/edit/matchbrackets.js"></script>

      <script src="doc/activebookmark.js"></script>
       
   </head>

   <body class="fixed-sn light-blue-skin bg-skin-lp" ng-app="">
   
   <!-- Customizer -->
    <div id="customizer" class="z-depth-1">
        <a href="#" id="toggle"><i class="fa fa-cog" aria-hidden="true"></i></a>
        <div class="inner">
            <p class="text-center customizer-heading">Pick a skin color</p>
            <ul class="skins-list">
                <li><a href="#" data-skin-color="deep-purple-skin"><span class="color skin-deep-purple"></span></a></li>
                <li><a href="#" data-skin-color="navy-blue-skin"><span class="color skin-navy-blue"></span></a></li>
                <li><a href="#" data-skin-color="cyan-skin"><span class="color skin-cyan"></span></a></li>
                <li><a href="#" data-skin-color="pink-skin"><span class="color skin-pink"></span></a></li>
                <li><a href="#" data-skin-color="indigo-skin"><span class="color skin-indigo"></span></a></li>
                <li><a href="#" data-skin-color="light-blue-skin"><span class="color skin-light-blue"></span></a></li>
                <li><a href="#" data-skin-color="grey-skin"><span class="color skin-grey"></span></a></li>
                <li><a href="#" data-skin-color="white-skin"><span class="color skin-white"></span></a></li>
                <li><a href="#" data-skin-color="black-skin"><span class="color skin-black"></span></a></li>
                <li><a href="#" data-skin-color="mdb-skin"><span class="color skin-mdb"></span></a></li>
            </ul>
            <p class="text-center customizer-heading">SideNav Background Type</p>
            <form class="form-inline">
                <fieldset class="form-group">
                    <input name="group1" type="radio" id="radio11" value="flat">
                    <label for="radio11">Flat</label>
                </fieldset>

                <fieldset class="form-group">
                    <input name="group1" type="radio" id="radio21" value="gradient">
                    <label for="radio21">Gradient</label>
                </fieldset>

                <fieldset class="form-group">
                    <input name="group1" type="radio" id="radio31" value="background" checked="checked">
                    <label for="radio31">Image</label>
                </fieldset>
            </form>

            <div id="bg-option">


                <p class="text-center customizer-heading">Mask opacity</p>

                <form class="form-inline">
                    <fieldset class="form-group">
                        <input name="group3" type="radio" id="radio13" value="strong" checked="checked">
                        <label for="radio13">Strong</label>
                    </fieldset>

                    <fieldset class="form-group">
                        <input name="group3" type="radio" id="radio23" value="light">
                        <label for="radio23">Light</label>
                    </fieldset>

                    <fieldset class="form-group">
                        <input name="group3" type="radio" id="radio33" value="slight">
                        <label for="radio33">Slight</label>
                    </fieldset>
                </form>
            </div>

            <div>
                <p class="text-center customizer-heading d-inline">Fixed sidenav</p>
                <div class="switch d-inline-block float-right">
                    <label>
                        Off
                        <input type="checkbox" checked="checked">
                        <span class="lever"></span> On
                    </label>
                </div>
            </div>

        </div>
    </div>
    <!-- /.Customizer -->


      <!--Double navigation-->
      <header>
         <!-- Navbar -->
         <nav class="navbar navbar-toggleable-md navbar-dark scrolling-navbar double-nav fixed-top">
            <!-- SideNav slide-out button -->
            <div class="float-xs-left">
               <a href="home.do"><img class="animated bounce infinite" style="margin-left:20px" src="img/custom/logo.png" /></a>
            </div>
            <!-- Breadcrumb-->
            <div class="breadcrumb-dn mr-auto">
               <bold>
                  <a class="nav-link" href="home.do">
                     <bold><h6>CODING PROGRAM</h6></bold>
                  </a>
               </bold>
            </div>
            <div class="menuHori">
            <ul class="nav navbar-nav ml-auto flex-row">

               
			 <bean:define id="idMenu" name="practicsForm" property="menuId"></bean:define>
             <bean:define id="idCate" name="practicsForm" property="cateId"></bean:define>
             <logic:iterate name="practicsForm" property="cateList" id="cate">
             
             		<bean:define id="cateId1" name="cate" property="cateId"></bean:define>
             		
	              	<logic:equal name="cate" property="menuId" value="${idMenu}">
	              		
	              		<logic:equal name="practicsForm" property="cateId" value="${cateId1}">
	              		<li class="nav-item menuActive" >
			                 <html:link 
	                		action="home-to-practics.do?menuId=${idMenu}&cateId=${cateId1}">
	                		 <span class="hidden-sm-down uppercase"  ><bean:write name="cate" property="name"/></span>
	                		</html:link>
		               </li>
	              		</logic:equal>
	              		
	              		<logic:notEqual name="practicsForm" property="cateId" value="${cateId1 }">
	              		<li class="nav-item" >
			                 <html:link  
	                		action="home-to-practics.do?menuId=${idMenu}&cateId=${cateId1}">
	                		 <span class="hidden-sm-down uppercase"  ><bean:write name="cate" property="name"/></span>
	                		</html:link>
		               </li>
	              		</logic:notEqual>
                		
                	</logic:equal>
            	</logic:iterate>


               <logic:equal name="practicsForm" property="statusLogin" value="notLogin">
              	<li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user"></i> <span class="hidden-sm-down">ACCOUNT</span>
                  </a>
                  <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                     <a class="dropdown-item"  data-toggle="modal" data-target="#modal-login">LOGIN</a>
                     <a class="dropdown-item" data-toggle="modal" data-target="#modal-register">REGISTER</a>
                  </div>
               </li>
              </logic:equal>
              
               <logic:equal name="practicsForm" property="statusLogin" value="login">
              	<li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user"></i> <span class="hidden-sm-down">
                  <span class="uppercase"> WELCOME <bean:write name="practicsForm" property="username"/> </span>
						
				</span>
                  </a>
                  <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                  	<html:link action="/user-logout.do" styleClass="dropdown-item">LOGOUT</html:link>
                  </div>
               </li>
              </logic:equal>  
              
              <logic:equal name="practicsForm" property="statusLogin" value="fail">
               <!-- Modal Login -->
              	<li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user"></i> <span class="hidden-sm-down">LOGIN FAIL PLEASE AGAIN</span>
                  </a>
                  <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                     <a class="dropdown-item"  data-toggle="modal" data-target="#modal-login">LOGIN</a>
                     <a class="dropdown-item" data-toggle="modal" data-target="#modal-register">LOGOUT</a>
                  </div>
               </li>
              </logic:equal>

            </div>
         </nav>
         <!-- /.Navbar -->
      </header>
      <!--Main layout-->
      
      
      
      <!-- Modal Login -->
      <div class="modal fade modal-ext" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog" role="document">
              <!--Content-->
              <div class="modal-content">
                  <!--Header-->
                  <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                      </button>
                      <h3 class="w-100"><i class="fa fa-user"></i> Login</h3>
                  </div>
                  <!--Body-->
                  <html:form action="/user-login">
                  		<div class="modal-body">
	                      <div class="md-form">
	                          <i class="fa fa-envelope prefix"></i>
	                          <html:text property="username" styleId="form2" styleClass="form-control"></html:text>
	                          <label for="form2">Your email</label>
	                      </div>
	
	                      <div class="md-form">
	                          <i class="fa fa-lock prefix"></i>
	                          <html:password property="password" styleId="form3" styleClass="form-control"></html:password>
	                          <label for="form3">Your password</label>
	                      </div>
	                      <div class="text-center">
	                          <html:submit styleClass="btn btn-primary btn-md">Login</html:submit>
	                      </div>
	                  </div>
                  </html:form>
                  <!--Footer-->
                  <div class="modal-footer">
                      <div class="options text-right">
                          <p>Not a member? <a href="#">Sign Up</a></p>
                          <p>Forgot <a href="#">Password?</a></p>
                      </div>
                      <button type="button" class="btn btn-default ml-auto" data-dismiss="modal">Close</button>
                  </div>
              </div>
              <!--/.Content-->
          </div>
      </div>


                           
      <!-- Modal Register -->
      <div class="modal fade modal-ext" id="modal-register" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog" role="document">
              <!--Content-->
              <div class="modal-content">
                  <!--Header-->
                  <div class="modal-header flex-column">
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                      </button>
                      <h3 class="w-100"><i class="fa fa-user"></i> Register with:</h3>
                      <div class="flex-row">
                          <a href="" class="btn-floating btn-fb btn-small"><i class="fa fa-facebook"></i></a>
                          <a href="" class="btn-floating btn-tw btn-small"><i class="fa fa-twitter"></i></a>
                          <a href="" class="btn-floating btn-gplus btn-small"><i class="fa fa-google-plus"></i></a>
                          <a href="" class="btn-floating btn-li btn-small"><i class="fa fa-linkedin"></i></a>
                          <a href="" class="btn-floating btn-git btn-small"><i class="fa fa-github"></i></a>
                      </div>
                  </div>
                  <!--Body-->
                  <div class="modal-body">
                      <div class="md-form">
                          <i class="fa fa-envelope prefix"></i>
                          <input type="text" id="form2" class="form-control">
                          <label for="form2">Your email</label>
                      </div>

                      <div class="md-form">
                          <i class="fa fa-lock prefix"></i>
                          <input type="password" id="form3" class="form-control">
                          <label for="form3">Your password</label>
                      </div>

                      <div class="md-form">
                          <i class="fa fa-lock prefix"></i>
                          <input type="password" id="form4" class="form-control">
                          <label for="form4">Repeat password</label>
                      </div>

                      <div class="text-center">
                          <button class="btn btn-primary btn-lg">Sign up</button>

                          <fieldset class="form-group">
                              <input type="checkbox" id="checkbox1">
                              <label for="checkbox1">Subscribe me to the newsletter</label>
                          </fieldset>
                      </div>
                  </div>
                  <!--Footer-->
                  <div class="modal-footer">
                      <div class="options">
                          <p>Already have an account? <a href="#">Log in</a></p>
                      </div>
                      <button type="button" class="btn btn-default ml-auto" data-dismiss="modal">Close</button>
                  </div>
              </div>
              <!--/.Content-->
          </div>
      </div>
      

         
      <div class="container" style="margin-top:100px">

      <div style="float:right;  font-size:20px; margin-bottom:25px" class="row-lg-12">
         <button type="button" class="btn btn-outline-warning waves-effect">
         Points: <bean:write name="practicsForm" property="point"/>
         Rank: <bean:write name="practicsForm" property="rank"/> </button>
         
         <hr>
      </div>
      
      <logic:iterate name="practicsForm" property="subList" id="sub">
      	<bean:define id="subId" name="sub" property="subId"></bean:define>
    	<bean:define id="successRate" name="sub" property="successRate"></bean:define>
    	<bean:define id="maxScore" name="sub" property="maxScore"></bean:define>
    	
    		
    	<div class="row-lg-12 clearfix" style="margin-top:10px">
         <!--Card Light-->
         
            <div class="card hoverable">
                <!--Card content-->
                <div class="card-block">
                    <!--Social shares button-->
                    <a class="activator"></a>   
                    <!--Title-->
                    <h4 class="card-title">
                    <span><i class="fa fa-share-alt"></i></span>
                    <bean:write name="sub" property="title"/>
                    </h4>
                    <hr>
                    <!--Text-->
                    <div class="row-lg-12">
                        <div class="col-lg-5">
                        <p class="card-text" style="margin-top:15px">
                           <span>Success Rate: ${ successRate } </span>
                           <span>Max Score: ${ maxScore } </span> 
                           <span>Difficulty: <bean:write name="sub" property="difficutly"/></span>
                        </p>
                        </div>
                       
                          
                        <!--set trang thai cho button try again and try now-->
                         <logic:iterate id="subTemp" name="practicsForm" property="subListTemp">
                         	<logic:equal name="subTemp" property="subId" value="${subId }">
                         		<bean:define id="status" name="subTemp" property="title"></bean:define>
                         	</logic:equal>
                         </logic:iterate>
                         
                         <logic:equal name="status" value="true">
                         	 <a href="chanllenges.do?subId=${subId}&menuId=${menuId}&cateId=${cateId}&editor=cpp" class="black-text d-flex flex-row-reverse">
	                        <button type="button" class="btn btn-outline-default waves-effect">Try Again
	                        <span><i class="fa fa-chevron-right"></i></span>
	                        </button>
	                       	</a>
                         </logic:equal>
                         
                         <logic:equal name="status" value="false">
                         	<a href="chanllenges.do?subId=${subId}&menuId=${menuId}&cateId=${cateId}&editor=cpp" class="black-text d-flex flex-row-reverse">
	                        <button type="button" class="btn btn-success">Try Now
	                        <span><i class="fa fa-chevron-right"></i></span>
	                        </button>
	                       	</a>
                         </logic:equal>
                         
                  
                    
                        
                    </div>
                </div>
                <!--/.Card content-->
            </div>
            <!--/.Card Light-->
         </div>
    		
   	</logic:iterate>

      

         
      

         <div class="col-lg-12">
            <!--Pagination teal-->
            <nav>
                <ul class="pagination pg-teal">
                    <!--Arrow left-->
                    <li class="page-item">
                        <a class="page-link" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                            <span class="sr-only">Previous</span>
                        </a>
                    </li>

                    <!--Numbers-->
                    <li class="page-item active"><a class="page-link">1</a></li>
                    <li class="page-item"><a class="page-link">2</a></li>
                    <li class="page-item"><a class="page-link">3</a></li>
                    <li class="page-item"><a class="page-link">4</a></li>
                    <li class="page-item"><a class="page-link">5</a></li>

                    <!--Arrow right-->
                    <li class="page-item">
                        <a class="page-link" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>
                </ul>
            </nav>
            <!--/Pagination teal-->
         </div>


      </div>


      <!--Footer-->
      <footer class="page-footer center-on-small-only">

          <!--Footer Links-->
          <div class="container-fluid">
              <div class="row">

                  <!--First column-->
                  <div class="col-md-3 offset-md-1">
                      <h5 class="title">FPT CODING PROGRAM</h5>
                      <p>Team 11 INTERN in FPTSoftware.</p>
                  </div>
                  <!--/.First column-->

                  <hr class="hidden-md-up">

                  <!--Second column-->
                  <div class="col-md-2 offset-md-1">
                      <h5 class="title">My's name team</h5>
                      <ul>
                          <li class="animated bounce infinite"><a href="#!">Lê Hồng Phương</a></li>
                          <li><a href="#!">Võ Thị Ngọc Hiền</a></li>
                          <li><a href="#!">Nguyễn Thị Nương</a></li>
                          <li><a href="#!">Võ Văn Hòa</a></li>
                          <li><a href="#!">Nguyễn Duy Thức</a></li>
                      </ul>
                  </div>
                  <!--/.Second column-->

                  <hr class="hidden-md-up">

                  <!--Third column-->
                  <div class="col-md-2">
                      <h5 class="title">Devoloper</h5>
                      <ul>
                          <li><a href="#!">© Full Stack ©</a></li>
                          <li><a href="#!">Front End & Content</a></li>
                          <li><a href="#!">Front End & Content</a></li>
                          <li><a href="#!">Coding & Front End</a></li>
                          <li><a href="#!">Coding & Designer</a></li>
                      </ul>
                  </div>
                  <!--/.Third column-->

                  <hr class="hidden-md-up">

                  <!--Fourth column-->
                  <div class="col-md-3">
                      <h5 class="title">University</h5>
                      <ul>
                          <li><a href="#!">Phạm Văn Đồng - Quảng Ngãi</a></li>
                          <li><a href="#!">Kinh Tế Huế - Huế</a></li>
                          <li><a href="#!">Phạm Văn Đồng - Quảng Ngãi</a></li>
                          <li><a href="#!">Quảng Nam - Quảng Nam</a></li>
                          <li><a href="#!">Quảng Nam - Quảng Nam</a></li>
                      </ul>
                  </div>
                  <!--/.Fourth column-->

              </div>
          </div>
          <!--/.Footer Links-->


          <!--Social buttons-->
          <div class="social-section">
              <ul>
                  <li><a class="btn-floating btn-small btn-fb"><i class="fa fa-facebook"> </i></a></li>
                  <li><a class="btn-floating btn-small btn-tw"><i class="fa fa-twitter"> </i></a></li>
                  <li><a class="btn-floating btn-small btn-gplus"><i class="fa fa-google-plus"> </i></a></li>
                  <li><a class="btn-floating btn-small btn-li"><i class="fa fa-linkedin"> </i></a></li>
                  <li><a class="btn-floating btn-small btn-git"><i class="fa fa-github"> </i></a></li>
                  <li><a class="btn-floating btn-small btn-pin"><i class="fa fa-pinterest"> </i></a></li>
                  <li><a class="btn-floating btn-small btn-ins"><i class="fa fa-instagram"> </i></a></li>
              </ul>
          </div>
          <!--/.Social buttons-->

          <!--Copyright-->
          <div class="footer-copyright">
              <div class="container-fluid">
                  © 2017 Copyright: <a href="https://www.dct13.appsot.com"> Lehongphuong.io </a>

              </div>
          </div>
          <!--/.Copyright-->

      </footer>
      <!--/.Footer-->




      

      <!-- back to top  -->
         
         
      <!-- SCRIPTS -->
      <script type="text/javascript" src="js/compiled.min.js"></script>
      <script>
         $(".button-collapse").sideNav();
             
         var el = document.querySelector('.custom-scrollbar');
         Ps.initialize(el);
         $(document).ready(function(){
         $(window).scroll(function () {
            if ($(this).scrollTop() > 50) {
                $('#back-to-top').fadeIn();
            } else {
                $('#back-to-top').fadeOut();
            }
         });
         // scroll body to 0px on click
         $(document).ready(function(){
               $('body').append('<div id="toTop" class="btn btn-info"><span class="glyphicon glyphicon-chevron-up"></span> Back to Top</div>');
               $(window).scroll(function () {
                  if ($(this).scrollTop() != 0) {
                     $('#toTop').fadeIn();
                  } else {
                     $('#toTop').fadeOut();
                  }
               }); 
             $('#toTop').click(function(){
                 $("html, body").animate({ scrollTop: 0 }, 600);
                 return false;
             });
         });

      </script>
      <!-- SCRIPTS -->
      <!-- JQuery -->
      <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
      <!-- Bootstrap tooltips -->
      <script type="text/javascript" src="js/tether.min.js"></script>
      <!-- MDB core JavaScript -->
      <script type="text/javascript" src="js/mdb.min.js"></script>
       <!-- Customizer -->
    <script type="text/javascript" src="https://mdbootstrap.com/live/_MDB/js/customizer.min.js"></script>
   </body>
</html>