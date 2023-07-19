// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4();
        task5();
        task6();
        task7 ();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то человеку 18 или больше лет");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то  возраст совершеннолетия еще не наступил и нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов. Холодно, надо надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов. Тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int speed = 100;
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", то скорость превышена, придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то превышения нет, можно ехать дальше");
        }
    }

    public static void task4(){
        System.out.println("Задача 4:");
        int age = 10;
        if (age < 2)
        {
            System.out.println("возраст человека равен " + age + ", ему пора спать");
        }
        else if (age < 6) {
            System.out.println("возраст человека равен " + age + ", ему пора в детский сад");
        }
        else if (age >= 7 && age < 18) {
            System.out.println("возраст человека равен " + age + ", ему нужно ходить в школу");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("возраст человека равен " + age + ", ему нужно ходить в университет");
        }
        else if (age >= 24 && age < 60) {
            System.out.println("возраст человека равен " + age + ", ему пора на работу");
        }
        else if (age >= 60) {
            System.out.println("возраст человека равен " + age + ", ему можно отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5:");
        int age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6:");
        int wagonCapacity = 102;
        int seats = 60;
        int passangers = 70;
        if (passangers < seats) {
            System.out.println("в вагоне" + passangers +" пассажиров, есть сидячие места");
        }
        else if (passangers >= seats && passangers < wagonCapacity) {
            System.out.println("в вагоне " + passangers + " пассажиров, есть только стоячие места");
        }
        else {
            System.out.println("в вагоне " + passangers + " пассажиров, мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7:");
        int one = 3;
        int two = 5;
        int three = 9;

        if (one > two) {
            if (one > three) {
                System.out.println("первое число самое большое");
            }
            else {
                System.out.println("третье число самое большое");
            }
        }
        else{
            if (two > three) {
                System.out.println("второе число самое большое");
            }
            else {
                System.out.println("третье число самое большое");
            }
        }
    }
}