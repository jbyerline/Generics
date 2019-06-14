public class Pair<A,B> {

    A first;
    B second;

    // Constructor to force population at instantiation time
    public Pair(A a, B b){
     first = a;
     second = b;
    }

    public  A getFirst(){
        return first;
    }

    public  B getSecond(){
        return second;
    }

}
