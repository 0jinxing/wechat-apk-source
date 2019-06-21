package com.tencent.mm.accessibility;

import android.app.Activity;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class AccessibilityCapture$Event
{
  public final Activity activity;
  public final long elapsedTime;
  public final AccessibilityEvent event;
  public final View view;

  public AccessibilityCapture$Event(AccessibilityEvent paramAccessibilityEvent, View paramView, Activity paramActivity, long paramLong)
  {
    this.event = paramAccessibilityEvent;
    this.view = paramView;
    this.activity = paramActivity;
    this.elapsedTime = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.AccessibilityCapture.Event
 * JD-Core Version:    0.6.2
 */