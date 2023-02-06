package study;

import java.io.File;
import java.util.Scanner;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {
	public static void main(String[] args) throws Exception {
		Sequencer seq =  MidiSystem.getSequencer();
		seq.open();
		seq.setSequence(MidiSystem.getSequence(new File("xmas-bgm.mid")));
		seq.setLoopCount(-1);
		seq.start();

		AudioInputStream ais = AudioSystem.getAudioInputStream(new File("xmas-bell.wav"));
		Clip clip = AudioSystem.getClip();
		clip.open();

		System.out.println("メリークリスマス！");
		System.out.println("何か入力すると3回だけベルが鳴るよ");

		for(int i = 0; i < 4; i++) {
			new Scanner(System.in).nextLine();
			clip.start();
			clip.setFramePosition(0);
		}
		clip.stop();
		ais.close();
		seq.stop();
		seq.close();
	}
}