public class Student {
    //defining variable
    private String prn;
    private String name;
    private String dob;
    private double marks;
    //constructor
    public Student(String prn,String name,String dob,double marks){
        this.prn=prn;
        this.name=name;
        this.dob=dob;
        this.marks=marks;
    }
    public String getPrn(){
        return prn;
    }
}
