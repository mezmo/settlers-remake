package jsettlers.lookandfeel.ui;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

/**
 * ProgressBar ui
 * 
 * @author Andreas Butti
 *
 */
public class SettlerProgressbar extends BasicProgressBarUI {

	/**
	 * Settler blue
	 */
	private static final Color FOREGROUND_COLOR = new Color(0x00C7C6);

	/**
	 * Constructor
	 */
	public SettlerProgressbar() {
	}

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);

		c.setOpaque(false);
		c.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

		JProgressBar pg = (JProgressBar) c;
		pg.setForeground(FOREGROUND_COLOR);
	}

	@Override
	protected Color getSelectionForeground() {
		return Color.WHITE;
	}

	@Override
	protected Color getSelectionBackground() {
		return Color.WHITE;
	}

}