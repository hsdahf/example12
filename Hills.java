class Hills{
    public void location() {
        System.out.println("This is a hill station.");
    }
    public void famousfor() {
        System.out.println("This hill station is famous for its scenic beauty.");
    }
}
class Manali extends Hills {
   
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }
    
    public void famousfor() {
        System.out.println("Manali is famous for its picturesque landscapes.");
    }
}
class Mussoorie extends Hills {
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand,");
    }
    public void famousfor() {
        System.out.println("Mussoorie is famous for its cool climate");
    }
}
class Gulmarg extends Hills {
    public void location() 
    {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }
    public void famousfor() {
        System.out.println("Gulmarg is famous for  snowboarding activities.");
    }
}
public class Main {
    public static void main(String[] args) {
        Hills manali = new Manali();
        Hills mussoorie = new Mussoorie();
        Hills gulmarg = new Gulmarg();
        manali.location();
        manali.famousfor();
        
        mussoorie.location();
        mussoorie.famousfor();
        
        gulmarg.location();
        gulmarg.famousfor();
    }
}
