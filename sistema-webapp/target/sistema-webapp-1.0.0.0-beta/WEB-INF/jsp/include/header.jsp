<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<c:set var="authentication" value="${sessionScope['SPRING_SECURITY_CONTEXT'].authentication}" />
<c:set var="user" value="${authentication.details}" />

  <div class="top_nav">

                <div class="nav_menu">
                    <nav class="" role="navigation">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="">
                                <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                    Rudy Jhean <span class=" fa fa-angle-down"></span>
                                </a>
                                <ul class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
                                    <li><a href="javascript:;">  Profile</a>
                                    </li>
                                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
