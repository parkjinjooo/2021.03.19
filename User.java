package board;

public class User {
    // 1. 필드

    // 회원 번호
    private int id;
    // 회원 유저네임
    private String userName;
    // 회원 비밀번호
    private String password;
    // 회원 닉네임
    private String nickname;

    // 2. 메소드
    // getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // 회원의 id를 기준으로 한 equals() 메소드
    public boolean equals(Object o) {
        if (o instanceof User) {
            User u = (User) o;
            if (id == u.id) {
                return true;
            }
        }

        return false;
    }

    // 사용자로부터 넘겨받은 userName과 password가 일치하면 true가 리턴되는
    // logIn 메소드
    public boolean logIn(User u) {
        if (userName.equals(u.userName) && password.equals(u.password)) {
            return true;
        }

        return false;
    }
}
