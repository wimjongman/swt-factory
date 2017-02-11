package org.eclipse.nebula.swt.factory.decoration.composite;

import org.eclipse.nebula.swt.factory.composite.CompositeFactory;
import org.eclipse.swt.widgets.Group;

public class GroupDecorator extends CompositeDecorator{

	public GroupDecorator(CompositeFactory compositeFactory, Group group) {
		super(compositeFactory, group);
	}

	public GroupDecorator text(String text) {
		get().setText(text);
		return this;
	}

	@Override
	public Group get() {
		return (Group) super.get();
	}
}