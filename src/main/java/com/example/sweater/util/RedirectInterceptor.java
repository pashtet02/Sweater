package com.example.sweater.util;

import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectInterceptor implements AsyncHandlerInterceptor {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            String args = request.getQueryString() != null ? request.getQueryString() : "";
            String url;
            if (request.getQueryString() != null) {
                url = request.getRequestURI() + "?" + args;
            } else {
                url = request.getRequestURI();
            }
            response.setHeader("Turbolinks-Location", url);
        }
    }
}
