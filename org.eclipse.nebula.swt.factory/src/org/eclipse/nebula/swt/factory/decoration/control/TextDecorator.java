package org.eclipse.nebula.swt.factory.decoration.control;

import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

public class TextDecorator extends ControlDecorator {

	private Text fText;

	private static int fDefaultStyle = SWT.BORDER;

	public TextDecorator(ControlFactory controlFactory, Text text) {
		super(controlFactory, text);
		this.fText = text;
	}

	@Override
	public Text get() {
		return fText;
	}

	/**
	 * Returns the default style for Text widgets. The default default style is
	 * {@link SWT#BORDER} but it can be set by calling
	 * {@link #setfDefaultStyle(int)}.
	 *
	 * @return the default style for {@link Text} widgets.
	 * @see #setfDefaultStyle(int)
	 */
	public static int getDefaultStyle() {
		return fDefaultStyle;
	}

	/**
	 * Sets the default style for Text widgets.
	 *
	 * @param defaultStyle
	 * @see #getDefaultStyle()
	 */
	public static void setfDefaultStyle(int defaultStyle) {
		TextDecorator.fDefaultStyle = defaultStyle;
	}
}