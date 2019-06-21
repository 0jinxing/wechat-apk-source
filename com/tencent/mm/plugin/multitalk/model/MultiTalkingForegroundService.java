package com.tencent.mm.plugin.multitalk.model;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.v.c;
import com.tencent.luggage.g.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public class MultiTalkingForegroundService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(54077);
    ab.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onBind");
    if (b.yj())
    {
      ab.i("MicroMsg.MultiTalkingForegroundService", "foreground service is on bind MicroMsg.MultiTalkingForegroundService");
      String str = ah.getContext().getString(2131301521);
      Object localObject = ah.getContext().getString(2131301560);
      paramIntent = new Intent();
      paramIntent.setClass(ah.getContext(), MultiTalkMainUI.class);
      paramIntent = PendingIntent.getActivity(ah.getContext(), 43, paramIntent, 134217728);
      int i = 2130839733;
      if (com.tencent.mm.compatible.util.d.fP(19))
        i = 2130839731;
      localObject = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g((CharSequence)localObject).j(System.currentTimeMillis()).d(str).e((CharSequence)localObject);
      ((v.c)localObject).EI = paramIntent;
      paramIntent = com.tencent.mm.plugin.voip.a.d.c((v.c)localObject);
      paramIntent.icon = i;
      paramIntent.flags |= 32;
      ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().a(43, paramIntent, false);
      startForeground(43, paramIntent);
    }
    AppMethodBeat.o(54077);
    return null;
  }

  public void onCreate()
  {
    AppMethodBeat.i(54079);
    ab.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onCreate");
    AppMethodBeat.o(54079);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54080);
    ab.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onDestroy");
    AppMethodBeat.o(54080);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(54078);
    ab.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onUnbind");
    stopSelf();
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(54078);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.MultiTalkingForegroundService
 * JD-Core Version:    0.6.2
 */