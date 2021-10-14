public class Array {

    //What is array ?
    //Array is derived datatype, which is used to store homogeneous data in sequential manner.
    //+ concatenation operator.
    public static void main(String[] args){
        int sumit[] = {5,9,8,3,4,7,6,1,2}; //1st method.

        //Print even numbers in an array. //2 4 6 8 

        for(int i=0; i<sumit.length ; i++){
            // System.out.println(sumit[i]%2 == 0 ? sumit[i] + " is even" : "");
            if(sumit[i]%2 == 0){
                System.out.println(sumit[i] + " is even");
            }
        }
        // System.out.println();

        // for(int i=0; i<sumit.length ; i++){
        //     if(sumit[i]%2 != 0){
        //         System.out.println(sumit[i] + " is Odd");
        //     }
        // }

        //WHILE LOOP IMPLEMENTATION
        // int arrayLength = sumit.length;

        // int i =0;
        // while(i=0 < sumit.length){
        //     if(sumit[i]%2 == 0){
        //         System.out.println(sumit[i] + " is even");
        //      }
        //      i++;
        // }
        
        // System.out.println();
        
        // int j=0;
        // while(j < sumit.length){
        //        if(sumit[j]%2 != 0){
        //         System.out.println(sumit[j] + " is Odd");
        //     }
        //      j++;
        // }
        
        //     int k = 0;
        // do{    
        //     if(sumit[k]%2 == 0){
        //         System.out.println(sumit[k] + " is Even");
        //     }
        //     k++;
        //  }while ( k < sumit.length); 

        //  System.out.println();

        //     int l = 0;
        // do{    
        //     if(sumit[l]%2 != 0){
        //         System.out.println(sumit[l] + " is ODD");
        //     }
        //     l++;
        //  }while ( l < sumit.length); 

    }
}
