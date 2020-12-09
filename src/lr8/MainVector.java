package lr8;

import java.lang.Math.*;
import java.util.Scanner;
import java.io.*;

import lr8.Radius;
import lr8.Vector;

public class MainVector {
	public static void main(String[] args) {
		try 
		{
		String str = "Работа с векторами и радиусами цилиндров.";
		int length_str = str.length();
		System.out.println(str);
		System.out.printf("Длина строки %d\n", length_str);
		Vector a = new Vector();
		Vector b = new Vector();
		Vector c = new Vector();
		Radius rad = new Radius();
		rad.initRadius(1.5);
		b.init(1, 0, -2, rad);
		System.out.printf("Количество созданных векторов: %d\n", Vector.GetCountOfVector());
		System.out.print("Введите координаты и радиус a: ");
		a.read();
		System.out.println("Цилиндры:");
		System.out.print("a ");
		a.display();
		System.out.println("");
		System.out.print("b ");
		b.display();
		System.out.println("");
		System.out.println("Сложение цилиндров a и b:");
		c = a.add(b);
		System.out.print("c ");
		c.display();
		System.out.printf("\nДлина вектора a равна %g\n", a.length());
		System.out.printf("Объем цилиндра a равен %g\n", a.cylinderVolume());
		System.out.printf("Скалярное произведение векторов a и b равно %g\n", a.scalar(b));
		
        System.out.println("Работа с массивом объектов.");
        Vector [] arr = new Vector[3];
        for (int i = 0; i < 3; i++)
        	arr[i] = new Vector();
        
        System.out.print("Введите координаты и радиус a: ");
        arr[0].read();
        arr[1].init(1, 0, -3, rad);

        System.out.println("Цилиндры:");
        System.out.print("arr[0] ");
        arr[0].display();
        System.out.println();
        System.out.print("arr[1] ");
        arr[1].display();
        System.out.println("");

        System.out.println("Сложение цилиндров arr[0] и arr[1]: ");
        arr[2] = arr[0].add(arr[1]);
        System.out.print("arr[2] ");
        arr[2].display();
        System.out.println("\nДлина вектора arr[0] равна " + arr[0].length());
        System.out.println("Объем цилиндра arr[0] равен " + arr[0].cylinderVolume());
        System.out.println("Скалярное произведение векторов arr[0] и arr[1] равно " + arr[0].scalar(arr[1]));


		}
		catch(Exception e)
		{
		System.out.println("e");
		}
	}
}
