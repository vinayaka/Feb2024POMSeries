package com.json.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationExample 
{
	public static void main(String[] args) {
	 try {
         // Create a new Person object
         Person person = new Person("John Doe", 30, "New York");

         // Create ObjectMapper instance
         ObjectMapper objectMapper = new ObjectMapper();

         // Serialize Person object to JSON string
         String jsonString = objectMapper.writeValueAsString(person);

         // Print the JSON string
         System.out.println("Serialized JSON string:");
         System.out.println(jsonString);
     } catch (Exception e) {
         e.printStackTrace();
     }
}
}

