public class AbstractClasses {
    public static void main(String args[]){
        // Art a = new Art();
        Music m = new Music();
        System.out.println(m.type());
        System.out.println(m.price());
    }
}

abstract class Art{
    public abstract String type();
    public abstract int price();
}

class Music extends Art{

    public String type(){
        return "Music by Some Artist";
    }

    public int price(){
        return 1000;
    }    

}