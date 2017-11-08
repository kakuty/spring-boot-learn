package hello.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import hello.data.Greeting;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private ObjectMapper mapper;

    @RequestMapping(value = "/greeting")
    public ObjectNode  greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("key", "value");
        objectNode.put("foo", "bar");
        objectNode.put("number", 42);
        ObjectNode newNode = objectNode.putObject("haha");
        newNode.put("test", 12345);
        String[] arr = new String[] {"1", "2", "3"};
        ArrayNode arrayNode = mapper.createArrayNode();
        
        for(int i = 0; i < 3; i++) {
        	ObjectNode workExperience = mapper.createObjectNode();
        	for(int j = 0; j < 3; j++) {
        		workExperience.put("value", j + 1);
            }
        	
        	arrayNode.addObject().setAll(workExperience);
        }
        objectNode.putArray("Array").addAll(arrayNode);
        System.out.println(arrayNode.size());
        return objectNode;
    }
}
