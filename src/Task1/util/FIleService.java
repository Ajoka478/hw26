import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import info.Product;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

    public class FIleService {
        private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        private static final Path PATH = Paths.get("data/keys.json");
        public static Product[] readFile(){
            String read = "";
            try {
                read = Files.readString(PATH);
            } catch (IOException e) {
                e.printStackTrace();
            } return GSON.fromJson(read, Product[].class);
        }

        public static void writeFile(Product[] products){
            String str = GSON.toJson(products);
            try {
                Files.write(PATH, str.getBytes());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

