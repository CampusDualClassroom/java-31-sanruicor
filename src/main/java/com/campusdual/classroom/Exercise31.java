package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try{
            reader = new BufferedReader((new FileReader("src/main/resources/lorem.txt")));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if (reader != null){
                    reader.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
