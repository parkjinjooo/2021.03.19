package day0319;

import java.util.ArrayList;
import java.util.Scanner;
import util.ScannerUtil;

public class Student01 {

    private final static ArrayList<Student> studentList = new ArrayList<>();

    private final static ArrayList<Teacher> teacherList = new ArrayList<>();

    private final static ArrayList<Evaluation> evaluationList = new ArrayList<>();

    private final static Scanner scanner = new Scanner(System.in);

    private static int studentId = 1;

    private static int teacherId = 1;

    private static int evaluationId = 1;
    // 현재 로그인한 회원의 정보를 저장
    private static Student logIn = null;

    private static Teacher T_logIn = null;

    public static void main(String[] args) {
        index();
    }

    private static void index() {
        System.out.println("===============================");
        System.out.println("     비트캠프 학생 관리 프로그램     ");
        System.out.println("===============================");

        while (true) {
            String message = new String("1. 로그인 2. 회원가입 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {
                login();
                if (logIn != null) {
                    showMenu();
                }
            } else if (userChoice == 2) {
                register();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
    }

    private static void showMenu() {
        System.out.println("===============================");
        System.out.println("       비트캠프 학생 목록관리       ");
        System.out.println("===============================");

        String message = new String("1.학생 목록 보기  2. 교사 정보 보기 ");
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);

        if (userChoice == 1) {

        } else if (userChoice == 2) {

        }

    }

    private static void login() {
        System.out.println("-----------------------");
        System.out.println("       로그인 페이지     ");
        System.out.println("-----------------------");

        String message = new String("1. 학생로그인 2. 선생로그인");
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);

        if (userChoice == 1) {

            if (studentList.isEmpty()) {
                System.out.println();
                System.out.println("아직 등록된 학생이 없습니다.");
                System.out.println();

            } else {

                Student s = new Student();
                message = new String("아이디를 입력해주세요.");
                s.setUserName(ScannerUtil.nextLine(scanner, message));

                message = new String("비밀번호를 입력해주세요.");
                s.setPassword(ScannerUtil.nextLine(scanner, message));

                logIn = auth(s);

                while (logIn == null) {
                    System.out.println();
                    System.out.println("해당하는 정보와 일치하는 회원이 없습니다.");
                    System.out.println("다시 아이디와 비밀번호를 입력해주세요.");
                    System.out.println();

                    message = new String("아이디를 입력해주세요. 만약 뒤로 가시려면 x를 입력해주세요.");
                    s.setUserName(ScannerUtil.nextLine(scanner, message));

                    if (s.getUserName().equalsIgnoreCase("x")) {
                        break;
                    }

                    message = new String("비밀번호를 입력해주세요.");
                    s.setPassword(ScannerUtil.nextLine(scanner, message));
                    logIn = auth(s);

                }
            }

        } else if (userChoice == 2) {
            if (teacherList.isEmpty()) {
                System.out.println();
                System.out.println("아직 등록된 선생이 없습니다.");
                System.out.println();
            } else {

                Teacher t = new Teacher();
                message = new String("아이디를 입력해주세요.");
                t.setUserName(ScannerUtil.nextLine(scanner, message));

                message = new String("비밀번호를 입력해주세요.");
                t.setPassword(ScannerUtil.nextLine(scanner, message));

                T_logIn = auth(t);

                while (T_logIn == null) {
                    System.out.println();
                    System.out.println("해당하는 정보와 일치하는 회원이 없습니다.");
                    System.out.println("다시 아이디와 비밀번호를 입력해주세요.");
                    System.out.println();

                    message = new String("아이디를 입력해주세요. 만약 뒤로 가시려면 x를 입력해주세요.");
                    t.setUserName(ScannerUtil.nextLine(scanner, message));

                    if (t.getUserName().equalsIgnoreCase("x")) {
                        break;
                    }

                    message = new String("비밀번호를 입력해주세요.");
                    t.setPassword(ScannerUtil.nextLine(scanner, message));
                    T_logIn = auth(t);

                }
            }
        }
    }

    private static Teacher auth(Teacher t) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (t.logIn(teacherList.get(i))) {
                return teacherList.get(i);
            }
        }

        return null;
    }

    private static Student auth(Student s) {
        for (int i = 0; i < studentList.size(); i++) {
            if (s.logIn(studentList.get(i))) {
                return studentList.get(i);
            }
        }

        return null;
    }

    private static void register() {
        System.out.println("-----------------------");
        System.out.println("       회원가입 페이지     ");
        System.out.println("-----------------------");

        String message = new String("1. 학생가입  2. 선생가입");
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);

        if (userChoice == 1) {
            Student s = new Student();

            s.setId(studentId++);

            message = new String("설정하실 아이디를 입력하세요.");
            s.setUserName(ScannerUtil.nextLine(scanner, message));

            while (validateId(s) || s.getUserName().equalsIgnoreCase("x")) {
                System.out.println(" 해당 아이디는 사용하실 수 없습니다.");
                s.setUserName(ScannerUtil.nextLine(scanner, message));
            }

            message = new String("설정하실 비밀번호를 입력하세요.");
            s.setPassword(ScannerUtil.nextLine(scanner, message));

            studentList.add(s);

        } else if (userChoice == 2) {

            Teacher t = new Teacher();

            t.setId(teacherId++);

            message = new String("설정하실 아이디를 입력하세요.");
            t.setUserName(ScannerUtil.nextLine(scanner, message));

            while (validateId(t) || t.getUserName().equalsIgnoreCase("x")) {
                System.out.println(" 해당 아이디는 사용하실 수 없습니다.");
                t.setUserName(ScannerUtil.nextLine(scanner, message));
            }

            message = new String("설정하실 비밀번호를 입력하세요.");
            t.setPassword(ScannerUtil.nextLine(scanner, message));

            teacherList.add(t);

        }
    }

    private static boolean validateId(Student s) {
        for (int i = 0; i < studentList.size(); i++) {
            if (s.getUserName().equals(studentList.get(i).getUserName())) {
                return true;
            }
        }
        return false;
    }

    private static boolean validateId(Teacher t) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (t.getUserName().equals(teacherList.get(i).getUserName())) {
                return true;
            }
        }
        return false;
    }

}
