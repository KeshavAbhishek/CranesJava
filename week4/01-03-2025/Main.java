import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    int rank;
    String name;

    Student(int rank, String name){
        this.rank = rank;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.rank - s.rank;
    }

    @Override
    public String toString(){
        return name + ' ' + '(' + rank + ')';
    }

}

public class Main{
    public static void main(String[] args) {
        PriorityQueue<Student> s = new PriorityQueue<>();
        s.offer(new Student(2, "Alice"));
        s.offer(new Student(1, "Bob"));
        s.offer(new Student(3, "Emile"));

        while (!s.isEmpty()) {
            System.out.println(s.poll());
        }
    }
}