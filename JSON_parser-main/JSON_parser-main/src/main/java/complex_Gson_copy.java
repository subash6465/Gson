import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class complex_Gson_copy {
    public static void main(String[] args) {
        {
            try{
          
            //JACKSON
            	
            	
                //final ObjectMapper objectMapper = new ObjectMapper();
            	
            	//File file = new File("D:\\Users\\subashb\\Downloads\\JSON_parser-main\\JSON_parser-main\\src\\main\\resources\\CA_category_id.json");
            	
            	// category_copy category_copy = objectMapper.readValue(file, category_copy.class);
            	
            	//System.out.println(category_copy.items.get(0).snippet.title);
            	
            //GSON	
            	
            	Gson gson = new Gson();
            	
                Reader file = new FileReader("D:\\Users\\subashb\\Downloads\\JSON_parser-main\\JSON_parser-main\\src\\main\\resources\\CA_category_id.json");
                
                category_copy category_copy = gson.fromJson(file, category_copy.class);
              
                category_copy.itemarr.stream().map(x->x).forEach(y->System.out.println(y.snippet.title+"\n"));
                

                //System.out.println(category_copy.itemarr.get(0).snippet.title);




            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

