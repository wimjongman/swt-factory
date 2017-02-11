package org.eclipse.nebula.swt.factory.decoration.control;

import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class LabelDecorator extends ControlDecorator {

	private static int fDefaultStyle;
	private Label fLabel;


	public LabelDecorator(ControlFactory controlFactory, Label label) {
		super(controlFactory, label);
		this.fLabel = label;
	}

	@Override
	public Label get() {
		return fLabel;
	}

	public LabelDecorator text(String text) {
		fLabel.setText(text);
		return this;
	}

	/**
	 * Returns the default style for Label widgets. The default default style is
	 * {@link SWT#NONE} but it can be set by calling
	 * {@link #setfDefaultStyle(int)}.
	 *
	 * @return the default style for {@link Text} widgets.
	 * @see #setfDefaultStyle(int)
	 */
	public static int getDefaultStyle() {
		return fDefaultStyle;
	}

	/**
	 * Sets the default style for Label widgets.
	 *
	 * @param defaultStyle
	 * @see #getDefaultStyle()
	 */
	public static void setfDefaultStyle(int defaultStyle) {
		LabelDecorator.fDefaultStyle = defaultStyle;
	}
}