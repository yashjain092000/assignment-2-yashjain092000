package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("D", 44));
        queue.enqueue(new Student("C", 69));
        queue.enqueue(new Student("B", 55));
        queue.enqueue(new Student("A", 88));
        queue.enqueue(new Student("Last", 10));
        queue.enqueue(new Student("Divyansh Sir", 0));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}