public class Main {
    public static void main(String[] args) {

        //1
        int x = 2;
        byte a = 4;
        short b = 6;
        long myNum = 10L;
        float floatNum = 3.3f;
        double doubleNum = 5.2;
        System.out.println("Значение переменной x с типом int равно " +x);
        System.out.println("Значение переменной a с типом byte равно " +a);
        System.out.println("Значение переменной b с типом short равно " +b);
        System.out.println("Значение переменной myNum с типом long равно " +myNum);
        System.out.println("Значение переменной floatNum с типом float равно " +floatNum);
        System.out.println("Значение переменной doubleNum с типом double равно " +doubleNum);

        //2
        double d = 27.12;
        long l =  987678965549L;
        float f = 2.786f;
        boolean B = false;
        short i = 569;
        int X = -159;
        int I = 27897;
        byte s = 67;

        //3
        var classAnna = 27;
        var classLyudmila = 23;
        var classEkaterina = 30;
        var classSum = classAnna+classLyudmila+classEkaterina;
        var paper = 480;
        var paperPerPerson = paper/classSum;
        System.out.println("На каждого ученика рассчитано "+paperPerPerson+" листов бумаги.");


    }
}