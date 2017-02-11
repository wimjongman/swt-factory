package org.eclipse.nebula.swt.factory.layout;

import org.eclipse.nebula.swt.factory.decoration.composite.CompositeDecorator;
import org.eclipse.swt.layout.GridLayout;

public class GridLayoutFactory extends LayoutFactory {

	private GridLayout fGridLayout;

	public GridLayoutFactory(CompositeDecorator compositeDecorator,
			int numberOfColumns, boolean makeColumnsEqualWidth) {
		super(compositeDecorator);
		fGridLayout = new GridLayout(numberOfColumns, makeColumnsEqualWidth);
		decorator().get().setLayout(fGridLayout);
	}

	public static GridLayoutFactory instance(
			CompositeDecorator fCompositeDecorator, int numberOfColumns,
			boolean makeColumnsEqualWidth) {
		return new GridLayoutFactory(fCompositeDecorator, numberOfColumns,
				makeColumnsEqualWidth);
	}
}
