package pack;

public class function1 {
    public static void calcTax(int tax6, int tax15) {
        System.out.println("УСН доходы: " + tax6);
        System.out.println("УСН доходы минус расходы: " + tax15);
        if (tax6 > tax15) {
            System.out.println("УСН доходы минус расходы: экономия "+ (tax6 - tax15));
        } else if (tax6 < tax15) {
            System.out.println("УСН доходы: экономия "+ (tax15 - tax6));
        } else {
            System.out.println("Можете выбрать любую систему налогообложения");
        }
    }

    public static int tax6(int income) {
        return income / 100 * 6;
    }
    public static int tax15(int income, int expense) {
        return  (income - expense) / 100 * 15;
    }
}

