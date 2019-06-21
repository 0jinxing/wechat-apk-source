package com.tencent.mm.plugin.appbrand.report.model;

import android.util.Pair;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aq;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Deque;
import java.util.LinkedList;

public final class d
  implements h, i
{
  private final String iAY;
  private final SparseArray<i.a> iAZ;
  private final Deque<i.a> iBa;
  private boolean iBb;
  private String iBc;
  private i.a iBd;

  public d(String paramString)
  {
    AppMethodBeat.i(132592);
    this.iAZ = new SparseArray();
    this.iBa = new LinkedList();
    this.iBb = true;
    this.iAY = paramString;
    AppMethodBeat.o(132592);
  }

  private void a(i.a parama)
  {
    try
    {
      AppMethodBeat.i(132599);
      this.iBa.offerFirst(parama);
      this.iAZ.put(parama.iBk, parama);
      AppMethodBeat.o(132599);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  private void aLm()
  {
    try
    {
      this.iBd = null;
      this.iBc = null;
      this.iBb = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private i.a aLn()
  {
    try
    {
      AppMethodBeat.i(132600);
      i.a locala = (i.a)this.iBa.pollFirst();
      if (locala != null)
        this.iAZ.remove(locala.iBk);
      AppMethodBeat.o(132600);
      return locala;
    }
    finally
    {
    }
  }

  private void b(w paramw1, w paramw2)
  {
    boolean bool;
    try
    {
      AppMethodBeat.i(132593);
      bool = DC(paramw2.aBm());
      this.iBd = j(paramw2);
      localObject1 = this.iBd;
      localObject2 = new com/tencent/mm/plugin/appbrand/report/model/i$c;
      ((i.c)localObject2).<init>(1, paramw1.aBm());
      ((i.a)localObject1).iBl = ((i.c)localObject2);
      int i = paramw1.hashCode();
      while ((!isEmpty()) && (aLo().iBk != i))
        aLn();
    }
    finally
    {
    }
    if (bool)
    {
      localObject2 = new com/tencent/mm/plugin/appbrand/report/model/i$a;
      ((i.a)localObject2).<init>(paramw1);
      a((i.a)localObject2);
    }
    Object localObject2 = j(paramw1);
    Object localObject1 = new com/tencent/mm/plugin/appbrand/report/model/i$b;
    ((i.b)localObject1).<init>(paramw2.aBm());
    ((i.a)localObject2).iBm = ((i.b)localObject1);
    j(paramw1).iBl = null;
    AppMethodBeat.o(132593);
  }

  private void i(w paramw)
  {
    try
    {
      AppMethodBeat.i(132594);
      this.iBc = paramw.aBm();
      this.iBb = false;
      i.a locala = new com/tencent/mm/plugin/appbrand/report/model/i$a;
      locala.<init>(paramw);
      a(locala);
      locala = aLo();
      if (bo.isNullOrNil(this.iAY));
      for (paramw = null; ; paramw = new i.b(this.iAY))
      {
        locala.iBm = paramw;
        AppMethodBeat.o(132594);
        return;
      }
    }
    finally
    {
    }
    throw paramw;
  }

  private boolean isEmpty()
  {
    try
    {
      AppMethodBeat.i(132602);
      boolean bool = this.iBa.isEmpty();
      AppMethodBeat.o(132602);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private i.a j(w paramw)
  {
    AppMethodBeat.i(132597);
    i.a locala = aLo();
    if (locala == null)
    {
      paramw = new i.a(paramw);
      AppMethodBeat.o(132597);
    }
    while (true)
    {
      return paramw;
      if (locala.iBk == paramw.hashCode())
      {
        AppMethodBeat.o(132597);
        paramw = locala;
      }
      else
      {
        ab.printErrStackTrace("MicroMsg.AppBrandPageVisitStack", new Throwable(), "mismatch stack order", new Object[0]);
        AppMethodBeat.o(132597);
        paramw = locala;
      }
    }
  }

  public final boolean DC(String paramString)
  {
    try
    {
      AppMethodBeat.i(132603);
      boolean bool;
      if ((!bo.isNullOrNil(this.iBc)) && (this.iBc.equals(paramString)))
      {
        bool = true;
        AppMethodBeat.o(132603);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(132603);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void a(w paramw1, w paramw2, aq paramaq)
  {
    AppMethodBeat.i(132595);
    try
    {
      if (this.iBb)
        i(paramw1);
      while (true)
      {
        return;
        if (paramaq != aq.iva)
          break;
        b(paramw1, paramw2);
        AppMethodBeat.o(132595);
      }
      if (this.iBd != null)
        aLm();
      if (paramw2 != null)
      {
        i.a locala = j(paramw2);
        if (locala != null)
        {
          paramaq = new com/tencent/mm/plugin/appbrand/report/model/i$c;
          paramaq.<init>(2, paramw1.aBm());
          locala.iBl = paramaq;
        }
      }
      paramaq = new com/tencent/mm/plugin/appbrand/report/model/i$a;
      paramaq.<init>(paramw1);
      if (paramw2 == null);
      for (paramw1 = null; ; paramw1 = new i.b(paramw2.aBm()))
      {
        paramaq.iBm = paramw1;
        a(paramaq);
        AppMethodBeat.o(132595);
        break;
      }
    }
    finally
    {
      AppMethodBeat.o(132595);
    }
    throw paramw1;
  }

  public final i.a aLo()
  {
    try
    {
      AppMethodBeat.i(132601);
      i.a locala = (i.a)this.iBa.peekFirst();
      AppMethodBeat.o(132601);
      return locala;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(w paramw)
  {
    AppMethodBeat.i(132596);
    try
    {
      i.a locala = j(paramw);
      if (locala == null);
      while (true)
      {
        return;
        paramw = e.l(paramw);
        int i = ((Integer)paramw.first).intValue();
        String str = (String)paramw.second;
        paramw = new com/tencent/mm/plugin/appbrand/report/model/i$c;
        paramw.<init>(i, str);
        locala.iBl = paramw;
        AppMethodBeat.o(132596);
      }
    }
    finally
    {
      AppMethodBeat.o(132596);
    }
    throw paramw;
  }

  public final void c(w paramw)
  {
    try
    {
      AppMethodBeat.i(132598);
      if (this.iBb)
      {
        i(paramw);
        AppMethodBeat.o(132598);
      }
      while (true)
      {
        return;
        aLm();
        AppMethodBeat.o(132598);
      }
    }
    finally
    {
    }
    throw paramw;
  }

  public final i.a k(w paramw)
  {
    try
    {
      AppMethodBeat.i(132604);
      i.a locala = (i.a)this.iAZ.get(paramw.hashCode());
      if ((locala == null) && (this.iBd != null) && (this.iBd.iBk == paramw.hashCode()))
      {
        paramw = this.iBd;
        AppMethodBeat.o(132604);
      }
      while (true)
      {
        return paramw;
        AppMethodBeat.o(132604);
        paramw = locala;
      }
    }
    finally
    {
    }
    throw paramw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.d
 * JD-Core Version:    0.6.2
 */