package com.spaceStation.spaceShip.service.mapper;

import com.spaceStation.spaceShip.model.Nave;
import com.spaceStation.spaceShip.model.dto.NaveDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NaveMapper {
    NaveDto toNaveDto(Nave nave);

    List<NaveDto> toNavesDto(List<Nave> naves);

    @InheritInverseConfiguration
    Nave toNave(NaveDto naveDto);
}
