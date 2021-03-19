import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Restaurant {
	
	private static Restaurant restaurant; //Singleton Design Patter is used to access same restaurant
	private List<Food> menu = new ArrayList<>();

	public static Restaurant getInstance() {
		if(restaurant==null) {
			restaurant = new Restaurant();
		}
		return restaurant;
	}
        
	public void creatingMenu() {
		getMenu().add(new Food("Meal","Fish & Chips",26));
		getMenu().add(new Food("Meal","Risotto of Wild Mushroom",36));
		getMenu().add(new Food("Meal","Smokie Burger",20));
		getMenu().add(new Food("Meal","Caesar Salad",16));
		getMenu().add(new Food("Meal","Sushi",40));
		getMenu().add(new Food("Dessert","Tiramisu",12));
		getMenu().add(new Food("Dessert","Cheesecake",14));
		getMenu().add(new Food("Dessert","Panna Cotta",12));
		getMenu().add(new Food("Dessert","Baklava",15));
		getMenu().add(new Food("Dessert","Pudding",10));
		getMenu().add(new Food("Drink","Cola",5));
		getMenu().add(new Food("Drink","Water",2));
		getMenu().add(new Food("Drink","Wine",15));
		getMenu().add(new Food("Drink","Beer",10));
		getMenu().add(new Food("Drink","MilkShake",10));

	}
	
	
	public void order(Customer customer, int foodIndex,Calendar cal) {
		
		
		Bill bill = new Bill("Restaurant Order - "+getMenu().get(foodIndex).getName(),getMenu().get(foodIndex).getPrice(),cal.getTime(),false);
		customer.getBillList().add(bill);
		
	}

   
        public List<Food> getMenu() {
            return menu;
    }

}
