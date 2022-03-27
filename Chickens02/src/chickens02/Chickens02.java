
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        
        /*
        
        −El lunes, el granjero Pedro recoge 100 huevos
        −El martes, recoge 121 huevos
        −El miércoles, recoge 117 huevos
        −¿Cuál es el valor diario de huevos recogidos (dailyAverage )?
        −¿Cuántos huevos cabría esperar como media en un mes de
        30 días (monthlyAverage)?
        −Si se obtienen unos beneficios de 0,18 dólares por huevo,
        ¿qué beneficio total obtendrá Pedro (monthlyProfit) para
        todos los huevos?
        
        */
        
        double dailyAverage, monthlyAverage, monthlyProfit;
        
        dailyAverage = (100+121+117)/3.0;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = (monthlyAverage * .18);
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
