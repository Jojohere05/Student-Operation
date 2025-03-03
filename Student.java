import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Student {
    //defining variable
    private String prn;
    private String name;
    private LocalDate dob;
    private double marks;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //constructor
    public Student(String prn,String name,String dob,double marks){
        this.prn=prn;
        this.name=name;
        this.dob=LocalDate.parse(dob, formatter);
        this.marks=marks;
    }
    public String getPrn(){
        return prn;
    }
    public String getName(){
        return name;
    }
    public LocalDate getDob(){
        return dob;
    }
    public double getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }

}
