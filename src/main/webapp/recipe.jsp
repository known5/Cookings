<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Bootstrap stuff -->
	<link rel="stylesheet" href="bootstrap/css/bootstrap.css">

	<link rel="stylesheet" href="styles.css"></link>
</head>
<body class="steps-page">

	<div id="main">
		<div class="current-step-block card">
			<div class="current-step-image-wrapper">
				<div class="current-step-image" style="background-image: url('media/img/lasagne.jpg');"></div>
			</div>
			<h2>Get a lasagne</h2>
			<p class="tips">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
		</div>
	</div>

	<aside id="step-overview">
		<ul id="steps">
			<li class="done" data-page="steps/not-found.jsp">Cut the onions the right way this time</li>
			<li class="done" data-page="steps/not-found.jsp">Blow up your stuff</li>
			<li class="done" data-page="steps/not-found.jsp">Discard onions</li>
			<li class="done" data-page="steps/not-found.jsp">Cut the onions the right way this time</li>
			<li class="active" data-page="steps/take-stuff.jsp">Take stuff</li>
			<li data-page="steps/cut-onions.jsp">Cut onions</li>
			<li data-page="steps/alt-take-stuff.jsp">Take stuff</li>
			<li data-page="steps/alt-cut-onions.jsp">Cut onions</li>
			<li data-page="steps/not-found.jsp">Get more stuff!</li>
			<li data-page="steps/not-found.jsp">Discard onions</li>
			<li data-page="steps/not-found.jsp">Blow up your stuff</li>
			<li data-page="steps/not-found.jsp">Discard onions</li>
			<li data-page="steps/not-found.jsp">Cut the onions the right way this time</li>
			<li data-page="steps/not-found.jsp">Blow up your stuff</li>
			<li data-page="steps/not-found.jsp">Discard onions</li>
			<li data-page="steps/not-found.jsp">Cut the onions the right way this time</li>
			<li data-page="steps/not-found.jsp">Blow up your stuff</li>
		</ul>
	</aside>

	<script src="media/jquery-2.1.4.min.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>
	<script src="main.js"></script>
</body>
</html>
