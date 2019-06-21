package com.tencent.mm.plugin.music.model.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.e.e;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class a$2 extends BroadcastReceiver
{
  a$2(a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(104972);
    if ((paramIntent == null) || (bo.isNullOrNil(paramIntent.getAction())))
      AppMethodBeat.o(104972);
    while (true)
    {
      return;
      String str = paramIntent.getStringExtra("mm_music_notification_action_key");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.Music.MMMusicNotification", "action is null, err, return");
        AppMethodBeat.o(104972);
      }
      else
      {
        ab.i("MicroMsg.Music.MMMusicNotification", "action:%s", new Object[] { str });
        paramIntent = k.bUf().bTS();
        if (paramIntent == null)
        {
          ab.e("MicroMsg.Music.MMMusicNotification", "musicPlayer is null, return");
          AppMethodBeat.o(104972);
        }
        else
        {
          paramContext = ((e)b.ar(e.class)).bTU();
          if (paramContext == null)
          {
            ab.e("MicroMsg.Music.MMMusicNotification", "music is null, return");
            AppMethodBeat.o(104972);
          }
          else if (str.equals("mm_music_notification_action_play"))
          {
            paramIntent.resume();
            com.tencent.mm.plugin.music.model.d.d.a(2, paramContext);
            AppMethodBeat.o(104972);
          }
          else if (str.equals("mm_music_notification_action_pause"))
          {
            paramIntent.bSN();
            k.bUh().bSK();
            com.tencent.mm.plugin.music.model.d.d.a(3, paramContext);
            AppMethodBeat.o(104972);
          }
          else
          {
            if (str.equals("mm_music_notification_action_pre"))
            {
              if (paramContext.field_musicType != 11)
                if (((e)b.ar(e.class)).getMode() == 2)
                  ((e)b.ar(e.class)).bTZ();
              while (true)
              {
                a.a(paramContext, 13, paramIntent.bSO());
                com.tencent.mm.plugin.music.model.d.d.a(1, paramContext);
                AppMethodBeat.o(104972);
                break;
                paramIntent.lP(0);
                paramIntent.resume();
                continue;
                k.bUf().ju(true);
              }
            }
            if (str.equals("mm_music_notification_action_next"))
            {
              if (paramContext.field_musicType != 11)
                if (((e)b.ar(e.class)).getMode() == 2)
                  ((e)b.ar(e.class)).bTY();
              while (true)
              {
                a.a(paramContext, 14, paramIntent.bSO());
                com.tencent.mm.plugin.music.model.d.d.a(4, paramContext);
                AppMethodBeat.o(104972);
                break;
                paramIntent.lP(0);
                paramIntent.resume();
                continue;
                k.bUf().ju(true);
              }
            }
            if (str.equals("mm_music_notification_action_close"))
            {
              al.d(this.oMO.oMM);
              paramIntent.stopPlay();
              com.tencent.mm.plugin.music.model.d.d.a(5, paramContext);
            }
            AppMethodBeat.o(104972);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.a.2
 * JD-Core Version:    0.6.2
 */