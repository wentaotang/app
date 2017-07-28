package com.hgcode.util.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wentao on 2017/6/17.
 */
public class ComparatorLambdaDemo {

    public static void main(String[] args) {

        List<Person> list=new ArrayList<>();
        list.add(new Person("twt"));
        list.add(new Person("abc"));
        list.add(new Person("xbc"));
        list.add(new Person("jbc"));
        list.add(new Person("fxt"));
        list.add(new Person("nvb"));
        list.add(new Person("wet"));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });
        for(Person p: list){
            System.out.println(p);
        }
        System.out.println("lambda sort");
        Collections.sort(list,(p1,p2)->p1.getSurName().compareTo(p2.getSurName()));
        for(Person p: list){
            System.out.println(p);
        }
    }

    /**
     * 按照surName 排序
     */
    static  class Person {
        private String givenName;
        private String surName;
        private int age;

        public String getGivenName() {
            return givenName;
        }

        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String surName) {
            this.surName = surName;
        }

        public Person() {
        }

        @Override
        public String toString() {
            return "Person{" +
                    "surName='" + surName + '\'' +
                    '}';
        }
    }
}
