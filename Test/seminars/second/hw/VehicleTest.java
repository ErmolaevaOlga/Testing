package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Motorcycle motorcycle;
    private Car car;
    private int carNumWheels = 4;
    private int motorcycleNumWheels = 2;
    private int testDriveCarSpeed = 60;
    private int testDriveMotorcycleSpeed = 75;
    private int parkingSpeed = 0;

    @BeforeEach
    public void prepareTestData() {
        this.car =  new Car("Reno", "Stepway", 2020);
        this.motorcycle =  new Motorcycle("Harley", "666", 2020);
    }
    @Test
    public void testInstanceCar(){
        assertThat(this.car).isInstanceOf(Vehicle.class);
    }
    @Test
    public void testCarCountWheels(){
        assertThat(this.car.getNumWheels()).isEqualTo(this.carNumWheels);
    }
    @Test
    public void testMotorcycleCountWheels(){
        assertThat(this.motorcycle.getNumWheels()).isEqualTo(this.motorcycleNumWheels);
    }
    @Test
    public void testCarSpeed(){
        this.car.testDrive();
        assertThat(this.car.getSpeed()).isEqualTo(testDriveCarSpeed);
    }
    @Test
    public void testMotorcycleSpeed(){
        this.motorcycle.testDrive();
        assertThat(this.motorcycle.getSpeed()).isEqualTo(testDriveMotorcycleSpeed);
    }
    @Test
    public void testCarParking(){
        this.car.testDrive();
        this.car.park();
        assertThat(this.car.getSpeed()).isEqualTo(parkingSpeed);
    }
    @Test
    public void testMotorcycleParking(){
        this.motorcycle.testDrive();
        this.motorcycle.park();
        assertThat(this.motorcycle.getSpeed()).isEqualTo(parkingSpeed);
    }

}