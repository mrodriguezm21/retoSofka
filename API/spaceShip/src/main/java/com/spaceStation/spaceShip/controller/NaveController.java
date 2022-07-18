package com.spaceStation.spaceShip.controller;

import com.spaceStation.spaceShip.model.dto.NaveDto;
import com.spaceStation.spaceShip.service.NaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/")
public class NaveController {

    @Autowired
    private NaveService naveService;

    @GetMapping()
    public ResponseEntity<List<NaveDto>> getAll() {
        return new ResponseEntity<>(naveService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<NaveDto> save(@RequestBody NaveDto naveDto){
        return new ResponseEntity<>(naveService.save(naveDto),HttpStatus.CREATED);
    }


}
