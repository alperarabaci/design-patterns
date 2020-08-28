package com.coffeepoweredcrew.bridge.e4.devices.remotes;

import com.coffeepoweredcrew.bridge.e4.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}