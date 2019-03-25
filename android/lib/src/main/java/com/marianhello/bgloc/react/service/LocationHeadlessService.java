package com.marianhello.bgloc.react.service;

import android.content.Intent;
import android.os.Bundle;

 import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.HeadlessJsTaskService;

 import com.facebook.react.jstasks.HeadlessJsTaskConfig;

 import javax.annotation.Nullable;

 public class LocationHeadlessService extends HeadlessJsTaskService {

     @Override
    protected @Nullable
    HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return new HeadlessJsTaskConfig("RNLocationHeadlessService", Arguments.fromBundle(extras), 5000, false);
        }
        return null;
    }
} 