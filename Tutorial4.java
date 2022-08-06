import java.io.FileWriter;
import java.io.IOException;
public class Tutorial4 {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("He who knows not and knows not that he knows not isfool shun him");
            writer.write("\nHe who knows not and knows that he knows not is a child teach him.");
            writer.write("He who knows and knows not that he knows is asleep wake him.");
            writer.write("He who knows and knows that he knows is wise walk with him.");
            writer.close();
            writer.append("~ Persian proverb");



        }
        catch(IOException e){
            e.printStackTrace();

        }
        
    }
    
}
