public class TypePro {
    public static void main(String[] args) {
        byte b=34;
        byte c=23;
        byte a=b*c; // float a=b*c; java automatically converts the byte type
        // variables into integer type first which are used in expresasions and cant be stored into byte type var
        System.out.println(a);
        double d=34.45;
        float f=34.33;
        float ff=b+d+f;// double ff=b+d+f;
        System.out.println(ff);
    }
}
