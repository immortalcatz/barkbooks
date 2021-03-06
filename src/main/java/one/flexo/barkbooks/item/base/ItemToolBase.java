/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.item.base;

import one.flexo.barkbooks.ModInfo;
import one.flexo.barkbooks.ModRegistry;
import one.flexo.nibbler.item.tool.NibblerTool;
import one.flexo.nibbler.item.tool.NibblerToolData;
import one.flexo.nibbler.registry.NibblerRegisteredObject;
import one.flexo.nibbler.registry.NibblerRegistry;

public class ItemToolBase extends NibblerTool implements NibblerRegisteredObject {

	public ItemToolBase(String name, NibblerToolData toolData) {
		super(ModInfo.modid, name, toolData, ModRegistry.tab);
	}

	@Override
	public NibblerRegistry getRegistry() {
		return ModRegistry.instance;
	}

}
