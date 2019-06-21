package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class d$4
  implements Runnable
{
  d$4(d paramd, RecyclerView paramRecyclerView, int paramInt, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134213);
    if (this.jbk.jbf)
    {
      d locald = this.jbk;
      RecyclerView localRecyclerView = this.jbi;
      Object localObject1 = this.jbk.jbe;
      int i = this.jbm;
      ab.i("ItemInsertHelper", "alvinluo checkDuplicate position: %d", new Object[] { Integer.valueOf(i) });
      if (localObject1 != null)
      {
        if (locald.jbh != null)
        {
          int j = 0;
          for (int k = -1; ; k = m)
          {
            m = k;
            if (j >= locald.jbd.size())
              break;
            Object localObject2 = locald.jbd.get(j);
            m = k;
            if (locald.jbh.x(localObject1, localObject2))
            {
              m = k;
              if (j != i)
                m = j;
            }
            j++;
          }
        }
        int m = -1;
        if ((m != -1) && (m < locald.jbd.size()))
        {
          ab.i("ItemInsertHelper", "alvinluo checkDuplicate targetPosition: %d", new Object[] { Integer.valueOf(m) });
          locald.jbd.remove(m);
          localRecyclerView.getAdapter().ci(m);
        }
      }
    }
    if (this.jbk.jbg != null)
      this.jbk.jbg.a(this.jbk.coc, this.jbk.endPos, this.jbk.jbe, this.jbk.jbf);
    this.cfC.run();
    AppMethodBeat.o(134213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.d.4
 * JD-Core Version:    0.6.2
 */