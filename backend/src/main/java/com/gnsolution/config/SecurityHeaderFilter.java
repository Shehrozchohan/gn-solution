package com.gnsolution.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class SecurityHeaderFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Prevent Clickjacking
        httpResponse.setHeader("X-Frame-Options", "DENY");
        
        // Block MIME type sniffing
        httpResponse.setHeader("X-Content-Type-Options", "nosniff");
        
        // Enable Browser XSS Filtering
        httpResponse.setHeader("X-XSS-Protection", "1; mode=block");
        
        // Enforce HTTPS Connections (HSTS)
        httpResponse.setHeader("Strict-Transport-Security", "max-age=31536000; includeSubDomains");
        
        // Content Security Policy (CSP) to control loaded resources
        httpResponse.setHeader("Content-Security-Policy", 
            "default-src 'self'; " +
            "style-src 'self' 'unsafe-inline' https://cdnjs.cloudflare.com https://fonts.googleapis.com; " +
            "font-src 'self' https://cdnjs.cloudflare.com https://fonts.gstatic.com; " +
            "img-src 'self' https://picsum.photos https://images.unsplash.com https://ui-avatars.com data:; " +
            "script-src 'self' 'unsafe-inline';");

        chain.doFilter(request, response);
    }
}