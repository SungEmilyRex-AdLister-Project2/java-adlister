package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controllers.SearchServlet", urlPatterns = "/searchResult")
public class SearchServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // "search" came from name attribute in the input element from navbar.jsp
        String searchTerm = request.getParameter("search");

        request.setAttribute("ads", DaoFactory.getAdsDao().searchByAd(searchTerm));

        request.getRequestDispatcher("/WEB-INF/searchResult.jsp").forward(request, response);
    }

}

