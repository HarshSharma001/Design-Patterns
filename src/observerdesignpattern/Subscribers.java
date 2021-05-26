package observerdesignpattern;

public class Subscribers implements YouTubeSubscribers{
	private int subId;
	private String subName;
	
	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public void getNotified(String channelName) {
		System.out.println("New notification to subscriber named as "+this.subName);
		System.out.println("**"+channelName+"** uploaded a new video!");
		System.out.println();
	}
}
