package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeTwoUI$9
  implements com.tencent.mm.plugin.freewifi.a.a
{
  ProtocolThreeTwoUI$9(ProtocolThreeTwoUI paramProtocolThreeTwoUI)
  {
  }

  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(21189);
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=connect, desc=An attempt to connect to ssid failed. ssid=%s, errCode=%d", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())), this.mAD.ssid, Integer.valueOf(paramInt) });
    d.a(this.mAD.ssid, 3, this.mAD.getIntent());
    k.a locala = k.byo();
    locala.ssid = this.mAD.ssid;
    locala.bssid = m.My("MicroMsg.FreeWifi.Protocol32UI");
    locala.cuI = m.Mz("MicroMsg.FreeWifi.Protocol32UI");
    locala.cuH = ProtocolThreeTwoUI.e(this.mAD);
    locala.mud = this.mAD.csB;
    locala.kBq = m.V(ProtocolThreeTwoUI.d(this.mAD));
    locala.mue = m.X(ProtocolThreeTwoUI.d(this.mAD));
    locala.muf = k.b.muq.muQ;
    locala.mug = k.b.muq.name;
    locala.result = paramInt;
    locala.cIb = m.Y(ProtocolThreeTwoUI.d(this.mAD));
    locala.muh = this.mAD.cBb;
    locala.byq().byp();
    AppMethodBeat.o(21189);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(21188);
    Object localObject = k.byo();
    ((k.a)localObject).ssid = this.mAD.ssid;
    ((k.a)localObject).bssid = m.My("MicroMsg.FreeWifi.Protocol32UI");
    ((k.a)localObject).cuI = m.Mz("MicroMsg.FreeWifi.Protocol32UI");
    ((k.a)localObject).cuH = ProtocolThreeTwoUI.e(this.mAD);
    ((k.a)localObject).mud = this.mAD.csB;
    ((k.a)localObject).kBq = m.V(ProtocolThreeTwoUI.d(this.mAD));
    ((k.a)localObject).mue = m.X(ProtocolThreeTwoUI.d(this.mAD));
    ((k.a)localObject).muf = k.b.muq.muQ;
    ((k.a)localObject).mug = k.b.muq.name;
    ((k.a)localObject).result = 0;
    ((k.a)localObject).cIb = m.Y(ProtocolThreeTwoUI.d(this.mAD));
    ((k.a)localObject).muh = this.mAD.cBb;
    ((k.a)localObject).byq().byp();
    String str = h.b.bym().byl();
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=connect, desc=An attempt to connect to ssid succeeded and then tries to access blackUrl. ssid=%s, blackUrl = %s", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())), this.mAD.ssid, str });
    localObject = new ProtocolThreeTwoUI.9.1(this, str);
    a.byw();
    a.a(str, (com.tencent.mm.plugin.freewifi.a.a.a)localObject);
    AppMethodBeat.o(21188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.9
 * JD-Core Version:    0.6.2
 */