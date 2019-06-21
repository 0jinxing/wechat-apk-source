package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class FreeWifiStateUI$1
  implements ap.a
{
  FreeWifiStateUI$1(FreeWifiStateUI paramFreeWifiStateUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(21071);
    if (!bo.isNullOrNil(this.mAc.ssid))
    {
      FreeWifiStateUI.a(this.mAc, this.mAc.bzz());
      ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now auth time out, ssid is %s, the connect state is %d", new Object[] { this.mAc.ssid, Integer.valueOf(FreeWifiStateUI.a(this.mAc)) });
      FreeWifiStateUI.b(this.mAc).stopTimer();
      k.a locala = k.byo();
      locala.ssid = this.mAc.ssid;
      locala.cuH = this.mAc.cuH;
      locala.kBq = m.V(this.mAc.getIntent());
      locala.mue = m.X(this.mAc.getIntent());
      locala.muf = k.b.muq.muQ;
      locala.mug = k.b.muq.name;
      locala.result = -16;
      locala.cIb = m.Y(this.mAc.getIntent());
      locala.mud = this.mAc.csB;
      locala.muh = this.mAc.cBb;
      locala.byq().byp();
      if (FreeWifiStateUI.a(this.mAc) != 2)
      {
        this.mAc.bzD();
        this.mAc.bzB();
        d.a(this.mAc.ssid, 3, this.mAc.getIntent());
      }
    }
    AppMethodBeat.o(21071);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI.1
 * JD-Core Version:    0.6.2
 */