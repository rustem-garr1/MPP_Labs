package MPP_Labs.Lab5.task2;

public interface QuackBehavior {
	default void quack(){
		System.out.println("Quack!");
	}
}
