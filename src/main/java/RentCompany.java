import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    public List<Car> list;

    public RentCompany() {
        this.list = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        list.add(car);
    }

    public String generateReport() {
        return list.stream()
                .map(it -> it.getName()+" : "+(int)it.getChargeQuantity()+"리터"+System.getProperty("line.separator"))
                .collect(Collectors.joining());
    }
}
