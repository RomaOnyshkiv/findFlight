package org.searchFlight.controllers;

import org.searchFlight.DTO.ScyscannerSearchDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class SkyscannerController {

    private final String BASE_URL = "http://partners.api.skyscanner.net/apiservices";
    private final String API_KEY = "?apikey=prtl6749387986743898559646983194";
    private String country;
    private String currency;
    private String locale;
    private String originalPlace;
    private String destinationPlace;
    private String outboundPartialDate;
    private String inboundPartialDate;

    @RequestMapping(value = "/find", method = POST)
    public ResponseEntity findFlight(@RequestBody ScyscannerSearchDTO scyscannerSearchDTO) {

        return null;
    }

    @RequestMapping(value = "/", method = GET)
    public String index() {
        return "Home Page";
    }

    @RequestMapping(value = "/test", method = POST)
    public ResponseEntity<String> test(@RequestBody ScyscannerSearchDTO scyscannerSearchDTO) {
        country = scyscannerSearchDTO.getCountry();
        currency = scyscannerSearchDTO.getCurrency();
        locale = scyscannerSearchDTO.getLocale();
        originalPlace = scyscannerSearchDTO.getOriginalPlace();
        destinationPlace = scyscannerSearchDTO.getDestinationPlace();
        outboundPartialDate = scyscannerSearchDTO.getOutboundPartialDate();
        inboundPartialDate = scyscannerSearchDTO.getInboundPartialDate();
        String endpoint = country + "/" + currency+ "/" + locale + "/" + originalPlace + "/" + destinationPlace + "/" + outboundPartialDate + "/" + inboundPartialDate + API_KEY;
        RestTemplate template = new RestTemplate();
        return template.getForEntity(BASE_URL + "/browsequotes/v1.0/" + endpoint, String.class);
    }
}
