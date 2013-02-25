package code;

import org.jfree.ui.RefineryUtilities;

public class Driver {
	public static void main(String[] args) {

        BarGrapher demo = new BarGrapher("Twitter Analysis");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}
