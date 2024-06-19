import java.util.*;
public class Quiz{
    static String[] qs={
        "What is the Capital of France?",
        "What is 5+7?",
        "What is the Color of the Sky?",
    };
    static String[][] ops={
        {
            "1.Berlin","2.Madrid","3.Paris","4.Rome"
        },
        {
            "1.10","2.12","3.11","4.13"
        },
        {
            "1.Blue","2.Green","3.Red","4.Yellow"
        },
    };
    static int[]  cas={2,1,0};
    static int sc=0;
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        for(int i=0;i<qs.length;i++) {
            displayQuestion(i);
            int ans=getAnswer();
            checkAnswer(i,ans);
        }
    displayResult();
    }
    static void displayQuestion(int i) {
        System.out.println(qs[i]);
        for(int j=0;j<ops[i].length;j++){
            System.out.println(ops[i][j]);
        }
        System.out.println("you have 10 seconds to answer.");
    }
    static int getAnswer(){
        long startTime=
        System.currentTimeMillis();
        int ans=-1;
        while((System.currentTimeMillis()-startTime)<10000 && ans==-1){
            if (scn.hasNextInt()) {
                ans=scn.nextInt()-1;
            }
        }
        return ans;
    }
    static void checkAnswer(int i,int ans){
        if(ans==cas[i]){
            System.out.println("correct!");
            sc++;
        } else {
            System.out.println("incorrect!");
        }
    }
    static void displayResult(){
        System.out.println("                  ");
        System.out.println("quiz is over! your score is:"+sc+"/"+qs.length);
        System.out.println("summary");
        for(int i=0;i<qs.length;i++){
            System.out.println((i+1)+"."+qs[i]);
            System.out.println("correct answer:" + (cas[i]+1));    
        
        }
    }
