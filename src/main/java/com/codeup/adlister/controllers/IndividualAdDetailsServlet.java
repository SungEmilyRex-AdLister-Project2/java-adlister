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

@WebServlet(name = "controllers.IndividualAdDetailsServlet", urlPatterns = "/individual")
public class IndividualAdDetailsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));
//        User adOwner = null;
        try{
            Ad ad = DaoFactory.getAdsDao().getAdById(id);
//            adOwner = DaoFactory.getUsersDao().
            request.setAttribute("ad", ad);
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }


        request.getRequestDispatcher("/WEB-INF/ads/individual.jsp").forward(request, response);


        }
}

