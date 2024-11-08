package FunctionalInterface;

interface Operation{
    int operate(int a,int b);
}
public class LambdaExpression {
    public static void main(String[]args){
        Operation add = (int num1,int num2)->num1+num2;
        System.out.println(add.operate(10,20));

        Operation sub = (num1,num2)->num1 - num2;
        System.out.println(sub.operate(10,5));

        Operation mul = (num1,num2)-> num1*num2;
        System.out.println(mul.operate(5,6));

    }
}
