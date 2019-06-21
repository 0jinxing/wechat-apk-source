package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import com.google.android.gms.common.util.PlatformVersion;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.concurrent.GuardedBy;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver
{

  @GuardedBy("FirebaseInstanceIdReceiver.class")
  private static y bvA;
  private static boolean bvy = false;

  @GuardedBy("FirebaseInstanceIdReceiver.class")
  private static y bvz;

  private final void a(Context paramContext, Intent paramIntent, String paramString)
  {
    String str1 = null;
    int i = 0;
    int j = -1;
    AppMethodBeat.i(108708);
    paramIntent.setComponent(null);
    paramIntent.setPackage(paramContext.getPackageName());
    if (Build.VERSION.SDK_INT <= 18)
      paramIntent.removeCategory(paramContext.getPackageName());
    String str2 = paramIntent.getStringExtra("gcm.rawData64");
    if (str2 != null)
    {
      paramIntent.putExtra("rawData", Base64.decode(str2, 0));
      paramIntent.removeExtra("gcm.rawData64");
    }
    if (("google.com/iid".equals(paramIntent.getStringExtra("from"))) || ("com.google.firebase.INSTANCE_ID_EVENT".equals(paramString)))
    {
      str1 = "com.google.firebase.INSTANCE_ID_EVENT";
      k = j;
      if (str1 != null)
      {
        k = i;
        if (PlatformVersion.isAtLeastO())
        {
          k = i;
          if (paramContext.getApplicationInfo().targetSdkVersion >= 26)
            k = 1;
        }
        if (k == 0)
          break label221;
        if (isOrderedBroadcast())
          setResultCode(-1);
        j(paramContext, str1).a(paramIntent, goAsync());
      }
    }
    label221: for (int k = j; ; k = o.uS().a(paramContext, str1, paramIntent))
    {
      if (isOrderedBroadcast())
        setResultCode(k);
      AppMethodBeat.o(108708);
      return;
      if ((!"com.google.android.c2dm.intent.RECEIVE".equals(paramString)) && (!"com.google.firebase.MESSAGING_EVENT".equals(paramString)))
        break;
      str1 = "com.google.firebase.MESSAGING_EVENT";
      break;
    }
  }

  private static y j(Context paramContext, String paramString)
  {
    try
    {
      AppMethodBeat.i(108709);
      y localy;
      if ("com.google.firebase.MESSAGING_EVENT".equals(paramString))
      {
        if (bvA == null)
        {
          localy = new com/google/firebase/iid/y;
          localy.<init>(paramContext, paramString);
          bvA = localy;
        }
        paramContext = bvA;
        AppMethodBeat.o(108709);
      }
      while (true)
      {
        return paramContext;
        if (bvz == null)
        {
          localy = new com/google/firebase/iid/y;
          localy.<init>(paramContext, paramString);
          bvz = localy;
        }
        paramContext = bvz;
        AppMethodBeat.o(108709);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(108707);
    if (paramIntent == null)
      AppMethodBeat.o(108707);
    while (true)
    {
      return;
      Parcelable localParcelable = paramIntent.getParcelableExtra("wrapped_intent");
      if ((localParcelable instanceof Intent))
      {
        a(paramContext, (Intent)localParcelable, paramIntent.getAction());
        AppMethodBeat.o(108707);
      }
      else
      {
        a(paramContext, paramIntent, paramIntent.getAction());
        AppMethodBeat.o(108707);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.FirebaseInstanceIdReceiver
 * JD-Core Version:    0.6.2
 */