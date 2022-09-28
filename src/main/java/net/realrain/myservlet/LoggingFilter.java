package net.realrain.myservlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "LoggingFilter", urlPatterns = "/*")
public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("LoggingFilter.doFilter Starts");
        chain.doFilter(request, response);
        System.out.println("LoggingFilter.doFilter Ends");
    }
}
