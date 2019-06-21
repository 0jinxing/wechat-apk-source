package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;

public class FirebaseInstanceIdService extends zzb
{
  protected final Intent f(Intent paramIntent)
  {
    AppMethodBeat.i(108710);
    paramIntent = (Intent)o.uS().bvY.poll();
    AppMethodBeat.o(108710);
    return paramIntent;
  }

  public final void g(Intent paramIntent)
  {
    AppMethodBeat.i(108711);
    if ("com.google.firebase.iid.TOKEN_REFRESH".equals(paramIntent.getAction()))
    {
      onTokenRefresh();
      AppMethodBeat.o(108711);
    }
    while (true)
    {
      return;
      String str = paramIntent.getStringExtra("CMD");
      if (str != null)
      {
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          paramIntent = String.valueOf(paramIntent.getExtras());
          new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(paramIntent).length()).append("Received command: ").append(str).append(" - ").append(paramIntent);
        }
        if (("RST".equals(str)) || ("RST_FULL".equals(str)))
        {
          FirebaseInstanceId.uD().uI();
          AppMethodBeat.o(108711);
        }
        else if ("SYNC".equals(str))
        {
          paramIntent = FirebaseInstanceId.uD();
          FirebaseInstanceId.bvq.aZ("");
          paramIntent.startSync();
        }
      }
      else
      {
        AppMethodBeat.o(108711);
      }
    }
  }

  public void onTokenRefresh()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.FirebaseInstanceIdService
 * JD-Core Version:    0.6.2
 */