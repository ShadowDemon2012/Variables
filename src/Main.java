public class Main {
    public static void main(String[] args) {
        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;
     double increaseMasha = Masha*0.1 + Masha;
     double increaseDenis = Denis*0.1 + Denis;
     double increaseKristina = Kristina*0.1 + Kristina;
     double yearSalaryMasha = increaseMasha*12 - Masha*12;
     double yearSalaryDenis = increaseDenis*12 - Denis*12;
     double yearSalaryKristina = increaseKristina*12 - Kristina*12;
        System.out.println("Зарплата Маши теперь " + increaseMasha + ", Годовая зарплата Маши выросла на " + yearSalaryMasha );
        System.out.println("Зарплата Дениса теперь " + increaseDenis+ ", Годовая зарплата Дениса выросла на " + yearSalaryDenis );
        System.out.println("Зарплата Кристины теперь " + increaseKristina+ ", Годовая зарплата Кристины выросла на " + yearSalaryKristina );
    }
}