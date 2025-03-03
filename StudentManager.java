import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner ;
    private static final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public StudentManager() {
    students=new ArrayList<>();
    scanner=new Scanner(System.in);
    }
  

}
