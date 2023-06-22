package com.classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MyPiano {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPiano window = new MyPiano();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyPiano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 20));
		frame.setBounds(100, 100, 804, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Piano");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		lblNewLabel.setBounds(274, 11, 302, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("C#");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/C_s.wav";
					try {
						AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
						Clip player = AudioSystem.getClip();
						player.open(audio);
						player.start();
					}catch(Exception i){
						i.getStackTrace();
					}
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 0, true));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(67, 92, 56, 192);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("D#");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/C_s.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_1.setBorder(new LineBorder(new Color(192, 192, 192), 0, true));
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(135, 92, 56, 192);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("F#");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/F_s.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(275, 96, 56, 192);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("G#");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/G_s.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(341, 96, 56, 192);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Bb");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/Bb.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setBounds(407, 96, 56, 192);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("C#1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/C_s1.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_5.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setBounds(537, 96, 56, 192);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("D#1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/D_s1.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_6.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setBounds(608, 96, 56, 192);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("C");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/C.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_7.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_7.setForeground(new Color(64, 0, 64));
		btnNewButton_7.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setBounds(34, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("D");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/D.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_8.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_8.setForeground(new Color(64, 0, 64));
		btnNewButton_8.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setBounds(101, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("E");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/E.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_9.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_9.setForeground(new Color(64, 0, 64));
		btnNewButton_9.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setBounds(167, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("F");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/F.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_10.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_10.setForeground(new Color(64, 0, 64));
		btnNewButton_10.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_10.setBackground(new Color(255, 255, 255));
		btnNewButton_10.setBounds(233, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("G");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/G.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_11.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_11.setForeground(new Color(64, 0, 64));
		btnNewButton_11.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_11.setBackground(new Color(255, 255, 255));
		btnNewButton_11.setBounds(299, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("A");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/A.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_12.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_12.setForeground(new Color(64, 0, 64));
		btnNewButton_12.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_12.setBackground(new Color(255, 255, 255));
		btnNewButton_12.setBounds(365, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("B");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/B.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_13.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_13.setForeground(new Color(64, 0, 64));
		btnNewButton_13.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_13.setBackground(new Color(255, 255, 255));
		btnNewButton_13.setBounds(431, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("C1");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/C1.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_14.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_14.setForeground(new Color(64, 0, 64));
		btnNewButton_14.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_14.setBackground(new Color(255, 255, 255));
		btnNewButton_14.setBounds(498, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("D1");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/D1.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_15.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_15.setForeground(new Color(64, 0, 64));
		btnNewButton_15.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_15.setBackground(new Color(255, 255, 255));
		btnNewButton_15.setBounds(564, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("E1");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/E1.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_16.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_16.setForeground(new Color(64, 0, 64));
		btnNewButton_16.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_16.setBackground(new Color(255, 255, 255));
		btnNewButton_16.setBounds(630, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("F1");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path="C:/Users/deepl/eclipse-workspace/Piano/src/audios/F1.wav";
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
					Clip player = AudioSystem.getClip();
					player.open(audio);
					player.start();
				}catch(Exception i){
					i.getStackTrace();
				}
			}
		});
		btnNewButton_17.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_17.setForeground(new Color(64, 0, 64));
		btnNewButton_17.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_17.setBackground(new Color(255, 255, 255));
		btnNewButton_17.setBounds(696, 309, 56, 192);
		frame.getContentPane().add(btnNewButton_17);
	}

}
