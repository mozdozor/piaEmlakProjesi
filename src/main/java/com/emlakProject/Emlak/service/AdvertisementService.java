package com.emlakProject.Emlak.service;

import com.emlakProject.Emlak.dto.AdvDetailDTO;
import com.emlakProject.Emlak.dto.AdvertisementSaveRequest;
import com.emlakProject.Emlak.dto.AdvertisementSaveResponse;
import com.emlakProject.Emlak.exception.DefaultExceptionMessage;
import com.emlakProject.Emlak.exception.GeneralMessageResponse;
import com.emlakProject.Emlak.model.Advertisement;
import com.emlakProject.Emlak.model.User;
import com.emlakProject.Emlak.repository.AdvertisementRepository;
import com.emlakProject.Emlak.repository.UserRepository;
import com.emlakProject.Emlak.util.AdvertisementMapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// CRUD
@Service
public class AdvertisementService {

    private final AdvertisementRepository advertisementRepository;
    private final UserRepository userRepository;


    public AdvertisementService(AdvertisementRepository advertisementRepository, UserRepository userRepository){
        this.advertisementRepository=advertisementRepository;
        this.userRepository = userRepository;
    }


    public List<Advertisement> gelAllAdvertisement() {

        return advertisementRepository.findAll();
    }


    public AdvertisementSaveResponse save(AdvertisementSaveRequest request) {
        Advertisement advertisement = AdvertisementMapperUtil.toAdvertisement(request);
        Advertisement savedAdvertisement = advertisementRepository.save(advertisement);
        return AdvertisementMapperUtil.toAdvertisementSaveResponse(savedAdvertisement);
    }



    public AdvDetailDTO detailAdvertisementById(String id) {
        Optional<Advertisement> advertisementObject = advertisementRepository.findById(id);

        User user = userRepository.findById(advertisementObject.get().getUser_id()).get();

        if (advertisementObject.isPresent())
            return AdvertisementMapperUtil.toAdvertisementDetailResponse(advertisementObject.get(),user);
        else
            return null;
    }


    public GeneralMessageResponse deleteAdvertisement(String id) {
        Optional<Advertisement> advertisementObject = advertisementRepository.findById(id);

        if (advertisementObject.isPresent()){
            advertisementRepository.deleteById(id);
            return new GeneralMessageResponse(true,"İlan başarıyla silindi.");
        }
        else{
            return new GeneralMessageResponse(false,"İlan silinirken bir hata ile karşılaşıldı.");
        }


    }



}
