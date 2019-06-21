package com.tencent.mm.plugin.talkroom.model;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class c
  implements d
{
  private ak mHandler;
  public String nMN;
  public boolean nNp;
  private Notification oHJ;
  public boolean sxP;
  private String sxQ;

  public c()
  {
    AppMethodBeat.i(25770);
    this.nMN = "";
    this.nNp = false;
    this.sxP = false;
    this.mHandler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(25770);
  }

  private static boolean cEl()
  {
    AppMethodBeat.i(25766);
    boolean bool;
    if (bo.isNullOrNil(b.cEh().syD))
    {
      ab.w("MicroMsg.TalkRoomDisplayMgr", "yy checkServer null");
      ab.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
      cEo();
      bool = false;
      AppMethodBeat.o(25766);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(25766);
    }
  }

  private void cEn()
  {
    AppMethodBeat.i(25772);
    if (!cEl())
      AppMethodBeat.o(25772);
    while (true)
    {
      return;
      if (this.oHJ != null)
        break;
      ab.e("MicroMsg.TalkRoomDisplayMgr", "yy updateNotify error no notification");
      AppMethodBeat.o(25772);
    }
    String str = h.aU(ah.getContext(), b.cEh().syD);
    if (b.cEh().syR);
    for (Object localObject1 = ah.getContext().getString(2131304006); ; localObject1 = ah.getContext().getString(2131304003, new Object[] { Integer.valueOf(b.cEh().bJF().size()) }))
    {
      Object localObject2 = com.tencent.mm.plugin.talkroom.a.gkF.BW();
      ((Intent)localObject2).putExtra("enter_chat_usrname", b.cEh().syD);
      localObject2 = PendingIntent.getActivity(ah.getContext(), 100, (Intent)localObject2, 268435456);
      localObject1 = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(this.sxQ).j(0L).d(str).e((CharSequence)localObject1);
      ((v.c)localObject1).EI = ((PendingIntent)localObject2);
      this.oHJ = ((v.c)localObject1).build();
      this.oHJ.icon = 2130840405;
      this.oHJ.flags = 32;
      aw.getNotification().a(100, this.oHJ, false);
      AppMethodBeat.o(25772);
      break;
    }
  }

  public static void cEo()
  {
    AppMethodBeat.i(25773);
    ab.v("MicroMsg.TalkRoomDisplayMgr", "yy cancelNotify");
    aw.getNotification().cancel(100);
    AppMethodBeat.o(25773);
  }

  public final void aU(String paramString1, String paramString2)
  {
    AppMethodBeat.i(25767);
    if (this.sxP)
      AppMethodBeat.o(25767);
    while (true)
    {
      return;
      cEn();
      AppMethodBeat.o(25767);
    }
  }

  public final void abt(String paramString)
  {
    AppMethodBeat.i(25771);
    if (!cEl())
      AppMethodBeat.o(25771);
    while (true)
    {
      return;
      ab.v("MicroMsg.TalkRoomDisplayMgr", "yy showNotify: ".concat(String.valueOf(paramString)));
      this.sxQ = paramString;
      this.oHJ = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(paramString).j(0L).build();
      this.oHJ.icon = 2130840405;
      this.oHJ.flags = 32;
      cEn();
      AppMethodBeat.o(25771);
    }
  }

  public final void akC()
  {
    this.nNp = false;
  }

  public final void akD()
  {
  }

  public final void akE()
  {
    AppMethodBeat.i(25768);
    ab.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
    cEo();
    AppMethodBeat.o(25768);
  }

  public final void akF()
  {
  }

  public final void akG()
  {
  }

  public final void akH()
  {
  }

  public final void cEm()
  {
    AppMethodBeat.i(25769);
    this.mHandler.post(new c.1(this));
    AppMethodBeat.o(25769);
  }

  public final void g(int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void l(String paramString, int paramInt1, int paramInt2)
  {
    this.nNp = false;
  }

  public final void mk(int paramInt)
  {
  }

  public final void tO(String paramString)
  {
    this.nMN = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.c
 * JD-Core Version:    0.6.2
 */