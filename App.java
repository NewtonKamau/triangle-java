import java.io.Console;
import java.util.*;
 public class App{
 	public static void main(String[] args) {
 	// Console myConsole = System.console();
 	Scanner myConsole = new Scanner(System.in);
 	System.out.println("Enter the three sides");

 	Integer userBase = myConsole.nextInt();
 	Integer userHeight = myConsole.nextInt();
 	Integer userHypotenuse = myConsole.nextInt();


 	 Triangle userTriangle = new Triangle(userBase, userHeight, userHypotenuse);

 	 checkSides(userBase, userHeight, userHypotenuse);
 	}

 	 public static void checkSides(Integer base, Integer height, Integer hypotenuse){
 	 	if(hypotenuse==base && hypotenuse==height && height==base){
 	 		System.out.println("Equilateral triangle");
 	 	}else if(hypotenuse==height || base==height){
 	 		System.out.println("Isoscles triangle");
 		}else{
 			System.out.println("its a Scalene triangle");
 		}
 	 	
 	  }
 }


