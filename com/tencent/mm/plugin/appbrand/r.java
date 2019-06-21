package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class r
{
  private Map<Integer, List<r.b>> gPL;
  private Map<Integer, Integer> gPM;

  private r()
  {
    AppMethodBeat.i(86774);
    this.gPL = new HashMap();
    this.gPM = new HashMap();
    AppMethodBeat.o(86774);
  }

  private void d(int paramInt, List<r.b> paramList)
  {
    AppMethodBeat.i(86778);
    if (this.gPM.isEmpty())
      AppMethodBeat.o(86778);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandServiceOnInitDoneListenerMgr", "notify pending : %d", new Object[] { Integer.valueOf(paramInt) });
      if (!this.gPM.containsKey(Integer.valueOf(paramInt)))
      {
        ab.i("MicroMsg.AppBrandServiceOnInitDoneListenerMgr", "not in pending notify");
        AppMethodBeat.o(86778);
      }
      else
      {
        this.gPM.remove(Integer.valueOf(paramInt));
        for (paramInt = 0; paramInt < paramList.size(); paramInt++)
          ((r.b)paramList.get(paramInt)).auh();
        AppMethodBeat.o(86778);
      }
    }
  }

  public final void a(q paramq)
  {
    try
    {
      AppMethodBeat.i(86777);
      int i = paramq.hashCode();
      ab.i("MicroMsg.AppBrandServiceOnInitDoneListenerMgr", "notify service:%d", new Object[] { Integer.valueOf(i) });
      paramq = (List)this.gPL.get(Integer.valueOf(i));
      if (paramq == null)
      {
        ab.i("MicroMsg.AppBrandServiceOnInitDoneListenerMgr", "notify listenerList empty");
        this.gPM.put(Integer.valueOf(i), Integer.valueOf(1));
        AppMethodBeat.o(86777);
      }
      while (true)
      {
        return;
        for (i = 0; i < paramq.size(); i++)
          ((r.b)paramq.get(i)).auh();
        AppMethodBeat.o(86777);
      }
    }
    finally
    {
    }
    throw paramq;
  }

  public final void a(q paramq, r.b paramb)
  {
    try
    {
      AppMethodBeat.i(86775);
      int i = paramq.hashCode();
      ab.i("MicroMsg.AppBrandServiceOnInitDoneListenerMgr", "addListener service:%d", new Object[] { Integer.valueOf(i) });
      List localList = (List)this.gPL.get(Integer.valueOf(i));
      paramq = localList;
      if (localList == null)
      {
        paramq = new java/util/ArrayList;
        paramq.<init>();
        this.gPL.put(Integer.valueOf(i), paramq);
      }
      paramq.add(paramb);
      d(i, paramq);
      AppMethodBeat.o(86775);
      return;
    }
    finally
    {
    }
    throw paramq;
  }

  public final void b(q paramq, r.b paramb)
  {
    try
    {
      AppMethodBeat.i(86776);
      int i = paramq.hashCode();
      ab.i("MicroMsg.AppBrandServiceOnInitDoneListenerMgr", "removeListener service:%d", new Object[] { Integer.valueOf(i) });
      paramq = (List)this.gPL.get(Integer.valueOf(i));
      if (paramq == null)
        AppMethodBeat.o(86776);
      while (true)
      {
        return;
        paramq.remove(paramb);
        if (paramq.isEmpty())
          this.gPL.remove(Integer.valueOf(i));
        AppMethodBeat.o(86776);
      }
    }
    finally
    {
    }
    throw paramq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r
 * JD-Core Version:    0.6.2
 */