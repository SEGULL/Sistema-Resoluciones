<%@include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${not empty resolucion.items}">
		<form action="resoluciones/${resolucion.id}/items/editar" method="post"
			id="formulario">
			<table class="tabla-cebra">
				<caption>Selecciona los items</caption>
				<tr>
					<th>#</th>
					<th>Nombre</th>
					<th>Tipo</th>
					
				</tr>
				<c:forEach items="${resolucion.items}" var="c" varStatus="cs">
					<tr>
						<td><input name="id_item" type="checkbox" ${c.checked}
							value="${c.id}"></td>
						<td>${c.nombre}</td>
						<td>${c.tipo}</td>
						
					</tr>
				</c:forEach>
				<tr>
					<td colspan="4"><input type="submit" value="Guardar"></td>
				</tr>
			</table>
		</form>
		<script>
			upeu.enviarFormulario({
				id : 'formulario',
				target : 'contenido'
			});
		</script>
	</c:when>
	<c:otherwise>
		<div class="aviso">No se encontraron items</div>
	</c:otherwise>
</c:choose>