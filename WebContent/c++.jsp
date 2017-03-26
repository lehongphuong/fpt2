<!doctype html>

<meta charset="utf-8"/>
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

 

<style>.CodeMirror {border: 7px inset #dee;}</style>
 
<article  >

choose language
<select ng-model="myVar">
  <option value="C">C
  <option value="C++">C++
  <option value="JAVA">JAVA
  <option value="PYTHON">PYTHON
</select>

<hr>
<div >
   <div >
    <h2>C-like mode</h2>

    <div><textarea id="c-code">
      
    </textarea></div>
    
  </div>
  <div  >
       <h2>C++ example</h2>

      <div><textarea id="cpp-code">

      </textarea></div>
  </div>
  <div  >
      <h2>Java example</h2>

      <div><textarea id="java-code">

      </textarea></div>
  </div>
  <div  >
      <h2>Python mode</h2>

      <div><textarea id="code-python" name="code-python">


      </textarea></div>
  </div>

  <div  >
      <h2>HTML mode</h2>

      <div><textarea id="code-html" name="code-html">
		
		<!DOCTYPE html>
		<html> 
		 <body>
		    <h1>My First Heading</h1>
		    <p>My first paragraph.</p>
		    </body>
		</html>
      </textarea></div>
      
  </div>
     
</div>


 


  <script>
    var cEditor = CodeMirror.fromTextArea(document.getElementById("c-code"), {
      lineNumbers: true,
      matchBrackets: true,
      mode: "text/x-csrc"
    });
    var cppEditor = CodeMirror.fromTextArea(document.getElementById("cpp-code"), {
      lineNumbers: true,
      matchBrackets: true,
      mode: "text/x-c++src"
    });
    var javaEditor = CodeMirror.fromTextArea(document.getElementById("java-code"), {
      lineNumbers: true,
      matchBrackets: true,
      mode: "text/x-java"
    });

    var editor = CodeMirror.fromTextArea(document.getElementById("code-python"), {
      mode: {name: "python",
      version: 3,
      singleLineStringErrors: false},
      lineNumbers: true,
      indentUnit: 4,
      matchBrackets: true
    });
    var editor = CodeMirror.fromTextArea(document.getElementById("code-html"), {
      mode: {name: "htmlmixed",
      version: 3,
      singleLineStringErrors: false},
    
      lineNumbers: true,
      indentUnit: 4,
      matchBrackets: true
    });

    var mac = CodeMirror.keyMap.default == CodeMirror.keyMap.macDefault;
    CodeMirror.keyMap.default[(mac ? "Cmd" : "Ctrl") + "-Space"] = "autocomplete";
  </script>
</article>

