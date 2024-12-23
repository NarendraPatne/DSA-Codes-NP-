public class TypeConversion {
public static void main(String[] args) {
    // Implicit type conversion i.e lossless conversion widening type
    byte b=34;
    int a=b;
    float f=a;
    double d=f;
    System.out.println(d);
}    
}
