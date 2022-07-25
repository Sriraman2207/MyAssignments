package day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("send a message");
	}
	public void sendDocument() {
		System.out.println("send a Document");
	}
	public void call() {
		System.out.println("call");
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
				m.sendMessage();
		m.sendDocument();
		m.call();
	}

}
