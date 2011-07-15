/*********************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.policy.adminui.server;


import org.ebayopensource.turmeric.policy.adminui.client.session.SessionInterface;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@RemoteServiceRelativePath("sessionService")
public class SessionServiceImpl extends RemoteServiceServlet implements
		SessionInterface {
	
	private static final long serialVersionUID = 1L;
			
	@Override
	public Integer getUserSessionTimeout() {
        int timeout = getThreadLocalRequest().getSession()
            .getMaxInactiveInterval() * 1000;
        return timeout;
    }
	
}
