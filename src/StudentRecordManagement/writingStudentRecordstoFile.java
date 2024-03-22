/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * @author Md Rabiul Islam Shaon
 * @email mdrabiulislamshaonn@gmail.com
 */

package StudentRecordManagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class writingStudentRecordstoFile {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String StudentName, StudentID, Semester, Batch, Phone;
        try {
            Formatter formatter = new Formatter("eOnushilonStudentList.txt");
            for (int i = 1; i <= 9; i++) {
                System.out.println(i + ". Student Record: ");
                System.out.print("ID = ");
                StudentID = input.nextLine();
                System.out.print("Name = ");
                StudentName = input.nextLine();
                System.out.print("Batch = ");
                Batch = input.nextLine();
                System.out.print("Semester = ");
                Semester = input.nextLine();
                System.out.print("Phone = ");
                Phone = input.nextLine();

                formatter.format("%s\t%s\t%s\t%s\t%s\r\n", StudentID, StudentName, Batch, Semester, Phone);
            }
            formatter.close();
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

}
