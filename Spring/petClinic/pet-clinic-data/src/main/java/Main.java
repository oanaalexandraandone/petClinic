import services.OwnerService;
import services.springdatajpa.OwnerSDJpaService;

public class Main {


    public static void main(String[] args) {
        System.out.println(OwnerService.class.getPackageName());
        System.out.println(OwnerSDJpaService.class.getPackageName());
        System.out.println("here" +What.class.getPackageName());
    }
}
