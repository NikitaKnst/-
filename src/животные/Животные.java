/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package животные;
import java.util.Scanner;
/**
 *
 * @author Home
 */
public class Животные {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.print("Year: ");
          int  year = in.nextInt(); 
          switch (year % 10)
		{
			case 0:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("белого ");
				else
					System.out.print("белой ");
				break;
			case 1:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год белого ");
				else
					System.out.print("год белой ");
				break;
			case 2:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год черного ");
				else
					System.out.print("год черной ");
				break;
			case 3:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год черного ");
				else
					System.out.print("год черной ");
				break;
			case 4:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год зеленого ");
				else
					System.out.print("год зеленой ");
				break;
			case 5:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год зеленого ");
				else
					System.out.print("год зеленой ");
				break;
			case 6:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год красного ");
				else
					System.out.print("год красной ");
				break;
			case 7:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год красного ");
				else
					System.out.print("год красной ");
				break;
			case 8:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год желтого ");
				else
					System.out.print("год желтой ");
				break;
			case 9:
				if (year % 12 == 6 || year % 12 == 7 || year % 12 == 8)
					System.out.print("год желтого ");
				else
					System.out.print("год желтой ");
				break;
		}
          switch ((year+8)%12) {
              case 0:
                System.out.println("Крысы");
              break;
              case 1:
                System.out.println("Быка/Коровы");
              break;
              case 2:
                System.out.println("Тигра");
              break;
              case 3:
                System.out.println("Заеца");
              break;
              case 4:
                System.out.println("Дракона");
              break;
              case 5:
                System.out.println("Змеи");
              break;
              case 6:
                System.out.println("Лошади");
              break;
              case 7:
                System.out.println("Овцы");
              break;
              case 8:
                System.out.println("Обезьяны");
              break;
              case 9:
                System.out.println("Курицы");
              break;
              case 10:
                System.out.println("Собаки");
              break;
              case 11:
                System.out.println("Свиньи");
              break;   
          }
          
        // TODO code application logic here
        
    }
    
}
