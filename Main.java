package ru.geekbrains.Lesson1;
// Java program to demonstrate working of
// Deque in Java
import java.util.*;

public class Main {
    public static void main ( String [] args ) {
        int size = 10;
        Queue q = new Queue(size);
        System.out.println("\nQUEUE:");
        int i= 0;
        do {
            q.insert(i);
            i++;
        }
        while(i<12);

        System.out.println("\nQEQUE: Display 1:");
        q.display();
        q.remove();
        q.remove();
        q.remove();
        System.out.println("\nQEQUE: Display 2 - after three removed:");
        q.display();

        q.insert(100);
        System.out.println("\nQEQUE: Display 3 - after one additional insert:");
        q.display();
/////////////////////////
        StackQ s = new StackQ(size);
        i= 0;
        do {
            s.push(i);
            i++;
        }
        while(i<9);

        System.out.println("\n---------------------------\nSTACKQ: Display 1:");
        s.display();
        s.pop();
        s.pop();
        System.out.println("\nSTACKQ: Display 2 - after two pops:");
        s.display();

        s.push(100);
        System.out.println("\nSTACKQ: Display 3 - after one additional push:");
        s.display();
////////////////////////
        System.out.println("\n---------------------------\nSTACKQ with String values: Initial list of words");
        String sLine = "one two three fourth five";
        String ss2 = "";
        String[] splited = sLine.split("\\s+");

        StackQ s1 = new StackQ(size,"String");
        for (int j = 0;j < splited.length;j++) {
            s1.pushS(splited[j]);
        }
        for (int j = 0;j < splited.length;j++) {
            ss2+=s1.popS()+" ";
        }
        System.out.println("\nNormal sequance of words:"+sLine);

        System.out.println("\nReversed sequance of words:"+ss2);
////////////////////////
        System.out.println("\n---------------------------\nDEQUE: First part - we use insertLeft:");
        Deque d = new Deque(size);
        d.insertLeft(6);
        d.insertLeft(7);
        d.insertLeft(8);
        d.insertLeft(9);
        d.insertLeft(10);
        d.display();

        System.out.println("\nSecond part - we use insertRight:");
        d.insertRight(5);
        d.insertRight(4);
        d.insertRight(3);
        d.insertRight(2);
        d.insertRight(1);
        d.display();

        System.out.println("\nDisplay after removeRight:");
        d.removeRight();
        d.display();

        System.out.println("\nDisplay after removeLeft:");
        d.removeLeft();
        d.display();
        //System.out.println("Start");
    }
}



