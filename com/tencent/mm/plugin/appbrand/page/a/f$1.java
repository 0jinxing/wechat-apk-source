package com.tencent.mm.plugin.appbrand.page.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class f$1 extends LinkedList<f.a>
{
  f$1(f paramf)
  {
  }

  public final boolean remove(Object paramObject)
  {
    AppMethodBeat.i(87352);
    boolean bool = super.remove(paramObject);
    f.a(this.ivo);
    AppMethodBeat.o(87352);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.f.1
 * JD-Core Version:    0.6.2
 */