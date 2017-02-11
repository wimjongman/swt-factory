package org.eclipse.nebula.swt.factory.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ShellFactory {

	private Display fDisplay;

	private Shell fShell;

	public ShellFactory(Display pDisplay) {
		this.fDisplay = pDisplay;
	}

	public static ShellFactory instance(Display pDisplay) {
		return new ShellFactory(pDisplay);
	}

	public static ShellFactory instance() {
		return new ShellFactory(Display.getDefault());
	}

	public ShellFactory shell(int style) {
		fShell = new Shell(fDisplay, style);
		fShell.setLayout(new GridLayout(1, false));
		return this;
	}

	public ShellFactory shell() {
		fShell = new Shell(fDisplay, SWT.DIALOG_TRIM | SWT.PRIMARY_MODAL);
		fShell.setLayout(new GridLayout(1, false));
		return this;
	}

	public Shell getShell() {
		return fShell;
	}

	public void open() {
		fShell.pack();
		fShell.open();
		while (!fShell.isDisposed()) {
			if (!fDisplay.readAndDispatch()) {
				fDisplay.sleep();
			}
		}
		fDisplay.dispose();
	}
}
