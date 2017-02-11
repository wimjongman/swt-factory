package org.eclipse.nebula.swt.factory.composite;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.nebula.swt.factory.decoration.composite.CompositeDecorator;
import org.eclipse.nebula.swt.factory.decoration.composite.GroupDecorator;
import org.eclipse.nebula.swt.factory.decoration.composite.ShellDecorator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public class CompositeFactory {

	private Composite fParent;

	private Map<String, Composite> fComposites = new HashMap<>();

	public CompositeFactory(Composite pParent) {
		this.fParent = pParent;
	}

	public static CompositeFactory instance(Composite pParent) {
		return new CompositeFactory(pParent);
	}

	public GroupDecorator group(String name, Integer style) {
		if (!fComposites.containsKey(name)) {
			Group group = new Group(fParent, style);
			fComposites.put(name, group);
		}
		return new GroupDecorator(this, (Group) fComposites.get(name));
	}

	public CompositeDecorator composite(String name, Integer style) {
		if (!fComposites.containsKey(name)) {
			Composite composite = new Composite(fParent, style);
			fComposites.put(name, composite);
		}
		return new CompositeDecorator(this, fComposites.get(name));
	}

	public ShellDecorator shell(String name, Integer style) {
		if (!fComposites.containsKey(name)) {
			Shell shell = new Shell(Display.getDefault(), style);
			fComposites.put(name, shell);
		}
		return new ShellDecorator(this, (Shell) fComposites.get(name));
	}

	public ShellDecorator shell(String name) {
		return shell(name, ShellDecorator.getDefaultStyle());
	}

	public Composite getComposite(String name) {
		return fComposites.get(name);
	}
}
