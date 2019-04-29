package com.example.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlServlet extends HttpServlet {
    private Logger LOG = LoggerFactory.getLogger(HtmlServlet.class);

    public HtmlServlet() {
        LOG.debug("init html servlet..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LOG.debug("do get...");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("OK");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        LOG.debug("destroy...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        LOG.debug("init...");

    }
}
