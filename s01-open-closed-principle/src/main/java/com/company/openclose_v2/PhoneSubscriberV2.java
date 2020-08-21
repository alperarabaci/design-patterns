package com.company.openclose_v2;

import java.util.List;

import com.company.openclose.CallHistory;

public class PhoneSubscriberV2 extends SubscriberV2 {

	@Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}