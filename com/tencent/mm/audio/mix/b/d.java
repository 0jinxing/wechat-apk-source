package com.tencent.mm.audio.mix.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class d
{
  private static d ckR;
  public volatile LinkedList<String> ckO;
  public volatile HashMap<String, c> ckP;
  public volatile Object ckQ;

  private d()
  {
    AppMethodBeat.i(136992);
    this.ckO = new LinkedList();
    this.ckP = new HashMap();
    this.ckQ = new Object();
    AppMethodBeat.o(136992);
  }

  public static d Dm()
  {
    AppMethodBeat.i(136993);
    if (ckR == null);
    try
    {
      if (ckR == null)
      {
        locald = new com/tencent/mm/audio/mix/b/d;
        locald.<init>();
        ckR = locald;
      }
      d locald = ckR;
      AppMethodBeat.o(136993);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(136993);
    }
  }

  public final long Dn()
  {
    AppMethodBeat.i(136999);
    long l = 0L;
    while (true)
      synchronized (this.ckQ)
      {
        Iterator localIterator = this.ckO.iterator();
        if (localIterator.hasNext())
        {
          Object localObject3 = (String)localIterator.next();
          localObject3 = (c)this.ckP.get(localObject3);
          if ((localObject3 != null) && (((c)localObject3).cky) && (!((c)localObject3).ckB))
            l = ((c)localObject3).Da() + l;
        }
        else
        {
          AppMethodBeat.o(136999);
          return l;
        }
      }
  }

  public final ArrayList<String> Do()
  {
    AppMethodBeat.i(137000);
    synchronized (this.ckQ)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localArrayList.addAll(this.ckO);
      AppMethodBeat.o(137000);
      return localArrayList;
    }
  }

  public final void clearCache()
  {
    AppMethodBeat.i(136997);
    synchronized (this.ckQ)
    {
      Iterator localIterator = this.ckO.iterator();
      while (localIterator.hasNext())
      {
        Object localObject3 = (String)localIterator.next();
        localObject3 = (c)this.ckP.get(localObject3);
        if (localObject3 != null)
          ((c)localObject3).reset();
      }
    }
    this.ckO.clear();
    this.ckP.clear();
    AppMethodBeat.o(136997);
  }

  public final c dv(String paramString)
  {
    AppMethodBeat.i(136994);
    synchronized (this.ckQ)
    {
      if (!this.ckO.contains(paramString))
        this.ckO.add(paramString);
      c localc1 = (c)this.ckP.get(paramString);
      c localc2 = localc1;
      if (localc1 == null)
      {
        localc2 = new com/tencent/mm/audio/mix/a/c;
        localc2.<init>(paramString);
        this.ckP.put(paramString, localc2);
      }
      AppMethodBeat.o(136994);
      return localc2;
    }
  }

  public final int dw(String paramString)
  {
    AppMethodBeat.i(136995);
    synchronized (this.ckQ)
    {
      if (!this.ckO.contains(paramString))
      {
        AppMethodBeat.o(136995);
        i = 0;
      }
      while (true)
      {
        return i;
        paramString = (c)this.ckP.get(paramString);
        if (paramString == null)
          break;
        i = paramString.size();
        AppMethodBeat.o(136995);
      }
      AppMethodBeat.o(136995);
      int i = 0;
    }
  }

  public final boolean dx(String paramString)
  {
    AppMethodBeat.i(136996);
    synchronized (this.ckQ)
    {
      if (!this.ckO.contains(paramString))
      {
        AppMethodBeat.o(136996);
        bool = false;
      }
      while (true)
      {
        return bool;
        paramString = (c)this.ckP.get(paramString);
        if ((paramString == null) || (paramString.size() <= 0) || (!paramString.cky))
          break;
        bool = true;
        AppMethodBeat.o(136996);
      }
      AppMethodBeat.o(136996);
      boolean bool = false;
    }
  }

  public final long dy(String paramString)
  {
    AppMethodBeat.i(136998);
    synchronized (this.ckQ)
    {
      if (!this.ckO.contains(paramString))
      {
        AppMethodBeat.o(136998);
        l = 0L;
      }
      while (true)
      {
        return l;
        paramString = (c)this.ckP.get(paramString);
        if ((paramString == null) || (!paramString.cky))
          break;
        l = paramString.Da();
        AppMethodBeat.o(136998);
      }
      AppMethodBeat.o(136998);
      long l = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.d
 * JD-Core Version:    0.6.2
 */