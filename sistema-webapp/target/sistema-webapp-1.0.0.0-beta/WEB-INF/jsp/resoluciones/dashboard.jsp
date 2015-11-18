<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>


		<display:table name="${listResolemitida}" id="item" requestURI="/dashboard" class="table">
			<display:column title="Nombre docente" property="docente.nombrereg"/>

			<display:column title="Cod. Reso" property="codresolucion" />
			<display:column title="Fecha" property="fechaemitida" />
			<display:column title="Nom. Reso." property="resolucion.nombre" />
			<display:column title="accion">
				<a href="#" onclick="javascript:edit('<c:out value="${item.id}"></c:out>');">
					<c:out value="Editar"/>
				</a>
			</display:column>
		</display:table>