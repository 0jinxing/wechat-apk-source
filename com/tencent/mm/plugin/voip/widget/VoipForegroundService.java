package com.tencent.mm.plugin.voip.widget;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.voip.a.d;
import com.tencent.mm.plugin.voip.ui.VideoActivity;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public class VoipForegroundService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    AppMethodBeat.i(5165);
    ab.i("MicroMsg.VoipForegroundService", "VoipForegroundService onCreate");
    if (com.tencent.luggage.g.b.yj())
    {
      v.c localc = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").j(System.currentTimeMillis()).as(b.bWV());
      localc.k(2, true);
      startForeground(40, d.c(localc));
    }
    AppMethodBeat.o(5165);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(5166);
    ab.i("MicroMsg.VoipForegroundService", "VoipForegroundService onDestroy");
    ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
    stopForeground(true);
    AppMethodBeat.o(5166);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5164);
    String str;
    Object localObject;
    if ((com.tencent.luggage.g.b.yj()) && (paramIntent != null))
    {
      ab.i("MicroMsg.VoipForegroundService", "foreground service is on bind MicroMsg.VoipForegroundService" + paramIntent.hasFileDescriptors());
      paramIntent.setClass(ah.getContext(), VideoActivity.class);
      str = paramIntent.getStringExtra("Voip_User");
      if (paramIntent.getBooleanExtra("Voip_VideoCall", false))
        break label206;
      if (paramIntent.getStringExtra("mTickerText") != null)
        break label195;
      localObject = ah.getContext().getString(2131304490);
    }
    while (true)
    {
      ab.i("MicroMsg.VoipForegroundService", "voip notification type is 40");
      paramIntent = PendingIntent.getActivity(ah.getContext(), 40, paramIntent, 134217728);
      localObject = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g((CharSequence)localObject).j(System.currentTimeMillis()).d(s.mJ(str)).e((CharSequence)localObject).as(b.bWV());
      ((v.c)localObject).EI = paramIntent;
      ((v.c)localObject).k(2, true);
      paramIntent = d.c((v.c)localObject);
      ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().a(40, paramIntent, false);
      AppMethodBeat.o(5164);
      return 2;
      label195: localObject = paramIntent.getStringExtra("mTickerText");
      continue;
      label206: localObject = ah.getContext().getString(2131304482);
    }
  }

  public void onTaskRemoved(Intent paramIntent)
  {
    AppMethodBeat.i(138296);
    super.onTaskRemoved(paramIntent);
    ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
    stopSelf();
    AppMethodBeat.o(138296);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.VoipForegroundService
 * JD-Core Version:    0.6.2
 */