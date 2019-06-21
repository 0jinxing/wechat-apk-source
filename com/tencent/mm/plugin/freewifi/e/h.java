package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class h extends e
  implements a
{
  private String mwQ;
  private int mwR;

  public h(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    AppMethodBeat.i(20829);
    this.mwR = 0;
    this.mwQ = this.intent.getStringExtra("free_wifi_portal_ap_info_authurl_with_params");
    ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, desc=Data retrieved. authUrlWithParams=%s", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), this.mwQ });
    AppMethodBeat.o(20829);
  }

  private void aH(int paramInt, String paramString)
  {
    AppMethodBeat.i(20831);
    Object localObject = k.byo();
    ((k.a)localObject).ssid = this.ssid;
    ((k.a)localObject).bssid = m.My("MicroMsg.FreeWifi.ProtocolThreeOne");
    ((k.a)localObject).cuI = m.Mz("MicroMsg.FreeWifi.ProtocolThreeOne");
    ((k.a)localObject).cuH = this.cuH;
    ((k.a)localObject).mud = this.appId;
    ((k.a)localObject).kBq = m.V(this.intent);
    ((k.a)localObject).mue = 31;
    ((k.a)localObject).muf = k.b.muG.muQ;
    ((k.a)localObject).mug = k.b.muG.name;
    ((k.a)localObject).result = paramInt;
    ((k.a)localObject).ehr = paramString;
    ((k.a)localObject).cIb = m.Y(this.intent);
    paramString = ((k.a)localObject).byq();
    localObject = this.intent;
    if (paramInt != 0);
    for (boolean bool = true; ; bool = false)
    {
      paramString.b((Intent)localObject, bool).byp();
      AppMethodBeat.o(20831);
      return;
    }
  }

  public final void connect()
  {
    AppMethodBeat.i(20830);
    ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.connect, desc=it starts connecting wifi by protocol 3.1. authUrlWithParams=%s", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), this.mwQ });
    String str = this.mwQ;
    j.byZ().byI().post(new h.1(this, str));
    AppMethodBeat.o(20830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.h
 * JD-Core Version:    0.6.2
 */