import java.util.ArrayList;

public class Recursion {
    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        if (n == 0){
            return 1;
        }
        if (n < 0){
            // throw exception
        }
        return n* fact(n-1);
    }

    public static int somt(int n){
        if(n < 0){
            // throw exception
        }
        if(n == 0){
            return 0;
        }
        return n + somt(n - 1);
    }


    public static int fibn(int n){
        if(n <= 0){
            //throw exception
        }
        if(n==1||n==2){
            return 1;
        }
        return 0;
        //Não terminado !!!!!!!!!
    }

    public static int somtInt(int n1, int n2){
        if(n2 >n1){
            //throw exception
        }

        if(n1 == n2){
            return n1;
        }
        return n1 + somtInt(n1 + 1, n2);
    }
    /**
     * public static boolean isPal(String s){
        if (){

        }
        return true;
    }
     * 
     */
    

    public static int nroDigit(int n){
        if( n>=0 && n < 10){
            return 1;
        }
        if( n<0 && n > -10){
            return 1;
        }

        return 1 + nroDigit(n/10);
    }
    //6
    /**
     * public static boolean is2(int n){
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static String convBase2(int n){
        if (n == 0) {
            return "0";
        }
        if (n == 1){
            return "1";
        }

        return "" + convBase2(n/2);
    }
     * 
     */
    // 7
    public static int smtList(ArrayList<Integer> list, int size){
        if(size == 0){
            return list.get(size);
        }
        
        return list.get(size) + smtList(list, size-1);
        
    }


}
