package com.json.serialization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person { 
@JsonProperty("name")
private String name;

@JsonProperty("age")
private int age;

@JsonProperty("city")
private String city;

// Default constructor is needed for deserialization
public Person() {
}

public Person(String name, int age, String city) {
    this.name = name;
    this.age = age;
    this.city = city;
}

// Getters and setters
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

@Override
public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", city='" + city + '\'' +
            '}';
}
}
