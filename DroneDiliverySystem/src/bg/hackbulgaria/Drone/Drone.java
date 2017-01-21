package bg.hackbulgaria.Drone;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import bg.hackbulgaria.Warehouse.Order;

public class Drone {
	private int id;
	private int  battery;
	private double capacity;
	private double	chargingRate;
	public Drone() {		
        Queue<Order> orders  = new ConcurrentLinkedQueue<>();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public double getChargingRate() {
		return chargingRate;
	}
	public void setChargingRate(double chargingRate) {
		this.chargingRate = chargingRate;
	}
	
}
