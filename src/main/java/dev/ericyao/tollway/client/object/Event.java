package dev.ericyao.tollway.client.object;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Event {
	
	@NotNull
	private String vehicleId;
	@NotNull
	private long gateId;
	@NotNull
	private int laneId;
	@NotNull
	Date timestamp;
	
	public Event(@NotNull String vehicleId,
			@NotNull long gateId, 
			@NotNull int laneId, 
			@NotNull Date timestamp) {
		super();
		this.vehicleId = vehicleId;
		this.gateId = gateId;
		this.laneId = laneId;
		this.timestamp = timestamp;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public long getGateId() {
		return gateId;
	}

	public void setGateId(long gateId) {
		this.gateId = gateId;
	}

	public int getLaneId() {
		return laneId;
	}

	public void setLaneId(int laneId) {
		this.laneId = laneId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date temestamp) {
		this.timestamp = temestamp;
	}
}

