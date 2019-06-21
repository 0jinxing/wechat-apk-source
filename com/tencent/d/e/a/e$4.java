package com.tencent.d.e.a;

import com.tencent.d.e.a.a.h;
import com.tencent.d.e.a.a.h.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class e$4 extends com.tencent.d.e.a.a.c
{
  e$4(e parame, com.tencent.d.e.a.a.e parame1, String paramString)
  {
  }

  public final void dQt()
  {
    AppMethodBeat.i(114540);
    Object localObject1 = h.dQz().dQA();
    HashMap localHashMap = new HashMap();
    Object localObject2;
    if (((Map)localObject1).size() != 0)
    {
      localObject2 = h.e((Map)localObject1, 0);
      if (localObject2 != null)
        localHashMap.put(((h.a)localObject2).AtS, ((h.a)localObject2).AtT);
      localObject2 = h.e((Map)localObject1, 1);
      if (localObject2 != null)
        localHashMap.put(((h.a)localObject2).AtS, ((h.a)localObject2).AtT);
      localObject1 = h.e((Map)localObject1, 2);
      if (localObject1 != null)
        localHashMap.put(((h.a)localObject1).AtS, ((h.a)localObject1).AtT);
    }
    if (localHashMap.size() == 0)
    {
      this.AtB.asv();
      AppMethodBeat.o(114540);
      return;
    }
    localObject1 = localHashMap.keySet().iterator();
    label140: label302: 
    while (true)
    {
      boolean bool;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.d.e.a.b.a)((Iterator)localObject1).next();
        ((com.tencent.d.e.a.b.a)localObject2).Aua = System.currentTimeMillis();
        ((com.tencent.d.e.a.b.a)localObject2).few = this.AtC;
        if ((this.AtB instanceof a))
          bool = e.a((a)this.AtB, (com.tencent.d.e.a.b.a)localObject2);
      }
      while (true)
      {
        if (!bool)
          break label302;
        localObject2 = ((List)localHashMap.get(localObject2)).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          try
          {
            File localFile = new java/io/File;
            localFile.<init>(str);
            localFile.delete();
          }
          catch (Throwable localThrowable)
          {
          }
        }
        break label140;
        if ((this.AtB instanceof c))
        {
          bool = e.a((c)this.AtB, (com.tencent.d.e.a.b.a)localObject2);
          continue;
          AppMethodBeat.o(114540);
          break;
        }
        bool = false;
      }
    }
  }

  public final void dQu()
  {
    AppMethodBeat.i(114541);
    if (e.f(this.Atx) != null)
      e.f(this.Atx);
    AppMethodBeat.o(114541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.e.4
 * JD-Core Version:    0.6.2
 */