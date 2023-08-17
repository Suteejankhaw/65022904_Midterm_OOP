public class Example {
    public static void main(String[] args) {
        Product P1 = new Product();
        P1.setName("chair");
        P1.getName();
        P1.setPrice(500.0);
        P1.getPrice();
        System.out.println("**********************************");
        Electronics P2 = new Electronics();
        P2.setName("Television");
        P2.getName();
        P2.setPrice(20000.0);
        P2.getPrice();
        P2.setBrand("Samsung");
        P2.getBrand();
        P2.setModel("Neo QLED");
        P2.getModel();
        System.out.println("**********************************");
        Smartphone I1 =  new Smartphone();
        I1.setName("Iphone");
        I1.getName();
        I1.setPrice(40000.0);
        I1.getPrice();
        I1.setBrand("Apple");
        I1.getBrand();
        I1.setModel("Iphone 99");
        I1.getModel();
        I1.setOperationSystem("ios");
        I1.getOperationSystem();
        System.out.println("**********************************");
        Book B = new Book();
        B.setName("OOP Programming");
        B.getName();
        B.setPrice(250.0);
        B.getPrice();
        B.setAuthor("John Doe");
        B.getAuthor();
        B.setPage(300);
        B.getPage();
        System.out.println("**********************************");
    }
    
}
class Product{
    private String name;
    private double price;

    public String getName(){
        System.out.println("Product Name : "+ name);
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        System.out.println("Product Price : "+ price);
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
class Electronics extends Product{
    private String brand;
    private String model;
    
    public String getBrand(){
        System.out.println("Brand : "+brand);
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        System.out.println("Model : "+ model);
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
}
class Smartphone extends Electronics {
    private String OperationSystem;

    public String getOperationSystem(){
        System.out.println("OperationSystem: "+OperationSystem);
        return OperationSystem;
    }
    public void setOperationSystem(String OperationSystem){
        this.OperationSystem = OperationSystem;
    }
} 

class Book extends Product{
    private String author;
    private int page;
    
    public String getAuthor(){
        System.out.println("Author : "+author);
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPage(){
        System.out.println("Number of Pages: "+page);
        return page;
    }
    public void setPage(int page){
        this.page = page;
    }
}