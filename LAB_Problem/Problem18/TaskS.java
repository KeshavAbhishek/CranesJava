import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name;
    }
}

class TaskScheduler {
    private PriorityQueue<Task> taskQueue;

    public TaskScheduler() {
        taskQueue = new PriorityQueue<>(Comparator.comparingInt((Task t) -> t.priority).reversed());
    }

    public void addTask(String name, int priority) {
        taskQueue.add(new Task(name, priority));
    }

    public String getNextTask() {
        return taskQueue.isEmpty() ? null : taskQueue.poll().toString();
    }

    public String peekTask() {
        return taskQueue.isEmpty() ? null : taskQueue.peek().toString();
    }

    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }
}

public class TaskS {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask("Write report", 2);
        scheduler.addTask("Fix bugs", 5);
        scheduler.addTask("Code review", 3);
        scheduler.addTask("Deploy app", 4);

        System.out.println(scheduler.peekTask());
        System.out.println(scheduler.getNextTask());
        System.out.println(scheduler.getNextTask());
    }
}