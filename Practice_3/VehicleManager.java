import java.util.*;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        for (Vehicle ve : vehicles) {
            if (ve.getPlate().equalsIgnoreCase(v.getPlate())) {
                System.out.println("Duplicate plate!");
                return;
            }
        }
        vehicles.add(v);
    }

    public Vehicle findByPlate(String plate) {
        for (Vehicle v : vehicles) {
            if(v.getPlate().equalsIgnoreCase(plate)) return v;
        }
        return null;
    }

    public List<Vehicle> findByOwnerId(String ownerId) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getOwner().getId().equals(ownerId)) result.add(v);
        }
        return result;
    }

    public void deleteByManufacturer (String mf) {
        vehicles.removeIf(v -> v.getManufacturer().equalsIgnoreCase(mf));
    }

    public String manufacturerWithMostVehicle() {
        Map<String, Integer> countMap = new HashMap<>();
        for (Vehicle v : vehicles) {
            countMap.put(v.getManufacturer(), countMap.getOrDefault(v.getManufacturer(), 0) + 1);

        }

        return countMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("None");
    }

    public void sortByManufacturerCountDesc() {
        vehicles.sort(Comparator.comparing(Vehicle::getManufacturer));
    }

    public void statisticByType() {
        int cars = 0, bikes = 0, trucks = 0;
        for (Vehicle v : vehicles) {
            if (v instanceof Car) cars++;
            else if (v instanceof Motorbike) bikes++;
            else if (v instanceof Truck) trucks++;
        }
        System.out.println("Cars: " + cars + ", Bikes: " + bikes + ", Trucks: " + trucks);
    }

    public void showAll() {
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-----------------");
        }
    }

    public void statisticsByType() {
    }

    public boolean manufacturerWithMostVehicles() {
        return false;
    }
}
