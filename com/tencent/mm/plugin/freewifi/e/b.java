package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  private static String TAG = "MicroMsg.FreeWifi.Protocol31Entry";

  public static void aa(Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(20802);
    if (paramIntent == null)
    {
      AppMethodBeat.o(20802);
      return;
    }
    Object localObject = paramIntent.getStringExtra("free_wifi_ap_key");
    int i;
    if (!m.isEmpty((String)localObject))
    {
      i = paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0);
      if (2 != i)
        break label383;
      i = 11;
    }
    while (true)
    {
      label49: paramIntent.putExtra("free_wifi_channel_id", i);
      paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 31);
      m.d(paramIntent, paramIntent.getStringExtra("free_wifi_schema_ticket"));
      paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID", m.V(paramIntent) + "_" + m.X(paramIntent) + "_" + m.Y(paramIntent) + "_" + System.currentTimeMillis());
      boolean bool2 = d.a.bzt().v(paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0), paramIntent.getStringExtra("free_wifi_ap_key"), paramIntent.getStringExtra("free_wifi_schema_ticket"));
      k.a locala = k.byo();
      locala.ssid = m.Mx(TAG);
      locala.bssid = m.My(TAG);
      locala.cuH = ((String)localObject);
      locala.kBq = paramIntent.getStringExtra("free_wifi_schema_ticket");
      locala.mue = m.X(paramIntent);
      locala.muf = k.b.muy.muQ;
      locala.mug = k.b.muy.name;
      locala.cIb = m.Y(paramIntent);
      if (bool2)
      {
        i = 0;
        label253: locala.result = i;
        localObject = locala.byq();
        if (bool2)
          break label410;
      }
      while (true)
      {
        ((k)localObject).b(paramIntent, bool1).byp();
        ab.i(TAG, "getLock = ".concat(String.valueOf(bool2)));
        m.MA("type=" + paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0) + ";getLock=" + bool2);
        if (bool2)
        {
          m.d(paramIntent, paramIntent.getStringExtra("free_wifi_schema_ticket"));
          paramIntent.setClass(ah.getContext(), FreeWifiNetCheckUI.class);
          paramIntent.addFlags(67108864);
          com.tencent.mm.bp.d.b(ah.getContext(), "freewifi", ".ui.FreeWifiEntryUI", paramIntent);
        }
        AppMethodBeat.o(20802);
        break;
        label383: if (3 == i)
        {
          i = 12;
          break label49;
        }
        if (4 != i)
          break label415;
        i = 13;
        break label49;
        i = -1;
        break label253;
        label410: bool1 = false;
      }
      label415: i = 1;
    }
  }

  public static b bzr()
  {
    AppMethodBeat.i(20801);
    b localb = b.a.bzs();
    AppMethodBeat.o(20801);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.b
 * JD-Core Version:    0.6.2
 */