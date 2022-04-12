public class FinalKeyWord {
    public static void main(String[] args){
        Art a1 = new Art(10);
        a1.print();
        
        Music m1 = new Music(20);
        m1.print();
        m1.modifyType();
        // m1.modifyIsArt(); //this will give an error because `isArt` is final
    }
}



class Art{
    public int id;
    public final Boolean isArt = true;
    public String type = "generic";


    Art(int _id){
        this.id = _id;
    }

    public void print(){
        System.out.println("I am an artwork with ID: "+this.id);
        System.out.println("Is art: "+this.isArt);
        System.out.println("Art type: "+this.type);
    }
}

class Music extends Art{
    Music(int _id){
        super(_id);
    }

    public void print(){
        System.out.println("I am a Music with ID: "+this.id);
    }

    public void modifyType(){
        this.type = "Music";
        System.out.println("Art type: "+this.type);
    }

    // public void modifyIsArt(){
    //     this.isArt = false;
    //     System.out.println("isArt: "+this.isArt);
    // }    
}
