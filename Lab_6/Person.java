package com.company;

public class Person {
    public String title, firstName, lastName, nickname;
    public int age;
    public boolean sex;

    Person() {
    }
    Person(    String title,
               String firstName,
               String lastName,
               String nickname,
               int age,
               boolean sex) {
        if (title != null)
            setTitle(title);
        if (firstName != null)
            setFirstName(firstName);
        if (lastName != null)
            setLastName(lastName);
        if (nickname != null)
            setNickname(nickname);
        setAge(age);
        setSex(sex);
    }

    public void setTitle(String t) {
        title = t.trim();
    }
    public void setFirstName(String f) {
        firstName = f.trim();
    }
    public void setLastName(String l) {
        lastName = l.trim();
    }
    public void setNickname(String n) {
        nickname = n.trim();
    }
    public void setAge(int a) {
        age = a;
    }
    public void setSex(boolean s) {
        sex = s;
    }
    public String getTitle() {
        return title;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public boolean getSex() {
        return sex;
    }
    public String getStandardName() {
        if ((firstName != null) || (lastName != null)) {
            String standardName = firstName + " " + lastName;
            return standardName.trim();
        }
        return "No nickname or first name found.";
    }
    public String getFormalName() {
        StringBuffer sb = new StringBuffer();
        if (title != null)
            sb.append(title + ". ");
        if (firstName != null)
            sb.append(firstName + " ");
        if (lastName != null)
            sb.append(lastName);
        return sb.toString().trim();
    }
    public String getCasualName() {
        if (null != nickname) {
            return nickname;
        }
        if (null != firstName) {
            return firstName;
        }
        return "No nickname or first name found.";
    }
}

