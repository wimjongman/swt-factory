package org.eclipse.nebula.swt.factory.layout;

import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.nebula.swt.factory.decoration.composite.CompositeDecorator;

public class LayoutFactory {

	private CompositeDecorator fCompositeDecorator;

	public LayoutFactory(CompositeDecorator compositeDecorator) {
		this.fCompositeDecorator = compositeDecorator;
	}

	public GridLayoutFactory gridLayout(int numberOfColumns,
			boolean makeColumnsEqualWidth) {
		return GridLayoutFactory.instance(fCompositeDecorator, numberOfColumns,
				makeColumnsEqualWidth);
	}

	public ControlFactory controlFactory() {
		return fCompositeDecorator.controlFactory();
	}

	public CompositeDecorator decorator() {
		return fCompositeDecorator;
	}
}
