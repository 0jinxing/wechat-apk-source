package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.c.a;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class f$1$1
  implements c.a
{
  f$1$1(f.1 param1)
  {
  }

  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(20808);
    ab.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, method=connect, desc=An attempt to connect to ssid failed. ssid=%s, errCode=%d", new Object[] { m.V(this.mwK.mwJ.intent), Integer.valueOf(m.W(this.mwK.mwJ.intent)), this.mwK.mwJ.ssid, Integer.valueOf(paramInt) });
    Object localObject = k.byo();
    ((k.a)localObject).ssid = this.mwK.mwJ.ssid;
    ((k.a)localObject).bssid = m.My("MicroMsg.FreeWifi.ProtocolFour");
    ((k.a)localObject).cuI = m.Mz("MicroMsg.FreeWifi.ProtocolFour");
    ((k.a)localObject).cuH = this.mwK.mwJ.cuH;
    ((k.a)localObject).mud = this.mwK.mwJ.appId;
    ((k.a)localObject).kBq = m.V(this.mwK.mwJ.intent);
    ((k.a)localObject).mue = m.X(this.mwK.mwJ.intent);
    ((k.a)localObject).muf = k.b.muq.muQ;
    ((k.a)localObject).mug = k.b.muq.name;
    ((k.a)localObject).result = paramInt;
    ((k.a)localObject).cIb = m.Y(this.mwK.mwJ.intent);
    ((k.a)localObject).byq().byp();
    if (paramInt == -16)
    {
      this.mwK.mwJ.intent.setClass(this.mwK.mwJ.mwF.mController.ylL, FreeWifiCopyPwdUI.class);
      this.mwK.mwJ.mwF.finish();
      this.mwK.mwJ.mwF.startActivity(this.mwK.mwJ.intent);
      AppMethodBeat.o(20808);
    }
    while (true)
    {
      return;
      FreeWifiFrontPageUI.d locald;
      FreeWifiFrontPageUI.a locala;
      if ((paramInt == -14) || (paramInt == -18))
      {
        localObject = this.mwK.mwJ.mwF;
        locald = FreeWifiFrontPageUI.d.mzk;
        locala = new FreeWifiFrontPageUI.a();
        locala.myH = 2131300039;
        locala.myI = m.a(this.mwK.mwJ.mwG, k.b.muq, paramInt);
        ((FreeWifiFrontPageUI)localObject).a(locald, locala);
        AppMethodBeat.o(20808);
      }
      else
      {
        localObject = this.mwK.mwJ.mwF;
        locald = FreeWifiFrontPageUI.d.mzk;
        locala = new FreeWifiFrontPageUI.a();
        locala.myH = 2131300038;
        locala.myI = m.a(this.mwK.mwJ.mwG, k.b.muq, paramInt);
        ((FreeWifiFrontPageUI)localObject).a(locald, locala);
        AppMethodBeat.o(20808);
      }
    }
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(20807);
    ab.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, desc=connect ssid succeeded. ", new Object[] { m.V(this.mwK.mwJ.intent), Integer.valueOf(m.W(this.mwK.mwJ.intent)) });
    k.a locala = k.byo();
    locala.ssid = this.mwK.mwJ.ssid;
    locala.bssid = m.My("MicroMsg.FreeWifi.ProtocolFour");
    locala.cuI = m.Mz("MicroMsg.FreeWifi.ProtocolFour");
    locala.cuH = this.mwK.mwJ.cuH;
    locala.mud = this.mwK.mwJ.appId;
    locala.kBq = m.V(this.mwK.mwJ.intent);
    locala.mue = m.X(this.mwK.mwJ.intent);
    locala.muf = k.b.muq.muQ;
    locala.mug = k.b.muq.name;
    locala.result = 0;
    locala.cIb = m.Y(this.mwK.mwJ.intent);
    locala.byq().byp();
    m.a(this.mwK.mwJ.intent, this.mwK.mwJ.cuH, this.mwK.mwJ.mwG, this.mwK.mwJ.cdf, this.mwK.mwJ.mwF, "MicroMsg.FreeWifi.ProtocolFour");
    AppMethodBeat.o(20807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.f.1.1
 * JD-Core Version:    0.6.2
 */