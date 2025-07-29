package homeWork.patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DriverFactory driverFactory = createDriverBySpeciality("truckdd");
        Driver driver = driverFactory.createDriver();
        driver.drive();
    }

    static DriverFactory createDriverBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("car")){
            return new CarDriverFactory();
        }else if (speciality.equalsIgnoreCase("truck")) {
            return new TruckDriverFactory();
        } else if (speciality.equalsIgnoreCase("gharry")) {
            return new CharryDriverFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown specialty");
        }
    }
}
