package net.realrain.myservlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "ResponseAppendFilter", urlPatterns = "/*")
public class ResponseAppendFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("ResponseAppendFilter.doFilter Starts");
        chain.doFilter(request, response);
        response.getWriter().append(" ResponseAppendFilter");
        System.out.println("ResponseAppendFilter.doFilter Ends");
    }
}
