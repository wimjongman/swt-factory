package org.eclipse.nebula.swt.factory.decoration.control;

import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;

public class ComboDecorator extends ControlDecorator {

	private CCombo fCombo;

	private static int fDefaultStyle = SWT.BORDER;

	public ComboDecorator(ControlFactory controlFactory, CCombo combo) {
		super(controlFactory, combo);
		this.fCombo = combo;
	}

	@Override
	public CCombo get() {
		return fCombo;
	}

	/**
	 * Returns the default style for Text widgets. The default default style is
	 * {@link SWT#BORDER} but it can be set by calling
	 * {@link #setfDefaultStyle(int)}.
	 *
	 * @return the default style for {@link Ccombo} widgets.
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
		ComboDecorator.fDefaultStyle = defaultStyle;
	}
}