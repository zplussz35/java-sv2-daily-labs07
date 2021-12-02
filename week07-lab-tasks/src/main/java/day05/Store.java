package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products= new ArrayList<>();

    public void addProduct(Product p){
        if(p.getDateOfSale().getYear()> LocalDate.now().getYear()&&
                p.getDateOfSale().getDayOfYear()> LocalDate.now().getDayOfYear()){
            throw  new IllegalArgumentException("Not correct sale of date!");
        }
        products.add(p);
    }

    public Path writeToCsvByMonth(Path path,Month month){
            List<String> result = new ArrayList<>();
            for (Product p:products) {
                if(p.getDateOfSale().getMonth()==month)
                result.add(p.getName()+";"+p.getDateOfSale()+";"+p.getPrice());
            }
            Path correctPath= Paths.get(path.toString()+"salesin"+month.name()+".csv");
            write(correctPath,result);
            return correctPath;
    }

    private void write(Path path,List<String> result){
        try{
            Files.write(path, result);
        }catch (IOException ioe){
            throw new IllegalStateException("Cannot write to file!",ioe);
        }
    }

    public static void main(String[] args) {
        Store s = new Store();
        s.addProduct(new Product("alma",LocalDate.now(),1200));
        s.addProduct(new Product("alma",LocalDate.of(2021,3,11),1200));
        s.addProduct(new Product("alma",LocalDate.now(),1200));
        s.addProduct(new Product("alma",LocalDate.now(),1200));
        s.addProduct(new Product("alma",LocalDate.now(),1200));
        s.addProduct(new Product("alma",LocalDate.now(),1200));

        s.writeToCsvByMonth(Paths.get("src/main/resources/"),LocalDate.now().getMonth());
    }
}
