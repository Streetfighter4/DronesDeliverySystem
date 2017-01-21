package bg.hackbulgaria.Warehouse;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

import bg.hackbulgaria.Coordinates.Coordinates;
import bg.hackbulgaria.Drone.Drone;
import bg.hackbulgaria.DroneConstants.DroneConstants;
import bg.hackbulgaria.Managers.WarehouseManager;

public class Warehouse {

	private WarehouseManager manager;
	private Coordinates coordinate;
	private Map<Product, Integer> availableProducts;
    public Queue<Order> orders;
    private List<Drone> drones;
    

	public Warehouse(Coordinates coords) {
		this.coordinate = coords;
		availableProducts = new ConcurrentHashMap<>();
        orders = new ConcurrentLinkedQueue<>();
        drones = new CopyOnWriteArrayList<>();
        for (int i = 0; i <DroneConstants.MAX_DRONES; i++) {
			drones.add(new Drone());
		}
		manager = new WarehouseManager(this);

	}

	public List<Drone> getDrones() {
		return drones;
	}

	public void setDrones(List<Drone> drones) {
		this.drones = drones;
	}

	public void addProduct(Product product, int quantity) {
		if (availableProducts.containsKey(product)) {
			availableProducts.put(product, availableProducts.get(product) + quantity);
		} else {
			availableProducts.put(product, quantity);
		}
	}

	public synchronized boolean containsProductNTimes(Product product, int quantity) {
		if (availableProducts.containsKey(product)) {
			if (availableProducts.get(product) >= quantity) {
				return true;
			}

		}
		return false;
	}
	public synchronized void removeProductNTimes(Product product,int quantity){
		   if (availableProducts.get(product) > quantity) {
	            int quantityLeft = availableProducts.get(product) - quantity;
	            availableProducts.put(product, quantityLeft);
	        } else
	            availableProducts.remove(product);
	}
}
