package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.jackson.json.demo.entity.Student;

import java.io.File;
import java.io.FileWriter;

public class Driver  {
    public static void main(String[] args) {
        try {
            //create object mapper
            ObjectMapper mapper = new ObjectMapper();
            //read JSON file and map/convert to Java POJO
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
            //print the pojo
            System.out.println(student);
            mapper.writeValue(new FileWriter("data/sample-full-written.json"), student);
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
