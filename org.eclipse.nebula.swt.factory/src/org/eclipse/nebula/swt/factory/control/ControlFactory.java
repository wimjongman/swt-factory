package org.eclipse.nebula.swt.factory.control;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.nebula.swt.factory.decoration.DecoratorFactory;
import org.eclipse.nebula.swt.factory.decoration.control.ButtonDecorator;
import org.eclipse.nebula.swt.factory.decoration.control.ComboDecorator;
import org.eclipse.nebula.swt.factory.decoration.control.LabelDecorator;
import org.eclipse.nebula.swt.factory.decoration.control.TextDecorator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ControlFactory {

	private Composite fParent;

	private Map<String, Control> fControls = new HashMap<>();

	private DecoratorFactory fDecoratorFactory;

	public ControlFactory(Composite pParent) {
		this.fParent = pParent;
	}

	public static ControlFactory instance(Composite pParent) {
		return new ControlFactory(pParent);
	}

	/**
	 * If a control with the passed name is not already registered a Text is
	 * created with the passed style and registered under the passed name.
	 *
	 * @return this {@link ControlFactory}.
	 */
	public ControlFactory text(String name, Integer style) {
		if (!fControls.containsKey(name)) {
			Text text = new Text(fParent, style);
			fControls.put(name, text);
		}
		return this;
	}

	/**
	 * If a control with the passed name is not already registered a Text is
	 * created with the default style and registered under the passed name.
	 *
	 * @return this {@link ControlFactory}.
	 */
	public ControlFactory text(String name) {
		if (!fControls.containsKey(name)) {
			Text text = new Text(fParent, TextDecorator.getDefaultStyle());
			fControls.put(name, text);
		}
		return this;
	}

	/**
	 * If a control with the passed name is not already registered a Label is
	 * created with the passed style and registered under the passed name.
	 *
	 * @return this {@link ControlFactory}.
	 */
	public ControlFactory label(String name, Integer style) {
		if (!fControls.containsKey(name)) {
			fControls.put(name, new Label(fParent, style));
		}
		return this;
	}

	/**
	 * Creates a label and files it under the passed name if it does not already
	 * exists otherwise it does nothing.
	 *
	 * @return this {@link ControlFactory}.
	 */
	public ControlFactory label(String name) {
		return label(name, LabelDecorator.getDefaultStyle());
	}

	/**
	 * Creates an anonymous label with the default style.
	 *
	 * @return this {@link ControlFactory}
	 */
	public ControlFactory label() {
		new Label(fParent, SWT.NONE);
		return this;
	}

	/**
	 * Returns the control that is registered under the provided name.
	 *
	 * @return the control or null if it does not exist.
	 */
	public Control get(String name) {
		return fControls.get(name);
	}

	/**
	 * Creates an anonymous label with the default style and the provided text.
	 *
	 * @return this {@link ControlFactory}.
	 */
	public ControlFactory labelWithText(String text) {
		new Label(fParent, LabelDecorator.getDefaultStyle()).setText(text);
		return this;
	}

	public DecoratorFactory decoratorFactory() {
		if (fDecoratorFactory == null) {
			fDecoratorFactory = new DecoratorFactory(this);
		}
		return fDecoratorFactory;
	}

	/**
	 * @param name
	 * @param description
	 * @return
	 */
	public ControlFactory buttonWithText(String name, String description) {
		((Button) button(name).get(name)).setText(description);
		return this;
	}

	/**
	 * Creates a Button with the passed style and files it under the passed name
	 * if it does not already exists otherwise it does nothing.
	 *
	 * @return this {@link ControlFactory}.
	 */
	public ControlFactory button(String name, int style) {
		if (!fControls.containsKey(name)) {
			fControls.put(name,
					new Button(fParent, ButtonDecorator.getDefaultStyle()));
		}
		return this;
	}

	/**
	 * Creates a Button with the default style and files it under the passed
	 * name if it does not already exists otherwise it does nothing.
	 *
	 * @return this {@link ControlFactory}.
	 * @see ButtonDecorator
	 */
	public ControlFactory button(String name) {
		return button(name, ButtonDecorator.getDefaultStyle());
	}

	public ControlFactory layoutData(String name, Object layoutData) {
		get(name).setLayoutData(layoutData);
		return this;
	}

	public ControlFactory combo(String name) {
		return combo(name, ComboDecorator.getDefaultStyle());
	}

	public ControlFactory combo(String name, int style) {
		if (!fControls.containsKey(name)) {
			fControls.put(name,
					new CCombo(fParent, ComboDecorator.getDefaultStyle()));
		}
		return this;
	}
}
