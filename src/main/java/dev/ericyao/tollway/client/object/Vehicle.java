package dev.ericyao.tollway.client.object;

import javax.validation.constraints.NotNull;

public class Vehicle {
	
	@NotNull
	private String vehicleId;
	private boolean registered;
	
	public Vehicle() {
		
	}

	public Vehicle(@NotNull String vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	
}
