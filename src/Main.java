public class Main {
    public static void main(String[] args) {
        short weight = 7000;
        short maxLoss = 500;
        short minLoss = 250;
        int timemax = weight/minLoss;
        int timemin = weight/maxLoss;
        int timeAverage = (timemax + timemin)/2;
        System.out.println("Дней для потери веса при минимальных потерях " + timemax+ " Дней");
        System.out.println("Дней для потери веса при максимальных потерях " + timemin+ " Дней");
        System.out.println("Дней для потери веса в среднем " + timeAverage+ " День");
         }
}