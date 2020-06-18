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
import java.util.List;

@WebServlet(name = "controllers.ShowUserAdServlet", urlPatterns = "/showUsersAds")
public class ShowUserAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long userId = Long.parseLong(request.getParameter("id"));

        try{

            List<Ad> ads = DaoFactory.getAdsDao().getAdsByUserId(userId);
//            System.out.println(ads.get(0).getTitle());
            User adOwner = DaoFactory.getUsersDao().findUserById(userId);
            request.setAttribute("ads", ads);
            request.setAttribute("adOwner", adOwner);

        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }


        request.getRequestDispatcher("/WEB-INF/showUsersAds.jsp").forward(request, response);


    }
}