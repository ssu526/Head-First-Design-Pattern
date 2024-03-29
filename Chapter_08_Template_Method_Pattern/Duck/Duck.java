package Chapter_08_Template_Method_Pattern.Duck;

public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name + " weights " + weight;
    }

    public int compareTo(Duck otherDuck){
        if(this.weight < otherDuck.weight){
            return -1;
        }else if(this.weight == otherDuck.weight){
            return 0;
        }else{
            return -1;
        }
    }
}
