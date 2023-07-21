package com.emlakProject.Emlak.util;

import com.emlakProject.Emlak.dto.*;
import com.emlakProject.Emlak.model.Advertisement;
import com.emlakProject.Emlak.model.User;
import com.emlakProject.Emlak.repository.AdvertisementRepository;
import com.emlakProject.Emlak.repository.UserRepository;
import com.emlakProject.Emlak.service.UserService;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDateTime;

public class AdvertisementMapperUtil {


    public static Advertisement toAdvertisement(AdvertisementSaveRequest advertisementSaveRequest) {
        Advertisement advertisement = new Advertisement();


        advertisement.setAdvertisementType(advertisementSaveRequest.getAdvertisementType());
        advertisement.setEstateType(advertisementSaveRequest.getEstateType());
        advertisement.setTitle(advertisementSaveRequest.getTitle());
        advertisement.setAdvContent(advertisementSaveRequest.getAdvContent());
        advertisement.setFirstImagePath(advertisementSaveRequest.getFirstImagePath());
        advertisement.setSecondImagePath(advertisementSaveRequest.getSecondImagePath());
        advertisement.setThirdImagePath(advertisementSaveRequest.getThirdImagePath());
        advertisement.setPrice(advertisementSaveRequest.getPrice());
        advertisement.setSize(advertisementSaveRequest.getSize());
        advertisement.setCity(advertisementSaveRequest.getCity());
        advertisement.setState(advertisementSaveRequest.getState());
        advertisement.setFloor(advertisementSaveRequest.getFloor());
        advertisement.setRoom(advertisementSaveRequest.getRoom());
        advertisement.setHeatingType(advertisementSaveRequest.getHeatingType());
        advertisement.setCreatedDate(LocalDateTime.now());
        advertisement.setIsFurniture(advertisementSaveRequest.getIsFurniture());
        advertisement.setUser_id(advertisementSaveRequest.getUser_id());


        return advertisement;
    }

    public static AdvertisementSaveResponse toAdvertisementSaveResponse(Advertisement advertisement) {
        AdvertisementSaveResponse advertisementSaveResponse = new AdvertisementSaveResponse();
        advertisementSaveResponse.setId(advertisement.getId());

        advertisementSaveResponse.setAdvertisementSaveSuccess(true);

        return advertisementSaveResponse;
    }


    public static AdvDetailDTO toAdvertisementDetailResponse(Advertisement advertisement,User user) {
        AdvDetailDTO advertisementDetailResponse = new AdvDetailDTO();

        advertisementDetailResponse.setName(user.getName());
        advertisementDetailResponse.setLastName(user.getLastname());
        advertisementDetailResponse.setPhoneNumber(user.getPhoneNumber());
        advertisementDetailResponse.setEmail(user.getEmail());

        advertisementDetailResponse.setAdvertisementType(advertisement.getAdvertisementType());
        advertisementDetailResponse.setEstateType(advertisement.getEstateType());
        advertisementDetailResponse.setTitle(advertisement.getTitle());
        advertisementDetailResponse.setAdvContent(advertisement.getAdvContent());
        advertisementDetailResponse.setFirstImagePath(advertisement.getFirstImagePath());
        advertisementDetailResponse.setSecondImagePath(advertisement.getSecondImagePath());
        advertisementDetailResponse.setThirdImagePath(advertisement.getThirdImagePath());
        advertisementDetailResponse.setPrice(advertisement.getPrice());
        advertisementDetailResponse.setSize(advertisement.getSize());
        advertisementDetailResponse.setCity(advertisement.getCity());
        advertisementDetailResponse.setState(advertisement.getState());
        advertisementDetailResponse.setFloor(advertisement.getFloor());
        advertisementDetailResponse.setRoom(advertisement.getRoom());
        advertisementDetailResponse.setHeatingType(advertisement.getHeatingType());
        advertisementDetailResponse.setCreatedDate(advertisement.getCreatedDate());
        advertisementDetailResponse.setIsFurniture(advertisement.getIsFurniture());
//        advertisementDetailResponse.setUser_id(advertisementSaveRequest.getUser_id());

        return advertisementDetailResponse;
    }

    public static HomeAdvertisementResponse toAdvertisementHomeResponse(Advertisement advertisement) {
        HomeAdvertisementResponse advertisementHomeResponse = new HomeAdvertisementResponse();
        advertisementHomeResponse.setTitle(advertisement.getTitle());
        advertisementHomeResponse.setCity(advertisement.getCity());
        advertisementHomeResponse.setPrice(advertisement.getPrice());
        advertisementHomeResponse.setPhoto(advertisement.getFirstImagePath());
        advertisementHomeResponse.setId(advertisement.getId());



        return advertisementHomeResponse;
    }

}
