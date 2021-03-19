package day0319;

public class Teacher {

    private int id;

    private String teacherName;

    private int teacherGroup;

    private String userName;

    private String password;

    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(int teacherGroup) {
        this.teacherGroup = teacherGroup;
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
        if (o instanceof Teacher) {

            Teacher t = (Teacher) o;

            if (id == t.id) {
                return true;
            }

        }
        return false;
    }
    
    public boolean logIn(Teacher t) {
        if (userName.equals(t.userName) && password.equals(t.password)) {
            return true;
        }
        return false;
    }
    
    
    
    

    //
    public void print() {

    }

}
