package com.massivecraft.massivehat;

import java.util.List;

import com.massivecraft.mcore.store.Entity;
import com.massivecraft.mcore.util.MUtil;

public class MConf extends Entity<MConf>
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //
	
	protected static transient MConf i;
	public static MConf get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	public List<String> aliasesHat = MUtil.list("hat", "blockhat", "massivehat", "mhat");

}
