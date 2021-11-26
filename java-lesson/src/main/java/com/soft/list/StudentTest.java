//package com.soft.list;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class StudentTest {
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<Student>();
//        list.add(new Student("rose",18));
//        list.add(new Student("jack",16));
//        list.add(new Student("abc",20));
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();//以学生的年龄升序
//            }
//        });
//    }
//
//    for (Student student : list) {
//        System.out.println(student);
//    }
//}
//    Student{name='jack', age=16}
//    Student{name='rose', age=18}
//    Student{name='abc', age=20}
//}
