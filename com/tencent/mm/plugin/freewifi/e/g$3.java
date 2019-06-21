package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class g$3
  implements f
{
  g$3(g paramg)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20815);
    ab.i("MicroMsg.FreeWifi.ProtocolOne", "errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = (a)paramm;
      paramString = paramm.bze();
      ab.i("MicroMsg.FreeWifi.ProtocolOne", "authUrl : %s", new Object[] { paramString });
      paramm = paramm.bzj();
      if (paramm != null)
      {
        ab.i("MicroMsg.FreeWifi.ProtocolOne", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramm.vEn, paramm.jCH, paramm.jBB, Integer.valueOf(paramm.vID), paramm.vIE, paramm.guQ });
        g localg = this.mwN;
        j.byZ().byI().post(new g.4(localg, paramString, paramm));
        AppMethodBeat.o(20815);
      }
    }
    while (true)
    {
      return;
      g.c(this.mwN);
      AppMethodBeat.o(20815);
      continue;
      g.c(this.mwN);
      AppMethodBeat.o(20815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.g.3
 * JD-Core Version:    0.6.2
 */