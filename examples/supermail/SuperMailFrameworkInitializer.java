/** BEGIN COPYRIGHT BLOCK
 * Copyright (C) 2001 Sun Microsystems, Inc.  Used by permission.
 * Copyright (C) 2005 Red Hat, Inc.
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version
 * 2.1 of the License.
 *                                                                                 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *                                                                                 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * END COPYRIGHT BLOCK **/
package supermail;

import java.util.*;
import java.awt.*;
import com.sun.java.swing.*;
import com.netscape.management.client.*;
import com.netscape.management.client.util.*;
import com.netscape.management.client.console.*;

import supermail.configuration.*;
import supermail.status.*;


/**
 *	Initializes Admin Server Config framework
 */
public class SuperMailFrameworkInitializer extends FrameworkInitializer
{
	public SuperMailFrameworkInitializer(ConsoleInfo consoleInfo)
	{
		addPage(new ConfigurationPage(consoleInfo));
		addPage(new StatusPage(consoleInfo));

		RemoteImage imageIcon = new RemoteImage("com/netscape/management/supermail/images/SuperMailSErverL.gif");
		setMinimizedImage(imageIcon.getImage());
		setBannerImage(new RemoteImage("com/netscape/management/supermail/images/supermail.gif").getImage());
		setFrameTitle(consoleInfo.getLDAPConnection(), consoleInfo.getCurrentDN());
		setBannerText(consoleInfo.getLDAPConnection(), consoleInfo.getCurrentDN());
	}
}
