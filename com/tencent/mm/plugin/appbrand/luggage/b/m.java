package com.tencent.mm.plugin.appbrand.luggage.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
  implements b
{
  private List<b> ikl;

  public m(i parami)
  {
    AppMethodBeat.i(86994);
    this.ikl = new LinkedList();
    this.ikl.add(new o(parami));
    this.ikl.add(new j(parami));
    AppMethodBeat.o(86994);
  }

  public final boolean a(c paramc, String paramString)
  {
    AppMethodBeat.i(86995);
    boolean bool;
    if ((paramc == null) || (paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(86995);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.ikl.iterator();
      while (true)
        if (localIterator.hasNext())
          if (((b)localIterator.next()).a(paramc, paramString))
          {
            bool = true;
            AppMethodBeat.o(86995);
            break;
          }
      AppMethodBeat.o(86995);
      bool = false;
    }
  }

  public final String b(c paramc, String paramString)
  {
    AppMethodBeat.i(86996);
    if ((paramc == null) || (paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(86996);
    while (true)
    {
      return paramString;
      Iterator localIterator = this.ikl.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          b localb = (b)localIterator.next();
          if (localb.a(paramc, paramString))
          {
            paramString = localb.b(paramc, paramString);
            AppMethodBeat.o(86996);
            break;
          }
        }
      AppMethodBeat.o(86996);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.m
 * JD-Core Version:    0.6.2
 */