/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Nov-20
 *  Time: 11:41 AM
 */
package student;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        Student[] arr = new Student[10];
        //initialize the array
        //write your code here
        //printing
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        //printing
        System.out.println(Arrays.toString(arr));
        //sort it by name;
        //i can define an lambda expression
        Comparator<Student> byName = (s1, s2) -> {
            if(s1 == s2){
                return 0;
            }
            else{
                return s1.getName().compareTo(s2.getName());
            }
        };
        Arrays.sort(arr,byName);
        //printing
        System.out.println(Arrays.toString(arr));
    }
}
