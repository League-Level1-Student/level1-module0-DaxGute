/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
        String url = ("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Waterfalls-picture_-_West_Virginia_-_ForestWander.jpg/794px-Waterfalls-picture_-_West_Virginia_-_ForestWander.jpg");
		// 2. create a variable of type "Component" that will hold your image
        Component URL = createImage(url);
		// 3. use the "createImage()" method below to initialize your Component
        quizWindow.add(URL);
		// 4. add the image to the quiz window
        quizWindow.pack();
		// 5. call the pack() method on the quiz window
        String a = JOptionPane.showInputDialog("where is this?");
		// 6. ask a question that relates to the image
        	if(a.equalsIgnoreCase("west virginia")) {
        		JOptionPane.showMessageDialog(null, "correct");
        	}else {
        		JOptionPane.showMessageDialog(null, "incorrect");
        	}
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        	quizWindow.remove(URL);
		// 10. find another image and create it (might take more than one line of code)
        	String url2 = ("https://i.pinimg.com/originals/c3/4f/a1/c34fa17364d05dd8cbe4c0267725ec17.jpg");
		// 11. add the second image to the quiz window
        	 Component URL2 = createImage(url2);
        	 quizWindow.add(URL2);
		// 12. pack the quiz window
        	 quizWindow.pack();
		// 13. ask another question
        	 String a2 = JOptionPane.showInputDialog("what is this?");
		// 14+ check answer, say if correct or incorrect, etc.
        		if(a2.equalsIgnoreCase("unicorn")) {
            		JOptionPane.showMessageDialog(null, "correct");
            	}else {
            		JOptionPane.showMessageDialog(null, "incorrect");
            	}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		
		JLabel imageLabel = new JLabel(icon);
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





