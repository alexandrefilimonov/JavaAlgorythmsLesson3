package ru.geekbrains.Lesson1;

public class StackQ
{
    private Deque stackQueue;

    public StackQ(int size)
    {
        stackQueue = new Deque(size);
    }
    public StackQ(int size, String s)
    {
        stackQueue = new Deque(size,"String");
    }

    public void push(long j)
    {
        stackQueue.insertRight(j);
    }

    public long pop()
    {
        return stackQueue.removeRight();
    }

    public void pushS(String j)
    {
        stackQueue.insertRightS(j);
    }

    public String popS()
    {
        return stackQueue.removeRightS();
    }

    public long peek()
    {
        return stackQueue.peekRight();
    }

    public Boolean isEmpty()
    {
        return stackQueue.isEmpty();
    }

    public Boolean isFull()
    {
        return stackQueue.isFull();
    }

    public void display()
    {
        stackQueue.display();
    }
}
