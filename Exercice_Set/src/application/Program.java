package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int n1 = sc.nextInt();
		for(int i = 0; i < n1; i++) {
			cursoA.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B: ");
		int n2 = sc.nextInt();
		for(int i = 0; i < n2; i++) {
			cursoB.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C: ");
		int n3 = sc.nextInt();
		for(int i = 0; i < n3; i++) {
			cursoC.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(cursoA);
		total.addAll(cursoB);
		total.addAll(cursoC);
		
		System.out.println("Total students: " +total.size());
	}
}
