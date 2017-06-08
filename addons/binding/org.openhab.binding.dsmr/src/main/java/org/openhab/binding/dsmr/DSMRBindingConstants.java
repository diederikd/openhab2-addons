/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dsmr;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link DSMRBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author M. Volaart
 * @since 2.1.0
 */
public class DSMRBindingConstants {
    /**
     * Binding constant
     */
    public static final String BINDING_ID = "dsmr";

    /**
     * Constant for the DSMR Thread pool
     */
    public static final String DSMR_THREAD_POOL_NAME = "DSMR Thread Pool";

    /**
     * Bridge device thing type UID
     */
    public final static ThingTypeUID THING_TYPE_DSMR_BRIDGE = new ThingTypeUID(BINDING_ID, "dsmrBridge");

    // The other Thing Types are defined in DSMRMeterTypes

    /**
     * Discovery timeout (in seconds)
     */
    public final static int DSMR_DISCOVERY_TIMEOUT_SECONDS = 60;
}
