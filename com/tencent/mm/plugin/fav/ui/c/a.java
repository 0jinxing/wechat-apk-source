package com.tencent.mm.plugin.fav.ui.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ge;
import com.tencent.mm.g.a.ge.a;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends c<ge>
{
  private l mhy;
  private com.tencent.mm.sdk.platformtools.ae<Long, com.tencent.mm.plugin.fav.a.g> moD;

  public a()
  {
    AppMethodBeat.i(74609);
    this.moD = new com.tencent.mm.sdk.platformtools.ae(10);
    this.xxI = ge.class.getName().hashCode();
    AppMethodBeat.o(74609);
  }

  private boolean a(ge paramge)
  {
    AppMethodBeat.i(74610);
    com.tencent.mm.plugin.fav.a.g localg1;
    com.tencent.mm.plugin.fav.a.g localg2;
    if (paramge.cAt.cvv != 0L)
      if (paramge.cAt.cAA)
      {
        localg1 = ((com.tencent.mm.plugin.fav.a.ae)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fav.a.ae.class)).getFavItemInfoStorage().iE(paramge.cAt.cvv);
        localg2 = localg1;
        if (localg1 != null)
        {
          this.moD.put(Long.valueOf(paramge.cAt.cvv), localg1);
          localg2 = localg1;
        }
      }
    while (true)
    {
      ab.d("MicroMsg.FavImageServiceListener", "image serivce callback type %d, localId %d", new Object[] { Integer.valueOf(paramge.cAt.opType), Long.valueOf(paramge.cAt.cvv) });
      if ((localg2 == null) && (paramge.cAt.opType != 3) && (paramge.cAt.opType != 4))
      {
        AppMethodBeat.o(74610);
        return false;
        localg2 = (com.tencent.mm.plugin.fav.a.g)this.moD.get(Long.valueOf(paramge.cAt.cvv));
        if (localg2 == null);
        for (boolean bool = true; ; bool = false)
        {
          ab.d("MicroMsg.FavImageServiceListener", "get item from cache itemInfo is null? %B", new Object[] { Boolean.valueOf(bool) });
          if (localg2 != null)
            break label551;
          localg1 = ((com.tencent.mm.plugin.fav.a.ae)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fav.a.ae.class)).getFavItemInfoStorage().iE(paramge.cAt.cvv);
          localg2 = localg1;
          if (localg1 == null)
            break;
          this.moD.put(Long.valueOf(paramge.cAt.cvv), localg1);
          localg2 = localg1;
          break;
        }
      }
      switch (paramge.cAt.opType)
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      case 4:
      }
      while (true)
      {
        AppMethodBeat.o(74610);
        break;
        paramge.cAu.cAB = l.a(paramge.cAt.cAv, localg2);
        continue;
        ab.d("MicroMsg.FavImageServiceListener", "get img from Cache %s", new Object[] { Boolean.valueOf(paramge.cAt.cAy) });
        if (paramge.cAt.cAy)
        {
          paramge.cAu.cAB = l.j(paramge.cAt.cAv);
        }
        else
        {
          paramge.cAu.cAB = l.b(paramge.cAt.cAv, localg2, paramge.cAt.maxWidth);
          continue;
          if (this.mhy == null)
          {
            ab.w("MicroMsg.FavImageServiceListener", "imageServer is null");
          }
          else
          {
            this.mhy.b(paramge.cAt.cAw, paramge.cAt.cAv, localg2, paramge.cAt.cAx, paramge.cAt.width, paramge.cAt.height);
            continue;
            ab.d("MicroMsg.FavImageServiceListener", "create image server");
            if (this.mhy != null)
              this.mhy.destory();
            this.mhy = new l(paramge.cAt.context, 16);
            continue;
            ab.d("MicroMsg.FavImageServiceListener", "destroy image server");
            if (this.mhy != null)
            {
              this.mhy.destory();
              this.mhy = null;
            }
          }
        }
      }
      label551: continue;
      localg2 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.c.a
 * JD-Core Version:    0.6.2
 */