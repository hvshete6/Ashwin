class Papa{
    int OneAcre(){
        return 1000;
    }
    int Cruze(){
        return 2000;
    }
}

//Single Level Inheritance.
class Ravindra extends Papa {
    void AmdocsJob(){
        System.out.println("Testing JOB");
    }
}

//Hierarchical
class Sumit extends Ravindra{
    void AmdocsJob(){
        System.out.println("Testing JOB");
    }
}
class Ashwin extends Ravindra{
    void AmdocsJob(){
        System.out.println("Testing JOB");
    }
}

//Multiple Inheritance.
// generates ambigutiy(confusion). Therefore not applicable in JAVA. 

// class Xyz extends Sumit,Ashiwn{
//     Xyz obj = new Xyz();
//     obj.AmdocsJob();
// }

//Multilevel Inheritance.
class JuniorRavi extends Ravindra{
    public static void main(String[] args) {
        JuniorRavi jravi = new JuniorRavi();

        //OneAcre
        int reciever = jravi.OneAcre();
        System.out.println(reciever);

        //Cruze
        int cruzeReciever = jravi.Cruze();
        System.out.println(cruzeReciever);

        //Job
        jravi.AmdocsJob();

    }
}
