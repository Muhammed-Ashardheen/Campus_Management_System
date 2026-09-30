package com.campus.filter;

import jakarta.servlet.annotation.WebFilter;



@WebFilter("/")
public class LoggingFilter extends HttpFilter {

    @override
    public void doFilter(ServletRequest request,ServletResponse respose,FilterChain chain) throws IOException,ServletException{
        System.out.println("Request Recieved");
        chain.doFilter(request,response);
        System.out.println("Response sent");
    }

    
}
