package FourAdapter;


class MP4Player implements AdvancedMediaPlayer {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing MP4 file " + filename);		
	}
}
