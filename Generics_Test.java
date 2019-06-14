import java.util.ArrayList;

public class Generics_Test {

    public static void main(String[] args){


        // Make an array of non - object type by casting (String)

        /*ArrayList lstStuff = new ArrayList();
        lstStuff.add("hello");
        String sHello = (String)lstStuff.get(0);*/

        // Make an array of non - object type by generics <String>

        ArrayList<String> lstStuff = new ArrayList<>();
        lstStuff.add("hello");
        String sHello = lstStuff.get(0);
        System.out.println("Test: " + sHello);

        Pair<String, Double> oStock1 = new Pair<>("MSFT", 29.3);
        Pair<String, Double> oStock2 = new Pair<>("GOOG", 47.19);
        Pair<String, Double> oStock3 = new Pair<>("APPL", 300.29);
        Pair<String, Double> oStock4 = new Pair<>("SNAP", 5.19);

        System.out.println("Stock 2 details: " + oStock2.getFirst() + ", " + oStock2.getSecond());

        ArrayList<Pair<String, Double>> lstStocks = new ArrayList<>();

        lstStocks.add(oStock1);
        lstStocks.add(oStock2);
        lstStocks.add(oStock3);
        lstStocks.add(oStock4);

        Pair<String, Double> oStock = lstStocks.get(0);
        System.out.println("Stock details from array list: " + oStock.getFirst() + ", " + oStock2.getSecond());

        // Create two more stocks.
        // Hint: You're going to have to create a highestPrice variable to track the highest price.
        // Hint: You also need to create a variable to hold the stock symbol of the highest price.
        // Loop through the array list and find the stock with the highest price.
        // Then print out the Stock symbol & price.


        /*for (int x = 0; x < 4; x++){

            Pair<String, Double> highestPrice = lstStocks.get(x);
            Pair<String, Double> temp = lstStocks.get(x+1);
            if( highestPrice < temp){

            }

        }*/



    }
}
