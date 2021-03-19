package day0319;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Evaluation {

    private int evaluationId;

    private int teacherId;

    private int id;

    private String content;

    private Calendar writeDate;

    //
    public int getEvaluationId() {
        return evaluationId;
    }

    public void setevaluationId(int evaluationId) {
        this.evaluationId = evaluationId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Calendar writeDate) {
        this.writeDate = writeDate;
    }

    //
    public boolean equals(Object o) {
        if (o instanceof Evaluation) {

            Evaluation e = (Evaluation) o;

            if (evaluationId == e.evaluationId) {
                return true;
            }

        }
        return false;
    }

    //
    public void print(String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yy년 M월 d일");

        System.out.println();
        System.out.println("=====================================");
        System.out.printf("평가 번호: %d\n", evaluationId);
        System.out.printf("교사 번호: %d\n", teacherId);
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("                내용                   ");
        System.out.println("---------------------------------------");
        System.out.println(content);
        System.out.println("=======================================");
        System.out.printf("작성일: %s\n", sdf.format(writeDate.getTime()));
        System.out.println();
    }

}
