import java.io.*; 
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        System.out.println("Input:\n");
        String s;
        s = scanner.nextLine();
        //System.out.println(s);
        double result = calc(s);
        if (result==22){
            System.out.println("Ошибка");
        }
        else {
        System.out.println("Output:\n"+result);
        }
    }
    ////////////////////////////////////////////////////////    
    public static double CheckDigit(String array_i){
        double num1;
        switch (array_i){
            case "1":
            case "I":
                num1=1;
                break;
            case "2":
            case "II":
                num1=2;
                break;
            case "3":
            case "III":
                num1=3;
                break;
            case "4":
            case "IV":
                num1=4;
                break;
			case "5":
			case "V":
			    num1=5;
				break;
			case "6":
			case "VI":
				num1=6;
				break;
			case "7":
			case "VII":
				num1=7;
				break;
			case "8":
			case "VIII":
				num1=8;
				break;
			case "9":
			case "IX":
				num1=9;
				break;
			case "10":
			case "X":
			    num1=10;
			default:
                System.out.println("Цифра не распознана. По тз цифры из интервала [1;10].");
                num1=CheckDigit(array_i);
        }
        return num1;
    }
    
    public static double  calc(String s){
        
        double num1;
        double num2;
        double result;
        
        String values[] = s.replaceAll("\\s", "").split("[\\+\\-\\*\\/]", 2);
        String array_i1= values[0];
        String array_i2= values[1];
        num1=CheckDigit(array_i1);
        num2=CheckDigit(array_i2);
        //    взять операцию
        String operand = s.replaceAll("[\\w\\s]", "");
    
        switch (operand){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана.");
                result = 22;
        }
        return result;
    }
    

////////////////////////////////////////////////////////////////// 
    
}
