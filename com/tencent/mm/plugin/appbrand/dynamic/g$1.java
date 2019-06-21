package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.network.n.a;
import java.util.Collection;
import java.util.Iterator;

final class g$1 extends n.a
{
  public final void gl(int paramInt)
  {
    AppMethodBeat.i(10692);
    Bundle localBundle = new Bundle();
    localBundle.putInt("status", paramInt);
    Iterator localIterator = i.azC().azD().iterator();
    while (localIterator.hasNext())
      f.a((String)localIterator.next(), localBundle, g.a.class, null);
    AppMethodBeat.o(10692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.g.1
 * JD-Core Version:    0.6.2
 */