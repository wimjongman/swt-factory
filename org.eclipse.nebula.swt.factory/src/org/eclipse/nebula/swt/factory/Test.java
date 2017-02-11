package org.eclipse.nebula.swt.factory;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.swt.factory.composite.CompositeFactory;
import org.eclipse.nebula.swt.factory.composite.ShellFactory;
import org.eclipse.nebula.swt.factory.decoration.composite.CompositeDecorator;
import org.eclipse.nebula.swt.factory.decoration.composite.GroupDecorator;
import org.eclipse.swt.SWT;

public class Test {

	public static void main(String[] args) {
		ShellFactory sf = ShellFactory.instance().shell();
		CompositeFactory cf = CompositeFactory.instance(sf.getShell());
		GroupDecorator group1 = cf.group("Group1", SWT.NONE).text("Customer");
		group1.layout().gridLayout(4, true); //
		group1.controlFactory() //
				.labelWithText("Order number").text("textOrder")
				.layoutData("textOrder",
						GridDataFactory.fillDefaults().span(3, 1).create())
				.labelWithText("Customer").text("textCust") //
				.labelWithText("Vat").text("textVat") //
				.labelWithText("Position").text("textPosition").label().label() //
				.label().label().buttonWithText("ok", "Ok") //
				.layoutData("ok", GridDataFactory.fillDefaults().span(2, 1)
						.align(SWT.FILL, SWT.CENTER).create());

		CompositeDecorator comp1 = cf.composite("Composite1", SWT.BORDER);
		comp1.layout().gridLayout(4, true); //
		comp1.controlFactory() //
				.labelWithText("Contracts") //
				.combo("contractsCombo")
				.layoutData("contractsCombo",
						GridDataFactory.fillDefaults().span(3, 1).grab(true, false).create())
				.buttonWithText("lookup", "Lookup") //
				.layoutData("lookup", GridDataFactory.fillDefaults().create());

		sf.open();
	}
}
