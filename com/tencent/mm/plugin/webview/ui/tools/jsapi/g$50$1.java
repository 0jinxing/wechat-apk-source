package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.model.l;
import com.tencent.mm.protocal.protobuf.afg;
import com.tencent.mm.protocal.protobuf.aua;
import com.tencent.mm.protocal.protobuf.auc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class g$50$1
  implements f
{
  g$50$1(g.50 param50, l paraml)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9106);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (afg)this.uHK.fAT.fsH.fsP;
      if (paramString.luT == 0)
      {
        paramString = paramString.wmG;
        paramm = new StringBuilder();
        Iterator localIterator = paramString.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (aua)localIterator.next();
          String str = ((aua)localObject).eCq + "," + ((aua)localObject).major;
          if (g.q(this.uHL.uHd).containsKey(str))
            paramString = (List)g.q(this.uHL.uHd).get(str);
          while (true)
          {
            paramString.add(localObject);
            paramm.append("{uuid:" + ((aua)localObject).eCq + ",major:" + ((aua)localObject).major + ",minors:[");
            localObject = ((aua)localObject).wxZ.iterator();
            while (((Iterator)localObject).hasNext())
            {
              paramString = (auc)((Iterator)localObject).next();
              paramm.append(paramString.wya + "-" + paramString.wyb + ",");
            }
            paramString = new ArrayList();
            g.q(this.uHL.uHd).put(str, paramString);
          }
          paramm.append("]},");
        }
        ab.d("MicroMsg.MsgHandler", "[MsgHandler][ibeacon check callback]" + paramm.toString());
      }
    }
    com.tencent.mm.kernel.g.Rg().b(1704, this);
    g.a(this.uHL.uHd, false);
    AppMethodBeat.o(9106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.50.1
 * JD-Core Version:    0.6.2
 */