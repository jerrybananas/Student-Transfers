<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="ui segment bg">

	<div id="content" style="float: left">
		<form:form action="saveUniversity" modelAttribute="university"
			method="POST" class="ui form">
			<h1>${university.uni_name}</h1>


			<p>
				University Grouping:<br> <input type="text"
					name="eligible_uni_id" size="20" value="${university.eligible_uni_id}" />
			</p>
			<p>
				University seats for transfer Students:<br> <input type="text"
					name="uni_seats" size="20" value="${university.uni_seats}" />
			</p>
			<p>
				<input type="submit" value="Update University">
			</p>
		</form:form>
	</div>


</div>

