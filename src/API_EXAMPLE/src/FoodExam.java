import java.util.Arrays;

public class FoodExam {

	public static void main(String[] args) {
		Food pizza = new Food("pizza");
		Food chicken = new Food("chiken");
		Food cake = new Food("cake");
		Food chocolate = new Food("chocolate");
		Food donut = new Food("donut");
		
		Food[] someFood = { donut, chocolate, cake, chicken, pizza };
		Arrays.sort(someFood);
		
		for (Food f : someFood) {
			System.out.println("Food: " + f.name);
		}

	}

}
