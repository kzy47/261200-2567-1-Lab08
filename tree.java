import java.awt.Color;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class tree {  
    public static void main(String[] args) {
        Map<String, Color> favoriteColors = new TreeMap<String, Color>();

       
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet) {
            Color value = favoriteColors.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
