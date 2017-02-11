package org.eclipse.nebula.swt.factory.decoration.control;

import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.swt.widgets.Control;

public class ControlDecorator {

	private Control fControl;

	private ControlFactory fControlFactory;

	public ControlDecorator(ControlFactory controlFactory, Control control) {
		this.fControlFactory = controlFactory;
		this.fControl = control;
	}

	public Control get() {
		return fControl;
	}

	public ControlFactory controlFactory() {
		return fControlFactory;
	}
}