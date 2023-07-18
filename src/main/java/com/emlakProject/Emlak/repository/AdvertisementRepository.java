package com.emlakProject.Emlak.repository;

import com.emlakProject.Emlak.model.Advertisement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends MongoRepository<Advertisement, String> {

    Advertisement findAdvertisementByCityIs(String city);
    Advertisement findAdvertisementByCityAndState(String city, String state);
    Advertisement findAdvertisementByAdvTypeAndCityAndState(String advType, String City, String state);

}
