class PC {
    int graphicCard = 5;
    int processor = 4;

    void Manus(){
        System.out.println("BILL");
    }
    int kaamWaliBai(){
        System.out.println("SaafSafai");
        return 0;
    }

    public static void main(String[] args){
    //Object Creation
    PC myPcStore = new PC();
    myPcStore.Manus(); //BILL
    myPcStore.kaamWaliBai(); //SaafSafai

    // int graphic = myPcStore.graphicCard;
    // System.out.println(graphic); //5

    System.out.println(myPcStore.graphicCard); //5
    System.out.println(myPcStore.processor); //4

    }
}
