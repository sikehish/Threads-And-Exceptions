import java.util.InputMismatchException;
import java.util.Scanner;


class KondaError extends Exception{
    int age;
    KondaError(String msg, int age){
        super(msg);
        this.age=age;
    }
}


class Practice{


    public static void test(int dr) throws KondaError, ArithmeticException{
            float ans= 5/dr;
            throw new KondaError("test func", 20);
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter num");
            test(in.nextInt());
            System.out.println("Enter name: ");
            String name=in.nextLine();
            System.out.println("Enter age: ");
            int age=in.nextInt();
            if(name.equalsIgnoreCase("Konda")){
                throw new KondaError("Change the input", age);
            }
        }catch(KondaError err){
            //KondaError err= new KondaError("Change the input");
            System.out.println(err.getMessage());
            System.out.println(err.age);
        }catch(InputMismatchException err){
            System.out.println(err);
        }
        catch(ArithmeticException err){
            System.out.println("Inside arithmetic exception");
           System.out.println(err);
        }
        catch(Exception err){
            System.out.println("Inside exception");
           System.out.println(err);
        }
        finally{
            System.out.println("Try catch done");
        }
        in.close();
        
    }

}