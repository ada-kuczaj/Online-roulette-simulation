package com.roullete.simulator.controller;


import com.roullete.simulator.model.RouletteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class RouletteController {

    //TODO: 1. Zobaczyc jak sie odpytuje api we frontendzie.
    //TODO: 2. Zobaczyc jak dzial biblioteka axios.
    // TODO: 3. Stworzyc prosty komponent w reacie z napisem hello world.
    // TODO: 4 Stworzyc 3 komponenty odpytujace nasze api i zmenijace kolor tla zgodnie z dostanym requestem.


    @GetMapping("/result")
    public ResponseEntity<RouletteResponse> getRouletteResult1(){

        return new ResponseEntity<>(new RouletteResponse("RED"), HttpStatus.OK);
    }

    @GetMapping("/result1")
    public ResponseEntity<RouletteResponse> getRouletteResult2(){
        return new ResponseEntity<>(new RouletteResponse("BLACK"), HttpStatus.OK);
    }

    @GetMapping("/result2")
    public ResponseEntity<RouletteResponse> getRouletteResult3(){

        return new ResponseEntity<>(new RouletteResponse("GREEN"), HttpStatus.OK);
    }





}
