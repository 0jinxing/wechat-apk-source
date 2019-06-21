package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import java.util.Set;

final class a$a$1
  implements c.a
{
  a$a$1(a.a parama)
  {
  }

  public final void b(Addr paramAddr)
  {
    AppMethodBeat.i(113299);
    a.a locala = this.nJE;
    bi localbi;
    int i;
    boolean bool;
    Object localObject;
    if ((paramAddr.tag != null) && ((paramAddr.tag instanceof Long)))
    {
      long l = ((Long)paramAddr.tag).longValue();
      localbi = ((j)g.K(j.class)).bOr().jf(l);
      if (!bo.isNullOrNil(paramAddr.fBg))
      {
        String str = localbi.field_content;
        if (localbi.field_isSend != 0)
          break label578;
        i = 1;
        bool = t.kH(localbi.field_talker);
        localObject = str;
        if (bool)
        {
          localObject = str;
          if (i != 0)
          {
            int j = bf.ox(str);
            localObject = str;
            if (j != -1)
              localObject = str.substring(j + 1).trim();
          }
        }
        localObject = bi.b.apD((String)localObject);
        ((bi.b)localObject).label = paramAddr.agv();
        if ((!bool) || (i == 0))
          break label590;
        i = bf.ox(localbi.field_content);
        if (i == -1)
          break label590;
        paramAddr = localbi.field_content.substring(0, i).trim();
        if (paramAddr.length() <= 0)
          break label590;
      }
    }
    while (true)
    {
      if ((((bi.b)localObject).xZt == null) || (((bi.b)localObject).xZt.equals("")))
        ((bi.b)localObject).xZt = "";
      if ((((bi.b)localObject).xZs == null) || (((bi.b)localObject).xZs.equals("")))
        ((bi.b)localObject).xZt = "";
      if ((((bi.b)localObject).xZr == null) || (((bi.b)localObject).xZr.equals("")))
        ((bi.b)localObject).xZr = "";
      if ((((bi.b)localObject).svN == null) || (((bi.b)localObject).svN.equals("")))
        ((bi.b)localObject).svN = "";
      if ((((bi.b)localObject).label == null) || (((bi.b)localObject).label.equals("")))
        ((bi.b)localObject).label = "";
      if ((((bi.b)localObject).xZq == null) || (((bi.b)localObject).xZq.equals("")))
        ((bi.b)localObject).xZq = "";
      localObject = "<msg><location x=\"" + ((bi.b)localObject).nJu + "\" y=\"" + ((bi.b)localObject).nJv + "\" scale=\"" + ((bi.b)localObject).cED + "\" label=\"" + ((bi.b)localObject).label + "\" maptype=\"" + ((bi.b)localObject).xZq + "\"  fromusername=\"" + ((bi.b)localObject).svN + "\" /></msg>";
      if ((bool) && (!paramAddr.equals("")));
      for (paramAddr = paramAddr + ":\n" + (String)localObject; ; paramAddr = (Addr)localObject)
      {
        ab.d("MicroMsg.LocationServer", "xml: ".concat(String.valueOf(paramAddr)));
        localbi.setContent(paramAddr);
        ((j)g.K(j.class)).bOr().a(localbi.field_msgId, localbi);
        locala.nJC.remove(Long.valueOf(localbi.field_msgId));
        AppMethodBeat.o(113299);
        return;
        label578: i = 0;
        break;
      }
      label590: paramAddr = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.a.a.1
 * JD-Core Version:    0.6.2
 */