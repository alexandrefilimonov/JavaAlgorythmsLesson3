package ru.geekbrains.Lesson1;

public class Queue
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    public long runningTally;

    public Queue(int s)
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
        runningTally = 0;
    }

    public void insert(long j)
    {
        if(rear == maxSize -1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public long remove()
    {
        long temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long peekFront()
    {
        return queArray[front];
    }

    public long itemAt(int i)
    {
        return queArray[i];
    }

    public boolean isEmpty()
    {
        return(nItems==0);
    }

    public boolean isFull()
    {
        return(nItems==maxSize);
    }

    public int size()
    {
        return nItems;
    }

    public void display()
    {
        int temp = front;
        for(int i = 0; i < nItems; i++)
        {
            System.out.print(queArray[temp] + " ");
            temp++;
            if(temp == maxSize) temp = 0;
        }
        System.out.println("");
    }
}
