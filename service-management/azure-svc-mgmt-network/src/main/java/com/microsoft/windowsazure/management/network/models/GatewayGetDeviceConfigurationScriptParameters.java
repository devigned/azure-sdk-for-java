/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.network.models;

/**
* The vendor, platform, and OS family of the requested device configuration
* script.
*/
public class GatewayGetDeviceConfigurationScriptParameters {
    private String oSFamily;
    
    /**
    * Optional. The device OS family.
    * @return The OSFamily value.
    */
    public String getOSFamily() {
        return this.oSFamily;
    }
    
    /**
    * Optional. The device OS family.
    * @param oSFamilyValue The OSFamily value.
    */
    public void setOSFamily(final String oSFamilyValue) {
        this.oSFamily = oSFamilyValue;
    }
    
    private String platform;
    
    /**
    * Optional. The device platform.
    * @return The Platform value.
    */
    public String getPlatform() {
        return this.platform;
    }
    
    /**
    * Optional. The device platform.
    * @param platformValue The Platform value.
    */
    public void setPlatform(final String platformValue) {
        this.platform = platformValue;
    }
    
    private String vendor;
    
    /**
    * Optional. The name of the device vendor.
    * @return The Vendor value.
    */
    public String getVendor() {
        return this.vendor;
    }
    
    /**
    * Optional. The name of the device vendor.
    * @param vendorValue The Vendor value.
    */
    public void setVendor(final String vendorValue) {
        this.vendor = vendorValue;
    }
}