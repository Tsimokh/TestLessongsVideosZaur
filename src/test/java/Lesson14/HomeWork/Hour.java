package Lesson14.HomeWork;

public class Hour {
    static void printTime() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                System.out.println("Starting iteration OUTER for");
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second < 60; second++) {
                    if (second * hour > minute) {
                        System.out.println("Finishing iteration OUTER for");
                        continue MIDDLE;
                    }
                    if(minute<10 && second <10){
                    System.out.println("0" + hour + ":0" + minute + ":0" + second);}
                    if(minute>=10 && second <10){
                        System.out.println("0" + hour + ":" + minute + ":0" + second);
                    }if(minute<10 && second >=10){
                        System.out.println("0" + hour + ":0" + minute + ":" + second);
                    }if(minute>=10 && second >=10){
                        System.out.println("0" + hour + ":" + minute + ":" + second);
                    }
                }
            }
        }
    }
    static void method1() {
        int x = 5;
        if (x > 10) {
            System.out.println("x ����� 10");
        } else if (x < 0) {
            System.out.println("x ����� 0");
        } else {
            System.out.println("x ����������� �� 0 � 10");
        }
    }

    static void method2() {
        int dayOfWeek = 3;
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "��������";
                break;
            case 2:
                dayName = "³������";
                break;
            case 3:
                dayName = "������";
                break;
            default:
                dayName = "�������� ����";
                break;
        }
    }


    public static void main(String[] args) {
        printTime();
    }
}

