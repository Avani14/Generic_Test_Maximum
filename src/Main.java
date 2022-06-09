public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Generics Test Maximum");
//        GenericsService<Integer> gs = new GenericsService<>();
//        int num1 = 1,num2 = 2,num3 = 3;
//        System.out.println("num1 :"+num1+" num2 : "+num2+" num3 :"+num3);
//        System.out.println("The maximum number is"+gs.maximum(num1,num2,num3));
//        System.out.println("num1 :"+num1+" num2 : "+num3+" num3 :"+num2);
//        System.out.println("The maximum number is "+gs.maximum(num1,num3,num2));
//        System.out.println("num1 :"+num3+" num2 : "+num1+" num3 :"+num2);
//        System.out.println("The maximum number is "+gs.maximum(num3,num1,num2));
//        System.out.println("---Float Testing---");
//        GenericsService<Float> gsFloat = new GenericsService<>();
//        float numF1 = 12.1F,numF2 = 23.4F,numF3 = 3.9F;
//        System.out.println("num1 :"+numF1+" num2 : "+numF2+" num3 :"+numF3);
//        System.out.println("The maximum number is"+gsFloat.maximum(numF1,numF2,numF3));
//        System.out.println("num1 :"+numF1+" num2 : "+numF3+" num3 :"+numF2);
//        System.out.println("The maximum number is "+gsFloat.maximum(numF1,numF3,numF2));
//        System.out.println("num1 :"+numF3+" num2 : "+numF1+" num3 :"+numF2);
//        System.out.println("The maximum number is "+gsFloat.maximum(numF3,numF1,numF2));
//        System.out.println("---String Testing---");
//        GenericsService<String> gsString = new GenericsService<>();
//        String str1 = "Apple",str2 = "Peach",str3 = "Banana";
//        System.out.println("str1 :"+str1+" str2 : "+str2+" str3 :"+str3);
//        System.out.println("The maximum number is"+gsString.maximum(str1,str2,str3));
//        System.out.println("str1 :"+str1+" num2 : "+str3+" str3 :"+str2);
//        System.out.println("The maximum number is "+gsString.maximum(str1,str3,str2));
//        System.out.println("str1 :"+str3+" num2 : "+str1+" str3 :"+str2);
//        System.out.println("The maximum number is "+gsString.maximum(str3,str1,str2));

        // Generic method
//        GenericsService<String> generic = new GenericsService<>();
        String str1 = "Apple",str2 = "Peach",str3 = "Banana";
//        System.out.println("str1 :"+str1+" str2 : "+str2+" str3 :"+str3);
//        System.out.println("The maximum number is"+generic.maximum(str1,str2,str3));
//        System.out.println("str1 :"+str1+" num2 : "+str3+" str3 :"+str2);
//        System.out.println("The maximum number is "+generic.maximum(str1,str3,str2));
//        System.out.println("str1 :"+str3+" num2 : "+str1+" str3 :"+str2);
//        System.out.println("The maximum number is "+generic.maximum(str3,str1,str2));

        //Generic class
        GenericsService<String> genericClass = new GenericsService<>(str1,str2,str3);
        System.out.println((String) genericClass.testMaximum(str1,str2,str3));
    }
}