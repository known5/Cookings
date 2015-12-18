<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Bootstrap stuff -->
	<link rel="stylesheet" href="bootstrap/css/bootstrap.css">

	<link rel="stylesheet" href="styles.css"></link>
</head>
<body class="menu-page">
	<div class="container">


		<div class="jumbotron">
			<h1>Lasagna ingredients</h1>
		</div>


		<div class="row">
			<div class="col-sm-4">
				<div class="card">
					<h2>Must haves</h2>
					<ul>
						<li>Pasta sheets</li>
						<li>Mozzarella</li>
						<li>Canned tomatoes</li>
						<li>Milk</li>
						<li>Flour</li>
						<li>Butter</li>
					</ul>
				</div>
			</div>



			<div class="col-sm-4">

				<div class="card">
					<h2>Other</h2>
					<form>
						<ul>
							<li>
								<input type="checkbox" id="c1" name="cc">
								<label for="c1">Ground beef</label>
							</li>
							<li>
								<input type="checkbox" id="c2" name="cc">
								<label for="c2">Spinach</label>
							</li>
							<li>
								<input type="checkbox" id="c3" name="cc">
								<label for="c3">Courgette</label>
							</li>
							<li>
								<input type="checkbox" id="c4" name="cc">
								<label for="c4">Eggplant</label>
							</li>
							<li>
								<input type="checkbox" id="c5" name="cc">
								<label for="c5">Carrots</label>
							</li>
							<li>
								<input type="checkbox" id="c6" name="cc">
								<label for="c6">Feta cheese</label>
							</li>
							<li>
								<input type="checkbox" id="c7" name="cc">
								<label for="c7">Parmesan</label>
							</li>
							<li>
								<input type="checkbox" id="c8" name="cc">
								<label for="c8">Mushroom</label>
							</li>
						</ul>
					</form>
				</div>

			</div>



			<div class="col-sm-4">

				<div class="card">
					<h2>Spices</h2>
					<form>
						<ul>
							<li>
								<input type="checkbox" id="c1" name="cc">
								<label for="c1">Basil</label>
							</li>
							<li>
								<input type="checkbox" id="c2" name="cc">
								<label for="c2">Parsley</label>
							</li>
							<li>
								<input type="checkbox" id="c3" name="cc">
								<label for="c3">Oregano</label>
							</li>
							<li>
								<input type="checkbox" id="c4" name="cc">
								<label for="c4">Nutmeg</label>
							</li>
							<li>
								<input type="checkbox" id="c5" name="cc">
								<label for="c5">Bay leaf</label>
							</li>
						</ul>
					</form>
				</div>

			</div>


		</div>


	</div>


	<script src="media/jquery-2.1.4.min.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>
	<script src="main.js"></script>
</body>
</html>
