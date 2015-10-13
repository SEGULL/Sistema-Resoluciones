<%@include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${not empty resolucion.id}">
		<c:url value="resoluciones/${resolucion.id}" var="urlSubmit">
		</c:url>
	</c:when>
	<c:otherwise>
		<c:url value="resoluciones/nuevo" var="urlSubmit">
		</c:url>
	</c:otherwise>
</c:choose>
<form action="${urlSubmit}" method="POST" id="formulario">
	<h1>Registro de Resoluciones</h1>
	<p>
		<input type="text" value="${resolucion.nombre}" name="nombre"
			placeholder="Nombre" autofocus="autofocus" required>
	</p>
	
	<p>
		<input type="submit" value="Guardar">&nbsp;&nbsp;&nbsp;<input
			type="button" value="Cancelar" onclick="upeu.cargarUrl('resoluciones/');">
		<c:if test="${not empty resolucionss.id}">
			<input type="hidden" name="id" value="${resolucion.id}">
		</c:if>
	</p>
</form>
<script>
	upeu.enviarFormulario({
		id : 'formulario',
		target : 'contenido'
	});
</script>