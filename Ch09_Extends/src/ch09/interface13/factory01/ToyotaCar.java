package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class ToyotaCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("ToyotaCar - 시동이 부드럽게 잘 걸린다~T");
		Thread.sleep((long)Math.random()*500 + 500);
	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("ToyotaCar - 시동이 부드럽게 잘 Off~T");
		Thread.sleep((long)Math.random()*500 + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("ToyotaCar - 액셀이 터보로 동작된다~T");
		Thread.sleep((long)Math.random()*500 + 500);
	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("ToyotaCar - 브레이크가 부드럽게 동작된다~T");
		Thread.sleep((long)Math.random()*500 + 500);
	}

}