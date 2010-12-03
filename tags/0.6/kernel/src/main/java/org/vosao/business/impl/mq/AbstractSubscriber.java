/**
 * Vosao CMS. Simple CMS for Google App Engine.
 * Copyright (C) 2009 Vosao development team
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * email: vosao.dev@gmail.com
 */

package org.vosao.business.impl.mq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.vosao.business.Business;
import org.vosao.business.mq.MessageQueue;
import org.vosao.business.mq.TopicSubscriber;
import org.vosao.common.VosaoContext;
import org.vosao.dao.Dao;
import org.vosao.global.SystemService;

/**
 * 
 * @author Alexander Oleynik
 *
 */
public abstract class AbstractSubscriber implements TopicSubscriber {

	protected static final Log logger = LogFactory.getLog(AbstractSubscriber.class);

	protected Business getBusiness() {
		return VosaoContext.getInstance().getBusiness();
	}

	protected Dao getDao() {
		return getBusiness().getDao();
	}
		
	protected SystemService getSystemService() {
		return getBusiness().getSystemService();
	}
	
	protected MessageQueue getMessageQueue() {
		return VosaoContext.getInstance().getMessageQueue();
	}
	
}