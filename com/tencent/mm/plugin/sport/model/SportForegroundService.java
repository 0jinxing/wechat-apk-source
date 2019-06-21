package com.tencent.mm.plugin.sport.model;

import android.app.Notification.Builder;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

public class SportForegroundService extends Service
{
  private static boolean rPJ;
  private ak ilv;

  public static void cwA()
  {
    AppMethodBeat.i(93698);
    Intent localIntent;
    if ((d.iW(26)) && (rPJ))
    {
      ab.i("MicroMsg.Sport.SportForegroundService", "stopSportForegroundService");
      rPJ = false;
      localIntent = new Intent(ah.getContext(), SportForegroundService.class);
    }
    while (true)
    {
      try
      {
        ah.getContext().stopService(localIntent);
        AppMethodBeat.o(93698);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(93698);
    }
  }

  public static boolean cwB()
  {
    return rPJ;
  }

  public static void cwz()
  {
    AppMethodBeat.i(93697);
    Intent localIntent;
    if ((d.iW(26)) && (!rPJ))
    {
      ab.i("MicroMsg.Sport.SportForegroundService", "startSportForegroundService");
      rPJ = true;
      localIntent = new Intent(ah.getContext(), SportForegroundService.class);
    }
    while (true)
    {
      try
      {
        ah.getContext().startForegroundService(localIntent);
        AppMethodBeat.o(93697);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(93697);
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(93696);
    ab.i("MicroMsg.Sport.SportForegroundService", "onDestroy");
    if (this.ilv != null)
      this.ilv.removeCallbacksAndMessages(null);
    stopForeground(true);
    super.onDestroy();
    AppMethodBeat.o(93696);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93695);
    ab.i("MicroMsg.Sport.SportForegroundService", "onStartCommand %d", new Object[] { Integer.valueOf(paramInt2) });
    if (d.iW(26))
    {
      Notification.Builder localBuilder = new Notification.Builder(getApplicationContext(), "reminder_channel_id");
      localBuilder.setContentTitle(ah.getResources().getString(2131303895)).setWhen(System.currentTimeMillis());
      startForeground(419430, localBuilder.build());
      ab.i("MicroMsg.Sport.SportForegroundService", "onStartCommand startForeground");
      ((PluginSport)com.tencent.mm.kernel.g.M(PluginSport.class)).getPushSportStepDetector().cwj();
      this.ilv = new ak(Looper.getMainLooper());
      this.ilv.postDelayed(new SportForegroundService.1(this), 6000L);
    }
    paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
    AppMethodBeat.o(93695);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.SportForegroundService
 * JD-Core Version:    0.6.2
 */