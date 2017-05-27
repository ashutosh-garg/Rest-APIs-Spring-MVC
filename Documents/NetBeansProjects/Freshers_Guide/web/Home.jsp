<html>
<head>
    <script>var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1} 
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none"; 
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block"; 
  dots[slideIndex-1].className += " active";
}</script>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #47B0CB;
}

#footer {
   position:fixed;
   bottom:0;
   width:100%;
   height:60px;
   background-color: #47B0CB;
}
li {
    float: right;
}
.bottom {
    float : middle;
}
li a {
    display: block;
    color: white;
    padding: 30px 15px;
    text-decoration: none;
}
li.title{
    float : left;
    text-align : center;
    color : white;
    padding: 30px 15px;
}
div{
    padding: 0;
}
li a:hover {
    background-color: #899193;
}
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

.mySlides {
    display: none;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  margin-top: -22px;
  padding: 16px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  cursor:pointer;
  height: 13px;
  width: 13px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

</style>
</head>
<body>
<ul>
<li class="title"><font face="Comic Sans MS" size="5"><b>FRESHERS GUIDE</b></font></li>
<li><a href="contact.jsp">Call Us : (+91) 9672116541</a></li>
<li><a href="Registration_Form.jsp">Register</a></li>
<li><a href="Login_Form1.jsp">Login</a></li>
<li><a href="Home.jsp">Home</a></li>
</ul>
   
<div class="slideshow-container"> <center>

  <div class="mySlides fade">
    <img src="img1.jpg" style="width:960px;height:340px;">
  </div>

  <div class="mySlides fade">
      <img src="img2.jpg" style="width:800px;height:340px;">
  </div>

  <div class="mySlides fade">
      <img src="img3.jpg" style="width:800px;height:340px;">
  </div>
<div class="mySlides fade">
    <img src="img4.jpg" style="width:600px;height:340px;">
  </div>
<div class="mySlides fade">
    <img src="img5.jpg" style="width:800px;height:340px;">
  </div>
<div class="mySlides fade">
    <img src="img6.jpg" style="width:960px;height:340px;">
  </div>
</center>
  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
  <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>
<br>

<div style="text-align:center">
  <span class="dot" onclick="currentSlide(1)"></span> 
  <span class="dot" onclick="currentSlide(2)"></span> 
  <span class="dot" onclick="currentSlide(3)"></span> 
  <span class="dot" onclick="currentSlide(4)"></span>
  <span class="dot" onclick="currentSlide(5)"></span>
  <span class="dot" onclick="currentSlide(6)"></span>
</div>
<center>
<h1 id="title" style="color:white;text-shadow :5px 5px 8px black; padding : 50px; background-color : #DFDFDF;">"Whether its the Question of Rooms or Food, Freshers Guide is always there for you!"</h1>
</center>

<ul id="footer">
<li><a href="contact.jsp">Contact Us</a></li>
<li><a href="about.jsp">About Us</a></li>
<li><a href="terms.jsp">Privacy & Terms</a></li>
</ul>
</body>
</html>
