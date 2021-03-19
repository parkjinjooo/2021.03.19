package day0319;

public class Student {

    private int id;

    private String name;

    private int group;

    private String userName;

    private String password;

    private boolean inputChecker;

    private int kor;

    private int eng;

    private int math;

    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public boolean isInputChecker() {
        return inputChecker;
    }

    public void setInputChecker(boolean inputChecker) {
        this.inputChecker = inputChecker;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //
    public boolean equals(Object o) {
        if (o instanceof Student) {

            Student s = (Student) o;

            if (id == s.id) {
                return true;
            }

        }
        return false;
    }

    public boolean logIn(Student s) {
        if (userName.equals(s.userName) && password.equals(s.password)) {
            return true;
        }
        return false;
    }

    //
    public void print(String name) {
        System.out.println();
        System.out.println("===================================");
        System.out.printf("             %s의 성적\n              ", name);
        System.out.printf(" 번호: %02d 이름: %s 반: %02d\n", id, name, group);
        System.out.printf(" 국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, math);
        System.out.println("===================================");

    }

}
