package org.eclipse.nebula.swt.factory.decoration;

import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.nebula.swt.factory.decoration.control.LabelDecorator;
import org.eclipse.nebula.swt.factory.decoration.control.TextDecorator;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DecoratorFactory {

	private ControlFactory fControlFactory;

	public DecoratorFactory(ControlFactory controlFactory) {
		this.fControlFactory = controlFactory;
	}

	/**
	 * Gets the decorator for the Text with the passed name. If a Text with the
	 * passed name does not exist then it is created.
	 *
	 * @param name
	 * @return the {@link TextDecorator} for the Text with the passed name.
	 */
	public TextDecorator textDecorator(String name) {
		return new TextDecorator(fControlFactory,
				(Text) fControlFactory.get(name));
	}

	/**
	 * Gets the decorator for the Label with the passed name. If a Label with
	 * the passed name does not exist then it is created.
	 *
	 * @param name
	 * @return the {@link TextDecorator} for the Text with the passed name.
	 */
	public LabelDecorator labelDecorator(String name) {
		return new LabelDecorator(fControlFactory,
				(Label) fControlFactory.get(name));
	}

}
