package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FacebookBroadcastReceiver extends BroadcastReceiver
{
  protected void onFailedAppCall(String paramString1, String paramString2, Bundle paramBundle)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(71574);
    String str = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
    paramContext = paramIntent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
    Bundle localBundle;
    if ((str != null) && (paramContext != null))
    {
      localBundle = paramIntent.getExtras();
      if (NativeProtocol.isErrorResult(paramIntent))
      {
        onFailedAppCall(str, paramContext, localBundle);
        AppMethodBeat.o(71574);
      }
    }
    while (true)
    {
      return;
      onSuccessfulAppCall(str, paramContext, localBundle);
      AppMethodBeat.o(71574);
    }
  }

  protected void onSuccessfulAppCall(String paramString1, String paramString2, Bundle paramBundle)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookBroadcastReceiver
 * JD-Core Version:    0.6.2
 */