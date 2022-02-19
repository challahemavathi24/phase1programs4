package com.threadsynchronization;

public class TestSynchronization {

		public static void main(String[] args) {

			//common object shared between 2 threads
			Sender sender=new Sender();

			User t1= new User("Hema", "Hello Good morning...!", sender);

			User t2= new User("Nareshs", "Hello A very Goord Morning to all of you...!", sender);

			t1.start();
			t2.start();
		}
	}


