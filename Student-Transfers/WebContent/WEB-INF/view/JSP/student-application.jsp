<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="ui segment bg">
	<div id="main">
		<h1>Update User</h1>
		<hr>
		<div id="content" style="float: left">
			<form action="updateForm" method="post">

				University #1 - (Currently selected: ${student.getFirst_choice()})<br> <select name="uni1">
					<c:forEach var="uni" items="${universities}">
						<option>${uni.getUni_name()}</option>
					</c:forEach>
				</select> <br> University #2 - (Currently selected: ${student.getSecond_choice()}<br> <select name="uni2">
					<c:forEach var="uni2" items="${universities}">
						<option>${uni2.getUni_name()}</option>
					</c:forEach>
				</select>

				<p>
					Number of siblings that are attending university at the city you
					want to apply<br> <input type="text" name="sameCitySiblings"
						size="20" value="${student.getSame_city_siblings()}" />
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
				Are you from the same city as the university?<br>
				<c:choose>
						<c:when test="${student.isSame_city()==true}">
							<input type="radio" name="sameCity" value="true" checked> True<br>
  					<input type="radio" name="sameCity" value="false" > False<br>
						</c:when>
						<c:otherwise>
							<input type="radio" name="sameCity" value="true" > True<br>
  					<input type="radio" name="sameCity" value="false" checked> False<br>
						</c:otherwise>
					</c:choose>
					
					
				</p>
				<p>
					<input type="submit" value="Sumbit Form">
				</p>
			</form>
		</div>



		<div id="content2" style="float: right">
			<form>
				<p>
					Your points<br> <input type="text" name="points" size="20"
						value="${student.getStudent_points()}" />
				</p>
				<p>
					E1 verified<br>
					<c:choose>
						<c:when test="${student.isE1_verified()==true}">
							<font color="blue">True</font>
						</c:when>
						<c:otherwise>
							<font color="red">False</font>
						</c:otherwise>
					</c:choose>
				</p>
				<p>
					Ekkatharistiko verified<br>
					<c:choose>
						<c:when test="${student.isEkkatharistiko_verified()==true}">
							<font color="blue">True </font>
						</c:when>
						<c:otherwise>
							<font color="red">False</font>
						</c:otherwise>
					</c:choose>
				</p>
				<p>
					Police ID verified<br>
					<c:choose>
						<c:when test="${student.isPolice_identity_verified()==true}">
							<font color="blue">True </font>
						</c:when>
						<c:otherwise>
							<font color="red">False </font>
						</c:otherwise>
					</c:choose>
				</p>
				<p>
					Student ID verified<br>
					<c:choose>
						<c:when test="${student.isStudent_identity_verified()==true}">
							<font color="blue">True </font>
						</c:when>
						<c:otherwise>
							<font color="red">False </font>
						</c:otherwise>
					</c:choose>
				</p>
			</form>
		</div>
	</div>
</div>