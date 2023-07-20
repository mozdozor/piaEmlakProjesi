package com.emlakProject.Emlak.controller;


import com.emlakProject.Emlak.dto.*;
import com.emlakProject.Emlak.exception.GeneralMessageResponse;
import com.emlakProject.Emlak.model.Advertisement;
import com.emlakProject.Emlak.model.User;
import com.emlakProject.Emlak.service.AdvertisementService;
import com.emlakProject.Emlak.util.UserMapperUtil;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;


    @GetMapping(value = "/getAllAdvertisement")
    public List<Advertisement> getAllAdvertisement() {

        return advertisementService.gelAllAdvertisement();
    }


    @GetMapping(value = "/getLastTenAdvertisement")
    public List<Advertisement> getLastTenAdvertisement() {

        return advertisementService.gelLastTenAdvertisements();
    }




    @PostMapping(value = "/saveAdvertisement")
    public AdvertisementSaveResponse save(@RequestBody AdvertisementSaveRequest advertisementSaveRequest) {
        return advertisementService.save(advertisementSaveRequest);
    }





    @GetMapping(value = "/getAdvertisementDetail/{id}")
    public AdvDetailDTO getById(@PathVariable String id) {

        return advertisementService.detailAdvertisementById(id);
    }


    @DeleteMapping (value = "/deleteAdvertisement/{id}")
    public GeneralMessageResponse deleteAdvertisement(@PathVariable String id) {

        return advertisementService.deleteAdvertisement(id);
    }



}
