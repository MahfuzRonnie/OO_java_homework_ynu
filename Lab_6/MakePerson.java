package com.company;

public class MakePerson {
    public static void main(String[] args) {
        Person p = new Person("Mr", "Michael","Zheng","Mike", 22, true);
        System.out.println("title:         " + p.getTitle());
        System.out.println("first name:    " + p.getFirstName());
        System.out.println("last name:     " + p.getLastName());
        System.out.println("age:           " + p.getAge());
        System.out.println("sex:           " + p.getSex());
        System.out.println("standard name: " + p.getStandardName());
        System.out.println("formal name:   " + p.getFormalName());
        System.out.println("casual name:   " + p.getCasualName());
        System.out.println(" ");

        Person p2 = new Person();
        p2.setTitle("Md");
        p2.setFirstName("Mahfuz");
        p2.setLastName("Rony");
        p2.setNickname("毒液");
        p2.setAge(20);
        p2.setSex(true);
        System.out.println("title:         " + p2.getTitle());
        System.out.println("first name:    " + p2.getFirstName());
        System.out.println("last name:     " + p2.getLastName());
        System.out.println("age:           " + p2.getAge());
        System.out.println("sex:           " + p2.getSex());
        System.out.println("standard name: " + p2.getStandardName());
        System.out.println("formal name:   " + p2.getFormalName());
        System.out.println("casual name:   " + p2.getCasualName());
        System.out.println(" ");

    }

}
