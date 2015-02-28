package com.thread.producer_cunsumer;

public class Producer extends Thread{
	
	private Buffer buffer;
	private int number;
	
	
	public Producer(Buffer buffer, int number) {
		this.buffer = buffer;
		this.number = number;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			//buffer.put();
		}
	}
	
	
	public Buffer getBuffer() {
		return buffer;
	}
	public void setBuffer(Buffer buffer) {
		this.buffer = buffer;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
