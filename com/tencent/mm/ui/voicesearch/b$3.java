package com.tencent.mm.ui.voicesearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.a.f;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class b$3
  implements Runnable
{
  b$3(b paramb, m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35329);
    Object localObject1 = ((f)this.crb).bOj();
    ab.d("MicroMsg.SearchResultAdapter", "count " + ((buv)localObject1).wod);
    Object localObject2;
    if (((buv)localObject1).wod > 0)
    {
      localObject2 = ((buv)localObject1).woe.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (but)((Iterator)localObject2).next();
        if (t.kv(((but)localObject1).wBT))
        {
          if (b.f(this.zLA) == null)
            b.a(this.zLA, new LinkedList());
          b.f(this.zLA).add(localObject1);
        }
      }
    }
    String str = aa.a(((buv)localObject1).wcB);
    ab.d("MicroMsg.SearchResultAdapter", "user ".concat(String.valueOf(str)));
    if (bo.nullAsNil(str).length() > 0)
    {
      localObject2 = new but();
      ((but)localObject2).wcB = ((buv)localObject1).wcB;
      ((but)localObject2).wBT = ((buv)localObject1).wBT;
      ((but)localObject2).guQ = ((buv)localObject1).guQ;
      ((but)localObject2).wyX = ((buv)localObject1).wyX;
      ((but)localObject2).guS = ((buv)localObject1).guS;
      ((but)localObject2).guW = ((buv)localObject1).guW;
      ((but)localObject2).guP = ((buv)localObject1).guP;
      ((but)localObject2).guO = ((buv)localObject1).guO;
      ((but)localObject2).guN = ((buv)localObject1).guN;
      ((but)localObject2).wBU = ((buv)localObject1).wBU;
      ((but)localObject2).wBX = ((buv)localObject1).wBX;
      ((but)localObject2).wBV = ((buv)localObject1).wBV;
      ((but)localObject2).wBW = ((buv)localObject1).wBW;
      ((but)localObject2).wBZ = ((buv)localObject1).wBZ;
      o.acd().n(str, aa.a(((buv)localObject1).vEF));
      if (b.f(this.zLA) == null)
        b.a(this.zLA, new LinkedList());
      b.f(this.zLA).clear();
      if (t.kv(((but)localObject2).wBT))
        b.f(this.zLA).add(localObject2);
      ab.d("MicroMsg.SearchResultAdapter", "count " + b.f(this.zLA).size());
    }
    b.b(this.zLA, false);
    AppMethodBeat.o(35329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.b.3
 * JD-Core Version:    0.6.2
 */