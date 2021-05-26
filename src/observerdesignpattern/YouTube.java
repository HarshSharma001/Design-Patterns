package observerdesignpattern;

import java.util.List;

public class YouTube {
	private List<Channel> youtubeChannels;

	public List<Channel> getYoutubeChannels() {
		return youtubeChannels;
	}

	public void setYoutubeChannels(List<Channel> youtubeChannels) {
		this.youtubeChannels = youtubeChannels;
	}
	
	public void displayAllChannels() {
		int size = youtubeChannels.size()-1;
		for(int i=0; i<=size; i++) {
			if(i == 0) {
				System.out.print("["+youtubeChannels.get(i).getChannelName()+", ");
			}
			else if(i < size) {
				System.out.print(youtubeChannels.get(i).getChannelName()+", ");
			}
			else {
				System.out.print(youtubeChannels.get(i).getChannelName()+"]");
			}
		}
		System.out.println("");
		System.out.println("");
	}
}
