package com.aurionpro.model;

public class SingleThreadExecutor2 extends Thread{
	public void run() {
		System.out.println("Task 2 started");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Task 2 ended");
	}
}
