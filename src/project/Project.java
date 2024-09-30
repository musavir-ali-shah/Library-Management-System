
package project;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Project
{
	public static void main(String [] args)
        {
            char r ;
        do
        {
            System.out.println("Library Mangement System");
            System.out.println("Presss 1 to add book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("press 5 to exit");

            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter any number");
            int a = obj1.nextInt();
            
            switch(a)
            {
                case 1:
                        Library aa = new Library();
                        aa.Add();
                        break;
                
                case 2:
                        Library bb = new Library();
                        bb.Issue();
                        break;
                    
                case 3:
                        Library cc = new Library();
                        cc.Return();
                        break;
                
                case 4:
                        Library is = new Library();
                        is.Details();
                        break;
                
                case 5:
                        Library add = new Library();
                        add.exit();
                        break;
                        default:
                            System.out.println("Invalid Number");
                    
            }
                System.out.println("YOu want to select next option Y/N");
                r = obj1.next().charAt(0);
               
                
        } while(r=='y'||r=='Y');
                if(r=='n'||r=='N')
                {
                    Library z = new Library();
                    z.exit();
                
                }
            
            
        }
}
class Library
{
    static String str,b,date;
    static int a ,c;
    void Add()
    {
		System.out.println("Enter book name");
		Scanner obj2 = new Scanner(System.in);

		String str = obj2.nextLine();
                
                System.out.println("Enter the price = ");
		float price = obj2.nextFloat();
                
                System.out.println("Enter the book id");
                
		int book_no = obj2.nextInt();
                System.out.println("Your details are "+ str + " - " + price + " - " + book_no);
               
               try {
                   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("book.txt"));
                   bufferedWriter.write("Book Name: " + str);
                   bufferedWriter.newLine();
                    bufferedWriter.write("Price: " + price);
                   bufferedWriter.newLine();
                     bufferedWriter.write("Book No: " + book_no);
                   bufferedWriter.newLine();
               bufferedWriter.close();
               }
               
               catch (IOException ex) {
                   ex.printStackTrace();
               }   
               
	}

	void Issue()
	{

		Scanner obj3 = new Scanner(System.in);
		System.out.println("Book name");
		str = obj3.nextLine();
		System.out.println("Book id ");
		a = obj3.nextInt();
		obj3.nextLine();
		System.out.println("issue date");
		b = obj3.nextLine();
		System.out.println("total number of book issued");
		c = obj3.nextInt();
		obj3.nextLine();
		System.out.println("Return book date");
		date = obj3.nextLine();
	}

	int getid()
	{
		return a ;	
	}

	void Return()
	{
		System.out.println("Enter student name return date, book id");
		Scanner c = new Scanner(System.in);
		String name = c.nextLine();
                String returnDate = c.nextLine();
		int book_id = c.nextInt();
            
                
		
		if(a==book_id)
		{
                    
			System.out.println("total details");
			System.out.println("Book name"+Library.str);
			System.out.println("book id "+Library.a);
			System.out.println("issue date"+Library.b);
			System.out.println("total number of book issued"+Library.c);
			System.out.println("book return date"+Library.date);
                
                        if (!returnDate.equalsIgnoreCase(date)){
                    System.out.println("Fine " + "Rs.1000/-");
                }
		}
		else
		{
			System.out.println("Wrong id , Please enter correct id ");
		}
	}
	
	void Details()	
	{
		System.out.println("Book name"+Library.str);
		System.out.println("book id "+Library.a);
		System.out.println("issue date"+Library.b);
		System.out.println("total number of book issued"+Library.c);
		System.out.println("book return date"+Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
}
