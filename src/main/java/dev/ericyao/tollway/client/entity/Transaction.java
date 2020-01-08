package dev.ericyao.tollway.client.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Transaction {
	
	// transaction-related
	@NotNull
	private long transactionId;
	int tollInCents;
	
	// car-related
	@NotNull
	private String vehicleId;
	@NotNull
	private long gateId;
	@NotNull
	private int laneId;
	@NotNull
	Date timestamp;
	
	public Transaction() {
		
	}

	public Transaction(Event event) {
		super();
		this.vehicleId = event.getVehicleId();
		this.gateId = event.getGateId();
		this.laneId = event.getLaneId();
		this.timestamp = event.getTimestamp();
	}

	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public int getTollInCents() {
		return tollInCents;
	}
	public void setTollInCents(int tollInCents) {
		this.tollInCents = tollInCents;
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
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", tollInCents=" + tollInCents + ", vehicleId="
				+ vehicleId + ", gateId=" + gateId + ", laneId=" + laneId + ", timestamp=" + timestamp + "]";
	}
	
	
}
