package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ProfileTracker$ProfileBroadcastReceiver extends BroadcastReceiver
{
  private ProfileTracker$ProfileBroadcastReceiver(ProfileTracker paramProfileTracker)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(71831);
    if ("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED".equals(paramIntent.getAction()))
    {
      paramContext = (Profile)paramIntent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE");
      paramIntent = (Profile)paramIntent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE");
      this.this$0.onCurrentProfileChanged(paramContext, paramIntent);
    }
    AppMethodBeat.o(71831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.ProfileTracker.ProfileBroadcastReceiver
 * JD-Core Version:    0.6.2
 */