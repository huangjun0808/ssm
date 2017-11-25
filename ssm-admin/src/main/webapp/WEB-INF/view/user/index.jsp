<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        user index${id}||${user.username}||${user.mobile}
        <form action="logout" method="POST">
            <sec:csrfInput/>
            <button>退出</button>
        </form>
</body>
</html>
