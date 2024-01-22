package Chapter_08_Template_Method_Pattern.Barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    public String getUserInput(){
        String answer = null;

        System.out.println("Would you like lemon with you tea (y/n)?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            answer = reader.readLine();
        }catch (IOException ex){
            System.err.println("IO error tying to read your answer");
        }

        if(answer == null){
            return "no";
        }

        return "yes";

    }
}
