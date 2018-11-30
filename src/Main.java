import java.util.Arrays;
import java.util.InputMismatchException;
import static java.util.Collections.sort;
import java.util.Vector;
import java.util.Scanner;

public class Main {

    private static int[] intArr;
    private static char[] charArr;
    private static int size;
    private static boolean isChar = false;   // false = integer, true = char

    private static void printMenu() {
        System.out.println("Choose the number of operation you want to execute:");
        System.out.println("1-\tMost repeated value");
        System.out.println("2-\tSort");
        System.out.println("3-\tShuffle");
        System.out.println("4-\tFind the largest prime");
        System.out.println("5-\tFind the smallest prime");
        System.out.println("6-\tCheck palindrome");
        System.out.println("7-\tCheck sorted");
        System.out.println("8-\tCount primes");
        System.out.println("9-\tReverse array");
        System.out.println("10-\tShift array");
        System.out.println("11-\tDistinct array");
        System.out.println("12-\tGet the maximum 3 numbers");
        System.out.println("13-\tGet the minimum 3 numbers");
        System.out.println("14-\tGet average");
        System.out.println("15-\tGet median");
        System.out.println("16-\tReturn only primes");
        System.out.println("17-\tZero if less than zero");
        System.out.println("18-\tExecute All");
        System.out.println("19-\tExit");
        System.out.println("\t************************\t");
    }
    
    private static void Most_repeated_value()
    {
	
    	if(isChar)
    	{
    		int count = 1, tempCount;
  		  char value = charArr[0];
  		  char temp = 0;
  		  for (int i = 0; i < (charArr.length - 1); i++)
  		  {
  		    temp = charArr[i];
  		    tempCount = 0;
  		    for (int j = 1; j < charArr.length; j++)
  		    {
  		      if (temp == charArr[j])
  		        tempCount++;
  		    }
  		    if (tempCount > count)
  		    {
  		      value = temp;
  		      count = tempCount;
  		    }
  		  }
  		  System.out.println("most repeated value is "+value);
  		  System.out.println();
    	}
    	else {
    		int count = 1, tempCount;
    		  int value = charArr[0];
    		  int temp = 0;
    		  for (int i = 0; i < (intArr.length - 1); i++)
    		  {
    		    temp = intArr[i];
    		    tempCount = 0;
    		    for (int j = 1; j < intArr.length; j++)
    		    {
    		      if (temp == intArr[j])
    		        tempCount++;
    		    }
    		    if (tempCount > count)
    		    {
    		      value = temp;
    		      count = tempCount;
    		    }
    		  }
    		  System.out.println("most repeated value is "+value);
    		  System.out.println();}
    		
    	}

    private static int getSmallestPrime() {
        if (isChar)
            return 0;
        int[] tmp = new int[size];
        for (int i = 0; i < size; i++)
            tmp[i] = intArr[i];
        Arrays.sort(tmp);
        int length = size;
        for (int i = 0; i < length; i++) {
            boolean flag = false;  //For signaling for the number prime or not
            for (int j = 2; j <= Math.floor(Math.sqrt(tmp[i])); j++) {
                if (tmp[i] % j == 0)  //Not prime
                {
                    if (tmp[i] == 2)
                        return tmp[i];
                    flag = true;
                    break;
                }
            }
            if (!flag)
                if (tmp[i] > 1)
                    return tmp[i];
        }
        return -1;
    }

    private static void smallestPrime() {
        int x = getSmallestPrime();
        if (x == 0)
            System.out.println("Sorry, no prime numbers in characters.");
        else if (x == -1)
            System.out.println("No prime number in this list.");
        else
            System.out.println("Smallest prime is: " + x);
    }

    public static void reverse() {
        if (isChar) {
            char[] tmp = new char[size];
            for (int i = 0; i < size; i++)
                tmp[i] = charArr[i];
            char temp;
            for (int i = 0; i < size / 2; i++) {
                temp = tmp[i];
                tmp[i] = tmp[size - i - 1];
                tmp[size - i - 1] = temp;
            }
            System.out.println("the reversed array is ");
            for (int j = 0; j < size; j++) {
                System.out.print(tmp[j] + " ");
            }
            System.out.println();
        } else {
            int[] tmp = new int[size];
            for (int i = 0; i < size; i++)
                tmp[i] = intArr[i];
            int temp;
            for (int i = 0; i < size / 2; i++) {
                temp = tmp[i];
                tmp[i] = tmp[size - i - 1];
                tmp[size - i - 1] = temp;
            }
            System.out.println("the reversed array is ");
            for (int j = 0; j < size; j++) {
                System.out.print(tmp[j] + " ");
            }
            System.out.println();
        }
    }

    public static void largest_prime(){
        if(isChar){
            System.out.println("no prime num ");
            return;
        }
        Vector<Integer> vect = new Vector();
        for(int i=0;i<intArr.length;i++)
        {
         int temp=intArr[i];
         boolean flage=true;
         if(temp==1)
             continue;
         if(temp==2)
         {    vect.add(temp);
              continue; }
           for(int j=2;j<temp;j++)
           {   
               if(temp%j==0)
               {      flage=false;  }
           }
           if(flage){
           vect.add(temp);
           }
        }
       sort(vect);
              if(vec.vect.size()==0){
      System.out.println("no prim /n");
                  return;
              }
        System.out.println("the largest prime num "+vect.get(vect.size()-1));

}
    public static void reverse()
    {
       if(isChar)
       {
           char temp;
    for(int i = 0; i < charArr.length/2; i++)
{
    temp =charArr[i];
    charArr[i] =charArr[charArr.length - i - 1];
    charArr[charArr.length- i - 1] = temp;}
      System.out.println("the out put is");
        for(int j=0;j<charArr.length;j++){

            System.out.println(charArr[j]);}}
       else
       {     int temp;
    for(int i = 0; i < intArr.length/2; i++)
{
    temp =intArr[i];
    intArr[i] =intArr[intArr.length - i - 1];
    intArr[intArr.length- i - 1] = temp;}
      System.out.println("the out put is");
        for(int j=0;j<intArr.length;j++){

            System.out.println(intArr[j]);}} }



    public static void FindUnique() {
        System.out.print("Find Unique : ");

        if (isChar) {
            for (int i = 0; i < size; i++) {
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (charArr[i] == charArr[j]) {
                        isUnique = false;
                        break;
                    }

                }
                if (isUnique) {
                    System.out.print(charArr[i] + " ");
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (intArr[i] == intArr[j]) {
                        isUnique = false;
                        break;
                    }

                }
                if (isUnique) {
                    System.out.print(intArr[i] + " ");
                }
            }
        }
        System.out.println();
    }

    private static void Maximum3Numbers() {
        if (isChar) {
            char[] tmp = new char[size];
            for (int i = 0; i < size; i++)
                tmp[i] = charArr[i];
            Arrays.sort(tmp);
            System.out.println("Maximum 3 characters are: ");
            for (int i = size - 1; i > size - 4 && i >= 0; i--)
                System.out.print(tmp[i] + " ");
            System.out.println();
        } else {
            int[] tmp = new int[size];
            for (int i = 0; i < size; i++)
                tmp[i] = intArr[i];
            Arrays.sort(tmp);
            System.out.println("Maximum 3 Numbers are: ");
            for (int i = size - 1; i > size - 4 && i >= 0; i--)
                System.out.print(tmp[i] + " ");
            System.out.println();
        }
    }

    private static void getMin3Numbers() {
        if (isChar) {
            char[] tmp = new char[size];
            for (int i = 0; i < size; i++)
                tmp[i] = charArr[i];
            Arrays.sort(tmp);
            System.out.print("Minimum 3 characters are: ");
            for (int i = 0; i < 3 && i < size; i++)
                System.out.print(tmp[i] + " ");
            System.out.println();
        } else {
            int[] tmp = new int[size];
            for (int i = 0; i < size; i++)
                tmp[i] = intArr[i];
            Arrays.sort(tmp);
            System.out.print("Minimum 3 numbers are: ");
            for (int i = 0; i < 3 && i < size; i++)
                System.out.print(tmp[i] + " ");
            System.out.println();
        }
    }

    private static void returnPrime() {
        int arr[] = new int[size];
        if (isChar) {
            System.out.println("Error, this Function run on integers only");
            return;
        } else {
            for (int i = 0; i < size; i++)
                arr[i] = intArr[i];
        }
        System.out.print("Prime Numbers:");
        boolean flage;
        for (int j = 0; j < arr.length; j++) {
            flage = false;
            for (int i = 2; i <= arr[j] / 2; i++) {
                if (arr[j] % i == 0)
                    flage = true;
            }
            if (flage == false && arr[j] > 1)
                System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void zeroIfLessThanZero() {
        int arr[] = new int[size];
        if (isChar) {
            System.out.println("Error, this Function run on integers only");
            return;
        } else {
            for (int i = 0; i < size; i++)
                arr[i] = intArr[i];
        }
        System.out.print("Zero if less than zero : { ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    private static void Get_average() {
        if (isChar) {
            System.out.println("Average : Can't Count Average for character Array");
        } else {
            double Sum = 0;
            double Avg;
            for (int i = 0; i < size; i++) {
                Sum += intArr[i];
            }
            Avg = Sum / size;
            System.out.println("Average : " + Avg);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                printMenu();
                int choice = in.nextInt();
                if (choice == 19) break;

                System.out.println("Enter The number of the input type:\n1- Character\n2- Integer");
                int type = in.nextInt();
                if (type == 1) {
                    isChar = true;
                } else {
                    isChar = false;
                }
                System.out.print("Enter The Size of the Array: ");
                size = in.nextInt();
                System.out.println("Enter " + size + " Elements of the array");
                if (isChar) {
                    charArr = new char[size];
                    for (int i = 0; i < size; i++) {
                        charArr[i] = in.next().charAt(0);
                    }
                } else {
                    intArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        intArr[i] = in.nextInt();
                    }
                }

                switch (choice) {
                case 1:
                	Most_repeated_value();
                	break;
                        case 4:
                	largest_prime();
                	break;
                    case 5:
                        smallestPrime();
                        break;
                    case 9:
                        reverse();
                        break;
                    case 11:
                        FindUnique();
                        break;
                    case 12:
                        Maximum3Numbers();
                        break;
                    case 13:
                        getMin3Numbers();
                        break;
                    case 14:
                        Get_average();
                        break;
                    case 16:
                        returnPrime();
                        break;
                    case 17:
                        zeroIfLessThanZero();
                        break;
                    case 18: // Execute All
                    	Most_repeated_value();//1
                        largest_prime();//4
                        smallestPrime();//5
                        reverse();//9
                        FindUnique();//11
                        Maximum3Numbers();//12
                        getMin3Numbers();//13
                        Get_average();//14
                        returnPrime();//16
                        zeroIfLessThanZero(); //17
                        
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input.");
                break;
            }
        }


    }
}
