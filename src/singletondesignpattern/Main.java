package singletondesignpattern;

public class Main {
	public static void main(String[] args) {
		Server server = Server.getServer();
		server.setServerId(1);
		server.setServerName("localhost");
		System.out.println(server);
	}
}
