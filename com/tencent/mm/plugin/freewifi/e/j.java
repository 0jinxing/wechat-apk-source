package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class j extends e
  implements a
{
  String cvO;
  private com.tencent.mm.plugin.freewifi.a mwL;
  private int mwR;
  String mxc;
  String openId;
  String sign;

  public j(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    AppMethodBeat.i(20860);
    this.mwR = 0;
    this.openId = this.intent.getStringExtra("free_wifi_openid");
    this.mxc = this.intent.getStringExtra("free_wifi_tid");
    this.cvO = this.intent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_TIMESTAMP");
    this.sign = this.intent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_SIGN");
    ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, desc=Data retrieved. openId=%s, tid=%s, timestamp=%s, sign=%s", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), this.openId, this.mxc, this.cvO, this.sign });
    AppMethodBeat.o(20860);
  }

  private void aI(int paramInt, String paramString)
  {
    AppMethodBeat.i(20862);
    k.a locala = k.byo();
    locala.ssid = this.ssid;
    locala.bssid = m.My("MicroMsg.FreeWifi.Protocol32");
    locala.cuI = m.Mz("MicroMsg.FreeWifi.Protocol32");
    locala.cuH = this.cuH;
    locala.mud = this.appId;
    locala.kBq = m.V(this.intent);
    locala.mue = 32;
    locala.muf = k.b.muH.muQ;
    locala.mug = k.b.muH.name;
    locala.result = paramInt;
    locala.ehr = paramString;
    locala.cIb = m.Y(this.intent);
    locala.byq().byp();
    AppMethodBeat.o(20862);
  }

  public final void connect()
  {
    AppMethodBeat.i(20861);
    this.mwL = new com.tencent.mm.plugin.freewifi.a(this.ssid, this.mwF);
    com.tencent.mm.plugin.freewifi.model.j.byZ().byI().post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(20845);
        j.a(j.this);
        AppMethodBeat.o(20845);
      }
    });
    AppMethodBeat.o(20861);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.j
 * JD-Core Version:    0.6.2
 */