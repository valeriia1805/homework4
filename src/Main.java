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
    public static void task1 () {
        System.out.println("Задача 2");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
      if (age<18) {
        System.out.println("Если возраст человека равен " + age + ", нужно немного подождать");
    }
}
    public static void task2 () {
        System.out.println("Задача 2");
    int summer = 20;
    int winter = -10;
        if (summer > 5) {
        System.out.println("Сегодня тепло " + summer + " , можно идти без шапки");
    }
        if (winter < 5) {
        System.out.println("На улице холодно " + winter + " , нужно надеть шапку");
        }
    }
    public static void task3 () {
     System.out.println("Задача №3");
             int excessSpeed = 80;
             int normalSpeed = 50;
             if (excessSpeed > 60) {
             System.out.println("Если скорось " + excessSpeed + " , то придется заплатить штраф");
             }
             if (normalSpeed < 60) {
        System.out.println("Если скорость " + normalSpeed + " , то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 65;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        }
        else {
            System.out.println( "Человеку не нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        }else {
            System.out.println( "Человеку не нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        }else {
            System.out.println( "Человеку не нужно ходить в университет");
        }
        if (age >= 24 && age <=60) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу");
        }else {
            System.out.println( "Человеку не нужно ходить на работу");
        }
        if (age > 60) {
        System.out.println("Если возраст человека равен " + age + " ,то ему можно отдохнуть");
}     else {
        System.out.println( "Человек не ходит в детский сад");
    }}

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 8;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ребенок не может кататься на аттракционе ");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ребенок может кататься на аттракционе только в сопровождении взрослого ");
        } else { System.out.println( "Если взрослого нет, кататься нельзя");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ребенок может кататься на аттракционе ");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int trainCapacity = 102;
        int trainSeat = 60;
        int trainStand = trainCapacity - trainSeat;
        int totalOccupied = 89;
        int seatOccupied = 60;
        int standOccupied = 29;
        int vacantStand = trainStand - standOccupied;
        if(trainSeat < 60 && trainStand < 42) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } if(trainSeat == 60 && trainStand <= 42) {
            System.out.println("В вагоне есть только стоячие места");
          if(seatOccupied==60 && standOccupied==29 ) {
              System.out.println("В вагоне есть " + vacantStand + " стоячих мест ");
          }
        } else {
            System.out.println("Вагон забит полностью");
        }
    }
        public static void task7 () {
            System.out.println("Задача 7");
            int one = 5;
            int two = 7;
            int three = 10;
            if(one>two && one>three) {
            System.out.println("Максимальное число это " + one +"" );}
            else {
                System.out.println("Максимальное число точно не " + one + "");
                }
            if(two>one && two>three) {
                System.out.println("Максимальное число это " + two +"");}
            else {
                System.out.println("Максимальное число точно не " + two + "");
            }
            if(three>one && three>two) {
                System.out.println("Максимальное число это " + three +"");}
            else {
                System.out.println("Максимальное число точно не " + three + "");
            }

    }
        }

