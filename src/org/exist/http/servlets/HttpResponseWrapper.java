/*
 *  eXist Open Source Native XML Database
 *  Copyright (C) 2001-03 Wolfgang M. Meier
 *  wolfgang@exist-db.org
 *  http://exist.sourceforge.net
 *  
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *  
 *  $Id$
 */
package org.exist.http.servlets;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Wolfgang Meier (wolfgang@exist-db.org)
 */
public class HttpResponseWrapper implements ResponseWrapper {

	private HttpServletResponse response;
	
	/**
	 * 
	 */
	public HttpResponseWrapper(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public void addDateHeader(String arg0, long arg1) {
		response.addDateHeader(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public void addHeader(String arg0, String arg1) {
		response.addHeader(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public void addIntHeader(String arg0, int arg1) {
		response.addIntHeader(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @return
	 */
	public boolean containsHeader(String arg0) {
		return response.containsHeader(arg0);
	}

	/**
	 * @param arg0
	 * @return
	 */
	public String encodeURL(String arg0) {
		return response.encodeURL(arg0);
	}

	/**
	 * @return
	 */
	public String getCharacterEncoding() {
		return response.getCharacterEncoding();
	}

	/**
	 * @return
	 */
	public Locale getLocale() {
		return response.getLocale();
	}

	/**
	 * @param arg0
	 * @throws java.io.IOException
	 */
	public void sendRedirect(String arg0) throws IOException {
		response.sendRedirect(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public void setDateHeader(String arg0, long arg1) {
		response.setDateHeader(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public void setHeader(String arg0, String arg1) {
		response.setHeader(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public void setIntHeader(String arg0, int arg1) {
		response.setIntHeader(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public void setLocale(Locale arg0) {
		response.setLocale(arg0);
	}
}
