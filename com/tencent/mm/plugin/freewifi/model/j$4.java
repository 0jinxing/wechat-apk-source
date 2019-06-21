package com.tencent.mm.plugin.freewifi.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.freewifi.c.a;
import com.tencent.mm.plugin.freewifi.d.d;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;

final class j$4
  implements bz.a
{
  j$4(j paramj)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(20742);
    e locale = j.bzc();
    parama = parama.eAB;
    if (1 != i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 0))
      i.a.byn().ch("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 1);
    if ((parama == null) || (parama.vED == null))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "cmdAddMsg is null");
      AppMethodBeat.o(20742);
    }
    while (true)
    {
      return;
      String str = aa.a(parama.vED);
      ab.i("MicroMsg.FreeWifi.FreeWifiMessageService", "freewifi push message cmdAM.NewMsgId=%d, msgContent=%s", new Object[] { Long.valueOf(parama.ptF), str });
      if (m.isEmpty(str))
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "msgContent is empty. return.");
        AppMethodBeat.o(20742);
      }
      else
      {
        a locala = a.MB(str);
        if (locala == null)
        {
          ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "parse schemaMsg failed. return.");
          AppMethodBeat.o(20742);
        }
        else
        {
          str = m.Mz("MicroMsg.FreeWifi.FreeWifiMessageService");
          new d(m.Mx("MicroMsg.FreeWifi.FreeWifiMessageService"), m.My("MicroMsg.FreeWifi.FreeWifiMessageService"), str, locala.mvw, locala.mvt, locala.mvx, locala.ssid, locala.bssid).c(new e.1(locale, parama));
          AppMethodBeat.o(20742);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.j.4
 * JD-Core Version:    0.6.2
 */