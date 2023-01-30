public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int age=50;
        if (age>=18){
            System.out.println("Если возраст человека " + age + " лет,то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека " + age + "  лет, он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int degrees = 10;
        if (degrees >= 5) {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку");
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        int speed =90;
        if (speed>60){
            System.out.println("Если скорость " + speed + " км/ч,то придется заплатить штраф.");
        }
        else{
            System.out.println("Если скорость " + speed + " км/ч,то можно ездить спокойно." );
        }

    }
    public static void  task4(){
        System.out.println("Задача 4");
        int age=30;
        if (age>=2 && age<=6){
            System.out.println("Если возраст человека" + age + ",то ему нужно ходить в детский сад.");
        }
        if (age>=7 && age <=18) {
            System.out.println("Если возраст человека" + age + ",то ему нужно ходить в школу." );
        }
        if (age>18 && age <24) {
            System.out.println("Если возраст человека" + age + ",то ему нужно ходить в yниверситет." );
        }
        else {
            System.out.println("Если возраст человека" + age + ",то ему нужно ходить на работу." );
        }
        }


    public static void task5(){
        System.out.println("Задача 5");
        int age=9;
        if (age<=5){
            System.out.println("Если возраст ребенка равен " + age + " ,то ему нельзя кататься на аттракционе");
        }
        if (age>5 && age<=14){
            System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println( "Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        }


    public static void task6(){
        System.out.println("Задача 6");
        int wagonCapacity=102;
        int seatPlace=60;
        if (seatPlace<=60){
            System.out.println("В вагоне есть сидячие места.");
        }
        if (seatPlace>60 && wagonCapacity<=102){
            System.out.println("В вагоне есть стоячие места.");
        }
        else {
            System.out.println(" В вагоне нет свободных мест.");
        }

    }

    public static void task7(){
        System.out.println("Задача 7");
        int oneNumber=7;
        int twoNumber=21;
        int threeNumber=28;
        if (oneNumber>twoNumber && oneNumber>threeNumber){
            System.out.println( "Первое число " +oneNumber+ " большее.");
        }
        if (twoNumber>oneNumber && twoNumber>threeNumber){
            System.out.println("Второе число " + twoNumber + " большее.");
        }
        else {
            System.out.println("Третье число " + threeNumber + " большее.");
        }
    }

}



