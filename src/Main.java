public class Main {

    public static void go (int age){
        if(age >= 18){
            System.out.println("Go VOTE!!!");
        }else{
            System.out.println("Go PLAY!!!");
        }
    }

    public static void respond (char answer){
        if(answer == 'Y' || answer == 'y'){
            System.out.println("YUP YUP YUP");
        }else{
            System.out.println("NOPE NOPE NOPE");
        }
    }

    public static void drink(int age){
        if(age < 21){
            System.out.println("juice");
        }else if(age < 50){
            System.out.println("adult beverage");
        }else if(age < 77) {
            System.out.println("tea");
        }else{
            System.out.println("heavy beverage");
        }
    }

    public static void manUtd(String result){
        if(result == "W" || result == "w"){
            System.out.println("ManUtd is the best team in the world!!!");
        }else if(result == "D" || result == "d"){
            System.out.println("ManUtd was unlucky :(");
        }else{
            System.out.println("This team sucks, I'm done supporting it! till next game :)");
        }

    }

    public static void main(String[] args) {

        manUtd("W");
        manUtd("D");
        manUtd("L");

        drink(11); // juice
        drink(25); // adult beverage
        drink(70); // tea
        drink(99); // heavy beverage

        go(13);
        go(26);

        respond('y');
        respond('n');
    }
}