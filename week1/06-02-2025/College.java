class Institution {
    String name;
    String location;

    public Institution(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInstitutionInfo() {
        System.out.println("Institution Name: " + name);
        System.out.println("Location: " + location);
    }
}

class University extends Institution {
    int ranking;
    int numberOfStudents;

    public University(String name, String location, int ranking, int numberOfStudents) {
        super(name, location);
        this.ranking = ranking;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public void displayInstitutionInfo() {
        super.displayInstitutionInfo();
        System.out.println("Ranking: " + ranking);
        System.out.println("Number of Students: " + numberOfStudents);
    }
}

class Department extends University {
    String departmentName;
    String headOfDepartment;

    public Department(String name, String location, int ranking, int numberOfStudents, String departmentName, String headOfDepartment) {
        super(name, location, ranking, numberOfStudents);
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
    }

    @Override
    public void displayInstitutionInfo() {
        super.displayInstitutionInfo();
        System.out.println("Department Name: " + departmentName);
        System.out.println("Head of Department: " + headOfDepartment);
    }
}

public class College {
    public static void main(String[] args) {
        Department dept = new Department(
            "C. V. Raman Global Univeristy",
            "India",
            5,
            5000,
            "Computer Science",
            "Dr. Sourav Rout"
        );
        dept.displayInstitutionInfo();
    }
}