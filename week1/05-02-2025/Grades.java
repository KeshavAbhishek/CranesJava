class Grades {
    private int subject1, subject2, subject3;
    private int total, avg;

    Grades(int mark1, int mark2, int mark3) {
        if ((mark1 >= 0 && mark1 <= 100) && (mark2 >= 0 && mark2 <= 100) && (mark3 >= 0 && mark3 <= 100)) {
            subject1 = mark1;
            subject2 = mark2;
            subject3 = mark3;
        } else {
            System.out.println("Invalid Marks Entered.");
            System.exit(0);
        }
    }

    void findTotal() {
        total = subject1 + subject2 + subject3;
        System.out.println("Total Marks: " + total);
    }

    void findAvg() {
        System.out.println("Total Average: " + total/3);
        avg = total / 3;
    }

    void setGrade() {
        if (avg < 50 || (subject1 < 35 || subject2 < 35 || subject3 < 35)) {
            System.out.println("Grade = Fail");
        } else {
            if (avg >= 70) {
                System.out.println("Grade = A");
            } else if (avg >= 60 && avg < 70) {
                System.out.println("Grade = B");
            } else if (avg >= 50 && avg < 60) {
                System.out.println("Grade = C");
            }
        }
    }

    public static void main(String[] args) {
        Grades G0 = new Grades(80, 85, 90);
        G0.findTotal();G0.findAvg();G0.setGrade();

        Grades G1 = new Grades(80, 65, 50);
        G1.findTotal();G1.findAvg();G1.setGrade();

        Grades G2 = new Grades(55, 65, 50);
        G2.findTotal();G2.findAvg();G2.setGrade();

        Grades G3 = new Grades(35,35,35);
        G3.findTotal();G3.findAvg();G3.setGrade();

        Grades G4 = new Grades(-80, 85, 90);
        G4.findTotal();G4.findAvg();G4.setGrade();
    }
}