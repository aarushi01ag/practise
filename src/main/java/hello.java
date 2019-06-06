//example : 1) this: to refer current class instance variable
package Inventory;

public class ThisConcept {
    String name;   //initialisation of instance variable
    int id;
    String phone;

    //creating constructor

    ThisConcept(String name,int id, String phone){
        this.name=name;
        this.id=id;
        this.phone=phone;
    }
    //creating method to display the values
    public void display() {
        System.out.println("name is:"+ name + "\n" + "id is:" + id +"\n"+ "phone is:" +phone);}


    //creating main method in which we create our object n call the method using the object name
    public static void main(String args[]) {
        ThisConcept t1=new ThisConcept("aarushi",1019,"9634553589");//creating object
        t1.display();//calling method by using object name

    }


//t1 is the object name

//syntax to create object name--
//ClassName objectName = new ClassName("values");
//objectName.methodName();  -- this will call the method

//example 2) this: to invoke current class method--in this from one method of same class we will call other methed of same call


    public class ThisConcept2{
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        void ThisConcept2(int b, int c,int e, int f){}
        public void add1() {
            a=b+c;}
        public void add2() {
            d=e+f;
        }
        public void add3(int a, int d) {

            g=a+d;
            this.add2();
            this.add1();
        }
        void addition() {
            System.out.println("a is :" + a +"\n"+ "d is:"+d+"\n"+"g is:"+g);
        }
        public void main(String args[]) {
            ThisConcept2 t2=new ThisConcept2(10,20,22,30);
            t2.addition();
        }
    }}


