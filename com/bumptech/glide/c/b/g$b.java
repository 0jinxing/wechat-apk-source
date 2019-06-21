package com.bumptech.glide.c.b;

import com.bumptech.glide.c.a;
import com.bumptech.glide.c.c.n.a;
import com.bumptech.glide.c.l;
import com.bumptech.glide.c.m;
import com.bumptech.glide.e;
import com.bumptech.glide.h.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class g$b<Z>
  implements h.a<Z>
{
  private final a aAL;

  g$b(g paramg, a parama)
  {
    this.aAL = parama;
  }

  public final u<Z> a(u<Z> paramu)
  {
    AppMethodBeat.i(91773);
    g localg = this.aAM;
    a locala = this.aAL;
    Class localClass = paramu.get().getClass();
    Object localObject1 = null;
    if (locala != a.ayG)
      localObject1 = localg.aAo.n(localClass);
    for (Object localObject2 = ((m)localObject1).a(localg.awi, paramu, localg.width, localg.height); ; localObject2 = paramu)
    {
      if (!paramu.equals(localObject2))
        paramu.recycle();
      int i;
      com.bumptech.glide.c.c localc;
      label158: Object localObject4;
      if (localg.aAo.awi.awj.awP.v(((u)localObject2).mK()) != null)
      {
        i = 1;
        if (i == 0)
          break label308;
        paramu = localg.aAo.awi.awj.awP.v(((u)localObject2).mK());
        if (paramu == null)
          break label286;
        localc = paramu.b(localg.aAd);
        Object localObject3 = localg.aAo;
        localObject4 = localg.aAB;
        localObject3 = ((f)localObject3).mo();
        int j = ((List)localObject3).size();
        i = 0;
        label189: if (i >= j)
          break label324;
        if (!((n.a)((List)localObject3).get(i)).azW.equals(localObject4))
          break label318;
        i = 1;
        label224: if (i != 0)
          break label330;
      }
      label286: label308: label318: label324: label330: for (boolean bool = true; ; bool = false)
      {
        localObject4 = localObject2;
        if (!localg.aAl.a(bool, locala, localc))
          break label443;
        if (paramu != null)
          break label336;
        paramu = new h.d(((u)localObject2).get().getClass());
        AppMethodBeat.o(91773);
        throw paramu;
        i = 0;
        break;
        paramu = new h.d(((u)localObject2).mK());
        AppMethodBeat.o(91773);
        throw paramu;
        localc = com.bumptech.glide.c.c.ayQ;
        paramu = null;
        break label158;
        i++;
        break label189;
        i = 0;
        break label224;
      }
      label336: switch (g.1.aAK[localc.ordinal()])
      {
      default:
        paramu = new IllegalArgumentException("Unknown strategy: ".concat(String.valueOf(localc)));
        AppMethodBeat.o(91773);
        throw paramu;
      case 1:
      case 2:
      }
      for (localObject1 = new c(localg.aAB, localg.aAb); ; localObject1 = new w(localg.aAo.awi.awk, localg.aAB, localg.aAb, localg.width, localg.height, (m)localObject1, localClass, localg.aAd))
      {
        localObject4 = t.d((u)localObject2);
        localObject2 = localg.aAs;
        ((g.c)localObject2).azP = ((com.bumptech.glide.c.h)localObject1);
        ((g.c)localObject2).aAN = paramu;
        ((g.c)localObject2).aAO = ((t)localObject4);
        label443: AppMethodBeat.o(91773);
        return localObject4;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.g.b
 * JD-Core Version:    0.6.2
 */