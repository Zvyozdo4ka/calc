import java.io.*; 
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        double num1 = getInt();
        double num2 = getInt();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        System.out.println("Output:\n"+result);
    }
 
    public static double getInt(){
        System.out.println("Input:\n");
         
        double num;
        
        String s;
        s = scanner.nextLine();
        //System.out.println(s);
        
        switch (s){
            case "1":
            case "I":
                num=1;
                break;
            case "2":
            case "II":
                num=2;
                break;
            case "3":
            case "III":
                num=3;
                break;
            case "4":
            case "IV":
                num=4;
                break;
			case "5":
			case "V":
			    num=5;
				break;
			case "6":
			case "VI":
				num=6;
				break;
			case "7":
			case "VII":
				num=7;
				break;
			case "8":
			case "VIII":
				num=8;
				break;
			case "9":
			case "IX":
				num=9;
				break;
			case "10":
			case "X":
			    num=10;
			default:
                System.out.println("Цифра не распознана. Повторите ввод. По тз цифры из интервала [1;10].");
                num = getInt();//рекурсия
        }
		
        /*if(scanner.hasNextInt()){
            num = scanner.nextInt();
              
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }*/
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}