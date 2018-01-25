package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.

	 */

	/* 2. Make it so that the user can keep entering new animals. */
while (true) {	
	String re =JOptionPane.showInputDialog("What animal sound would you like to play? Cow, Cat, Llama, Dog, or Duck.");
	
	if (re.equals("Duck")) {
		playQuack();
	}
	if (re.equals("Cow")) {
		playMoo();
	}
	if (re.equals("Dog")) {
	    playWoof();
	}
	if (re.equals("Meow")) {
		playMeow();
}
if (re.equals("Baa")) {
		playBaa();
}
}
}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}
void playMeow() {
	playNoise(meowFile);
}
void playBaa() {
	playNoise(llamaFile);
}


String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";




/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

