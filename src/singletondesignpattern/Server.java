package singletondesignpattern;

public class Server {
	private int serverId;
	private String serverName;
	
	private static Server server = new Server();
	
	private Server() {};
	
	public int getServerId() {
		return serverId;
	}
	
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	
	public String getServerName() {
		return serverName;
	}
	
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	
	public static Server getServer() {
		return server;
	}
	
	@Override
	public String toString() {
		return "Server [serverId=" + serverId + ", serverName=" + serverName + "]";
	}
}
