/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dsmr.internal.device;

import java.util.Objects;

/**
 * Class described the DSMRDeviceConfiguration.
 *
 * This class is supporting the Configuration.as functionality from {@link Configuration}
 *
 * @author M. Volaart
 * @since 2.1.0
 */
public class DSMRDeviceConfiguration {
    /**
     * Configured Portname
     */
    public String serialPort;

    /**
     * The DSMR Device can work in a lenient mode.
     * This means the binding is less strict during communication errors and will ignore the CRC-check
     * Data that is available will be communicated to the OpenHAB2 system and recoverable communication errors
     * won't be logged.
     * This can be needed for devices handling the serial port not fast enough (e.g. embedded devices)
     */
    public Boolean lenientMode;

    /**
     * Use serial port autodetection
     */
    public Boolean autoDiscovery;

    /**
     * Configured baudrate
     */
    public Integer baudrate;

    /**
     * Configured number of data bits
     */
    public Integer databits;

    /**
     * Configured parity
     */
    public String parity;

    /**
     * Configured number of stopbits
     */
    public String stopbits;

    @Override
    public String toString() {
        return "DSMRDeviceConfiguration(portName:" + serialPort + ", lenientMode:" + lenientMode + ", auto discovery:"
                + autoDiscovery + ", baudrate:" + baudrate + ", databits:" + databits + ", parity:" + parity
                + ", stopbits:" + stopbits;
    }

    /**
     * Returns if this DSMRDeviceConfiguration is equal to the other DSMRDeviceConfiguration.
     * Evaluation is done based on all the parameters
     *
     * @param other the other DSMRDeviceConfiguration to check
     * @return true if both are equal, false otherwise or if other == null
     */
    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof DSMRDeviceConfiguration)) {
            return false;
        }
        DSMRDeviceConfiguration o = (DSMRDeviceConfiguration) other;

        return serialPort.equals(o.serialPort) && lenientMode == o.lenientMode && autoDiscovery == o.autoDiscovery
                && baudrate.equals(o.baudrate) && databits.equals(o.databits) && parity.equals(o.parity)
                && stopbits.equals(o.stopbits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialPort, lenientMode, autoDiscovery, baudrate, databits, parity, stopbits);
    }
}
