import java.util.Scanner;

public class QuestionSerivce 
{
    Question[] questions = new Question[5];
    String[] selection  = new String[5];

    public QuestionSerivce() 
    {
        questions[0] = new Question(1,"JVM Full Form?","Java Viral Machine","Java Various Machine","Java Verification Machine","Java Virtual Machine","Java Virtual Machine");
        questions[1] = new Question(2,"Size of int?","2","4","6","8","4");
        questions[2] = new Question(3,"Size of Char?","2","4","6","8","2");
        questions[3] = new Question(4,"Size of Double?","2","4","6","8","8");
        questions[4] = new Question(5,"Size of Floagt?","2","4","6","8","4");
    }

    public void displayQuestions()
    {
        int i=0;
        for(Question q : questions)
        {
            System.out.println("Question no : " + questions[i].getId());
            System.out.println(questions[i].getQuiz());
            System.out.println(questions[i].getOpt1());
            System.out.println(questions[i].getOpt2());
            System.out.println(questions[i].getOpt3());
            System.out.println(questions[i].getOpt4());
            System.out.println(questions[i].getAns());
            Scanner in = new Scanner(System.in);
            selection[i] = in.nextLine();
            i++;

        }

        for(String s:selection)
        {
            System.out.println(s);
        }
    }

    public void printScore()
    {
        int score = 0;

        for(int i=0;i<questions.length;i++)
        {

            if(questions[i].getAns().equals(selection[i]))
            {
                score++;
            }
        }

        System.out.println("You are Score is : " + score);
    }

}
