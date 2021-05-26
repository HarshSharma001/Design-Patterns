package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Channel channel1 = new Channel();
		channel1.setChannelId(1);
		channel1.setChannelName("Elite Sharma");

		Channel channel2 = new Channel();
		channel2.setChannelId(2);
		channel2.setChannelName("Telusko");

		Channel channel3 = new Channel();
		channel3.setChannelId(3);
		channel3.setChannelName("WWE");

		Channel channel4 = new Channel();
		channel4.setChannelId(4);
		channel4.setChannelName("Discovery");

		Subscribers sub1 = new Subscribers();
		sub1.setSubId(1);
		sub1.setSubName("Naruto");

		Subscribers sub2 = new Subscribers();
		sub2.setSubId(2);
		sub2.setSubName("Sakura");

		Subscribers sub3 = new Subscribers();
		sub3.setSubId(3);
		sub3.setSubName("Sasuke");

		Subscribers sub4 = new Subscribers();
		sub4.setSubId(4);
		sub4.setSubName("Itachi");

		// 1st channel subs list
		List<Subscribers> list1 = new ArrayList<>();
		list1.add(sub1);
		list1.add(sub2);
		list1.add(sub3);
		channel1.setSubscribers(list1);

		// 2nd channel subs list
		List<Subscribers> list2 = new ArrayList<>();
		list2.add(sub1);
		list2.add(sub3);
		channel2.setSubscribers(list2);

		// 3rd channel subs list
		List<Subscribers> list3 = new ArrayList<>();
		list3.add(sub1);
		list3.add(sub4);
		channel3.setSubscribers(list3);

		// 4rth channel subs list
		List<Subscribers> list4 = new ArrayList<>();
		list4.add(sub3);
		channel4.setSubscribers(list4);
		
		YouTube youtube = new YouTube();
		List<Channel> youtubeChannels = new ArrayList<>();
		youtubeChannels.add(channel1);
		youtubeChannels.add(channel2);
		youtubeChannels.add(channel3);
		youtubeChannels.add(channel4);
		
		youtube.setYoutubeChannels(youtubeChannels);
		
		youtube.displayAllChannels();
		
		channel1.uploadVideo();
		channel2.uploadVideo();
		channel3.uploadVideo();
		channel4.uploadVideo();
	}
}
