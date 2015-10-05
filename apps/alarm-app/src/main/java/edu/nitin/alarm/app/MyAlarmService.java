package edu.nitin.alarm.app;

import android.app.IntentService;
import android.content.Intent;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by nitin.verma on 10/5/15.
 */
@Slf4j( topic = "AlarmService" )
public class MyAlarmService extends IntentService {


    public MyAlarmService() {
        super(log.getName());
    }

    @Override
    protected void onHandleIntent(final Intent intent) {
    }
}
