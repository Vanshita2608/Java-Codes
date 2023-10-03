//string methods


import java.util.Scanner;

class StringMethodsDemo
{
	public static void main(String str[])
	{
		// 1. character array to strings
		System.out.println();
		char charS[] = {'A' , 'B' , 'C' , 'D'};
		String s1 = new String(charS);
		System.out.println("We have s1 as : " + s1);

		// 2. length
		System.out.println();
		String s2 = "Hello Friends";
		System.out.println("The length is : " + s2.length());

		// 3. concat() function
		System.out.println();
		String s3 = "Good";
		String s4 = "Afternoon";
		System.out.println("Concat function shows : " + s3.concat(s4));

		// 4. character extraction
		System.out.println();
		String s5 = "SBMP IT 2022";
		System.out.println("The character at the position 3 is : " + s5.charAt(3));

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the grade of employee: ");
		char grade = sc.next().charAt(0);
		System.out.println("The grade is : " + grade);

		// 5. string to array
		System.out.println();
		String s6 = "Everyone..";
		char ch[] = s6.toCharArray();
		for(int i=0 ; i<ch.length ; i++)
		{
			System.out.println("The string to character shows :" + ch[i]);
		}

		// 6. string comparison
		System.out.println();
		String s7 = "Hello";
		String s8 = "Hello";
		String s9 = "Helo";
		System.out.println("s7 and s8 comparison result :" + s7.equals(s8));
		System.out.println("s7 and s9 comparison result :" + s7.equals(s9));

		// 7. string comaprison ignore case
		System.out.println();
		String s10 = "HELLO";
		String s11 = "HeLLO";
		String s12 = "hello";
		System.out.println("s10 and s11 comparison result :" + s10.equalsIgnoreCase(s11));
		System.out.println("s10 and s12 comparison result :" + s10.equalsIgnoreCase(s12));

		// 8. the compareTo() function
		System.out.println();
		String s13 = "sunny";
		String s14 = "sun";
		System.out.println("Comparison of s13 to s14 :" + s13.compareTo(s14));
		System.out.println("Comparison of s14 to s13 :" + s14.compareTo(s13));

		// 9. the indexOf() function
		System.out.println();
		String s15 = "SBMP IT-CSE 2021";
		System.out.println("The index position of 'S'(the one which comes first) is :" + s15.indexOf('S'));

		// 10. the lastIndexOf() function
		System.out.println();
		String s16 = "SBMP IT-CSE 2021";
		System.out.println("The index position of 'S'(the one which comes first of last) is :" + s16.lastIndexOf('S'));

		// 11. Extracting a part from the string type1
		System.out.println();
		String s17 = "HELLO";
		System.out.println("The extracted part is:" + s17.substring(2));

		// 12. Extracting a part from the string type2
		System.out.println();
		String s18 = "HELLO";
		System.out.println("The extracted part is:" + s18.substring(1,3));

		// 13. trim()
		System.out.println();
		String s19 = " HELLO WORLD_ ";
		System.out.println("After trim() is:" + s19.trim());

		// 14. replace()
		System.out.println();
		String s20 = "HELLO";
		System.out.println("After replace() is:" + s20.replace('L' , 'M'));

		// 15. toLowerCase() and toUpperCase()
		System.out.println();
		String s21 = "RADHAKRISHNA";
		System.out.println("The toLowerCase() shows : " + s21.toLowerCase());
		String s22 = "radhakrishna";
		System.out.println("The toUpperCase() shows : " + s22.toUpperCase());
	}
}