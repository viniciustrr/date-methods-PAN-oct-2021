package datas;

import java.util.Calendar;

public class Data_Calendario {
	public static void main(String[] args) {
		
		Calendar calendario1 = Calendar.getInstance();
		Calendar calendario2 = (Calendar) Calendar.getInstance();
		Calendar calendario3 = (Calendar) Calendar.getInstance();
		
		System.out.println("Calendario1 antes"+ calendario1.getTime());
		System.out.println("Calendario2 antes"+ calendario2.getTime());
		System.out.println("Calendario3 antes"+ calendario3.getTime());
		System.out.println("------------------------------------");
		
		
		calendario1.add((Calendar.MONTH), 2);
		calendario1.add((Calendar.YEAR), 5);
		calendario1.add((Calendar.DAY_OF_MONTH), 10);
		
		
		System.out.println("Calendario1 depois"+ calendario1.getTime());
		System.out.println("Calendario2 depois"+ calendario2.getTime());
		System.out.println("Calendario3 depois"+ calendario3.getTime());
		System.out.println("------------------------------------");
	}
}
