package org.eclipse.nebula.swt.factory.decoration.composite;

import org.eclipse.nebula.swt.factory.composite.CompositeFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

public class ShellDecorator extends CompositeDecorator{

	private static int fDefaultStyle = SWT.SHELL_TRIM;

	public ShellDecorator(CompositeFactory compositeFactory, Shell shell) {
		super(compositeFactory, shell);
	}

	public ShellDecorator text(String text) {
		get().setText(text);
		return this;
	}

	@Override
	public Shell get() {
		return (Shell) super.get();
	}


	/**
	 * Returns the default style for Button widgets. The default default style is
	 * {@link SWT#SHELL_TRIM} but it can be set by calling
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
		fDefaultStyle = defaultStyle;
	}
}