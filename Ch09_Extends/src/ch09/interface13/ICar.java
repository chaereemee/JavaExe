package ch09.interface13;

/*
 * InterruptedException은 스레드가 waiting, sleeping, interrupted 된 상태에서 발생할 수 있음
 */

public interface ICar {
	public void turnOn() throws InterruptedException;
	public void turnOff() throws InterruptedException;
	public void accel() throws InterruptedException;
	public void footBreak() throws InterruptedException;
}