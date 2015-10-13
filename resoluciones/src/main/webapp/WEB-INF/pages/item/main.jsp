<%@include file="/common/taglibs.jsp"%>
<c:choose>
	<c:when test="${not empty lp}">
		<table class="tabla-cebra">
			<caption>Lista de Items</caption>
			<tr>
				<td colspan="5"><a href="#"
					onclick="upeu.cargarUrl('items/nuevo')">+ Nuevo</a></td>
			</tr>
			<tr>
				<th>#</th>
				<th>Nombre</th>
				<th>Tipo</th>
				<th>Opc</th>
			</tr>
			<c:forEach items="${lp}" var="p" varStatus="ps">
				<tr>
					<td>${ps.count}</td>
					<td>${p.nombre}</td>
					<td>${p.tipo}</td>
					<td><span title="Clic para editar"
						onclick="upeu.cargarUrl('items/${p.id}')"
						class="icon-pen icon-verde"></span></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<p>
			<a href="#" onclick="upeu.cargarUrl('items/nuevo')">+ Nuevo</a>
		</p>
		<div class="aviso">No se encontraron itemmss</div>
	</c:otherwise>
</c:choose>