public class Main {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        Owner o1 = new Owner("123456789012", "Nguyen Van A", "a@email.com");
        Owner o2 = new Owner("098765432109", "Tran Thi B", "b@email.com");

        manager.addVehicle(new Car("AB123", "Toyota", 2022, "Red", o1, 5, "Hybrid"));
        manager.addVehicle(new Motorbike("XY789", "Honda", 2023, "Black", o2, 150));
        manager.addVehicle(new Truck("ZZ001", "Suzuki", 2021, "White", o1, 3.5));

        System.out.println("=== ALL VEHICLES ===");
        manager.showAll();

        System.out.println("\n=== FIND BY PLATE AB123 ===");
        Vehicle found = manager.findByPlate("AB123");
        if (found != null) found.displayInfo();

        System.out.println("\n=== OWNER 123456789012 VEHICLES ===");
        for (Vehicle v : manager.findByOwnerId("123456789012")) {
            v.displayInfo();
        }

        System.out.println("\n=== DELETE BY MANUFACTURER: Honda ===");
        manager.deleteByManufacturer("Honda");

        System.out.println("\n=== STATISTICS BY TYPE ===");
        manager.statisticsByType();

        System.out.println("\n=== MANUFACTURER WITH MOST VEHICLES ===");
        System.out.println(manager.manufacturerWithMostVehicles());
    }
}
