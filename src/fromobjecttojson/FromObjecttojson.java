package fromobjecttojson;

import class_of_users.Users;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FromObjecttojson {

    public static void main(String[] args) throws JsonProcessingException {
        Users us = new Users();
        us.setFirstName("ahmad");
        us.setBarthDate("10/9/1997");
        us.setGender("m");
        us.setMedName("mohammad");
        us.setLastName("kisswani");
        ObjectMapper mapper = new ObjectMapper();
        try {

            System.out.println(mapper.writeValueAsString(us));
        } catch (JsonGenerationException | JsonMappingException e) {
            // catch various errors
            e.printStackTrace();
        }

    }

}
