package com.threadsynchronization;

public class Synch {

		void send(String msg)
		{
			System.out.println("Sending message "+msg);
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println("Error while sending a message");
			}
			System.out.println("Message Sent successfully");
		}

}
