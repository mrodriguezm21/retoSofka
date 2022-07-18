package com.spaceStation.spaceShip.service;

import com.spaceStation.spaceShip.model.dto.NaveDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NaveService {
    List<NaveDto> getAll();
    NaveDto save(NaveDto naveDto);
}
