enum PizzaIngrediends {
    MARGHERITA("sos pomidorowy", "ser", "", ""),
    CAPRICIOSA("sos pomidorowy", "ser", "", "pierczarki"),
    PROSCIUTTO("sos pomidorowy", "ser", "szynka", "");

//    MARGHERITA (sos pomidorowy + ser),
//    CAPRICIOSA (sos pomidorowy + ser + pieczarki)
//    PROSCIUTTO (sos pomidorowy + ser + szynka)

    private String sosiwo;
    private String ser;
    private String mieso;
    private String pieczarki;

    private PizzaIngrediends(String sosiwo, String ser, String mieso, String pieczarki) {
        this.sosiwo = sosiwo;
        this.ser = ser;
        this.mieso = mieso;
        this.pieczarki = pieczarki;
    }


    public String getDescription() {

        return name() +" "+ sosiwo + " " + ser + " " + mieso + " " + pieczarki;
    }
    public static PizzaIngrediends fromDescription(String name) {
        PizzaIngrediends[] values = values();
        for (PizzaIngrediends pizza : values) {
            if (pizza.getName().equals(name))
                return pizza ;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Skladniki " + getName()+'\n'+
                 sosiwo + '\n' +
                 ser + '\n' +
                 mieso + '\n' +
                 pieczarki + '\n' ;

    }
    public String getName(){
        return name();
    }
}
class Pizza{
    private PizzaIngrediends pizzaIngrediends;

    public PizzaIngrediends getPizzaIngrediends() {
        return pizzaIngrediends;
    }

    public void setPizzaIngrediends(PizzaIngrediends pizzaIngrediends) {
        this.pizzaIngrediends = pizzaIngrediends;
    }
}
