<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>사용자 목록</title>
</head>
<body>
    <h1>사용자 목록</h1>
    <table class="table table-striped table-bordered table-condensed">
        <#list users as user>
            <tr>
                <#if users?exists>
                    <td>soulduse@naver.com</td>
                    <td>김현우</td>
                    <td>
                        <form action="/users/edit" method="get">
                            <input type="submit" name="form" value="편집">
                            <input type="hidden" name="id" value="${users.id}">
                        </form>
                    </td>
                    <td>
                        <form action="/users/delete" method="post">
                            <input type="submit" value="삭제">
                            <input type="hidden" name="id" value="${users.id}">
                        </form>
                    </td>
                <#else >
                    <td>soulduse@naver.com</td>
                    <td>김현우</td>
                    <td>
                        <form action="/users/edit" method="get">
                            <input type="submit" name="form" value="편집">
                        <#--<input type="hidden" name="id" value="${users.id}">-->
                        </form>
                    </td>
                    <td>
                        <form action="/users/delete" method="post">
                            <input type="submit" value="삭제">
                        <#--<input type="hidden" name="id" value="${users.id}">-->
                        </form>
                    </td>
                </#if>
            </tr>
        </#list>
    </table>
</body>
</html>