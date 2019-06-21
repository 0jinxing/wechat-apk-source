package com.tencent.mm.plugin.appbrand.appusage.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "fLongitude", "", "fLatitude", "onCallbackLocation"})
final class d$d
  implements c.a
{
  d$d(d paramd)
  {
  }

  public final void G(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(134573);
    Iterator localIterator = d.g(this.hbv).iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      d locald = this.hbv;
      j.o(localInteger, "item");
      d.a(locald, localInteger.intValue(), paramFloat1, paramFloat2);
    }
    d.g(this.hbv).clear();
    AppMethodBeat.o(134573);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.d.d
 * JD-Core Version:    0.6.2
 */