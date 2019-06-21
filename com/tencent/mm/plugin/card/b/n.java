package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ii;
import com.tencent.mm.g.a.ii.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.bi;

public final class n extends c<ii>
  implements f
{
  private long cuQ;

  public n()
  {
    AppMethodBeat.i(87766);
    this.cuQ = 0L;
    this.xxI = ii.class.getName().hashCode();
    AppMethodBeat.o(87766);
  }

  private boolean a(ii paramii)
  {
    AppMethodBeat.i(87768);
    String str;
    if ((paramii instanceof ii))
    {
      Object localObject = paramii.cDs.cDt;
      this.cuQ = paramii.cDs.cuQ;
      str = paramii.cDs.cDu;
      paramii = com.tencent.mm.plugin.card.d.g.Hi((String)localObject);
      localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.cuQ);
      ((bi)localObject).setStatus(1);
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.cuQ, (bi)localObject);
      if (paramii != null)
        break label173;
      paramii = com.tencent.mm.plugin.card.d.g.Hi(((cy)localObject).field_content);
    }
    label173: 
    while (true)
    {
      if (paramii != null)
      {
        com.tencent.mm.kernel.g.RO().eJo.a(652, this);
        paramii = new af(paramii.cMC, str, 17);
        com.tencent.mm.kernel.g.RO().eJo.a(paramii, 0);
      }
      AppMethodBeat.o(87768);
      for (boolean bool = true; ; bool = false)
      {
        return bool;
        AppMethodBeat.o(87768);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87767);
    String str;
    if ((paramm instanceof af))
    {
      str = ((af)paramm).cMD;
      paramm = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(this.cuQ);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label160;
      paramm.setStatus(2);
    }
    while (true)
    {
      paramString = j.b.me(paramm.field_content);
      d locald = com.tencent.mm.plugin.card.d.g.Hi(paramm.field_content);
      locald.cMD = str;
      paramString.fhB = com.tencent.mm.plugin.card.d.g.a(locald);
      paramString.cDt = j.b.a(paramString, null, null);
      paramm.setContent(j.b.a(paramString, null, null));
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.cuQ, paramm);
      com.tencent.mm.kernel.g.RO().eJo.b(652, this);
      AppMethodBeat.o(87767);
      return;
      label160: paramm.setStatus(5);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.n
 * JD-Core Version:    0.6.2
 */