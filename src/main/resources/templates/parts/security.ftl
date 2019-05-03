<#assign
    know = Session.SPRING_SECURITY_CONTEXT??
>
<#if know>
    <#assign
        user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
        name = user.getUsername()
        isAdmin = user.isAdmin()
        isManager = user.isManager()
    >
<#else>
    <#assign
        name = "Гость"
        isAdmin = false
        isManager = false
    >
</#if>