package board;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Reply {
    // 1. 필드
    // 댓글 번호
    private int id;
    // 게시글 번호
    private int boardId;
    // 작성자 회원 번호
    private int writerId;
    // 내용
    private String content;
    // 작성일
    private Calendar writtenDate;

    // 2. 메소드
    // getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
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

    // id를 기준으로 한 equals() 메소드
    public boolean equals(Object o) {
        if (o instanceof Reply) {
            
            Reply r = (Reply) o;
            if (id == r.id) {
                return true;
            }
        }

        return false;
    }

    // 댓글을 형식에 맞추어 출력하는 print() 메소드
    public void print(String writerName) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        System.out.println("---------------------------------");
        System.out.printf("작성자: %s 작성일 %s\n", writerName, sdf.format(writtenDate.getTime()));
        System.out.println("----------------------------------");
        System.out.println(content);
        System.out.println("-----------------------------------");
        
        
        
        
        
        
        
        
        

    }

}
