import java.io.*; 
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        System.out.println("Input:\n");
        
        String s = scanner.nextLine();
        String result_string = calc(s);
        System.out.println("Output:\n"+result_string);
    }
//////////////////////////////////////////////////////////////////          
    public static String calc(String s){
        //берем цифры
        String values[] = s.replaceAll("\\s", "").split("[\\+\\-\\*\\/]", 2); 
        
        int num1=0;
        int num2=0;
        
        String result_string = "";
        int result_int=0;
        boolean roman1=true;
        boolean roman2=true;
  
        switch (values[0]){
            case "1":
                num1=1;
                roman1=false;
                break;
            case "I":
                num1=1;
                break;
            case "2":
                num1=2;
                roman1=false;
                break;
            case "II":
                num1=2;
                break;
            case "3":
                num1=3;
                roman1=false;
                break;
            case "III":
                num1=3;
                break;
            case "4":
                num1=4;
                roman1=false;
                break;
            case "IV":
                num1=4;
                break;
			case "5":
			    num1=5;
                roman1=false;
                break;
			case "V":
			    num1=5;
				break;
			case "6":
			    num1=6;
			    roman1=false;
			    break;
			case "VI":
				num1=6;
				break;
			case "7":
			    num1=7;
			    roman1=false;
			    break;
			case "VII":
				num1=7;
				break;
			case "8":
			    num1=8;
			    roman1=false;
			    break;
			case "VIII":
				num1=8;
				break;
			case "9":
			    num1=9;
			    roman1=false;
			    break;
			case "IX":
				num1=9;
				break;
			case "10":
			    num1=10;
			    roman1=false;
			    break;
			case "X":
			    num1=10;
			    break;
			default:
                System.out.println("Цифра не распознана. По тз цифры из интервала [1;10].");
                System.exit(0);
            
        }

        switch (values[1]){
            case "1":
                num2=1;
                roman2=false;
                break;
            case "I":
                num2=1;
                break;
            case "2":
                num2=2;
                roman2=false;
                break;
            case "II":
                num2=2;
                break;
            case "3":
                num2=3;
                roman2=false;
                break;
            case "III":
                num2=3;
                break;
            case "4":
                num2=4;
                roman2=false;
                break;
            case "IV":
                num2=4;
                break;
			case "5":
			    num2=5;
                roman2=false;
                break;
			case "V":
			    num2=5;
				break;
			case "6":
			    num2=6;
			    roman2=false;
			    break;
			case "VI":
				num2=6;
				break;
			case "7":
			    num2=7;
			    roman2=false;
			    break;
			case "VII":
				num2=7;
				break;
			case "8":
			    num2=8;
			    roman2=false;//арабские
			    break;
			case "VIII":
				num2=8;
				break;
			case "9":
			    num2=9;
			    roman2=false;
			    break;
			case "IX":
				num2=9;
				break;
			case "10":
			    num2=10;
			    roman2=false;
			    break;
			case "X":
			    num2=10;
			    break;
			default:
                System.out.println("Цифра не распознана. По тз цифры из интервала [1;10].");
                System.exit(0);
        }
////////берем операнд
        String operand = s.replaceAll("[\\w\\s]", "");
        
        if (roman1==roman2){//одинаковые форматы чисел
            switch (operand){
            case "+":
                result_int = num1+num2;
                break;
            case "-":
                result_int = num1-num2;
                break;
            case "*":
                result_int = num1*num2;
                break;
            case "/":
                result_int = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана.");
                System.exit(0);
            }
            if (roman2==false){//арабские числа
                result_string = Integer.toString(result_int);
            }
            else {//Римские числа - ад!!!!
                result_string = Roman(result_int);
            }
        }
        else {//разный формат
            System.out.println("Разные форматы чисел.");
            System.exit(0);
        }
    return result_string;
    }
/////////////////////////////////////////////////////////////////////////////////////////    
    public static String Roman(int r_int){
        
        String r_string;
        int result_ost=0;
        
        String ostatok="";
        
        result_ost = r_int % 10;
         switch (result_ost){
            
            case 1:
                ostatok="I";
                break;
            
            case 2:
                ostatok="II";
                break;
           
            case 3:
                ostatok="III";
                break;
           
            case 4:
                ostatok="IV";
                break;
		
			case 5:
			    ostatok="V";
                break;
			case 6:
			    ostatok="VI";
                break;
		 
			case 7:
			    ostatok="VII";
			    break;
			
			case 8:
			    ostatok="VIII";
			    break;
			
			case 9:
			    ostatok="IX";
			    break;
			case 0:
			    ostatok=" ";
			    break;
		
			default:
                System.out.println("Ошибка");
                System.exit(0);
        }
        
        if  ( (r_int>=40) && (r_int<50) ) {
            r_string = "XL"+ostatok;
            
        }
        else if  ( (r_int>=50) && (r_int<60) ) {
            r_string = "L"+ostatok;
            
        }
        else if  ( (r_int>=60) && (r_int<70) ) {
            r_string = "LX"+ostatok;
            
        }
        else if  ( (r_int>=70) && (r_int<80) ) {
            r_string = "LXX"+ostatok;
            
        }
        else if  ( (r_int>=80) && (r_int<90) ) {
            r_string = "LXXX"+ostatok;
            
        }
        else if  ( (r_int>=90) && (r_int<100) ) {
            r_string = "XC"+ostatok;
            
        }
        else if  ( (r_int== 100) ) {
            r_string = "C";
            
        }
        else if  ( (r_int>=0) && (r_int<1) ) {
            r_string = "0";
            
        }
        else if  ( (r_int>=1) && (r_int<10) ) {
            r_string = ostatok;
            
        }
        else if  ( (r_int>=10) && (r_int<20) ) {
            r_string = "X"+ostatok;
            
        }
        else if  ( (r_int>=20) && (r_int<30) ) {
            r_string = "XX"+ostatok;
            
        }
        else if  ( (r_int>=30) && (r_int<40) ) {
            r_string = "XXX"+ostatok;
        }
        else {
            r_string = "0";
        }
        return r_string;
        
    }
    
}
