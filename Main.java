//Jhotika Raja
//23070126050
//A2
// Program: Menu-driven Java program for Student Management System
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManager manager=new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n====== Student Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    manager.searchByPrn();
                    break;
                case 4:
                    manager.searchByName();
                    break;
                case 5:
                    manager.searchByPosition();
                    break;
                case 6:
                    manager.updateStudentInfo();
                    break;
                case 7:
                    manager.deleteStudent();
                    break;
                default:
                    System.out.println("Thankyou!!!");
            }
        } while (choice != 0);
        scanner.close(); 
    }
}
