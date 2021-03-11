package fromobjecttojson;

import class_of_users.Users;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.lines;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FromObjecttojson {

    private static FileWriter file;
    private static ObjectMapper mapper;
    private static Users us = null;

    public static void main(String[] args) throws JsonProcessingException {
        Users us = new Users();
        us.setFirstName("ahmad");
        us.setBarthDate("10/9/1997");
        us.setGender("m");
        us.setMedName("mohammad");
        us.setLastName("kisswani");
        mapper = new ObjectMapper();
        try {

            System.out.println(mapper.writeValueAsString(us));
            //jsonFile
            file = new FileWriter(System.getProperty("user.dir") + "/jsonFile/jsonFile.json");
  
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String prettyJson = gson.toJson(mapper.writeValueAsString(us));
            prettyJson = prettyJson.replaceAll(",", ",\n");
            prettyJson =  prettyJson.replaceAll("[\\\\_]", "");
            file.write(prettyJson);
            file.flush();
            file.close();

        } catch (JsonGenerationException | JsonMappingException e) {
            // catch various errors
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(FromObjecttojson.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
