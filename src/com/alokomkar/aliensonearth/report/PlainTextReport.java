package com.alokomkar.aliensonearth.report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import net.xeoh.plugins.base.annotations.PluginImplementation;

import com.alokomkar.aliensonearth.auxillary.AuxilaryClass;
import com.alokomkar.aliensonearth.plugin.ReportPluginInterface;

@PluginImplementation
public class PlainTextReport implements ReportPluginInterface {

	
	@Override
	public void generateReport() {
		try {
			Desktop.getDesktop().open(new File(AuxilaryClass.getAlienListFilePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}

}
