package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class Student {
    private static final Logger logger = Logger.getLogger(Student.class.getName());

    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {
        String filePath = "students.json";

        try {
            String jsonData = Files.readString(Paths.get(filePath));

            List<Student> students = parseJsonToStudents(jsonData);

            double averageAge = calculateAverageAge(students);

            logger.log(Level.INFO, "Average age of students: " + averageAge);


        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading JSON file: " + e.getMessage(), e);
        }
    }

    private static List<Student> parseJsonToStudents(String jsonData) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonData, objectMapper.getTypeFactory().constructCollectionType(List.class, Student.class));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error parsing JSON data: " + e.getMessage(), e);
            return null;
        }
    }

    private static double calculateAverageAge(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Student student : students) {
            sum += student.getAge();
        }
        return sum / students.size();
    }
}
