//  ========================================================================
//  Copyright (c) 1995-2016 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================

package com.acme;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

/**
 * MockDataSource
 *
 *.
 */
public class MockDataSource implements DataSource
{

    /**
     * NOTE: JDK7+ new feature
     */
    public Logger getParentLogger() 
    {
        return null;
    }

    public Connection getConnection() throws SQLException
    {
        return null;
    }

    public Connection getConnection(String username, String password)
            throws SQLException
    {
        return null;
    }

    public PrintWriter getLogWriter() throws SQLException
    {
        return null;
    }

    public int getLoginTimeout() throws SQLException
    {
        return 0;
    }

    public void setLogWriter(PrintWriter out) throws SQLException
    {
    }

    public void setLoginTimeout(int seconds) throws SQLException
    {
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException
    {
        return false;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException
    {
        return null;
    }

}
