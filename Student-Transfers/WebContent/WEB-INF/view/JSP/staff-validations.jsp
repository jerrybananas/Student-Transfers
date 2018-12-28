<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<div class="ui segment bg">
	<h1>Documents of
		${student.getStudent_first_name()}-${student.getStudent_last_name()}</h1>
	<hr>


	<div id="content2" style="float: left">
		<form action="Documents" method="post">
			<p>
				E1 verified<br>
				<c:choose>
					<c:when test="${student.isE1_verified()==true}">
						<input type="radio" name="E1_verified" value="true" checked> True<br>
						<input type="radio" name="E1_verified" value="false"> False<br>
					</c:when>
					<c:otherwise>
						<input type="radio" name="E1_verified" value="true"> True<br>
						<input type="radio" name="E1_verified" value="false" checked> False<br>
					</c:otherwise>
				</c:choose>
			</p>
			<p>
				Ekkatharistiko verified<br>
				<c:choose>
					<c:when test="${student.isEkkatharistiko_verified()==true}">
						<input type="radio" name="Ekkatharistiko_verified" value="true"
							checked> True<br>
						<input type="radio" name="Ekkatharistiko_verified" value="false"> False<br>
					</c:when>
					<c:otherwise>
						<input type="radio" name="Ekkatharistiko_verified" value="true"> True<br>
						<input type="radio" name="Ekkatharistiko_verified" value="false"
							checked> False<br>
					</c:otherwise>
				</c:choose>
			</p>
			<p>
				Police ID verified<br>
				<c:choose>
					<c:when test="${student.isPolice_identity_verified()==true}">
						<input type="radio" name="Police_identity_verified" value="true"
							checked> True<br>
						<input type="radio" name="Police_identity_verified" value="false"> False<br>
					</c:when>
					<c:otherwise>
						<input type="radio" name="Police_identity_verified" value="true"> True<br>
						<input type="radio" name="Police_identity_verified" value="false"
							checked> False<br>
					</c:otherwise>
				</c:choose>
			</p>
			<p>
				Student ID verified<br>
				<c:choose>
					<c:when test="${student.isStudent_identity_verified()==true}">
						<input type="radio" name="Student_identity_verified" value="true"
							checked> True<br>
						<input type="radio" name="Student_identity_verified" value="false"> False<br>
					</c:when>
					<c:otherwise>
						<input type="radio" name="Student_identity_verified" value="true"> True<br>
						<input type="radio" name="Student_identity_verified" value="false"
							checked> False<br>
					</c:otherwise>
				</c:choose>
			</p>
			<p>
				<input type="submit" value="Submit">
			</p>
		</form>
	</div>
</div>
