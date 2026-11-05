<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng Nhập</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .login-container {
            background: #ffffff;
            border-radius: 12px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.3);
            padding: 40px 36px;
            width: 100%;
            max-width: 400px;
        }

        .login-container h2 {
            text-align: center;
            color: #333;
            margin-bottom: 28px;
            font-size: 1.8rem;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            margin-bottom: 6px;
            color: #555;
            font-weight: 600;
            font-size: 0.9rem;
        }

        .form-group input {
            width: 100%;
            padding: 12px 14px;
            border: 1.5px solid #ddd;
            border-radius: 8px;
            font-size: 1rem;
            transition: border-color 0.3s;
            outline: none;
        }

        .form-group input:focus {
            border-color: #667eea;
            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.2);
        }

        .btn-login {
            width: 100%;
            padding: 13px;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: #fff;
            border: none;
            border-radius: 8px;
            font-size: 1rem;
            font-weight: 700;
            cursor: pointer;
            transition: opacity 0.3s;
            margin-top: 8px;
        }

        .btn-login:hover {
            opacity: 0.88;
        }

        .hint {
            text-align: center;
            margin-top: 18px;
            color: #999;
            font-size: 0.82rem;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>🔐 Đăng Nhập</h2>
        <form action="${pageContext.request.contextPath}/login" method="POST">
            <div class="form-group">
                <label for="username">Tên đăng nhập</label>
                <input type="text"
                       id="username"
                       name="username"
                       placeholder="Nhập username..."
                       required
                       autocomplete="username" />
            </div>
            <div class="form-group">
                <label for="password">Mật khẩu</label>
                <input type="password"
                       id="password"
                       name="password"
                       placeholder="Nhập password..."
                       required
                       autocomplete="current-password" />
            </div>
            <button type="submit" class="btn-login">Đăng Nhập</button>
        </form>
        <p class="hint">Gợi ý: username = <strong>admin</strong> / password = <strong>admin</strong></p>
    </div>
</body>
</html>

