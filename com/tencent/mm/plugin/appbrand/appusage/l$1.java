package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.ari;
import com.tencent.mm.sdk.platformtools.ab;

final class l$1
  implements w.a
{
  l$1(l paraml)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(129557);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramb != null) && (paramb.fsH.fsP != null) && ((paramb.fsH.fsP instanceof ari)))
      l.a(this.gZn, (ari)paramb.fsH.fsP);
    while (true)
    {
      AppMethodBeat.o(129557);
      return 0;
      ab.e("MicroMsg.AppBrandLauncherListWAGameLogic", "doRequest() cgi return errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      l.a(this.gZn, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.l.1
 * JD-Core Version:    0.6.2
 */