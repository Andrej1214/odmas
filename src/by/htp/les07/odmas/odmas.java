package by.htp.les07.odmas;

public class odmas {

	//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.     
	    public static void Task01om(String[] args) {
	        int k = 2;
	        int sum =0;
	        int [] mas = {3,5,8,2,9,10};
	        for(int i=0;i<mas.length;i++){
	        if(mas[i]%k==0){
	           sum+=mas[i]; 
	        }
	        }
	        System.out.println(sum);
	        }
	//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.     
	    public static void Task02om(String[] args) {
	        int [] mas={3,5,7,0,2,0,3,2,0,7,0,3};
	        int [] mas2 = new int [5] ; 
	        int j=0;
	        for(int i=0;i<mas.length;i++){
	            if(mas[i]==0){
	                mas2[j] = i;  
	            System.out.print(mas2[j] + " ");   
	            j++;
	            }
	        }
	    }
	//3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить,
	//какое число встречается раньше - положительное или отрицательное
	    public static void task03om(String[] args) {
	        int []mas={9,4,6,5,7};
	        if(mas[0]>0){
	            System.out.println("положительное число встречается раньше");
	        }
	        if(mas[0]<0){
	            System.out.println("отрицательное число встречается раньше");
	        }
	    }
	//4. Дана последовательность действительных чисел а1 а2 ,..., аn . 
	//Выяснить, будет ли она возрастающей. 
	    public static void task04om(String[] args) {
	        int[] mas = {2,4,6};
	            if(mas[0]<mas[1]){
	                System.out.println("последовательность возрастающая");
	            }
	            if(mas[0]>mas[1]){
	                System.out.println("последовательность убывающая");
	            }
	        }
	//5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив
	//из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте. 
	    public static void task05om(String[] args) {
	        int []mas = new int[]{1,5,3,3,9,-5,5,10};
	        int [] mas2 = new int[7];
	        int j =0;
	        for (int i =0;i<mas.length;i++){
	            if(mas[i]%2==0){
	               mas2[j]=mas[i]; 
	               System.out.print(mas2[j]+" "); 
	                j++;
	            }
	        }
	        if (j<1){
	            System.out.println("В массиве нет четных чисел.");  
	             
	        }
	    }
	//6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.    
	    public static void task06om(String[] args) {
	        int [] mas = new int[]{4,6,2,4,3,7,0,10};
	        int max;
	        max = mas[0];
	        for (int i = 0; i<mas.length;i++){
	            if(mas[i]>max){
	                max=mas[i];
	            }
	        }
	        System.out.println(max);
	    }
	//7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
	//большие данного Z, этим числом. Подсчитать количество замен. 
	public static void task07om(String[] args) {
	        int [] mas = new int[]{3,5,7,6,12,-5,7,16};
	        int k=0;
	        int z = 8;
	        for(int i=0;i<mas.length;i++){
	            if(mas[i]>z){
	                mas[i]=z;
	            k++;
	            }
	            System.out.print(mas[i]+" ");
	        }
	    System.out.println();    
	    System.out.println(k);
	    }
	//8. Дан массив действительных чисел, размерность которого N. 
	//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
	    public static void task08om(String[] args) {
	        int [] mas = new int[]{3,0,4,0,7,-5,9,-2,1,9,-5,16};
	        int poz = 0;
	        int neg = 0; 
	        int zero = 0;
	        
	        for(int i=0;i<mas.length;i++){
	            if(mas[i]>0){
	                poz++;
	            }
	             if(mas[i]<0){
	                neg++;
	            }
	             if(mas[i]==0){
	                zero++;
	            }    
	        }
	    System.out.println("Положительных чисел " + poz);  
	    System.out.println("Отрицательных чисел " + neg);    
	    System.out.println("Нолей " + zero);
	    }

	
	//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 
	    public static void task10om(String[] args) {
	        int[]mas = new int[]{3,-6,7,2,-4,9,1,24,5};
	        for(int i=0;i<mas.length;i++){
	            if(mas[i]>i){
	                System.out.print(mas[i] + " ");
	            }
	        }
	    }
	//11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
	    //от деления на М равен L (0 < L < М-1). 
	    public static void task11om(String[] args) {
	        int [] mas = new int []{333,525,616,822,23,0,127,52,335,17};
	        int m = 9;
	        int l = 3;
	        for(int i = 0; i<mas.length;i++){
	            if((mas[i]%m==l)&((m-1)>l)&(l>0)){
	                System.out.print(mas[i]%m +" ");
	                System.out.print(mas[i] + "  ");
	            }
	        }
	    }
	//12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые
	    //номера которых являются простыми числами
	    public static void task12om(String[] args) {
	        int [] mas = new int []{3,5,2,13,-2,5,-6,12};
	        int sum = 0;
	         for(int i=0; i<mas.length;i++){
	             for(int j=1; j<100;j++){
	            if(((mas[i]/j)==1)){
	                System.out.print(mas[i]+" ");
	                sum+=mas[i];
	            }
	        }
	        }  System.out.println();  
	         System.out.println(sum);
	    }
	//13. Определить количество элементов последовательности натуральных чисел, 
	    //кратных числу М и заключенных в промежутке от L до N.    
	        public static void task13om(String[] args) {
	        int l=3;
	        int n=53;
	        int m=6;
	        int j =0;
	        
	        for(int k=l;k<=n;k++){
	           if(k%m==0){
	               j++;
	           }
	        }
	        System.out.print("В числовой последовательности от " + l + " до " + n + ", " + j + " числа(-ел) кратных " + m);
	    }
	//14. Дан одномерный массив A[N]. Найти: max( четн. ) + min( нечетн. )
	         public static void task14om(String[] args) {
	         int a [] = new int []{3,5,7,2,4,7,3,6,2,5,9,5,12};
	        int max = a[0];
	        int min = a[1];
	        int rez;
	        
	        for(int i =0; i<a.length;i=i+2){
	            
	            if( a[i]>max){
	                max = a[i];
	            }
	        }
	        for(int i =1; i<a.length;i=i+2){
	          
	            if( a[i]<min){
	                min = a[i];
	            }
	        }
	    rez = min + max;
	        System.out.println(rez);
	    }    
	//15. Дана последовательность действительных чисел a1,a2...an . 
	//Указать те ее элементы, которые принадлежат отрезку [с, d].     
	    public static void task15om(String[] args) {
	        int c = 3;
	        int d = 8;
	        int n = 15;
	        int [] a = new int [n];
	        a[0]=2;
	        for(int i=0;i<(n-1);i++){
	            a[i+1]=a[i]+1;
	            if(a[i]>=c&a[i]<=d){
	                System.out.print(a[i]+" ");
	            }
	        }
	    }
	//17. Дана последовательность целых чисел a1,a2,...,an ? . Образовать новую последовательность,
	    //выбросив из исходной те члены, которые равны a min.
	        public static void task17om(String[] args) {
	        int a [] = new int []{2,4,5,1,4,7,5,1,7,8,1,4,2,1,1,10};
	        int c =findMin(a);
	        System.out.println(c+"min");
	        for(int i=0;i<a.length;i++){
	            int j=0;
	            if(a[i]!=c){
	                a[j]=a[i];
	             System.out.print(a[j] + " ");   
	            }
	            j++;
	        }
	    }
	    public static int findMin(int d[]){
	        int min = d[0];
	        for(int i=0;i<d.length;i++){
	            if(d[i]<min){
	                min=d[i];
	            }
	        }
	        return min;
	    } 
	    
	    
	    
	    
	//20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый
	//второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.    
	    public static void task20om(String[] args) {
	        int [] d = new int [] {2,4,6,4,8,5,2,1,3,6,7,9,5,26,9,4,7,3,8};
	        int i=1;
	        for (;i<d.length;i=i+2){
	            d[i]=0;
	            
	        }
	        for (int j=0;j<d.length;j++){
	        System.out.print(d[j] + " ");   
	        }
	    }    
	}

	 
	    



