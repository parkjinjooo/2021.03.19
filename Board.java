package board;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// 게시글을 담당할 Board 클래스
public class Board {
    // 1. 필드
    // 글 번호
    private int id;

    // 작성자 회원 번호
    private int writerId;

    // 글 제목
    private String title;

    // 글 내용
    private String content;

    // 작성일
    private Calendar writtenDate;

    // 수정일
    private Calendar updatedDate;

    // 2. 메소드

    // getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }

    public Calendar getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    // id를 기준으로 한 equals()
    public boolean equals(Object o) {
        if (o instanceof Board) {

            Board b = (Board) o;

            if (id == b.id) {
                return true;
            }

        }
        return false;
    }

    // 게시글을 형식에 맞추어 출력하는 print()
    public void print(String writerName) {
        // 작성일 수정일에서
        // 출력에 사용될 SimpleDateFormat
        // SimpleDateFormat 처럼 클래스 이름이 너무 길 때에는
        // 약어를 사용해도 괜찮다.
        SimpleDateFormat sdf = new SimpleDateFormat("yy년 M월 d일");

        System.out.println();
        System.out.println("=====================================");
        System.out.printf("글번호: %04d\n", id);
        System.out.printf("제목: %s\n", title);

        // 기존의 Board.java는 Board 클래스의 필드로
        // 작성자의 닉네임이 곧장 String Writer로 저장이 되는 형태였지만
        // 현재 이 Board.java는 작성자의 닉네임을 직접 가지고 있는 것이 아니라
        // 작성자의 회원 번호를 갖고 있기 때문에
        // 우리가 출력할 때에는 먼저 그 번호를 통해 사용자의 닉네임을 불러와서
        // 이 println 메소드에 파라미터로 넘겨주어야 한다!
        // System.out.println("작성자: %s\n", Writer);

        System.out.printf("작성자: %s\n", writerName);
        System.out.printf("작성일: %s\n", sdf.format(writtenDate.getTime()));
        System.out.printf("수정일: %s\n", sdf.format(updatedDate.getTime()));
        System.out.println("--------------------------------------");
        System.out.println("                내용                   ");
        System.out.println("---------------------------------------");
        System.out.println(content);
        System.out.println("=======================================");
        System.out.println();

    }
}
