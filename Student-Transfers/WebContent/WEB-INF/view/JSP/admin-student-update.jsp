<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="ui segment bg">


	<h1>Select Student</h1>
	<hr>


	<div id="content" style="float: left">
		<form action="update" method="post">

			<p>
				ID: ${student.student_id}
			</p>
			<p>
				First Name<br> <input type="text" name="student_first_name"
					size="20" value="${student.student_first_name}" />
			</p>
			<p>
				Last Name<br> <input type="text" name="student_last_name"
					size="20" value="${student.student_last_name}" />
			</p>
			<p>
				Mail<br> <input type="text" name="student_mail" size="20"
					value="${student.student_mail}" />
			</p>
			<p>
				Password<br> <input type="text" name="student_password"
					size="20" value="${student.student_password}" />
			</p>

			University - (${student.student_uni})<br> <select name="uni">
				<c:forEach var="uni" items="${unis}">
					<option>${uni.getUni_name()}</option>
				</c:forEach>
			</select>
			<br>
			University choice #1 - (${student.first_choice})<br> <select name="uni1">
				<c:forEach var="uni" items="${unis}">
					<option>${uni.getUni_name()}</option>
				</c:forEach>
			</select>
			<br>
			University choice #2 - (${student.second_choice})<br> <select name="uni2">
				<c:forEach var="uni" items="${unis}">
					<option>${uni.getUni_name()}</option>
				</c:forEach>
			</select>

			<p>
				Number of siblings that are attending university at the same city<br>
				<input type="text" name="same_city_siblings" size="20"
					value="${student.same_city_siblings}" />
			</p>
			<p>
				Number of under aged siblings<br> <input type="text"
					name="underagedSiblings" size="20"
					value="${student.getUnderaged_siblings()}" />
			</p>
			<p>
				Family income<br> <input type="text" name="familyIncome"
					size="20" value="${student.getFamily_income()}" />
			</p>
			<p>
				<input type="submit" value="Update">
			</p>
		</form>
	</div>



</div>








