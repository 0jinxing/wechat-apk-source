package com.tencent.mm.az;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.messenger.foundation.a.a.g.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bhq;
import com.tencent.mm.protocal.protobuf.bhr;
import com.tencent.mm.protocal.protobuf.bhs;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a$1
  implements f
{
  a$1(a parama, j.b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    paramInt1 = -1;
    AppMethodBeat.i(983);
    if (paramm.getType() != 681)
      AppMethodBeat.o(983);
    while (true)
    {
      return;
      if (((b)paramm).fLr == null)
      {
        AppMethodBeat.o(983);
      }
      else
      {
        paramString = ((b.c)((b)paramm).fLr.fLu).fLw;
        paramInt2 = ((tb)((b.b)((b)paramm).fLr.acF()).fLv.wIw.jBw.getLast()).wat;
        if ((paramString == null) || (paramString.wKS == null) || (paramString.wKS.wof == null))
        {
          paramString = (List)this.fLq.fLo.get(paramInt2);
          if (paramString != null)
          {
            paramString = paramString.iterator();
            while (paramString.hasNext())
              ((g.a)paramString.next()).a(-1, this.fLp);
          }
          AppMethodBeat.o(983);
        }
        else
        {
          if (paramString.wKS.wof.size() > 0)
            paramInt1 = ((Integer)paramString.wKS.wof.getLast()).intValue();
          if (paramString.wKS.wKT.size() > 0)
            paramString.wKS.wKT.getLast();
          if (paramString.wKS.wKT.size() > 0)
            paramString.wKS.wKT.getLast();
          paramString = (List)this.fLq.fLo.get(paramInt2);
          if (paramString != null)
          {
            paramString = paramString.iterator();
            while (paramString.hasNext())
              ((g.a)paramString.next()).a(paramInt1, this.fLp);
          }
          AppMethodBeat.o(983);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.a.1
 * JD-Core Version:    0.6.2
 */