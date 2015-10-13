<%@include file="/common/taglibs.jsp"%>
                                                                    
<c:choose>
	<c:when test="${not empty lp}">
		<table class="tabla-cebra">
			<caption>Lista de Docentes</caption>
			
			<tr>
				<th>#</th>
				<th>Dni</th>
				<th>Paterno</th>
				<th>Materno</th>
				<th>Nombre</th>
				<th>Estado</th>
				<th>Opc</th>
			</tr>
			<c:forEach items="${lp}" var="p" varStatus="ps">
				<tr>
					<td>${ps.count}</td>
					<td>${p.dni}</td>
					<td>${p.apePat}</td>
					<td>${p.apeMat}</td>
					<td>${p.nombre}</td>
					<td>${p.estado}</td>
					<td></td>
					
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		
		<div class="aviso">No se encontraron docentes</div>
	</c:otherwise>
</c:choose>