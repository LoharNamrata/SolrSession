/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solrsession.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.solrsession.core.constants.SolrSessionCoreConstants;
import com.solrsession.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class SolrSessionCoreManager extends GeneratedSolrSessionCoreManager
{
	public static final SolrSessionCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SolrSessionCoreManager) em.getExtension(SolrSessionCoreConstants.EXTENSIONNAME);
	}
}
