package com.spaceStation.spaceShip.service.impl;

import com.spaceStation.spaceShip.model.Nave;
import com.spaceStation.spaceShip.model.dto.NaveDto;
import com.spaceStation.spaceShip.repository.NaveRepository;
import com.spaceStation.spaceShip.service.NaveService;
import com.spaceStation.spaceShip.service.mapper.NaveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class NaveServiceImpl implements NaveService {

    @Autowired
    private NaveRepository naveRepository;

    @Autowired
    private NaveMapper naveMapper;

    @Override
    public List<NaveDto> getAll() {
        return naveMapper.toNavesDto(naveRepository.findAllByOrderByIdNaveAsc());
    }

    @Override
    public NaveDto save(NaveDto naveDto) {
        Nave nave = naveMapper.toNave(naveDto);
        return naveMapper.toNaveDto(naveRepository.save(nave));
    }
}
