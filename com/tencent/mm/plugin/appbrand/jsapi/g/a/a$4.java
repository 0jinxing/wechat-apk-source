package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

final class a$4
  implements Runnable
{
  a$4(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51152);
    ViewGroup localViewGroup = (ViewGroup)this.hNv.hMS;
    synchronized (this.hNv.hNj)
    {
      Iterator localIterator = this.hNv.hNj.iterator();
      if (localIterator.hasNext())
        localViewGroup.removeView(((a.b)localIterator.next()).hNJ);
    }
    this.hNv.hNj.clear();
    AppMethodBeat.o(51152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.4
 * JD-Core Version:    0.6.2
 */