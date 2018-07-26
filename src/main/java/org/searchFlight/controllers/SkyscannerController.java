package org.searchFlight.controllers;

import org.searchFlight.DTO.ScyscannerSearchDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkyscannerController {

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public ResponseEntity findFlight(@RequestBody ScyscannerSearchDTO scyscannerSearchDTO) {

        return null;
    }
}
