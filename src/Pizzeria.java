import java.util.Objects;
import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {


        for (PizzaIngrediends s : PizzaIngrediends.values()){
            System.out.println(s.getDescription());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz pizze ");
        String testName = sc.nextLine();
        PizzaIngrediends pizzaIngrediends = PizzaIngrediends.fromDescription(testName);
        Pizza test = new Pizza();
        test.setPizzaIngrediends(pizzaIngrediends);
        System.out.println("Czy na pewno: \nT/N? ");
        String n = sc.nextLine();
        if (Objects.equals(n, "T")){
            System.out.println("Wybrales pizze "+ test.getPizzaIngrediends().getName());
        }else System.out.println("To wypad");



    }
}
