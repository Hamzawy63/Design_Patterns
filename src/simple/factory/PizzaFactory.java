package simple.factory;

public class PizzaFactory {
public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.equalsIgnoreCase("cheese")){
        pizza = new CheesePizza();
    }else if(type.equalsIgnoreCase("peppironi")){
        pizza = new PeppironiPizza();
    }
    return pizza ;
}
}
