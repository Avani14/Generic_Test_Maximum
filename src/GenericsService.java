public class GenericsService<E> {
    public int maximum(int num1,int num2, int num3)
    {
        int max = num1>num2?num1:num2;
        max = max>num3?max:num3;
        return max;
    }
    public float maximum(float num1,float num2, float num3)
    {
        float max = num1>num2?num1:num2;
        max = max>num3?max:num3;
        return max;
    }
    public String maximum(String str1,String str2, String str3)
    {
        String max = str1.length()>str2.length()?str1:str2;
        max = max.length()>str3.length()?max:str3;
        return max;
    }
}
