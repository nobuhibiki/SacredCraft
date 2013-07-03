package com.sacred.SC.handler;

import com.sacred.SC.helper.LocalizationHelper;
import com.sacred.SC.lib.Localization;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	public static void loadLanguages(){
		for(String LocationFile: Localization.localeFiles){
			LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
		}
	}
}