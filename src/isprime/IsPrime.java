/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package isprime;
import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author Compaq
 */
public class IsPrime {

    /**
     * @param args the command line arguments
     */
    
    
    public static int MaxSum(int[] A){
       int n = A.length;
    int sum = 0;
    int tempsum = 0;
    
    for (int i = 0; i<n; i++){
        if(A[i]>=0)
            tempsum += A[i];
        if (tempsum >sum)
            sum = tempsum;
        if(A[i]>=sum)
            sum = A[i];
        else tempsum = 0;
    }
    return sum;
    
    }
    
    public static void MutipleOf (int n){
        int count = 0;    
        while (count <= n){
            System.out.println("count is " + count);
            if (count % 15 == 0){
            System.out.println("15");
            }
           else  if (count % 5 == 0){
            System.out.println("5");
            }
          else  if (count % 3 == 0){
            System.out.println("3");
            }
            else 
                System.out.println("is not a multiple");
            count++;
        }
         // IMPORTANT
       // if,  if , if, else ... this control structure evaluates each if for very step, but
        // if, else if, else if, else ... this one would select the accurate evaluation.
    
    }
    
    
    
    public static int ClimbStairs(int n){
	if(n <= 2) return n;
	int x = ClimbStairs(n-1) + ClimbStairs(n-2);
	return x;
}
    public static void BestProfit(int [] A){
     int n = A.length;
     int tempProfit = 0;
     int Profit = 0;
     int indexToBuy = 0;
     int indexToSell = 0;
     int x = 0; 
     int y = 0;
     int minPrice = A[0];
     int maxPrice = A[0];
     
     // int[] A = {4,10,6,6,4,1,7,1,8,5};
     for (int i = 1; i < n; i++){
         
         // cuando pongo el minimo, no interesa las fechas anteriores, por tal mi max 
         // empezara a compararse desde el mismo valor hacia la derecha.
       if ( A[i] <= minPrice){
           minPrice = A[i];
           indexToBuy = i;
           maxPrice = A[i];
           indexToSell = i;
          // System.out.println("Para i = " + i + " minPrice es ahora " + minPrice);
       }
       // si encontre un max (en relacion al current min) lo guardare para la operacion tempProfit
       else if( A[i] >= maxPrice){
           maxPrice = A[i];
           indexToSell = i;
        //   System.out.println("Para i = " + i + " maxPrice es ahora " + maxPrice);
       }
       
       // encuentro el profit para esta combinacion especifica
       tempProfit = maxPrice - minPrice;
      // System.out.println("Para i = " + i + " el tempProfit es " + tempProfit);
          // A = {2,1,4,8,3,9,7,1,6,5}
       // si el temp es mayor que mi record, guardo el dato y guardo sus current indexes.
      if(tempProfit >= Profit){
                 Profit = tempProfit;
                 x = indexToBuy;
                 y = indexToSell;
      }
                // System.out.println("Para i = " + i + " el profit es " + Profit + " y el tempProfit es " + tempProfit);
                 System.out.println("Para i = " + i + " x es " + x + " y " + y);
     }
     System.out.println("The best profit is " + Profit + " And it corresponds to buy on date " + x + " and sell on " + y);
    }
            
    public static void main(String[] args) {
        
        String word = "hola";
        char a = word.charAt(0);
        int charcode = word.charAt(0);
        System.out.println(" char is " + a + " and charcode is " + charcode);
        
        
        
       // testing round method
        
    //    double paid = 2.38;
      //  double price = 1.68;
        //double exchange = paid - price;
       // System.out.println(exchange);
       // System.out.println((double)Math.round(exchange*100)/100);
        
        //double exchange1 = (exchange + 0.005) * 100;
        //exchange1 = (int)exchange1;
        //exchange1 = exchange1 / 100;
       ///////////////////////////////////////////////
      //  int[] a = {1,54,34,23,64,64,6,2,3,7,43,45,6,8};
     //   ShowArray(a);
       // System.out.println();
       // int []b = MergeSort(a);
       //  ShowArray(b);
         
         //int key = HashWord("yes");
         // System.out.print(key);
         
       // ShowPrimes(700);
        //binary(4);
     //  System.out.println(BinaryConvertArray(8));
        // ShowArray(ReverseArray(a));
        
    // MinNeg();
       // ShowPrimes();
      // Turned(30.00, 22.34);
        //NextPrime(7);
        
        // show the max sum in an array
        //int[] A = {1,-2,3,6,0,1,-3,-3,5,5};
        //System.out.println(MaxSum(A));
        
        // best profit 
       // int[] A = {2,1,4,8,3,9,7,1,6,5};
       // BestProfit(A);
        
       // MutipleOf(15);
      //  System.out.println(String.valueOf(ClimbStairs(5)));
        
       // int[] z = {1,12,4,3,13,14,6,2,3,7,4,4,6,8};
        //Duplicates(z);
      
        
      //  String text = "hola koala como estas";
       // String pattern = "koala";
      // System.out.println(" Match " + Matching( text,  pattern));
    
        //  int [] A = {1,2,4,5,7,8,9,12,13,15,17,21,32};
         // System.out.println(BS(A, 9));
    } 
    
    public static void ShowArray(int [] A){
    for (int i = 0; i< A.length;i++){
      System.out.print(" " + A[i]);
    }
        
    
    }
    public static void binary(int n){
        int b = n % 2;
        System.out.println(b);
       if (n/2 > 1)
       binary((int)(n/2));
       else
           // to show last number result
      System.out.println((int)(n/2));
       
    }
     
    public static ArrayList BinaryConvertArray(int n){
        ArrayList<Integer> bin = new ArrayList<>();
        
        while (n/2 > 1){
        int b = n % 2;
         bin.add(b);
         n = (int)(n/2);
    }
        bin.add((int)(n/2));
        
       return bin;
    }
    
    public static int[] ReverseArray(int[] A){
      int n = A.length;
      int i = 0;
      int temp;
      while (i < n-1 - i){
       temp = A[i];
        A[i] =  A[n-1-i];
       A[n-1-i] = temp;
      i++;   
      }
      return A;
    }
    
    public static void MinNeg(){
    int[] array =  { -20, -19, -1, -5, -1, -27, -19, -5 } ;
    int   max;

    // initialize the current maximum
    max = array[0];

    // scan the array
    for ( int index=0; index < array.length; index++ )
    { 
      if ( array[ index ] > max )    // examine the current element
        max = array[ index ];        // if it is the largest so far, change max
    }     
    System.out.println("The maximum of this array is: " + max );
  }
             
            
            public static void ShowPrimes(){
            System.out.println("1");
            int N = 2;
            while (true){
                int count = 0;
                for (int i = 1; i <= N ; i++){
             if (N % i == 0)
                 count++;
            }
                if (count == 2)
                    System.out.println(N);
                    N++;
            }
            
}
            
            public static void NextPrime(int N){
               
               int a = N + 1;
               boolean b = false;   
               
               while (b == false){
                   int count = 0;
                   for (int i = 1; i <= a; i++){
                   if ( a % i == 0)
                       count++;
                    //System.out.println(count);
                   }
                   if ( count == 2){
               System.out.println(a);
               b = true;
                   }
                   a++;
                   }
            
               
           
            }        

           public static void Turned(double paid, double price){
            double turned = paid - price;
           
            System.out.println(turned);
            int a = 0; 
            int b= 0; 
            int c =0; 
            int d =0; 
            int e= 0;
            
            while (turned != 0){
            
                if (turned >= 1){
                     a = (int)(turned /1);
                     
                     turned = (int)(((turned % 1) + 0.005) * 100);
                     
                     turned = turned/100;
                     
                }   
                else if (turned >= 0.25){
                     b = (int)(turned /0.25);
                     turned = (int)(((turned % 0.25) + 0.005) * 100);
                     
                     turned = turned/100;
                     
                }
                 else if (turned >= 0.10){
                     c = (int)(turned /0.10);
                     turned = (int)(((turned % 0.10) + 0.005) * 100);
                     turned = turned/100;
                    
                }
                 else if (turned >= 0.05){
                     d = (int)(turned /0.05);
                     turned = (int)(((turned % 0.05) + 0.005) * 100);
                    
                     turned = turned/100;
                    
                } else if (turned >= 0.01){
                     e = (int)(turned /0.01);
                     turned = (int)(((turned % 0.01) + 0.005) * 100);
                     turned = turned/100;
                     
                }
                  }
               double total = a*1 + b*0.25 + c*0.10 + d*0.05 + e*0.01;
               total = (int)((total + 0.005) * 100);
               total = total/100;
                System.out.println("the amount of $1 coints are: " + a + " and it summarize: $" + a*1);
                System.out.println("the amount of $0.25 coints are " + b + " and it summarize: $"+ b*0.25);
                System.out.println("the amount of $0.10 coints are " + c + " and it summarize: $"+ c*0.10);
                System.out.println("the amount of $0.05 coints are " + d + " and it summarize: $" +d*0.05);
                System.out.println("the amount of $0.01 coints are " + e + " and it summarize: $" +e*0.01);
               System.out.println("the TOTAL amount to TURN BACK IS  $" +total);
                
                
          
            
            
            
            
            
            
            
            
            
            }
                     
           
          public static int[] MergeSort(int [] A){
               int n = A.length;
               if (n==1) 
                   return A;
               else
               {
               int middle = (int)(n/2);
               int[] left = new int[middle];
               int[] rigth = new int[n - middle];
               
               for (int i = 0; i < n; i++)
               {
                   if (i < middle)
                       left[i]= A[i];
               else
                  rigth[i - middle] = A[i];
                }  
               
               left = MergeSort(left);
               rigth = MergeSort(rigth);
               A = Merged(left, rigth);
               return A;
               }
            }
   
           public static int[] Merged(int[] left, int[] rigth){
                
               int [] Merged = new int[left.length + rigth.length];
               int i = 0;
               int j = 0;
               int k = 0;
               
               while (i < left.length && j < rigth.length){
                   if(left[i] > rigth[j]){
                       Merged[k]= rigth[j];
                       j++;                             
                   }else{
                       Merged[k]= left[i];
                       i++; 
                   }
                   k++;
               }
               
               while (i<left.length){
                   Merged[k]=left[i];
                   i++;
                   k++; 
               }
               while (j<rigth.length){
                   Merged[k]=rigth[j];
                   j++;
                   k++; 
               }
           return Merged;
           }
           
           
           
           public static int HashWord(String word){
              // [hashvalue * 27 + (charCode - 96)] + [hashvalue * 27 + (charCode - 96)]
               int hashvalue = 0;
               for(int i=0; i < word.length(); i++){
                   int charCode = word.charAt(i) - 96;
                   int TempHashvalue = hashvalue;
                   
                   hashvalue = (hashvalue * 27 + charCode) % 11;
                   
                    System.out.println("hash value for " + TempHashvalue + " * 27 + charCode" + charCode + " mod 11");
               }
                System.out.println("final hashvalue is: " + hashvalue);
               return hashvalue;
           }
           
           
           // show a repetitive value into an array with the hash function approach.
           
           public static void Duplicates(int [] Array){
             int n = Array.length;
             // can we assume than numbers are less than 100
             int [] NewOne = new int[n];
             
             for (int i = 0; i < n ; i++){
               System.out.println("for value " +Array[i]+ " the original i is "+i+" then hashindex is "+hashPosition(Array[i],n));
                 if(NewOne[hashPosition(Array[i],n)] == 0){
                      NewOne[hashPosition(Array[i],n)] = Array[i];     
                    
                 }else{
                      System.out.println("This number is repetitive "+Array[i]);
                 }
             }    
           }
           
           //{1,12,9,3,5,14,6,2,10,7,4,4,11,8}
           
           // the key here is to create a hash function that provides a unique index.
           public static int hashPosition(int i, int n){
                int index = i % n; 
           return index;
           }
           
           // get repetitive numbers, tree approach.
           // take each element on the array and insert them into the tree structure, each time a value is equal to an existing element.
          // we avoid to store it and we show the message for that element.
           
           public static void DuplicateTree(int [] Array){
            
               
            
           
                   
           }
           
          /////////////////////////////////////////////////////////////////////////////
           
           // PATTERN MATCHING, BOYER MOORE ALGORITH 
           // String text = "hola koala como estas";
       // String pattern = "como";
       //System.out.println(" Match " + Matching( text,  pattern));
           public static int Matching(String text, String pattern){
            int n = text.length();
            int m = pattern.length();
            int skip = 0;

            // creating my hashMap to figure out skips from the pattern when dismatching a camparison.
            Map<String, Integer> skipMap = new HashMap<>();
            for (int i = 0; i < m; i++){ 
                   skipMap.put(String.valueOf(pattern.charAt(i)), Math.max(1, m-1-i));
            }
            //-------------------- table created --------------------------
           
            for (int i = 0; i <= n-m ; i += skip){
           skip = 0;
           for (int j = m-1; j>= 0; j--){
           
               // comparing last character of pattern with text.
               if(pattern.charAt(j) != text.charAt(i + j))
                   if (skipMap.containsKey(String.valueOf(text.charAt(i + j)))){
                       skip = (int)skipMap.get(String.valueOf(text.charAt(i + j)));
                   }else{ 
                       skip = m;
                   }
               break;
           }
           if (skip == 0)
               return i;  
           }   
           return -1;
           }   
           
           // int [] A = {1,2,4,5,7,8,9,12,13,15,17,21,32};
           // BS(A, 13);
           public static int BS(int [] Array, int value){
           
               int n = Array.length;
               int min = 0;
               int max = n - 1;
               int middle;
           
               while (max >= min){
               
               middle = (int)(max + min)/2;
                 
                   if (value > Array[middle]){
                       min = middle + 1;
                      
                   }else if  (value < Array[middle]){
                       max = middle - 1;
                 
                   }  else {
                         return middle;
               }       
               }
              return -1;
           }
           

           }
           
           
           

   

    
    


    
    
    



