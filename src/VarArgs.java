public class VarArgs {
    public static void main(String[] args) {
        int a=4,b=5,c=3;
        System.out.println("The sum of "+a+" and "+b+" is "+sum(a,b));
        System.out.println("The sum of "+a+","+b+" and "+c+" is "+sum(a,b,c));
    }
//    static  int sum(int a,int b){
//        return a+b;
//    }
//    static  int sum(int a,int b,int c){
//        return a+b+c;
//    }
// if we need to 4 variable we have to made another method and so on, so we introduced Variable length arguments
    static  int sum (int ...arr){
      int result=0;
      for(int i:arr){
          result+=i;
      }
      return result;
    }
}
