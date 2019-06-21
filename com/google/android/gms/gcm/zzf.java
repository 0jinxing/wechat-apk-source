package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.BlockingQueue;

final class zzf extends Handler
{
  zzf(GoogleCloudMessaging paramGoogleCloudMessaging, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(70029);
    if (paramMessage != null)
      Object localObject = paramMessage.obj;
    paramMessage = (Intent)paramMessage.obj;
    if ("com.google.android.c2dm.intent.REGISTRATION".equals(paramMessage.getAction()))
    {
      GoogleCloudMessaging.zzd(this.zzai).add(paramMessage);
      AppMethodBeat.o(70029);
    }
    while (true)
    {
      return;
      if (!GoogleCloudMessaging.zzd(this.zzai, paramMessage))
      {
        paramMessage.setPackage(GoogleCloudMessaging.zze(this.zzai).getPackageName());
        GoogleCloudMessaging.zze(this.zzai).sendBroadcast(paramMessage);
      }
      AppMethodBeat.o(70029);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.zzf
 * JD-Core Version:    0.6.2
 */