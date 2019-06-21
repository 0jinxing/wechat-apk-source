package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cwj;
import com.tencent.mm.protocal.protobuf.cwk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class aj$2
  implements w.a
{
  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(129413);
    h.pYm.a(368L, 40L, 1L, false);
    if (g.RK())
    {
      long l = bo.anT();
      g.RP().Ry().set(ac.a.xNS, Long.valueOf(86400L + l));
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.WxaCommLibVersionChecker", "onResp, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(129413);
    }
    while (true)
    {
      return 0;
      try
      {
        aj.b(((cwj)paramb.fsG.fsP).version, (cwk)paramb.fsH.fsP, aj.a.gTL);
        AppMethodBeat.o(129413);
      }
      catch (RuntimeException paramString)
      {
        while (true)
          ab.e("MicroMsg.WxaCommLibVersionChecker", "onResp, e %s", new Object[] { paramString });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.aj.2
 * JD-Core Version:    0.6.2
 */