class Student {
    String fname = "kesi";
    String lname = "Ogbonna";

    void displayInfo() {
        System.out.println("Name: " + fname + " " + lname);
    }

    // New method to get the initials
    String getInitials() {
        return fname.charAt(0) + "." + lname.charAt(0) + ".";
    }
}

public class StudentOOP {
    public static void main(String[] args) {
        Student myObj = new Student(); // myObj is an Object of OOP class
        Student myObj2 = new Student();
        Student myObj3 = new Student();

        myObj2.fname = "Kyle";
        myObj2.lname = "Collado";

        myObj3.fname = "Kenny";
        myObj3.lname = "Dizon";

        myObj.displayInfo();
        System.out.println("Name Initials: " + myObj.getInitials());
        System.out.println();
        myObj2.displayInfo();
        System.out.println("Name Initials: " + myObj2.getInitials());
        System.out.println();
        myObj3.displayInfo();
        System.out.println("NameInitials: " + myObj3.getInitials());
    }
}