package com.virtual.libroservice.service;

import com.virtual.libroservice.dto.ResenaDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import java.util.List;

@Service
public class ResenaClientService {

    private final RestTemplate restTemplate;
    private final String resenaServiceUrl = "http://localhost:8081/api/resenas";

    public ResenaClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<ResenaDTO> getResenasForLibro(Long libroId) {
        ResponseEntity<List<ResenaDTO>> response = 
                restTemplate.exchange(
                    resenaServiceUrl + "/libro/" + libroId,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<ResenaDTO>>() {});
        return response.getBody();
    }
}
