public class Main {

    public static void main(String[] args) {
        
        linkedliststack a= new linkedliststack();

        a.push(20);
        a.push(23);
        a.push(32);
        a.push(12);
        a.push(26);
        a.push(98);

        a.pop();
        a.pop();
        a.pop();
        
        a.pop();
        a.pop();
        a.pop();
        a.pop();
       System.out.println("null");
       a.display();
    

    }
}