package com.tencent.mm.plugin.appbrand.b;

import android.support.v4.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import java.util.Set;

final class c$1 extends d
{
  c$1(c paramc, i parami)
  {
    super(parami);
  }

  final void a(b paramb)
  {
    AppMethodBeat.i(86832);
    c localc = this.gWA;
    synchronized (localc.gWz)
    {
      c.a[] arrayOfa = new c.a[localc.gWz.size()];
      arrayOfa = (c.a[])localc.gWz.keySet().toArray(arrayOfa);
      int i = arrayOfa.length;
      int j = 0;
      if (j < i)
      {
        arrayOfa[j].a(localc.gPI.mAppId, paramb);
        j++;
      }
    }
    AppMethodBeat.o(86832);
  }

  final void awy()
  {
    AppMethodBeat.i(86831);
    c localc = this.gWA;
    if (!localc.gPI.mFinished)
      localc.gPI.finish();
    AppMethodBeat.o(86831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.c.1
 * JD-Core Version:    0.6.2
 */