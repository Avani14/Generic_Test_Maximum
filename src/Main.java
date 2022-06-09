public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Generics");
        GenericsService<Integer> gs = new GenericsService<>();
        int num1 = 1,num2 = 2,num3 = 3;
        System.out.println("num1 :"+num1+" num2 : "+num2+" num3 :"+num3);
        System.out.println("The maximum number is"+gs.maximum(num1,num2,num3));
        System.out.println("num1 :"+num1+" num2 : "+num3+" num3 :"+num2);
        System.out.println("The maximum number is "+gs.maximum(num1,num3,num2));
        System.out.println("num1 :"+num3+" num2 : "+num1+" num3 :"+num2);
        System.out.println("The maximum number is "+gs.maximum(num3,num1,num2));

    }
}