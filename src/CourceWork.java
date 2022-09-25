import java.util.Arrays;
import java.util.Scanner;

public class CourceWork {
    public static void main(String[] args) {

        String tb1 = "GRIPHON-5";
        String tb2 = "GRIPHON-7";
        String tb3 = "GRIPHON-8";

        CrewMember cm1 = new CrewMember();
        cm1.setName ("Дуравкин Алексей");
        cm1.setSalary(150000);
        cm1.setTugBoat(tb1);
        cm1.setID(1);
        cm1.setPosition("Капитан");

        CrewMember cm2 = new CrewMember();
        cm2.setName ("Кузьмин Сергей");
        cm2.setSalary(120000);
        cm2.setTugBoat(tb1);
        cm2.setID(2);
        cm2.setPosition("Старший помощник капитана");

        CrewMember cm3 = new CrewMember();
        cm3.setName ("Каширский Сергей");
        cm3.setSalary(110000);
        cm3.setTugBoat(tb1);
        cm3.setID(3);
        cm3.setPosition("Старший механик");

        CrewMember cm4 = new CrewMember();
        cm4.setName ("Некрасов Дмитрий");
        cm4.setSalary(100000);
        cm4.setTugBoat(tb1);
        cm4.setID(4);
        cm4.setPosition("Второй механик");

        CrewMember cm5 = new CrewMember();
        cm5.setName ("Куриш Виктор");
        cm5.setSalary(70000);
        cm5.setTugBoat(tb1);
        cm5.setID(5);
        cm5.setPosition("Боцман");

        CrewMember cm6 = new CrewMember();
        cm6.setName ("Давитадзе Тариел");
        cm6.setSalary(60000);
        cm6.setTugBoat(tb1);
        cm6.setID(6);
        cm6.setPosition("Матрос");

        CrewMember cm7 = new CrewMember();
        cm7.setName ("Федоров Максим");
        cm7.setSalary(150500);
        cm7.setTugBoat(tb3);
        cm7.setID(7);
        cm7.setPosition("Капитан");

        CrewMember cm8 = new CrewMember();
        cm8.setName ("Витюк Григорий");
        cm8.setSalary(120500);
        cm8.setTugBoat(tb3);
        cm8.setID(8);
        cm8.setPosition("Старший помощник капитана");

        CrewMember cm9 = new CrewMember();
        cm9.setName ("Горчаков Александр");
        cm9.setSalary(110500);
        cm9.setTugBoat(tb3);
        cm9.setID(9);
        cm9.setPosition("Старший механик");

        CrewMember cm10 = new CrewMember();
        cm10.setName ("Говоров Александр");
        cm10.setSalary(100500);
        cm10.setTugBoat(tb3);
        cm10.setID(10);
        cm10.setPosition("Второй механик");

        CrewMember cm11 = new CrewMember();
        cm11.setName ("Ведебура Сергей");
        cm11.setSalary(70000);
        cm11.setTugBoat(tb3);
        cm11.setID(11);
        cm11.setPosition("Боцман");

        CrewMember cm12 = new CrewMember();
        cm12.setName ("Семенов Илья");
        cm12.setSalary(60000);
        cm12.setTugBoat(tb3);
        cm12.setID(12);
        cm12.setPosition("Матрос");

        CrewMember cm13 = new CrewMember();
        cm13.setName ("Мейсак Вадим");
        cm13.setSalary(151000);
        cm13.setTugBoat(tb2);
        cm13.setID(13);
        cm13.setPosition("Капитан");

        CrewMember cm14 = new CrewMember();
        cm14.setName ("Пузанков Владимир");
        cm14.setSalary(121000);
        cm14.setTugBoat(tb2);
        cm14.setID(14);
        cm14.setPosition("Старший помощник капитана");

        CrewMember cm15 = new CrewMember();
        cm15.setName ("Калино Алексей");
        cm15.setSalary(111000);
        cm15.setTugBoat(tb2);
        cm15.setID(15);
        cm15.setPosition("Старший Механик");

        CrewMember cm16 = new CrewMember();
        cm16.setName ("Виролайнен Виталий");
        cm16.setSalary(101000);
        cm16.setTugBoat(tb2);
        cm16.setID(16);
        cm16.setPosition("Второй механик");

        CrewMember cm17 = new CrewMember();
        cm17.setName ("Бойцов Олег");
        cm17.setSalary(70000);
        cm17.setTugBoat(tb2);
        cm17.setID(17);
        cm17.setPosition("Боцман");

        CrewMember cm18 = new CrewMember();
        cm18.setName ("Сохонцев Владимир");
        cm18.setSalary(60000);
        cm18.setTugBoat(tb2);
        cm18.setID(18);
        cm18.setPosition("Матрос");

        Scanner grifon = new Scanner(System.in);
        System.out.println("Всего в компании <ООО Грифон> три буксира. На каждом из них по 6 человек ");
        System.out.println("Введите порядковый номер буксира, чья судовая роль Вам необходима: 1. GRIFON-5 ; 2. GRIFON-7 ; 3. GRIFON-8 ");
        int tugName = grifon.nextInt();
        switch (tugName) {
            case (1) :
                System.out.println("Введите ID от 1 до 6");
                String[] grifon5 = new String[6];
                grifon5[0] = (cm1.getName() + ", " + cm1.getSalary() + " рублей,  " + cm1.getPosition());
                grifon5[1] = (cm2.getName() + ", " + cm2.getSalary() + " рублей,  " + cm2.getPosition());
                grifon5[2] = (cm3.getName() + ", " + cm3.getSalary() + " рублей,  " + cm3.getPosition());
                grifon5[3] = (cm4.getName() + ", " + cm4.getSalary() + " рублей,  " + cm4.getPosition());
                grifon5[4] = (cm5.getName() + ", " + cm5.getSalary() + " рублей,  " + cm5.getPosition());
                grifon5[5] = (cm6.getName() + ", " + cm6.getSalary() + " рублей,  " + cm6.getPosition());
                Scanner ID1 = new Scanner(System.in);
                int employee = ID1.nextInt();
                switch (employee) {
                    case (1) :
                        System.out.println(grifon5[0]);
                        break;
                    case (2):
                        System.out.println(grifon5[1]);
                        break;
                    case (3):
                        System.out.println(grifon5[2]);
                        break;
                    case (4):
                        System.out.println(grifon5[3]);
                        break;
                    case (5):
                        System.out.println(grifon5[4]);
                        break;
                    case (6):
                        System.out.println(grifon5[5]);
                }
                break;

            case(2):
                System.out.println("Введите ID члена экипажа от 1 до 6");
                String[] grifon7 = new String[6];
                grifon7[0] = (cm13.getName() + ", " + cm13.getSalary() + " рублей,  " + cm13.getPosition());
                grifon7[1] = (cm14.getName() + ", " + cm14.getSalary() + " рублей,  " + cm14.getPosition());
                grifon7[2] = (cm15.getName() + ", " + cm15.getSalary() + " рублей,  " + cm15.getPosition());
                grifon7[3] = (cm16.getName() + ", " + cm16.getSalary() + " рублей,  " + cm16.getPosition());
                grifon7[4] = (cm17.getName() + ", " + cm17.getSalary() + " рублей,  " + cm17.getPosition());
                grifon7[5] = (cm18.getName() + ", " + cm18.getSalary() + " рублей,  " + cm18.getPosition());

                Scanner ID2 = new Scanner(System.in);
                int employee1 = ID2.nextInt();
                switch (employee1) {

                    case (1):
                        System.out.println(grifon7[0]);
                        break;
                    case (2):
                        System.out.println(grifon7[1]);
                        break;
                    case (3):
                        System.out.println(grifon7[2]);
                        break;
                    case (4):
                        System.out.println(grifon7[3]);
                        break;
                    case (5):
                        System.out.println(grifon7[4]);
                        break;
                    case (6):
                        System.out.println(grifon7[5]);
                        break;
                }
                break;

            case (3) :
                System.out.println("Введите ID члена экипажа от 1 до 6");
                String[] grifon8 = new String[6];
                grifon8[0] = (cm7.getName() + ", " + cm7.getSalary() + " рублей,  " + cm7.getPosition());
                grifon8[1] = (cm8.getName() + ", " + cm8.getSalary() + " рублей,  " + cm8.getPosition());
                grifon8[2] = (cm9.getName() + ", " + cm9.getSalary() + " рублей,  " + cm9.getPosition());
                grifon8[3] = (cm10.getName() + ", " + cm10.getSalary() + " рублей,  " + cm10.getPosition());
                grifon8[4] = (cm11.getName() + ", " + cm11.getSalary() + " рублей,  " + cm11.getPosition());
                grifon8[5] = (cm12.getName() + ", " + cm12.getSalary() + " рублей,  " + cm12.getPosition());

                Scanner ID3 = new Scanner(System.in);
                int employee2 = ID3.nextInt();

                switch (employee2) {

                    case(1):
                        System.out.println(grifon8[0]);
                        break;
                    case(2):
                        System.out.println(grifon8[1]);
                        break;
                    case(3):
                        System.out.println(grifon8[2]);
                        break;
                    case(4):
                        System.out.println(grifon8[3]);
                        break;
                    case(5):
                        System.out.println(grifon8[4]);
                        break;
                    case(6):
                        System.out.println(grifon8[5]);
                        break;
                }
                break;
            }
        }
    }
    class CrewMember {

        private String name;
        public void setName(String memberName) {name = memberName;}
        public String getName(){return name;}


        private int salary;
        public void setSalary(int memberSalary){salary = memberSalary;}
        public int getSalary(){return salary;}


        private String tugBoat;
        public void setTugBoat(String tug){tugBoat = tug;}
        public String getTugBoat(){return tugBoat;}


        private int ID;
        public void setID(int iD){ID=iD;}
        public int getID(){return ID;}


        private String position;
        public void setPosition(String pos){position = pos;}
        public String getPosition(){return position;}


    void space(){
        System.out.println("       ");
    }
    void conclusion(){
            System.out.println("ID Number "+ID+" Имя: "+name+". Зарплата: "+salary+" Буксир: "+tugBoat+" Должность: " +position);
    }

}

