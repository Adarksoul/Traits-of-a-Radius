/* 
* This program gives the cicular are and circumference as well as spherical surface area and volume
* 	when given a radius. 
* 
* @author Chad Manning 
* Course: COMP B11 
* Created: Feb 1, 2017 
* Source File: RoundThings.java 
*/ 

import java.util.Scanner;

public class RoundThings{
	public static void main(String[] args){
		double 	   radius = 0.0, 
			   circumference = 0.0, 
			   areaOfCircle = 0.0, 
			   areaOfSphere = 0.0,
			   volumeOfSphere = 0.0;
		Scanner userInput = new Scanner(System.in);	   
	
		System.out.print("Enter radius: "); //Asks for radius
		radius = userInput.nextDouble();
		userInput.close();
		
		circumference  = Math.PI * radius * 2                           ;	//	calculates traits of circle
		areaOfCircle   = Math.PI * radius * radius                      ;	//
		areaOfSphere   = Math.PI * radius * radius * 4                  ;	//
		volumeOfSphere = Math.PI * radius * radius * radius * (4.0/3.0) ;	//
		
		System.out.printf("%n");
		System.out.printf("A circle or sphere with radius %.3f has these traits: %n", radius);
		System.out.printf("Circumference of %.3f %n"          ,circumference);
		System.out.printf("Circular radius of %.3f %n"        ,areaOfCircle);
		System.out.printf("Spherical surface area of %.3f %n" ,areaOfSphere);
		System.out.printf("Spherical volume of %.3f %n"       ,volumeOfSphere);
	}
}
