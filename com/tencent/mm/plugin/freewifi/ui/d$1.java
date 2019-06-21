package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements c.a
{
  public final void Q(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(21005);
    try
    {
      String str1 = String.valueOf(paramFloat1);
      String str2 = String.valueOf(paramFloat2);
      c localc = j.byW().ML(com.tencent.mm.plugin.freewifi.model.d.byO());
      if (localc != null)
      {
        h.pYm.e(12073, new Object[] { localc.field_ssid, localc.field_mac, localc.field_url, localc.field_url, str2, str1 });
        ab.i("MicroMsg.FreeWifi.FreeWifiLocationReporter", "report location. ssid=%s, mac=%s, mp_url=%s, qrcode=%s, longtitued=%s, latitude=%s", new Object[] { localc.field_ssid, localc.field_mac, localc.field_url, localc.field_url, str1, str2 });
      }
      AppMethodBeat.o(21005);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiLocationReporter", "report location exception. " + localException.getMessage() + m.h(localException));
        AppMethodBeat.o(21005);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.d.1
 * JD-Core Version:    0.6.2
 */