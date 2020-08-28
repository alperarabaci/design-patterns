package com.coffeepoweredcrew.bridge.e4;

import com.coffeepoweredcrew.bridge.e4.devices.Device;
import com.coffeepoweredcrew.bridge.e4.devices.Tv;
import com.coffeepoweredcrew.bridge.e4.devices.remotes.AdvancedRemote;
import com.coffeepoweredcrew.bridge.e4.devices.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        //testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
