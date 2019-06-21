package com.facebook;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.d;
import com.facebook.internal.Validate;

public abstract class ProfileTracker
{
  private final d broadcastManager;
  private boolean isTracking = false;
  private final BroadcastReceiver receiver;

  public ProfileTracker()
  {
    Validate.sdkInitialized();
    this.receiver = new ProfileTracker.ProfileBroadcastReceiver(this, null);
    this.broadcastManager = d.S(FacebookSdk.getApplicationContext());
    startTracking();
  }

  private void addBroadcastReceiver()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
    this.broadcastManager.a(this.receiver, localIntentFilter);
  }

  public boolean isTracking()
  {
    return this.isTracking;
  }

  protected abstract void onCurrentProfileChanged(Profile paramProfile1, Profile paramProfile2);

  public void startTracking()
  {
    if (this.isTracking);
    while (true)
    {
      return;
      addBroadcastReceiver();
      this.isTracking = true;
    }
  }

  public void stopTracking()
  {
    if (!this.isTracking);
    while (true)
    {
      return;
      this.broadcastManager.unregisterReceiver(this.receiver);
      this.isTracking = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.ProfileTracker
 * JD-Core Version:    0.6.2
 */