package com.tencent.mm.plugin.music.model.notification;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.e.e;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.f.a.d;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public class MMMusicPlayerService extends Service
{
  a oMS;
  Runnable oMT;

  public MMMusicPlayerService()
  {
    AppMethodBeat.i(104992);
    this.oMT = new MMMusicPlayerService.1(this);
    AppMethodBeat.o(104992);
  }

  public final void c(com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(104995);
    ab.i("MicroMsg.Music.MMMusicPlayerService", "play");
    if (parama == null)
    {
      ab.e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
      AppMethodBeat.o(104995);
    }
    while (true)
    {
      return;
      al.af(this.oMT);
      this.oMS.c(parama);
      AppMethodBeat.o(104995);
    }
  }

  public final void d(com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(104996);
    ab.i("MicroMsg.Music.MMMusicPlayerService", "pause");
    if (parama == null)
    {
      ab.e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
      AppMethodBeat.o(104996);
    }
    while (true)
    {
      return;
      al.af(this.oMT);
      this.oMS.d(parama);
      AppMethodBeat.o(104996);
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(104999);
    paramIntent = new MMMusicPlayerService.a(this);
    AppMethodBeat.o(104999);
    return paramIntent;
  }

  public void onCreate()
  {
    AppMethodBeat.i(104993);
    super.onCreate();
    ab.i("MicroMsg.Music.MMMusicPlayerService", "onCreate");
    ab.i("MicroMsg.Music.MMMusicPlayerService", "init");
    this.oMS = new a();
    a locala = this.oMS;
    ab.i("MicroMsg.Music.MMMusicNotification", "init");
    locala.oMK = this;
    locala.oML = ((NotificationManager)getSystemService("notification"));
    locala.oMN = new a.2(locala);
    IntentFilter localIntentFilter = new IntentFilter("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
    registerReceiver(locala.oMN, localIntentFilter);
    locala.bZi = true;
    refresh();
    AppMethodBeat.o(104993);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104998);
    super.onDestroy();
    ab.i("MicroMsg.Music.MMMusicPlayerService", "onDestroy");
    a locala = this.oMS;
    ab.i("MicroMsg.Music.MMMusicNotification", "uninit");
    locala.oMK.unregisterReceiver(locala.oMN);
    locala.oMN = null;
    locala.oMK = null;
    locala.oML = null;
    locala.bZi = false;
    AppMethodBeat.o(104998);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 2;
  }

  final void refresh()
  {
    AppMethodBeat.i(104994);
    ab.i("MicroMsg.Music.MMMusicPlayerService", "initNotification");
    com.tencent.mm.plugin.music.model.e.a locala = ((e)b.ar(e.class)).bTU();
    if (locala == null)
    {
      ab.e("MicroMsg.Music.MMMusicPlayerService", "initNotification music is null, return");
      AppMethodBeat.o(104994);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(locala.field_protocol))
      {
        ab.e("MicroMsg.Music.MMMusicPlayerService", "exoplayer play audio, ingore");
        AppMethodBeat.o(104994);
      }
      else
      {
        d locald = k.bUf().bTS();
        if (locald == null)
        {
          ab.e("MicroMsg.Music.MMMusicPlayerService", "musicPlayer is null, return");
          AppMethodBeat.o(104994);
        }
        else if (locald.aie())
        {
          c(locala);
          AppMethodBeat.o(104994);
        }
        else if (locald.aif())
        {
          d(locala);
          AppMethodBeat.o(104994);
        }
        else
        {
          AppMethodBeat.o(104994);
        }
      }
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(104997);
    ab.i("MicroMsg.Music.MMMusicPlayerService", "stop");
    this.oMS.close();
    al.af(this.oMT);
    al.n(this.oMT, 60000L);
    AppMethodBeat.o(104997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService
 * JD-Core Version:    0.6.2
 */