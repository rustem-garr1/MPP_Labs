package MPP_Labs.Lab5.task2;

abstract public class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	abstract public void display();
	public void fly() {
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}
	protected void setFlyBehavior(FlyBehavior b) {
		flyBehavior = b;
	}
	protected void setQuackBehavior(QuackBehavior b) {
		quackBehavior = b;
	}
	
	public void swim() {
		System.out.println("  swimming");
	}
	
}
