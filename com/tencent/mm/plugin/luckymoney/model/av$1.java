package com.tencent.mm.plugin.luckymoney.model;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.vg;
import com.tencent.mm.g.a.vg.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class av$1 extends c<vg>
{
  av$1(av paramav)
  {
    AppMethodBeat.i(42425);
    this.xxI = vg.class.getName().hashCode();
    AppMethodBeat.o(42425);
  }

  private boolean a(vg paramvg)
  {
    AppMethodBeat.i(42426);
    if ((paramvg instanceof vg))
      switch (paramvg.cSe.action)
      {
      default:
      case 1:
      }
    label259: 
    while (true)
    {
      AppMethodBeat.o(42426);
      return false;
      av localav = this.nZw;
      long l = paramvg.cSe.cuQ;
      if (!localav.nZr)
      {
        localav.nZr = true;
        bi localbi = ((j)g.K(j.class)).bOr().jf(l);
        paramvg = localbi.field_content;
        if (paramvg != null);
        for (paramvg = j.b.X(paramvg, localbi.field_reserved); ; paramvg = null)
        {
          if (paramvg == null)
            break label259;
          paramvg = bo.nullAsNil(paramvg.fhZ);
          Uri localUri = Uri.parse(paramvg);
          String str = localUri.getQueryParameter("sendid");
          int i = bo.getInt(localUri.getQueryParameter("channelid"), 1);
          if (localav.nZs != null)
          {
            g.RQ();
            g.RO().eJo.c(localav.nZs);
            localav.nZs = null;
          }
          g.RQ();
          g.RO().eJo.a(1581, localav);
          localav.nZs = new aq(i, str, paramvg, 3, "v1.0");
          localav.nZs.talker = localbi.field_talker;
          localav.nZs.cvx = l;
          g.RQ();
          g.RO().eJo.a(localav.nZs, 0);
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.av.1
 * JD-Core Version:    0.6.2
 */