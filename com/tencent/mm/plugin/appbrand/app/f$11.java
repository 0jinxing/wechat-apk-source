package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.aj;
import com.tencent.mm.plugin.appbrand.appusage.a.g;
import com.tencent.mm.plugin.appbrand.appusage.j;
import com.tencent.mm.plugin.appbrand.appusage.j.1;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.auth.a.a;
import com.tencent.mm.protocal.j.a;
import com.tencent.mm.protocal.j.d;
import com.tencent.mm.protocal.j.e;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.platformtools.al;

final class f$11
  implements a
{
  f$11(f paramf)
  {
  }

  public final void a(j.f paramf, j.g paramg, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(129251);
    if ((paramg != null) && ((paramg instanceof j.e)))
    {
      paramg = j.axh();
      m.aNS().aa(new j.1(paramg));
      aj.dC(true);
    }
    if ((paramBoolean) && ((paramf instanceof j.a)) && (paramf.vyf == 12));
    for (int j = 1; ; j = 0)
    {
      if (j != 0)
        aj.dC(true);
      if ((!(paramf instanceof j.d)) || (paramf.vyf != 1))
      {
        j = i;
        if ((paramf instanceof j.a))
        {
          j = i;
          if (paramf.vyf != 12);
        }
      }
      else
      {
        j = 1;
      }
      if (j != 0)
        g.dF(true);
      AppMethodBeat.o(129251);
      return;
    }
  }

  public final void a(v.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.f.11
 * JD-Core Version:    0.6.2
 */