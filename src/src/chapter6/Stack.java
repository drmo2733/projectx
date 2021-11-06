package src.chapter6;

public class Stack {
    int stck[] = new int[10];
    int index;
    Stack() {
        index=-1;
    }
    void push(int item) {
        if (index == 9)
            System.out.println("stek zapolnen");
        else
            stck[++index] = item;
    }
        int pop() {
            if (index<0){
                System.out.println("stek ne zagruzhen");
                return 0;
            }
            else
                return stck[index--];
        }
    }

