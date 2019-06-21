package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;

class AccessTokenTracker$CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver
{
  private AccessTokenTracker$CurrentAccessTokenBroadcastReceiver(AccessTokenTracker paramAccessTokenTracker)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(96575);
    if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(paramIntent.getAction()))
    {
      Utility.logd(AccessTokenTracker.access$100(), "AccessTokenChanged");
      paramContext = (AccessToken)paramIntent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
      paramIntent = (AccessToken)paramIntent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
      this.this$0.onCurrentAccessTokenChanged(paramContext, paramIntent);
    }
    AppMethodBeat.o(96575);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.AccessTokenTracker.CurrentAccessTokenBroadcastReceiver
 * JD-Core Version:    0.6.2
 */