import java.util.ArrayList;
import java.util.Collections;

public class GenericsService<E extends Comparable> {
    E var1;
    E var2;
    E var3;



    public GenericsService(E var1, E var2, E var3)
    {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
//    public int maximum(int num1,int num2, int num3)
//    {
//        int max = num1>num2?num1:num2;
//        max = max>num3?max:num3;
//        return max;
//    }
//    public float maximum(float num1,float num2, float num3)
//    {
//        float max = num1>num2?num1:num2;
//        max = max>num3?max:num3;
//        return max;
//    }
//    public String maximum(String str1,String str2, String str3)
//    {
//        String max = str1.length()>str2.length()?str1:str2;
//        max = max.length()>str3.length()?max:str3;
//        return max;
//    }
//    public <E extends Comparable<E>> E genericMaximum (E var1, E var2, E var3)
//    {
//        E max = var1.compareTo(var2)>0?var1:var2;
//        max = max.compareTo(var3)>0 ? max:var3;
//        return max;
//    }
    public static  <E extends Comparable<E>> E testMaximum(E var1, E var2, E var3)
    {
        E max = var1.compareTo(var2)>0?var1:var2;
        max = max.compareTo(var3)>0 ? max:var3;
        return max;
    }

    public <E extends Comparable<E>> void testMaximum(ArrayList<E> arrayOfString) {
       Collections.sort(arrayOfString);
        for (E a:arrayOfString) {
            System.out.print(" "+a);
        }
    }
}
