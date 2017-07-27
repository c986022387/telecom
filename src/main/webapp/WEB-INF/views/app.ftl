<#assign basePath = request.contextPath>
<#assign c = JspTaglibs["http://java.sun.com/jsp/jstl/core"]>
<#if Session["userName"]?exists>
    <#assign userName = Session["userName"]>
</#if>
<#if Session["trueName"]?exists>  
    <#assign trueName = Session["trueName"]>
</#if>
<#import "/spring.ftl" as spring />