package simple.factory;

public class PizzaStore {

    Pizza  orderPizza(){
        Pizza pizza = null;


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
}
