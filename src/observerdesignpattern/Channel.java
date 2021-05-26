package observerdesignpattern;

import java.util.List;

public class Channel implements YoutubeChannel {
	private int channelId;
	private String channelName;
	private List<Subscribers> subscribers;

	public int getChannelId() {
		return channelId;
	}

	public List<Subscribers> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Subscribers> subscribers) {
		this.subscribers = subscribers;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public String toString() {
		return "YTChannel [channelId=" + channelId + ", channelName=" + channelName + "]";
	}

	public void uploadVideo() {
		System.out.println("uploading video on channel " + this.channelName);
		this.sendNotificationToSubscribers();
	}

	@Override
	public void sendNotificationToSubscribers() {
		for(Subscribers sub: subscribers) {
			sub.getNotified(this.channelName);
		}
	}

}
