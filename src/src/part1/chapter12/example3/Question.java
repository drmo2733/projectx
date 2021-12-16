package src.part1.chapter12.example3;

import java.util.Random;

public class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100* rand.nextDouble());

        if (prob < 15)
            return Answers.MAYBE;
        else if (prob < 30)
            return Answers.NO;
        else if (prob < 60)
            return Answers.YES;
        else if (prob < 75)
            return Answers.LATER;
        else if (prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }
}

class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO -> System.out.println("net");
            case YES -> System.out.println("da");
            case MAYBE -> System.out.println("vazmozhno");
            case LATER -> System.out.println("pozdnee");
            case SOON -> System.out.println("vskore");
            case NEVER -> System.out.println("nikogda");

        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}