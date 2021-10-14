class Sumit{
    void sumit(){
        System.out.println("Hello Sumit");
    }
    void sumit1(){
        System.out.println("Hello Sumit");
    }
    void sumit2(){
        System.out.println("Hello Sumit");
    }
}

class Ashwin{
    void ashwin(){
        System.out.println("Hello Ashwin");
    }
    
}

class Harsh {
    public static void main(String[] args){
        Ashwin ashu = new Ashwin(); //object created of class Ashwin.
        Sumit manoj = new Sumit(); //object created of class Ashwin.
        ashu.ashwin();
        manoj.sumit1();
        System.out.println("Hello Harsh");
        manoj.sumit1();

   
    }
}