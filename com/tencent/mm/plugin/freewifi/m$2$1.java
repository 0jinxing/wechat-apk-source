package com.tencent.mm.plugin.freewifi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.sdk.platformtools.ab;

final class m$2$1
  implements f
{
  m$2$1(m.2 param2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20625);
    ab.i(this.muY.muT, "sessionKey=%s, step=%d, desc=net request [apauth.getBackPage] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { m.V(this.muY.val$intent), Integer.valueOf(m.W(this.muY.val$intent)), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    k.a locala = k.byo();
    locala.ssid = m.Mx(this.muY.muT);
    locala.bssid = m.My(this.muY.muT);
    locala.cuI = m.Mz(this.muY.muT);
    locala.cuH = this.muY.muV;
    locala.kBq = m.V(this.muY.val$intent);
    locala.mue = m.X(this.muY.val$intent);
    locala.muf = k.b.muu.muQ;
    locala.mug = k.b.muu.name;
    locala.cIb = m.Y(this.muY.val$intent);
    locala.result = paramInt2;
    locala.ehr = paramString;
    locala.byq().b(this.muY.val$intent, true).byp();
    this.muY.muX.h(paramInt1, paramInt2, paramString, paramm);
    AppMethodBeat.o(20625);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.m.2.1
 * JD-Core Version:    0.6.2
 */