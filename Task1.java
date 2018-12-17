/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
*/
class Task1 {
	public static void main(String... argv) {
		int sec=4500;//число секунд
				
		int ms1=sec/60;
		int ms2=sec%60;
		int h=sec/3600;
		int d=h/24;
		int w=d/7;
		
		
		
		System.out.println("In "+sec+" seconds: "+ms1+" minutes, "+ms2+" seconds");
		System.out.println();
		System.out.println("In "+sec+" seconds: "+h+" hours, "+ms1+" minutes, "+ms2+" seconds");
		System.out.println();
		System.out.println("In "+sec+" seconds: "+d+" days, "+h+" hours, "+ms1+" minutes, "+ms2+" seconds");
		System.out.println();
		System.out.println("In "+sec+" seconds: "+w+" weeks, "+d+" days, "+h+" hours, "+ms1+" minutes, "+ms2+" seconds");
		}
}