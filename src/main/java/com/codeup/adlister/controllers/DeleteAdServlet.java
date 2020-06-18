package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.DeleteAdServlet", urlPatterns = "/DeleteAd")
public class DeleteAdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long adId = Long.parseLong(request.getParameter("id"));
        try {
//            Long deleteAd = DaoFactory.getAdsDao().getAdById(adId);
//            deleteAd.delete()

            DaoFactory.getAdsDao().delete(adId);
            response.sendRedirect("/showUsersAds");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        request.getRequestDispatcher("/ads").forward(request, response);
    }

}

