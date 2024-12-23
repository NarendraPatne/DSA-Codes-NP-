public class TCast {
public static void main(String[] args) {
    //Explicit type conversion using round brackets and data type lossy conversion narrowing
    double d=34.6543;
    float f=(float)d;
    int i=(int)f;
    byte b=(byte)i;
    System.out.println(i);
}    
}
