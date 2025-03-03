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
    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn=scanner.next();
    
        System.out.print("Enter name: ");
        String name=scanner.nextLine();

        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        String dobInput = scanner.next();
        LocalDate dob = LocalDate.parse(dobInput, formatter);

        System.out.print("Enter name: ");
        double marks=scanner.nextDouble();
        students.add(new Student(prn,name,dob.format(formatter),marks));
        System.out.println("Student added successfully!");
    }
    public void searchByPrn(){
        System.out.print("Enter PRN to search: ");
        String prn = scanner.next();
        boolean flag=false;
        for (Student student:students){
            if (student.getPrn().equalsIgnoreCase(prn)){
                flag=true;
                student.display();
                return;
            }
        }
        if (flag==false){
            System.out.println("Student not found");
        }
    }
    public void searchByName(){
        System.out.println("enter name to be searched");
        String name=scanner.nextLine();
        boolean flag=false;
        for (Student student:students){
            if (student.getName().equalsIgnoreCase(name)){
                flag=true;
                student.display();
                return;
            }
        }
        if (flag==false){
            System.out.println("Student not found");
        }

    }

}
