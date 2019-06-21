package com.tencent.mm.plugin.freewifi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class m$2
  implements Runnable
{
  m$2(String paramString1, String paramString2, Intent paramIntent, int paramInt1, int paramInt2, m.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20626);
    Object localObject = k.byo();
    ((k.a)localObject).ssid = m.Mx(this.muT);
    ((k.a)localObject).bssid = m.My(this.muT);
    ((k.a)localObject).cuI = m.Mz(this.muT);
    ((k.a)localObject).cuH = this.muV;
    ((k.a)localObject).kBq = m.V(this.val$intent);
    ((k.a)localObject).mue = this.muj;
    ((k.a)localObject).muf = k.b.mur.muQ;
    ((k.a)localObject).mug = k.b.mur.name;
    ((k.a)localObject).cIb = m.Y(this.val$intent);
    ((k.a)localObject).result = 0;
    ((k.a)localObject).byq().byp();
    localObject = m.My(this.muT);
    String str = m.Mx(this.muT);
    int i = d.byL();
    ab.i(this.muT, "NetStatusUtil.getNetType(MMApplicationContext.getContext()) = " + at.getNetType(ah.getContext()));
    ab.i(this.muT, "sessionKey=%s, step=%d, method=getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPage]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { m.V(this.val$intent), Integer.valueOf(m.W(this.val$intent)), this.muV, localObject, str, Integer.valueOf(i) });
    new a(this.muV, (String)localObject, str, i, this.muW, m.V(this.val$intent)).c(new m.2.1(this));
    AppMethodBeat.o(20626);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.m.2
 * JD-Core Version:    0.6.2
 */