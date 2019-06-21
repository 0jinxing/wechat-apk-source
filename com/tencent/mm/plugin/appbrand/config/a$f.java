package com.tencent.mm.plugin.appbrand.config;

import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public final class a$f
{
  public ArrayList<a.g> cHb;
  public String color;
  public String hfm;
  public String hfn;
  public String hfo;
  public String hfp;
  public boolean hfq;

  public a$f()
  {
    AppMethodBeat.i(86878);
    this.cHb = new ArrayList();
    AppMethodBeat.o(86878);
  }

  public final boolean yU(String paramString)
  {
    AppMethodBeat.i(86879);
    Iterator localIterator = this.cHb.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((a.g)localIterator.next()).url.equals(h.bO(paramString)))
      {
        bool = true;
        AppMethodBeat.o(86879);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.f
 * JD-Core Version:    0.6.2
 */