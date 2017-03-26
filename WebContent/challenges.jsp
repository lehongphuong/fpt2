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
      <link class="animated bounce infinite" href="https://cdn.hrcdn.net/hackerrank/assets/favicon-5bb50091f1911aa90950eca8b575d496.ico" rel="shortcut icon" type="image/vnd.microsoft.icon" />
      <!-- Font Awesome -->
      <!-- w3 school -->
   	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  
  	<!-- <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->
  

      <!-- <link rel="stylesheet" href="css/font-awesome.min.css"> -->
      <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css"> -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

      <!-- CSS -->
      <link href="css/compiled1.min.css" rel="stylesheet">
      <!-- <link rel="stylesheet" href="http://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/compiled.min.css?ver=4.7.3" type='text/css' /> -->
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
      <!-- Bootstrap core CSS -->
      <!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->
      <!-- Material Design Bootstrap -->
      <link href="css/mdb.min.css" rel="stylesheet">
      <!-- Your custom styles (optional) -->
      <link href="css/style.css" rel="stylesheet">
      
      <!-- Material Design Icons -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    
     <!-- Customizer -->
    <link rel="stylesheet" href="https://mdbootstrap.com/live/_MDB/css/customizer.min.css">
      

  <!-- mirror editor-->
  <link rel="stylesheet" href="library/codemirror.css">
  <script src="library/codemirror.js"></script>
  <script src="library/selection-pointer.js"></script>
  <script src="library/xml.js"></script>
  <script src="library/javascript.js"></script>
  <script src="library/css.js"></script>
  <script src="library/vbscript.js"></script>
  <script src="library/htmlmixed.js"></script>
  <script src="library/markdown.js"></script>
  <script src="library/show-hint.js"></script>
  <script src="library/javascript-hint.js"></script>
  <link rel=stylesheet href="library/docs.css">
  <script src="library/matchbrackets.js"></script>
  <link rel="stylesheet" href="library/show-hint.css">
  <script src="library/clike.js"></script>
  <script src="library/python.js"></script>
  
  <style>.CodeMirror {border: 10px inset #dee;}</style>
  <!-- /mirror editor-->
  
  <!-- Khai bao doi tuong de dung trong file  -->
  <bean:define id="subject" name="challengesForm" property="subject" /> 
  
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
         
            <h6>CODING PROGRAM</h6>
         
        </a>
      </bold>
    </div>
    <div class="menuHori">
      <ul class="nav navbar-nav ml-auto flex-row">


        <bean:define id="idMenu" name="challengesForm" property="menuId"></bean:define>
        <bean:define id="idCate" name="challengesForm" property="cateId"></bean:define>
        <logic:iterate name="challengesForm" property="cateList" id="cate">

        <bean:define id="cateId1" name="cate" property="cateId"></bean:define>

        <logic:equal name="cate" property="menuId" value="${idMenu}">

        <logic:equal name="challengesForm" property="cateId" value="${cateId1}">
        <li class="nav-item menuActive">
          <html:link action="home-to-practics.do?menuId=${idMenu}&cateId=${cateId1}">
          <span class="hidden-sm-down uppercase"><bean:write name="cate" property="name"/></span>
          </html:link>
        </li>
      </logic:equal>

      <logic:notEqual name="challengesForm" property="cateId" value="${cateId1 }">
      <li class="nav-item">
        <html:link action="home-to-practics.do?menuId=${idMenu}&cateId=${cateId1}">
        <span class="hidden-sm-down uppercase"><bean:write name="cate" property="name"/></span>
        </html:link>
      </li>
    </logic:notEqual>

  </logic:equal>
</logic:iterate>


<logic:equal name="challengesForm" property="statusLogin" value="notLogin">
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

<logic:equal name="challengesForm" property="statusLogin" value="login">
<li class="nav-item dropdown">
  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    <i class="fa fa-user"></i> <span class="hidden-sm-down">
    <span class="uppercase"> WELCOME <bean:write name="challengesForm" property="username"/> </span>

  </span>
</a>
<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
  <html:link action="/user-logout.do" styleClass="dropdown-item">LOGOUT</html:link>
</div>
</li>
</logic:equal>

<logic:equal name="challengesForm" property="statusLogin" value="fail">
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

</div>
</nav>
<!-- /.Navbar -->
</header>
<!--Main layout--> 

<div class="container" style="margin-top:100px">

  <div style="float:right;  font-size:20px; margin-bottom:25px" class="row-lg-12">
    <button type="button" class="btn btn-outline-warning waves-effect">
     <span>Points: <bean:write name="challengesForm" property="point"/> </span>
     <span> Rank: </span><bean:write name="challengesForm" property="rank"/> </button>

     <hr>
   </div>


   <!-- main  -->
   <div class="row-lg-12 clearfix" style="margin-top:10px">
    <h1 style="color:#00C851;">${subject.title} <span> <i class="fa fa-bookmark" aria-hidden="true"></i></span></h1>
    <br>
    
 

    <!-- Nav tabs -->
    <div class="tabs-wrapper tabs-5">
      <ul class="nav classic-tabs tabs-grey" role="tablist" style="background-color:#33b5e5">
        <li class="nav-item">
          <a class="nav-link waves-light active" data-toggle="tab" href="#panel83" role="tab"><i class="fa fa-code fa-2x" aria-hidden="true"></i><br> Problem</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link waves-light" data-toggle="tab" href="#panel84" role="tab"><i class="fa fa-upload fa-2x" aria-hidden="true"></i><br> Submissions</a>
        </li>
        <li class="nav-item">
          <a class="nav-link waves-light" data-toggle="tab" href="#panel85" role="tab"><i class="fa fa-trophy fa-2x"  aria-hidden="true"></i><br> Leaderboard</a>
        </li>
        <li class="nav-item">
          <a class="nav-link waves-light" data-toggle="tab" href="#panel86" role="tab"><i class="fa fa-edit fa-2x" aria-hidden="true"></i><br> Editorial</a>
        </li>
      </ul>
    </div>

    <!-- Tab panels -->
    <div class="tab-content card">

     <!--problem 1-->
     <div class="tab-pane fade in show active" id="panel83" role="tabpanel">
      <!--define data problem-->
      <bean:define id="prob" name="challengesForm" property="problem"></bean:define>
      <div class="problemConstraint">
       <div class="time-limit">
        <div class="property-title">Time limit per test</div>
        <bean:write name="prob" property="constrain"/>
      </div>
      <div class="memory-limit">
        <div class="property-title">Memory limit per test</div>256 megabytes</div>
        <div class="input-file">
          <div class="property-title">Input</div>standard input</div>
          <div class="output-file">
            <div class="property-title">Output</div>standard output</div>
            
          </div>        
          
          
          <div>
            <bean:write name="prob" property="description"/>
          </div>
          <div class="input-specification">
            <div class="section-title">Input</div>
            <bean:write name="prob" property="inputRequire"/>
          </div>
          <div class="output-specification">
            <div class="section-title">Output</div>
            <bean:write name="prob" property="outputRequire"/>
          </div>
          <div class="sample-tests">
            <div class="section-title">Examples</div>
            <div class="sample-test">
              <div class="input">
                <div class="title">Input</div>
                
                <pre><bean:write name="prob" property="inputTestCase"/></pre>
              </div>
              <div class="output">
                <div class="title">Output</div>
                <pre><bean:write name="prob" property="outputTestCase"/></pre>
              </div>
              
            </div>
          </div>
          <div class="note">
            <div class="section-title">Explain</div>
            <p><bean:write name="prob" property="explain"/></p>
          </div>
          
          
          <!-- form run code -->
          <div class="col-lg-3 select-language btn-outline-default">
           <label for="sel1">SELECT LANGUAGE:</label>
           <html:select name="challengesForm" styleClass="form-control" property="editor" styleId="sel1">
           <html:option value="cpp">C++</html:option>
           <html:option value="JAVA">JAVA</html:option>
           <html:option value="PYTHON">PYTHON</html:option>
           </html:select>
         </div>
         

         <html:form action="/chanllenges.do?subId=${param.subId}&menuId=${param.menuId}&cateId=${param.cateId}&editor=cpp" styleId="cpp">

         </html:form>

         <html:form action="/chanllenges.do?subId=${param.subId}&menuId=${param.menuId}&cateId=${param.cateId}&editor=java" styleId="java">

         </html:form>

         <html:form action="/chanllenges.do?subId=${param.subId}&menuId=${param.menuId}&cateId=${param.cateId}&editor=python" styleId="python">

         </html:form>

         <script type="text/javascript">
//Material Select Initialization
$(document).ready(function() {
  $( "#sel1" ).change(function() {
    var action=$("#sel1").val();
    if(action=="cpp"){
      document.getElementById("cpp").submit();
    }
    if(action=="JAVA"){
      document.getElementById("java").submit();
    }
    if(action=="PYTHON"){
      document.getElementById("python").submit();
    }
  });
});
</script>

<br><br><br>


<html:form  action="/chanllenges.do?subId=${param.subId}&menuId=${param.menuId}&cateId=${param.cateId}&editor=${param.editor}&run=true" >

<!-- c++ -->

<logic:equal name="challengesForm" property="editor" value="cpp">
<a class="btn btn-outline-default btn-xlg waves-effect waves-light">C++ EDITOR</a>



<html:textarea name="challengesForm" property="codeSample"  styleId="code-c++">

</html:textarea>

<script type="text/javascript">
 var editor = CodeMirror.fromTextArea(document.getElementById("code-c++"), {
   lineNumbers: true,
   matchBrackets: true,
   indentUnit: 4,
   mode: "text/x-c++src"
 });
</script>


<br><br><br>
</logic:equal>

<!-- end c++ -->

<!-- python -->

<logic:equal name="challengesForm" property="editor" value="PYTHON">
<a class="btn btn-outline-default btn-xlg waves-effect waves-light">PYTHON EDITOR</a>
<html:textarea name="challengesForm" property="codeSample"   styleId="code-python">

</html:textarea>

<script type="text/javascript">
 var editor = CodeMirror.fromTextArea(document.getElementById("code-python"), {
   mode: {name: "python",
   version: 3,
   singleLineStringErrors: false},
   lineNumbers: true,
   indentUnit: 4,
   matchBrackets: true
 });
</script>



<br><br><br>
</logic:equal>

<!-- end python -->

<!-- java --> 

<logic:equal name="challengesForm" property="editor" value="JAVA">
<a class="btn btn-outline-default btn-xlg waves-effect waves-light">JAVA EDITOR</a>

<html:textarea name="challengesForm" property="codeSample"  styleId="code-java">

</html:textarea>

<script type="text/javascript">
 var editor = CodeMirror.fromTextArea(document.getElementById("code-java"), {
   lineNumbers: true,
   matchBrackets: true,
   indentUnit: 4,
   mode: "text/x-java"
 });
</script>




<br><br><br>
</logic:equal>

<!-- end java --> 



<script> 
  var mac = CodeMirror.keyMap.default == CodeMirror.keyMap.macDefault;
  CodeMirror.keyMap.default[(mac ? "Cmd" : "Ctrl") + "-Space"] = "autocomplete";
</script>



<!-- buttton -->

<div class="d-flex justify-content-end">
  <div class="mr-auto p-2">

    <fieldset class="form-group" style="margin-top:15px">
      <input type="checkbox" id="checkbox1" ng-model="myVar" ng-init="myVar = false">
      <label for="checkbox1">Test against custom input</label>
    </fieldset>
    
    <div ng-if="myVar">
      
      <html:textarea styleId="textarea1" name="challengesForm" styleClass="md-textarea"   property="inputUser">
      </html:textarea>
      
      <label for="textarea1">Type your Testcase</label>
    </div>


  </div>
  <div class="p-2">
    <html:submit  property="submit" value="runCode" styleClass="btn btn-outline-default waves-effect">RUN CODE</html:submit>
  </div>
  <div class="p-2">
    <html:submit   property="submit" value="submit" styleClass="btn btn-success waves-effect" onclick="loadDoc()">COMMIT</html:submit>
  </div>
</div>
<!-- end button -->



</html:form>

<!-- end form run code -->


<!-- result runcode  -->
<logic:equal name="challengesForm" property="run" value="runCode">
<h1><label class="label label-success">Result compiler</label></h1>

<div class="input">
 <div class="title">Input</div>
 
 <pre><bean:write name="challengesForm" property="inputTestCase"/></pre>
</div>

<logic:notEqual name="challengesForm" property="outputTestCase" value="inputUser">

<div class="output">
 <div class="title">Output</div>
 <pre><bean:write name="challengesForm" property="outputTestCase"/></pre>
</div>

</logic:notEqual>

<div class="output">
 <div class="title">Your Output</div>
 <pre><bean:write name="challengesForm" property="yourOutput"/></pre>
</div>
<logic:notEqual name="challengesForm" property="error" value="">
<div class="output">
 <div class="title">Error</div>
 <pre><bean:write name="challengesForm" property="error"/></pre>
</div>
</logic:notEqual>


</logic:equal>
<!-- end runcode  -->

<!-- begin  run code-->


<!-- result submit code -->
<logic:equal name="challengesForm" property="run" value="submit">

<h1><label class="label label-success">Result Commit</label></h1>


<logic:equal name="challengesForm" property="error" value="">

<div class="input">
 <div class="title">Number TestCase</div>
 
 <pre><bean:write name="challengesForm" property="numberTestCase"/></pre>
</div>

<logic:notEqual name="challengesForm" property="outputTestCase" value="inputUser">

<div class="output">
 <div class="title">Number Testcase Pass</div>
 <pre><bean:write name="challengesForm" property="testCasePass"/></pre>
</div>

</logic:notEqual>

<div class="output">
 <div class="title">Result Commit</div>
 <pre><bean:write name="challengesForm" property="result"/></pre>
</div>

</logic:equal>

<logic:notEqual name="challengesForm" property="error" value="">
<div class="output">
 <div class="title">Error</div>
 <pre><bean:write name="challengesForm" property="error"/></pre>
</div>
</logic:notEqual>
</logic:equal>
<!-- end submit code  -->


<logic:notEqual name="challengesForm" property="run" value="false">

<script type="text/javascript">
  $(document).ready(function() {
   
    $('html, body').animate({
      scrollTop: $(document).height()
    }, 1500);    
  });
</script>

</logic:notEqual>




</div>


<!--/.problem 1-->

<!--submittion 2-->

<div class="tab-pane fade" id="panel84" role="tabpanel">
  
  <div class="container">
  <table class="table table-hover">
	  <!--Table head-->
	  <thead>
	      <tr>
	        <th><h5><span class="badge red">Problem</span></h5></th>
	        <th><h5><span class="badge blue">Language</span></h5></th>
	        <th><h5><span class="badge black">Time</span></h5></th>
	        <th><h5><span class="badge yellow">Result</span></h5></th>
	        <th><h5><span class="badge pink">Score</span></h5></th>
	        <th></th>
	      </tr>
	  </thead>
	  <!--/Table head-->
	
	  <!--Table body-->
	  <tbody>
	  	<logic:iterate name="challengesForm" property="submitList" id="submit">
     <tr>
      <td> 
        ${subject.title}
      </td>
      <td> 
        <bean:write name="submit" property="language"/>
      </td>
      <td> 
        <bean:write name="submit" property="time"/>
      </td>
      <td> 
        <logic:equal name="submit" property="point" value="${subject.maxScore }">
        	<i class="fa fa-check" aria-hidden="true" style="color:green" ></i> Accept
        </logic:equal>
       <logic:notEqual name="submit" property="point" value="${subject.maxScore }">
        	<i class="fa fa-warning" aria-hidden="true" style="color:red"></i> Wrong Answer
        </logic:notEqual>
       </td>
      <td> 
        <jsp:getProperty name="submit" property="point"/>
        </td>
      <td> 
      	<!-- Modal view code -->
      	<bean:define id="submitId" name="submit" property="submitId"/>
        <button type="button" class="btn btn-outline-success waves-effect"
        class="dropdown-item" data-toggle="modal" data-target="#viewCode${submitId}">View Results <i class="fa fa-edit" aria-hidden="true"></i></button>
        <!-- end modal view code -->
       </td>
    	</tr>
  	</logic:iterate>
	  </tbody>
	  <!--/Table body-->
	</table>
	
	
 
</div>

</div>
<!--/.submition 2-->

<!--leaderboard 3-->
<div class="tab-pane fade" id="panel85" role="tabpanel">
   
  <div class="container">
  <table class="table table-hover">
    <thead>
      <tr>
      	<th><h5><span class="badge red">Rank</span></h5></th>
       	<th><h5><span class="badge blue">User</span></h5></th>
       	<th><h5><span class="badge black">Score</span></h5></th>
       	<th><h5><span class="badge yellow">Language</span></h5></th> 
        <th></th>
      </tr>
    </thead>
    <tbody>
    
     <logic:iterate name="challengesForm" property="leaderList" id="leader">
     
     <bean:define id="submitId" name="leader" property="submitId"/>
     
     <tr>
      <td> 
        <jsp:getProperty name="leader" property="leadId"/>
       </td>
      <td>
      	<bean:define id="userId" name="leader" property="leadId" ></bean:define>
      	<logic:iterate id="user" name="challengesForm" property="userList">
      		<logic:equal value="${userId}" name="user" property="userId">
      			<bean:write name="user" property="username"/>
      		</logic:equal>
      	</logic:iterate>
      	
      </td>
      	 <logic:iterate name="challengesForm" property="submitListLead" id="submit">
      	 	
      	 	<logic:equal value="${submitId }" name="submit" property="submitId">
      	 		<td><jsp:getProperty name="submit" property="point"/></td>
      	 		<td><bean:write name="submit" property="language"/></td>
      	 	</logic:equal>
      	 
      	 
      	 </logic:iterate>
       
       <td>
       
       <!-- Modal view code -->
      	
        <button type="button" class="btn btn-outline-success waves-effect"
        class="dropdown-item" data-toggle="modal" data-target="#viewCodeLead${submitId}">View Code <i class="fa fa-edit" aria-hidden="true"></i></button>
        <!-- end modal view code --> 
    
       </td>
    	</tr>
  	</logic:iterate>  
    </tbody>
  </table>
  
</div>



 

</div>
<!--/.leaderboard 3-->

<!--editorial 4-->
<bean:define id="edit" name="challengesForm" property="editorial"/>   
<div class="tab-pane" id="panel86" role="tabpanel">
 
	  
	  <div class="container">
		<p>
		<bean:write name="edit" property="explain"/>
		</p>  
	  </div>
	  	  
	  <pre class="code-toolbar language-markup">
<code class=" language-markup"><bean:write name="edit" property="code"/></code>
	</pre>
</div>

<!--/.edittorial 4-->

</div>

</div>

</div>


<!-- end main -->






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
      <li class="animated bounce infinite"><a href="#!" >Lê Hồng Phương</a></li>
      <li  ><a href="#!">Võ Thị Ngọc Hiền</a></li>
      <li  ><a href="#!">Nguyễn Thị Nương</a></li>
      <li  ><a href="#!">Võ Văn Hòa</a></li>
      <li  ><a href="#!">Nguyễn Duy Thức</a></li>
    </ul>
  </div>
  <!--/.Second column-->

  <hr class="hidden-md-up">

  <!--Third column-->
  <div class="col-md-2">
    <h5 class="title">Devoloper</h5>
    <ul>
      <li><a href="#!"  class="animated rubberBand infinite">© Full Stack ©</a></li>
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
 
 
 
 <!-- modal view code submit -->
 <logic:iterate name="challengesForm" property="submitList" id="submit"  >
      
      <!-- Modal view code -->
      <bean:define id="submitId" name="submit" property="submitId"/>
        
        <!-- Modal Login -->
         <div class="modal fade modal-ext animated bounceInLeft" id="viewCode${submitId}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
             <div class="modal-dialog" role="document">
                 <!--Content-->
                 <div class="modal-content">
                     <!--Header-->
                     <div class="modal-header">
                         <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                         <span aria-hidden="true">&times;</span></button>
                         <h3 class=" w-100"><i class="fa fa-code" aria-hidden="true"></i> View Code</h3>
                         <img class="animated bounce infinite" src="https://mdbootstrap.com/img/logo/mdb-transparent.png">
                     </div>
                     <!--Body-->
                     
                     <logic:equal name="submit" property="language" value="cpp">
                     	<html:textarea name="submit" property="code"  styleId="code-c++${submitId}">

						</html:textarea>
						
						<script type="text/javascript">
						 var editor = CodeMirror.fromTextArea(document.getElementById("code-c++"+${submitId}), {
						   
						   matchBrackets: true,
						   indentUnit: 4,
						   mode: "text/x-c++src"
						 });
						</script>
                     </logic:equal>
                     
                     <logic:equal name="submit" property="language" value="java">
                     	<html:textarea name="submit" property="code"   styleId="code-java${submitId}">

						</html:textarea>
						
						<script type="text/javascript">
						 var editor = CodeMirror.fromTextArea(document.getElementById("code-java"+${submitId}), {
						    
						   matchBrackets: true,
						   indentUnit: 4,
						   mode: "text/x-java"
						 });
						</script>
                     </logic:equal>
                     
                     <logic:equal name="submit" property="language" value="python">
                     
                     <html:textarea name="submit" property="code"  styleId="code-python${submitId}">

					</html:textarea>
					
					<script type="text/javascript">
					 var editor = CodeMirror.fromTextArea(document.getElementById("code-python"+${submitId}), {
					   mode: {name: "python",
					   version: 3,
					   singleLineStringErrors: false},
					    
					   indentUnit: 4,
					   matchBrackets: true
					 });
					</script>
                     
                     </logic:equal>
                     
                     <!--Footer-->
	                   <div class="modal-footer">
	                      
	                       <button type="button" class="btn btn-default ml-auto" onclick="close${submitId}()" data-dismiss="modal">Close</button>
	                   </div>
	                   
	                  <script type="text/javascript">
	                   
	                  	function close${submitId}(){
	                  		 $('#viewCode${submitId}').addClass('bounceOutRight');
	                  		setInterval(function() {
	                  			$('#viewCode${submitId}').removeClass('bounceOutRight');
	                  		}, 2000);
							
	                   	}
	                  
	                  </script>
                      
                     
                 </div>
                 <!--/.Content-->
             </div>
         </div>
   </logic:iterate>
   <!-- end modal view code --> 
        
        
        
     <!-- view code leader boad -->
      <logic:iterate name="challengesForm" property="submitListLead" id="submit">
      
        <bean:define id="submitId" name="submit" property="submitId"/>
        
        <!-- Modal Login -->
         <div class="modal fade modal-ext animated rollIn" id="viewCodeLead${submitId}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
             <div class="modal-dialog" role="document">
                 <!--Content-->
                 <div class="modal-content">
                     <!--Header-->
                     <div class="modal-header">
                         <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                         <span aria-hidden="true">&times;</span></button>
                         <h3 class=" w-100"><i class="fa fa-code" aria-hidden="true"></i> View Code</h3>
                         <img class="animated bounce infinite" src="https://mdbootstrap.com/img/logo/mdb-transparent.png">
                     </div>
                     <!--Body--> 
                 
			      			
			      		<logic:equal name="submit" property="language" value="cpp">
                     	<html:textarea name="submit" property="code"  styleId="lcode-c++${submitId}">

						</html:textarea>
						
						<script type="text/javascript">
						 var editor = CodeMirror.fromTextArea(document.getElementById("lcode-c++"+${submitId}), {
						   
						   matchBrackets: true,
						   indentUnit: 4,
						   mode: "text/x-c++src"
						 });
						</script>
                     </logic:equal>
                     
                     <logic:equal name="submit" property="language" value="java">
                     	<html:textarea name="submit" property="code"   styleId="lcode-java${submitId}">

						</html:textarea>
						
						<script type="text/javascript">
						 var editor = CodeMirror.fromTextArea(document.getElementById("lcode-java"+${submitId}), {
						    
						   matchBrackets: true,
						   indentUnit: 4,
						   mode: "text/x-java"
						 });
						</script>
                     </logic:equal>
                     
                     <logic:equal name="submit" property="language" value="python">
                     
                     <html:textarea name="submit" property="code"  styleId="lcode-python${submitId}">

					</html:textarea>
					
					<script type="text/javascript">
					 var editor = CodeMirror.fromTextArea(document.getElementById("lcode-python"+${submitId}), {
					   mode: {name: "python",
					   version: 3,
					   singleLineStringErrors: false},
					    
					   indentUnit: 4,
					   matchBrackets: true
					 });
					</script>
                     
                     </logic:equal>
			 			
                     
                     
                     
                     <!--Footer-->
	                   <div class="modal-footer">
	                      
	                       <button type="button" class="btn btn-default ml-auto" onclick="lclose${submitId}()" data-dismiss="modal">Close</button>
	                   </div>
	                   
	                  <script type="text/javascript">
	                  
	                  	function lclose${submitId}(){
	                  		 $('#viewCodeLead${submitId}').addClass('rollOut');
	                  		setInterval(function() {
	                  			$('#viewCodeLead${submitId}').removeClass('rollOut');
	                  		}, 2000);
							
	                   	}
	                  	
	                  </script>
                      
                     
                 </div>
                 <!--/.Content-->
             </div>
         </div>
        <!-- end modal view --> 
      	
       <!-- Modal view code -->
  	</logic:iterate>  
        
        <!-- end view code leader board -->
        


</body>

</html>