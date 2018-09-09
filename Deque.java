package ru.geekbrains.Lesson1;
import java.io.*;
public class Deque {
    private int maxSize;
    private long[] arr;
    private String[] arrS;
    private int nItems;
    private int left;
    private int right;

    public Deque(int s)
    {
        maxSize = s;
        arr = new long[maxSize];
        nItems = 0;

        left = 1;
        right = 0;
    }
    public Deque(int s, String ss)
    {
        maxSize = s;
        arrS = new String [maxSize];
        nItems = 0;

        left = 1;
        right = 0;
    }

    public long peekLeft()
    {
        return arr[left];
    }

    public long peekRight()
    {
        return arr[right];
    }
    public String peekLeftS()
    {
        return arrS[left];
    }

    public String peekRightS()
    {
        return arrS[right];
    }

    public void insertLeft(long value)
    {
        if(!isFull())
        {
            left--;
            if(left < 0) left = maxSize-1;
            arr[left] = value;
            nItems++;
        }
        else System.out.println("The Queue is full!");
    }

    public long removeLeft()
    {
        if(!isEmpty())
        {
            long temp = arr[left];
            left++;
            if(left >= maxSize) left = 0;
            nItems--;
            return temp;
        }
        else
        {
            System.out.println("The Deque is empty!");
            return -1;
        }
    }

    public void insertRight(long value)
    {
        if(!isFull())
        {
            right++;
            if(right >= maxSize) right = 0;
            arr[right] = value;
            nItems++;
        }
        else System.out.println("The Deque is full!");
    }

    public long removeRight()
    {
        if(!isEmpty())
        {
            long temp = arr[right];
            right--;
            if(right < 0) right = maxSize-1;
            nItems--;
            return temp;
        }
        else
        {
            System.out.println("The Deque is empty!");
            return -1;
        }
    }
    public void insertRightS(String value)
    {
        if(!isFull())
        {
            right++;
            if(right >= maxSize) right = 0;
            arrS[right] = value;
            nItems++;
        }
        else System.out.println("The Deque is full!");
    }

    public String removeRightS()
    {
        if(!isEmpty())
        {
            String temp = arrS[right];
            right--;
            if(right < 0) right = maxSize-1;
            nItems--;
            return temp;
        }
        else
        {
            System.out.println("The Deque is empty!");
            return "";
        }
    }

    public Boolean isEmpty()
    {
        if(nItems == 0) return true;
        else return false;
    }

    public Boolean isFull()
    {
        if(nItems == maxSize) return true;
        else return false;
    }

    protected void display()
    {
        System.out.println("Left: " + left + ", Right: " + right);
        int index = left;
        for(int i = 0; i < nItems; i++)
        {
            if(index >= maxSize) index = 0;
            System.out.print(arr[index] + " ");
            index++;
        }
        System.out.println("");
    }
}
