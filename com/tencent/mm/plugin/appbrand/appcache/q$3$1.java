package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.cwk;

final class q$3$1
  implements f
{
  q$3$1(q.3 param3)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(129355);
    if ((paramm != null) && ((paramm.ftl instanceof com.tencent.mm.ai.b)))
    {
      paramString = (cwk)((com.tencent.mm.ai.b)paramm.ftl).fsH.fsP;
      paramInt1 = q.a(this.gSN.gSK);
      paramInt2 = paramString.version;
      paramString = new q.3.1.1(this);
      az.a(al.t("@LibraryAppId", paramInt1, paramInt2), paramString);
    }
    g.RO().eJo.b(1168, this);
    AppMethodBeat.o(129355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.q.3.1
 * JD-Core Version:    0.6.2
 */