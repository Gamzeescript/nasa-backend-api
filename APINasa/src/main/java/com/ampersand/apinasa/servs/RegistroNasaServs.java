package com.ampersand.apinasa.servs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ampersand.apinasa.beans.RegistroNasa;
import com.ampersand.apinasa.utils.RegistroNasaRep;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ampersand.apinasa.utils.ConRegistroNasa;

@Service
public class RegistroNasaServs implements ConRegistroNasa<RegistroNasa>{
	
	@Autowired
	RegistroNasaRep rnasa;

	@Override
	public List<RegistroNasa> gets() {
		
		return rnasa.findAll();
	}


		
		 public void saveInfoNasa(RegistroNasa rgnasa) throws JsonMappingException, JsonProcessingException {
		        // Consumo de la api de la nasa
		        String url = "https://api.nasa.gov/apod";
		        String apikey = "inserte_su_apikey_aqui";
		        
		     // parametros de cabecera
		        HttpHeaders headers = new HttpHeaders();
		        headers.setContentType(MediaType.APPLICATION_JSON);
		        headers.set("inserte_su_apikey_Aqui", apikey);
		        HttpEntity<RegistroNasa> entity = new HttpEntity<>(rgnasa, headers);

		        // hhtp request
		        RestTemplate restTemplate = new RestTemplate();
		        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, entity, String.class);

		        // Parse al json
		        ObjectMapper objectMapper = new ObjectMapper();
		        RegistroNasa registronasa = objectMapper.readValue(responseEntity.getBody(), RegistroNasa.class);
		        
		        
		 rnasa.save(registronasa);
		        
		        
		
	}

	

}
