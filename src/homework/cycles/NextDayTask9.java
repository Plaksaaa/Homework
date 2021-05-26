package homework.cycles;

public class NextDayTask9 {
    public static void main(String[] args) {

    }

    public void nextSummerDay(int dayOfSummer, int monthOfSummer, int year){
        if (monthOfSummer == 6 || monthOfSummer == 7 || monthOfSummer == 8) {
            System.out.println(dayOfSummer + "." + monthOfSummer + "." + year);
            if (dayOfSummer == 31) {
                monthOfSummer++;
                dayOfSummer = 1;
                if (monthOfSummer == 9){
                    monthOfSummer = 6;
                    year++;
                }
            }else {
                dayOfSummer++;
            }
            System.out.println(dayOfSummer + "." + monthOfSummer + "." + year);

        }
        if (monthOfSummer < 6 || monthOfSummer > 8){
            System.out.println("Некорректная дата");
        }
    }

}
