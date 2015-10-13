<%@include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${not empty curso.id}">
		<c:url value="items/editar" var="urlSubmit">
		</c:url>
	</c:when>
	<c:otherwise>
		<c:url value="items/nuevo" var="urlSubmit">
		</c:url>
	</c:otherwise>
</c:choose>
<form action="${urlSubmit}" method="POST" id="formulario">
	<h1>Registro de Items</h1>
	<p>
		<input type="text" value="${item.nombre}" name="nombre"
			placeholder="Nombre" autofocus="autofocus" required>
	</p>
	<p>
		<input type="text" value="${item.tipo}" name="tipo"
			placeholder="Tipo" autofocus="autofocus" required>
	</p>
	
	<p>
		<input type="submit" value="Guardar">&nbsp;&nbsp;&nbsp;<input
			type="button" value="Cancelar" onclick="upeu.cargarUrl('items/');">
		<c:if test="${not empty item.id}">
			<input type="hidden" name="id" value="${item.id}">
		</c:if>
	</p>
</form>
<script>
	upeu.enviarFormulario({
		id : 'formulario',
		target : 'contenido'
	});
</script>