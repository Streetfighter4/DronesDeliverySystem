package bg.hackbulgaria.Managers;

import java.util.List;

import bg.hackbulgaria.Drone.Drone;
import bg.hackbulgaria.Warehouse.Warehouse;

public class WarehouseManager {
	private Warehouse warehouse;
	private List<Drone> drones;

	public WarehouseManager(Warehouse warehouse) {
		this.warehouse = warehouse;
		this.drones = warehouse.getDrones();
		
	}

}
