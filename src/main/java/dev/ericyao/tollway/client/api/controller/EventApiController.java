package dev.ericyao.tollway.client.api.controller;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import dev.ericyao.tollway.client.object.Event;
import dev.ericyao.tollway.client.object.Transaction;
import dev.ericyao.tollway.client.object.Vehicle;

@RestController
public class EventApiController {
	
	@Value("${gate.id}")
	private long gateId;
	
	@Value("${tollway.server.url}")
	private String tollwayServerUrl;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping(value = "/{laneId}", consumes = "application/json")
	public void processEvent(@PathVariable("laneId") int laneId, @RequestBody Vehicle vehicle) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		Event event = new Event(vehicle.getVehicleId(), gateId, laneId, new Date());	// TODO: may not add timestamp here
		
		HttpEntity<Event> entity = new HttpEntity<>(event, headers);
		
		Transaction trans = restTemplate.exchange(tollwayServerUrl, HttpMethod.POST, entity, Transaction.class).getBody();
	
		System.out.println("Transaction saved: " + trans.toString());
	}
}
