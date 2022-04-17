package parsingJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test
{
    public static void main(String[] args) throws IOException {
             // read the data in the json file
       byte[] jsonData=Files.readAllBytes(Paths.get("C:\\Users\\ThariniMandyaSriniva\\Desktop\\way2automation\\firstParsing.json"));

             //creat objectmapper class and call readvalue method , that return type is class type
        ObjectMapper mapper=new ObjectMapper();
       Person person= mapper.readValue(jsonData,Person.class);

        System.out.println(person.getFirstName());
    }

}
