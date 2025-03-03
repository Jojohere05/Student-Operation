import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
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
    public void display(){
        if (students.isEmpty()){
            System.out.println("No student found!!");
        }
        else{
            System.out.println("the list of students are \n");
            for (Student student:students){
                student.display();
                System.out.println("\n");
            }
        }
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
    public void searchByPosition(){
        System.out.print("Enter Position (Index) to search: ");
        int index=scanner.nextInt();
        if (index >= 0 && index < students.size()) {
            students.get(index).display();
        } else {
            System.out.println("Invalid index.");
        }
    }
    public void updateStudentInfo(){
        System.out.print("Enter PRN of student to update: ");
        String prn = scanner.next();
        boolean flag=false;
        for (Student student:students){
            if (student.getPrn().equalsIgnoreCase(prn)){
                System.out.println("enter new name");
                String name=scanner.nextLine();
                student.setName(name);
                System.out.println("enter date of birth change");
                LocalDate newDob = null;
                while (newDob == null) {
                    try {
                        String dobInput = scanner.next();
                        newDob = LocalDate.parse(dobInput, formatter);
                        student.setDob(dobInput);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format! Please enter in DD/MM/YYYY format.");
                    }
                }
                System.out.println("enterthe new marks");
                double marks=scanner.nextDouble()
                student.setMarks(marks);
                System.out.println("Student details updated successfully.");
                student.display();
            }
        }
       
        if (flag==false){
            System.out.println("Student not found");
        }
    }
    public void deleteStudent() {
        System.out.print("Enter PRN of student to delete: ");
        String prn = scanner.next();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getPrn().equalsIgnoreCase(prn)) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

}
