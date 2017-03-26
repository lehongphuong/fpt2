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
                        
                        <style>
                            .bg-skin-lp {
                                background-image: url('img/custom/carouse.jpg');
                                background-size: cover;
                                background-repeat: no-repeat;
                                background-position: center center;
                                background-attachment: fixed;
                            }
                        </style>
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
                                            <bold>
                                                <h6>CODING PROGRAM</h6>
                                            </bold>
                                        </a>
                                    </bold>
                                </div>
                                <ul class="nav navbar-nav ml-auto flex-row">

                                    <logic:iterate id="menu" name="homeForm" property="menuList">

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <span class="hidden-sm-down uppercase"><bean:write name="menu" property="name"/></span>
                                            </a>
                                            <bean:define id="menuId" name="menu" property="menuId"></bean:define>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                                <logic:iterate name="homeForm" property="cateList" id="cate">
                                                    <logic:equal name="cate" property="menuId" value="${menuId}">
                                                        <bean:define id="idMenu" name="cate" property="menuId"></bean:define>
                                                        <bean:define id="idCate" name="cate" property="cateId"></bean:define>
                                                        <html:link styleClass="dropdown-item" action="/home-to-practics.do?menuId=${idMenu}&cateId=${idCate}&tutId=1">
                                                            <span class="uppercase"><bean:write name="cate" property="name"/></span>
                                                        </html:link>
                                                    </logic:equal>
                                                </logic:iterate>
                                            </div>
                                        </li>
                                    </logic:iterate>

                                    <logic:equal name="homeForm" property="statusLogin" value="notLogin">
                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <i class="fa fa-user"></i> <span class="hidden-sm-down">ACCOUNT</span>
                                            </a>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                                <a class="dropdown-item" data-toggle="modal" data-target="#modal-login">LOGIN</a>
                                                <a class="dropdown-item" data-toggle="modal" data-target="#modal-register">REGISTER</a>
                                            </div>
                                        </li>
                                    </logic:equal>

                                    <logic:equal name="homeForm" property="statusLogin" value="login">
                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <i class="fa fa-user"></i> <span class="hidden-sm-down">
                  <span class="uppercase"> WELCOME <bean:write name="homeForm" property="username"/> </span>

                                                </span>
                                            </a>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                                <html:link action="/user-logout.do" styleClass="dropdown-item">LOGOUT</html:link>
                                            </div>
                                        </li>
                                    </logic:equal>

                                    <logic:equal name="homeForm" property="statusLogin" value="fail">
                                        <!-- Modal Login -->
                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <i class="fa fa-user"></i> <span class="hidden-sm-down">LOGIN FAIL PLEASE AGAIN</span>
                                            </a>
                                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                                <a class="dropdown-item" data-toggle="modal" data-target="#modal-login">LOGIN</a>
                                                <a class="dropdown-item" data-toggle="modal" data-target="#modal-register">LOGOUT</a>
                                            </div>
                                        </li>
                                    </logic:equal>

                                </ul>
                            </nav>
                            <!-- /.Navbar -->
                        </header>
                        <!--/.Double navigation-->
                        <!--Main layout-->
                        <div class="containerfluid">

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
                                            <h3 class="w-100"><i class="fa fa-user"></i>Login</h3>
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





                            <!--Carousel Wrapper-->
                            <div id="carousel-example-2" class="carousel slide carousel-fade" data-ride="carousel">
                                <!--Indicators-->
                                <ol class="carousel-indicators">
                                    <li data-target="#carousel-example-2" data-slide-to="0" class="active"></li>
                                    <li data-target="#carousel-example-2" data-slide-to="1"></li>
                                    <li data-target="#carousel-example-2" data-slide-to="2"></li>
                                </ol>
                                <!--/.Indicators-->
                                <!--Slides-->
                                <div class="carousel-inner" role="listbox">
                                    <div class="carousel-item active">
                                        <div class="view hm-black-light">
                                            <img src="https://mdbootstrap.com/img/Photos/Slides/img%20(22).jpg" alt="First slide">
                                        </div>
                                        <div class="carousel-caption">
                                            <h3 class="h3-responsive">Light mask</h3>
                                            <p>First text</p>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <!--Mask color-->
                                        <div class="view hm-black-strong">
                                            <img src="https://mdbootstrap.com/img/Photos/Slides/img%20(23).jpg" alt="Second slide">
                                        </div>
                                        <div class="carousel-caption">
                                            <h3 class="h3-responsive">Strong mask</h3>
                                            <p>Secondary text</p>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <!--Mask color-->
                                        <div class="view hm-black-slight">
                                            <img src="https://mdbootstrap.com/img/Photos/Slides/img%20(24).jpg" alt="Third slide">
                                        </div>
                                        <div class="carousel-caption">
                                            <h3 class="h3-responsive">Slight mask</h3>
                                            <p>Third text</p>
                                        </div>
                                    </div>
                                </div>
                                <!--/.Slides-->
                                <!--Controls-->
                                <a class="carousel-control-prev" href="#carousel-example-2" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#carousel-example-2" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                                <!--/.Controls-->
                            </div>
                            <!--/.Carousel Wrapper-->



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
                                            <li><a href="#!">Võ Thị Ngọc Hiền©</a></li>
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

                        <!-- SCRIPTS -->
                        <script type="text/javascript" src="js/compiled.min.js"></script>
                        <script>
                            $(".button-collapse").sideNav();

                            var el = document.querySelector('.custom-scrollbar');
                            Ps.initialize(el);
                            $(document).ready(function() {
                                $(window).scroll(function() {
                                    if ($(this).scrollTop() > 50) {
                                        $('#back-to-top').fadeIn();
                                    } else {
                                        $('#back-to-top').fadeOut();
                                    }
                                });
                                // scroll body to 0px on click
                                $('#back-to-top').click(function() {
                                    $('#back-to-top').tooltip('hide');
                                    $('body,html').animate({
                                        scrollTop: 0
                                    }, 800);
                                    return false;
                                });

                                $('#back-to-top').tooltip('show');

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