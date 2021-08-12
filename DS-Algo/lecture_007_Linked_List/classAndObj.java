public class classAndObj{
    public static class phone{
        String brand;
        String model;
        String color;
        int ram;
        int storage;
        int battery;

        phone(String brand,String model,String color,int ram,int storage,int battery){
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.ram = ram;
            this.storage = storage;
            this.battery = battery;
        
        }

    }

    public static void main(String[] args){
        phone ph1 = new phone("onePlus","9r 5G","Lake Blur",8,128,4500);
        phone ph2 = new phone("onePlus","9 Pro","Lake Blur",8,128,4500);
        
        System.out.println(ph1);

    }

}