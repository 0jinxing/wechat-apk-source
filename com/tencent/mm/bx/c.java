package com.tencent.mm.bx;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.p;
import com.tencent.mm.cache.ArtistCacheManager;
import com.tencent.mm.cache.g;
import java.util.Iterator;
import java.util.Stack;

public final class c
  implements p
{
  private com.tencent.mm.br.b cjc;

  public c(com.tencent.mm.br.b paramb)
  {
    this.cjc = paramb;
  }

  public final String AA()
  {
    AppMethodBeat.i(116367);
    String str = ((com.tencent.mm.cache.c)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciY)).kb("||")[1];
    AppMethodBeat.o(116367);
    return str;
  }

  public final int Ar()
  {
    AppMethodBeat.i(116356);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciY);
    int i;
    if (localc == null)
    {
      i = 0;
      AppMethodBeat.o(116356);
    }
    while (true)
    {
      return i;
      i = localc.Jk()[1];
      AppMethodBeat.o(116356);
    }
  }

  public final int As()
  {
    AppMethodBeat.i(116357);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciY);
    int i;
    if (localc == null)
    {
      AppMethodBeat.o(116357);
      i = 0;
    }
    while (true)
    {
      return i;
      i = localc.Jk()[0];
      AppMethodBeat.o(116357);
    }
  }

  public final int At()
  {
    AppMethodBeat.i(116358);
    g localg = (g)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciX);
    int i;
    if (localg == null)
    {
      AppMethodBeat.o(116358);
      i = 0;
    }
    while (true)
    {
      return i;
      i = localg.ac(false);
      AppMethodBeat.o(116358);
    }
  }

  public final int Au()
  {
    AppMethodBeat.i(116359);
    com.tencent.mm.cache.b localb = (com.tencent.mm.cache.b)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciW);
    int i;
    if (localb == null)
    {
      AppMethodBeat.o(116359);
      i = 0;
    }
    while (true)
    {
      return i;
      i = localb.ac(false);
      AppMethodBeat.o(116359);
    }
  }

  public final int Av()
  {
    AppMethodBeat.i(116360);
    int i = 0;
    Object localObject = (com.tencent.mm.cache.b)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciW);
    if (localObject != null)
      i = ((com.tencent.mm.cache.b)localObject).efs + 0;
    localObject = (g)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciX);
    int j = i;
    if (localObject != null)
      j = i + ((g)localObject).efs;
    AppMethodBeat.o(116360);
    return j;
  }

  public final boolean Aw()
  {
    boolean bool1 = false;
    AppMethodBeat.i(116362);
    com.tencent.mm.e.b localb = this.cjc.b(com.tencent.mm.api.e.ccL);
    boolean bool2 = bool1;
    if (localb != null)
    {
      bool2 = bool1;
      if (localb.CG() == com.tencent.mm.e.a.ciZ)
        if (((com.tencent.mm.e.c)localb).cjO <= 0)
          break label57;
    }
    label57: for (bool2 = true; ; bool2 = false)
    {
      AppMethodBeat.o(116362);
      return bool2;
    }
  }

  public final int Ax()
  {
    int i = 0;
    AppMethodBeat.i(116364);
    Object localObject = (com.tencent.mm.cache.b)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciW);
    if (localObject == null)
      AppMethodBeat.o(116364);
    while (true)
    {
      return i;
      localObject = ((com.tencent.mm.cache.b)localObject).efq;
      if (localObject != null)
      {
        Iterator localIterator = ((Stack)localObject).iterator();
        int j = 0;
        label110: 
        while (true)
        {
          i = j;
          if (!localIterator.hasNext())
            break;
          localObject = (com.tencent.mm.y.b)localIterator.next();
          int[] arrayOfInt = com.tencent.mm.view.footer.a.AcD;
          for (i = 0; ; i++)
          {
            if (i >= arrayOfInt.length)
              break label110;
            if (((com.tencent.mm.y.b)localObject).mColor == arrayOfInt[i])
            {
              j = 1 << i | j;
              break;
            }
          }
        }
      }
      i = 0;
      AppMethodBeat.o(116364);
    }
  }

  public final boolean Ay()
  {
    AppMethodBeat.i(116365);
    com.tencent.mm.cache.b localb = (com.tencent.mm.cache.b)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciW);
    g localg = (g)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciX);
    com.tencent.mm.cache.a locala = (com.tencent.mm.cache.a)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciZ);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciY);
    boolean bool;
    if (((localb != null) && (localb.ac(true) > 0)) || ((localg != null) && (localg.ac(true) > 0)) || ((localc != null) && (localc.ac(true) > 0)) || ((locala != null) && (locala.ac(true) > 0)))
    {
      AppMethodBeat.o(116365);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(116365);
    }
  }

  public final String Az()
  {
    AppMethodBeat.i(116366);
    String str = ((com.tencent.mm.cache.c)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciY)).kb(",")[0];
    AppMethodBeat.o(116366);
    return str;
  }

  public final int getTextColor()
  {
    int i = 0;
    AppMethodBeat.i(116363);
    Object localObject1 = (com.tencent.mm.cache.c)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciY);
    if (localObject1 == null)
      AppMethodBeat.o(116363);
    while (true)
    {
      return i;
      localObject1 = ((com.tencent.mm.cache.c)localObject1).efq;
      if (localObject1 != null)
      {
        localObject1 = ((Stack)localObject1).iterator();
        int j = 0;
        label123: 
        while (true)
        {
          i = j;
          if (!((Iterator)localObject1).hasNext())
            break;
          Object localObject2 = (com.tencent.mm.y.c)((Iterator)localObject1).next();
          if ((localObject2 instanceof com.tencent.mm.y.e))
          {
            localObject2 = (com.tencent.mm.y.e)localObject2;
            int[] arrayOfInt = com.tencent.mm.view.footer.a.AcD;
            for (i = 0; ; i++)
            {
              if (i >= arrayOfInt.length)
                break label123;
              if (((com.tencent.mm.y.e)localObject2).mColor == arrayOfInt[i])
              {
                j = 1 << i | j;
                break;
              }
            }
          }
        }
      }
      i = 0;
      AppMethodBeat.o(116363);
    }
  }

  public final boolean isCropped()
  {
    AppMethodBeat.i(116361);
    com.tencent.mm.cache.a locala = (com.tencent.mm.cache.a)ArtistCacheManager.Jc().a(com.tencent.mm.e.a.ciZ);
    boolean bool;
    if (locala == null)
    {
      AppMethodBeat.o(116361);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (locala.ac(false) > 0)
      {
        bool = true;
        AppMethodBeat.o(116361);
      }
      else
      {
        AppMethodBeat.o(116361);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bx.c
 * JD-Core Version:    0.6.2
 */