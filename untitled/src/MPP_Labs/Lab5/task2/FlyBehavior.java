package MPP_Labs.Lab5.task2;

public interface FlyBehavior {
	default void fly(){
		System.out.println("I am flying.");
	}
}
