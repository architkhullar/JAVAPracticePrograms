package animal;

import java.util.*;
import java.io.*;

public class AnimalDemo{
	public static void main(String[] args) throws Exception{
		ArrayList <Animal> animals= new ArrayList <Animal> ();
		Console cons=System.console();

		int n;
		char ch;
		//Bat obj=new Bat();
		do{
			System.out.println("Enter a new Animal...\nWhich animal?");
			n=findAnimal(); 
			switch(n){
				case 1:
					animals.add(new Bat());
					break;
				case 2: 
					animals.add(new Dog());
					break;
				case 3:
					animals.add(new Cow());
					break;
				case 4:
					animals.add(new Ostrich());
					break;
				case 5:
					animals.add(new Parrot());
					break;
			}
			
			ch=cons.readLine("Do u want to continue??? (y/n)").charAt(0);

		}while(ch=='y');

		
		putAnimals(animals);
		putHerb(animals);
		putFly(animals);
		
	}
	
	private static void putAnimals(List <Animal> animals){
		int i;
		System.out.println("Listing all the Animals...");
		for(i=0; i< animals.size(); i++){
			System.out.println( (Object) animals.get(i).getName() );
		}
	}
	private static void putHerb(List <Animal> animals){
		System.out.println("Listing all the Herbivores...");
		for(Animal a:animals){
			if(a.getHerb()){
				System.out.println( a.getName() );
			}
		}
	}
	private static void putFly(List <Animal> animals){
		System.out.println("Listing all the Animals that can fly...");
		for(Animal a:animals){
			if(!(a.getWalk())){
				System.out.println( a.getName() );
			}
		}
	}
	

	private static int findAnimal(){
		System.out.println("1.Bat\n2.Dog\n3.Cow\n4.Ostrich\n5.Parrot");
		Console cons=System.console();
		int n=Integer.parseInt(cons.readLine());
		return n;
	}
	
}

//(Object)animals.get(i).getName()
