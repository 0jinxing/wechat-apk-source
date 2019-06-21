package com.tencent.mm.plugin.appbrand;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

final class i$7
  implements ViewTreeObserver.OnPreDrawListener
{
  i$7(i parami, View paramView, i.c paramc)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(86658);
    this.gOf.getViewTreeObserver().removeOnPreDrawListener(this);
    this.gOf.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(86657);
        i locali = i.7.this.gOb;
        i.c localc = i.7.this.gOg;
        ConcurrentLinkedQueue localConcurrentLinkedQueue = new ConcurrentLinkedQueue(locali.gNX);
        locali.gNX = new LinkedList();
        Iterator localIterator = localConcurrentLinkedQueue.iterator();
        while (localIterator.hasNext())
        {
          i.b localb = (i.b)localIterator.next();
          localb.gOo = new i.8(locali, localConcurrentLinkedQueue, localb, localc);
          localb.prepare();
        }
        AppMethodBeat.o(86657);
      }
    });
    AppMethodBeat.o(86658);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.7
 * JD-Core Version:    0.6.2
 */