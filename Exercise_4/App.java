import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Enrollment = new LinkedList<>();

        Enrollment.add("Alexander Du");
        Enrollment.add("Neil Rifarial");
        Enrollment.add("Ronn Adia");
        Enrollment.add("Mycko Par");
        Enrollment.add("Jap Bolanos");

        System.out.println(Enrollment);

        System.out.println(Enrollment.size());

        System.out.println(Enrollment.peek());

        Enrollment.remove();
        Enrollment.remove();
        Enrollment.remove();
        Enrollment.remove();
        Enrollment.remove();

        System.out.println(Enrollment);

        Enrollment.add("Jamil Valencia");
        Enrollment.add("James Jalalon");
        Enrollment.add("Jethro Vargas");
        Enrollment.add("Carlos Legaspi");
        Enrollment.add("Luis Verzosa");

        System.out.println(Enrollment);

        System.out.println(Enrollment.size());

        System.out.println(Enrollment.peek());

    }

}
