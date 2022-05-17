import java.util.ArrayList;


public class ArrayListTest {
    public static void main(String args[]){
        Test t = new Test();
        t.add("Elem0");
        t.add("Elem1");
        System.out.println(t.len());
        t.print();
        
        t.modify(0, "NewElem0");
        t.print();

        // t.remove(0);
        // System.out.println(t.len());
        // t.print();

        // System.out.println(t.access(0));
        // t.clear();

        // System.out.println(t.len());


    }
    
}


class Test{
    ArrayList<String> myArrList = new ArrayList<String>();

    public void add(String elem){
        myArrList.add(elem);
    }

    public void addIndex(int index, String elem){
        myArrList.add(index, elem);
    }    

    public void remove(int index){
        myArrList.remove(index);
    } 

    public void clear(){
        myArrList.clear();
    }     

    public int len(){
        return myArrList.size();
    }
    
    public String access(int index){
        return myArrList.get(index);
    } 

    public void modify(int index, String newVal){
        myArrList.set(index, newVal);
    }
    
    public void print(){
        for(int i=0; i<myArrList.size(); i++){
            System.out.println(myArrList.get(i));
        }
    }
}
