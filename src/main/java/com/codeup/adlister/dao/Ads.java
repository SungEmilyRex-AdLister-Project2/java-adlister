package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);

    Long delete(Ad ad);

    Ad getAdById (long id);


    // grabbing ads based off of user_id
    List<Ad> getAdsByUserId(Long userId);

    // search ad/ads
    List<Ad> searchByAd(String param);

}
