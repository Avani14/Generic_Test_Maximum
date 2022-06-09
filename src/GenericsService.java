public class GenericsService<E> {
    public int maximum(int num1,int num2, int num3)
    {
        int max = num1>num2?num1:num2;
        max = max>num3?max:num3;
        return max;
    }
}
