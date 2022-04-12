public class ReferenceVariable {
    int x;
    public ReferenceVariable(int _x){
        x = _x;
    }

    public void print(){
        System.out.println(x);
    }

    public static void main(String[] args){
        ReferenceVariable refVar1 = new ReferenceVariable(10);
        System.out.println(refVar1);

        ReferenceVariable refVar2 = new ReferenceVariable(10);
        System.out.println(refVar2);        

    }
    
}
