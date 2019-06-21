package com.tencent.luggage.bridge.impl.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d.a;
import com.tencent.mm.plugin.appbrand.d.a.a;
import com.tencent.mm.plugin.appbrand.d.a.b;
import com.tencent.mm.plugin.appbrand.d.a.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class b
  implements a
{
  private final List<a.b> bOX;

  public b()
  {
    AppMethodBeat.i(90762);
    this.bOX = new LinkedList();
    a(new c());
    AppMethodBeat.o(90762);
  }

  public final Bitmap a(String paramString, Rect paramRect, a.c paramc)
  {
    AppMethodBeat.i(90764);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(90764);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = this.bOX.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          a.b localb = (a.b)localIterator.next();
          if (localb.match(paramString))
          {
            paramString = localb.b(paramString, paramRect, paramc);
            AppMethodBeat.o(90764);
            break;
          }
        }
      AppMethodBeat.o(90764);
      paramString = null;
    }
  }

  public final void a(a.b paramb)
  {
    AppMethodBeat.i(90765);
    if (this.bOX.contains(paramb))
      this.bOX.remove(paramb);
    this.bOX.add(paramb);
    AppMethodBeat.o(90765);
  }

  public final void a(String paramString, a.a parama)
  {
    AppMethodBeat.i(90766);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(90766);
    while (true)
    {
      return;
      Iterator localIterator = this.bOX.iterator();
      while (localIterator.hasNext())
      {
        a.b localb = (a.b)localIterator.next();
        if (localb.match(paramString))
          localb.a(paramString, parama);
      }
      AppMethodBeat.o(90766);
    }
  }

  public final Bitmap bB(String paramString)
  {
    AppMethodBeat.i(90763);
    paramString = a(paramString, null, null);
    AppMethodBeat.o(90763);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.a.b
 * JD-Core Version:    0.6.2
 */