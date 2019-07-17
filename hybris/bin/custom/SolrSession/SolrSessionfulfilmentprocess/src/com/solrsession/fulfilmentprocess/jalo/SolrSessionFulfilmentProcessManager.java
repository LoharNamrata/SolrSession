/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solrsession.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.solrsession.fulfilmentprocess.constants.SolrSessionFulfilmentProcessConstants;

public class SolrSessionFulfilmentProcessManager extends GeneratedSolrSessionFulfilmentProcessManager
{
	public static final SolrSessionFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SolrSessionFulfilmentProcessManager) em.getExtension(SolrSessionFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
