package org.apache.maven.repository.util;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.repository.TransferCancelledException;
import org.apache.maven.repository.TransferEvent;
import org.apache.maven.repository.TransferListener;

/**
 * A skeleton implementation for custom transfer listeners. The callback methods in this class do nothing.
 * 
 * @author Benjamin Bentmann
 */
public abstract class AbstractTransferListener
    implements TransferListener
{

    public void transferInitiated( TransferEvent transferEvent )
        throws TransferCancelledException
    {
    }

    public void transferStarted( TransferEvent transferEvent )
        throws TransferCancelledException
    {
    }

    public void transferProgressed( TransferEvent transferEvent )
        throws TransferCancelledException
    {
    }

    public void transferCorrupted( TransferEvent transferEvent )
        throws TransferCancelledException
    {
    }

    public void transferSucceeded( TransferEvent transferEvent )
    {
    }

    public void transferFailed( TransferEvent transferEvent )
    {
    }

}