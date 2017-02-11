package org.eclipse.nebula.swt.factory.decoration.composite;

import org.eclipse.nebula.swt.factory.composite.CompositeFactory;
import org.eclipse.nebula.swt.factory.control.ControlFactory;
import org.eclipse.nebula.swt.factory.decoration.DecoratorFactory;
import org.eclipse.nebula.swt.factory.layout.LayoutFactory;
import org.eclipse.swt.widgets.Composite;

public class CompositeDecorator {

	/**
	 * The layout factory for this decorator.
	 */
	private final LayoutFactory fLayoutFactory;

	/**
	 * The composite factory.
	 */
	public final CompositeFactory Factory;

	private Composite fComposite;

	private ControlFactory fControlFactory;

	public CompositeDecorator(CompositeFactory compositeFactory,
			Composite composite) {
		this.Factory = compositeFactory;
		fLayoutFactory = new LayoutFactory(this);
		fComposite = composite;
	}

	public Composite get() {
		return fComposite;
	}

	public CompositeFactory newCompositeFactory() {
		return new CompositeFactory(fComposite);
	}

	public ControlFactory controlFactory() {
		if (fControlFactory == null) {
			fControlFactory = new ControlFactory(fComposite);
		}
		return fControlFactory;
	}

	public LayoutFactory layout() {
		return fLayoutFactory;
	}

	public DecoratorFactory decoratorFactory() {
		return controlFactory().decoratorFactory();
	}

}
