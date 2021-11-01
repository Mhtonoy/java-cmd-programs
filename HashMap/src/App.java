import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> myMap = new HashMap<>();

        //size of hashmap
        System.out.println("Size of hashmap is: " + myMap.size());

        //check whether hashmap is empty or not
        System.out.println("Is hashmap empty: " + myMap.isEmpty());

        //Insert items on hashmap
        myMap.put("Monday", "Shombar");
        myMap.put("Tuesday", "Mongolbar");
        myMap.put("Wednesday", "Budhbar");
        myMap.put("Thursday", "Brihospotibar");
        myMap.put("Friday", "Shukrobar");
        myMap.put("Saturday", "Shonibar");
        myMap.put("Sunday", "Robibar");
        
        //size of hashmap
        System.out.println("Size of hashmap is: " + myMap.size());

        //check whether hashmap is empty or not
        System.out.println("Is hashmap empty: " + myMap.isEmpty());

        //print all keys of hashmap
        System.out.println("Keys of hashmap are: " + myMap.keySet());

        //print all values of hashmap
        System.out.println("Values of hashmap are: " + myMap.values());

        //get the value of a key
        System.out.println("Value of key Monday is: " + myMap.get("Monday"));
        System.out.println("Value of key Saturday is: " + myMap.get("Saturday"));

        //get the value of a key that are not present
        System.out.println(myMap.get("abv"));

        //check whether a key is present or not
        System.out.println("Is key Thursday present: " + myMap.containsKey("Thursday"));

        //check whether a value is present or not
        System.out.println("Is value Budhbar present: " + myMap.containsValue("Budhbar"));

        //remove a key
        System.out.println(myMap.remove("Thursday"));

        //print the hasmap
        System.out.println(myMap.toString());

        //replace a value
        System.out.println(myMap.replace("Sunday", "BudhBar"));

        //print the hasmap
        System.out.println(myMap.toString());

        //clear the entire hashmap
        myMap.clear();

        //print the hasmap
        System.out.println(myMap.toString());
        
    }
}
