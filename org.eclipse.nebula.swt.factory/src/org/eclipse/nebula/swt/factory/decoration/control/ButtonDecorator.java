package org.eclipse.nebula.swt.factory.decoration.control;

import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class ButtonDecorator extends ControlDecorator {

	private Button fButton;

	private static int fDefaultStyle = SWT.PUSH;

	public ButtonDecorator(ControlFactory controlFactory, Button button) {
		super(controlFactory, button);
		this.fButton = button;
	}

	@Override
	public Button get() {
		return fButton;
	}

	/**
	 * Returns the default style for Button widgets. The default default style is
	 * {@link SWT#PUSH} but it can be set by calling
	 * {@link #setfDefaultStyle(int)}.
	 *
	 * @return the default style for {@link Button} widgets.
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
		ButtonDecorator.fDefaultStyle = defaultStyle;
	}
}