package com.json.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationExample {

	public static void main(String[] args) {
        try {
            // JSON string
            String jsonString = "{\"name\":\"John Doe\",\"age\":30,\"city\":\"New York\"}";

            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Deserialize JSON string to Person object
            Person person = objectMapper.readValue(jsonString, Person.class);

            // Print the Person object
            System.out.println("Deserialized Person object:");
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
