import com.denis26andreyevich.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void CarOnDrive() {
        // given
        Car car = new Car(30, 7.5, 2020, 10, 22);
        // when
        double bak = car.getBak();
        double rashodNaStoKm = car.getRashodNaStoKm();
        int year = car.getTechOsmotr().getYear();
        int month = car.getTechOsmotr().getMonthValue();
        int day = car.getTechOsmotr().getDayOfMonth();
        //then
        Assertions.assertEquals(bak, 30);
        Assertions.assertEquals(rashodNaStoKm, 7.5);
        Assertions.assertEquals(year, 2020);
        Assertions.assertEquals(month, 10);
        Assertions.assertEquals(day, 22);

    }
    @Test
    void testMove() {
        Car car = new Car(30, 7.5, 2020, 10, 22);
        boolean CarMove = car.CarMove();
        Assertions.assertTrue(CarMove);
    }

    @Test
        void testNotMove(){
        Car car2 = new Car (0,8.5,2017,12,25);
        boolean CarMove = car2.CarMove();
        Assertions.assertFalse(CarMove);
        }

    @Test
    void testCarRiding(){
        Car car = new Car(30,7.5,2020,10,22);
        double CarRiding = car.CarRiding();
        Assertions.assertEquals(CarRiding, car.getBak() / car.getRashodNaStoKm() * 100);
    }
  @Test
    void testCheckTime(){
          Car car = new Car(30, 7.5, 2020, 10, 22);
          boolean CheckTime = car.TechTime();
          Assertions.assertTrue(CheckTime);
  }
  @Test
    void testComeCheckTime(){
        Car car2 = new Car (0,8.5,2017,12,25);
        boolean CheckTime = car2.TechTime();
      Assertions.assertFalse(CheckTime);
  }
}
