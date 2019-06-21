package com.tencent.mm.plugin.voip.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.sdk.platformtools.ab;

public class VoipMgr$NetChangedBroadcastReceiver extends BroadcastReceiver
{
  public VoipMgr$NetChangedBroadcastReceiver(VoipMgr paramVoipMgr)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(4484);
    if (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
      switch (a.getNetType(paramContext))
      {
      default:
        AppMethodBeat.o(4484);
      case 5:
      case 4:
      }
    while (true)
    {
      return;
      if (VoipMgr.k(this.sSn) == 5)
        break;
      i = VoipMgr.cJP()[1];
      if (VoipMgr.l(this.sSn) == 0)
        VoipMgr.c(this.sSn, 4);
      int k = VoipMgr.aSQ() / VoipMgr.l(this.sSn);
      VoipMgr.c(this.sSn, 5);
      int m = VoipMgr.cJP()[0];
      ab.i("MicroMsg.Voip.VoipMgr", "befor change to 4G and cost " + VoipMgr.m(this.sSn));
      if (VoipMgr.b(this.sSn));
      while (true)
      {
        a.a(j, System.currentTimeMillis(), VoipMgr.k(this.sSn), 5, i, m, k);
        VoipMgr.n(this.sSn);
        VoipMgr.d(this.sSn, 5);
        VoipMgr.cJQ();
        VoipMgr.o(this.sSn);
        AppMethodBeat.o(4484);
        break;
        j = 1;
      }
      if (VoipMgr.k(this.sSn) == 4)
        break;
      m = VoipMgr.cJP()[0];
      if (VoipMgr.l(this.sSn) == 0)
        VoipMgr.c(this.sSn, 5);
      k = VoipMgr.aSQ() / VoipMgr.l(this.sSn);
      VoipMgr.c(this.sSn, 4);
      int n = VoipMgr.cJP()[1];
      ab.i("MicroMsg.Voip.VoipMgr", "befor change to wifi and cost " + VoipMgr.m(this.sSn));
      if (VoipMgr.b(this.sSn));
      for (j = i; ; j = 1)
      {
        a.a(j, System.currentTimeMillis(), VoipMgr.k(this.sSn), 4, m, n, k);
        VoipMgr.n(this.sSn);
        VoipMgr.d(this.sSn, 4);
        VoipMgr.cJQ();
        VoipMgr.o(this.sSn);
        break;
      }
      if ((paramIntent.getAction().equals("android.net.wifi.STATE_CHANGE")) && (VoipMgr.p(this.sSn) == 0L))
      {
        VoipMgr.a(this.sSn, System.currentTimeMillis());
        AppMethodBeat.o(4484);
      }
      else
      {
        if ((paramIntent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) && (VoipMgr.p(this.sSn) != 0L))
        {
          VoipMgr.b(this.sSn, System.currentTimeMillis() - VoipMgr.p(this.sSn));
          VoipMgr.a(this.sSn, 0L);
        }
        AppMethodBeat.o(4484);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.NetChangedBroadcastReceiver
 * JD-Core Version:    0.6.2
 */