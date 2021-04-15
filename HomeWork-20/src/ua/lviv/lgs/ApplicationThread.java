package ua.lviv.lgs;

import java.util.Scanner;

public class ApplicationThread {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		RunnableThread myRunnableThread = new RunnableThread();
		Thread th = new Thread(myRunnableThread);
		th.start();
		
		
	}	
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.print("Enter how many number ASC to show: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		
		int[] fibNumber = new int[number+1];
		fibNumber[1] = 1;
		fibNumber[2] = 1;
		
		for (int i = 3; i < fibNumber.length; i++) {
			fibNumber[i] = fibNumber[i-1] + fibNumber[i-2];	
		}
		System.out.print("Потік Thread : ");
		for (int i = 1; i < fibNumber.length; i++) {
			System.out.print(fibNumber[i] + "  ");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

class RunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.print("Enter how many number DESC to show: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		
		int[] fibNumber = new int[number+1];
		fibNumber[1] = 1;
		fibNumber[2] = 1;
		
		for (int i = 3; i < fibNumber.length; i++) {
			fibNumber[i] = fibNumber[i-1] + fibNumber[i-2];	
		}
		System.out.print("Потік Runnable: ");
		for (int i = fibNumber.length-1; i > 0; i--) {
			System.out.print(fibNumber[i] + "  ");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
	
}