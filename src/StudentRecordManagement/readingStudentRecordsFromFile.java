/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * @author Md Rabiul Islam Shaon
 * @email mdrabiulislamshaonn@gmail.com
 */

package StudentRecordManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingStudentRecordsFromFile {

    public static void main(String[] args) {
        try {
            File file = new File("eOnushilonStudentList.txt");

            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String StudentID = input.next();
                String StudentName = input.next();
                String Batch = input.next();
                String Semester = input.next();
                String Phone = input.next();

                System.out.println("ID = " + StudentID + " Name = " + StudentName + " Batch = " + Batch + " Semester = " + Semester + " Phone = " + Phone);
            }
            input.close();
        } catch (FileNotFoundException e) {

        }
    }
}