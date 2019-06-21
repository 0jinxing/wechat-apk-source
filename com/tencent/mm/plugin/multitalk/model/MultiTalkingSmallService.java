package com.tencent.mm.plugin.multitalk.model;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.luggage.g.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class MultiTalkingSmallService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(54081);
    ab.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onBind");
    paramIntent = (Notification)paramIntent.getParcelableExtra("notification");
    if ((b.yj()) && (paramIntent != null))
      startForeground(43, paramIntent);
    AppMethodBeat.o(54081);
    return null;
  }

  public void onCreate()
  {
    AppMethodBeat.i(54083);
    ab.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onCreate");
    AppMethodBeat.o(54083);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54084);
    ab.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onDestroy");
    AppMethodBeat.o(54084);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(54082);
    ab.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onUnbind");
    stopSelf();
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(54082);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.MultiTalkingSmallService
 * JD-Core Version:    0.6.2
 */