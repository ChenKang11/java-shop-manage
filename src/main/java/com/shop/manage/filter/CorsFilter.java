package com.shop.manage.filter;

import org.springframework.http.HttpMethod;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE,OPTIONS");
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,token,Authorization,keyword,iv,sign,aeskey,signature,aesiv,encrypt,jsonflag");
        res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));

        /* 解决预检请求无响应 */
        if (req.getMethod().equals(HttpMethod.OPTIONS.name())) {
            res.setStatus(HttpServletResponse.SC_OK);
            return;
        }
        chain.doFilter(request, res);
    }

    @Override
    public void destroy() {

    }
}
