<%@include file="/common/taglibs.jsp"%>
<h1>Item de ${resolucion.nombre}</h1>
<c:choose>
	<c:when test="${not empty resolucion.items}">
		<table class="tabla-cebra">
			<tr>
				<td colspan="5"><a href="#"
					onclick="upeu.cargarUrl('resoluciones/');">[Atras]</a>&nbsp;&nbsp;&nbsp;<span
					onclick="upeu.cargarUrl('resoluciones/${resolucion.id}/items/editar')"
					class="icon-pen icon-verde"></span></td>
			</tr>
			<tr>
				<th>#</th>
				<th>Nombre</th>
				<th>Tipo</th>
				<th>Opc</th>
			</tr>
			<c:forEach items="${resolucion.items}" var="c" varStatus="cs">
				<tr>
					<td>${cs.count}</td>
					<td>${c.nombre}</td>
					<td>${c.tipo}</td>
					<td><span
						onclick="upeu.cargarUrl('resoluciones/${resolucion.id}/items/${c.id}/eliminar')"
						class="icon-minus-alt icon-verde"></span></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<p>
			<span
				onclick="upeu.cargarUrl('resoluciones/${resolucion.id}/items/editar')"
				class="icon-pen icon-verde"> </span>
		</p>
		<div class="aviso">No se encontraron itemsss</div>
	</c:otherwise>
</c:choose>