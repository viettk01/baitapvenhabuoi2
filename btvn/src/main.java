import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Moi ban nhap ten hang nhap kho: ");
        String tenhang = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Moi ban nhap ngay thang nam sinh theo dang (yyyy-MM-dd):");
        String localDate = scanner2.nextLine();
        LocalDate birthday = LocalDate.parse(localDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Moi ban nhap thoi gian nhap hang theo dang (HH:mm:ss): ");
        String timein = scanner3.nextLine();
        LocalTime timeitemin = LocalTime.parse(timein, DateTimeFormatter.ofPattern("HH:mm:ss"));



        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Moi ban nhap thoi gian theo dang (yyyy-MM-dd HH:mm:ss): ");
        String time = scanner4.nextLine();
        LocalDateTime thoigian = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("Ten hang nhap kho la: "+tenhang);
        System.out.println("Nam sinh cua ban la: "+birthday);
        System.out.println("Thoi gian nhap hang cua ban la: "+timeitemin);
        System.out.println("Thoi gian ban đa nhap la: "+thoigian);


    }
}
