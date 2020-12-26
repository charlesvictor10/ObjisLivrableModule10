package com.youssfi.sing;

import com.youssfi.multiThread.ThreadedTask;

public class Application {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			ThreadedTask t = new ThreadedTask("T"+i);
			t.start();
		}
	}
}
