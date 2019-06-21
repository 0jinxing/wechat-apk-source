package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import java.util.ArrayList;
import java.util.Iterator;

final class c$3
  implements Runnable
{
  c$3(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26716);
    while (true)
    {
      StringBuilder localStringBuilder;
      int i;
      synchronized (this.uPg)
      {
        if (c.d(this.uPg) == null)
        {
          AppMethodBeat.o(26716);
          return;
        }
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Iterator localIterator = c.d(this.uPg).iterator();
        i = 0;
        if (localIterator.hasNext())
        {
          com.tencent.mm.plugin.wenote.model.a.c localc1 = (com.tencent.mm.plugin.wenote.model.a.c)localIterator.next();
          if (localc1.getType() != 1)
          {
            i++;
            continue;
          }
          localStringBuilder.append(((i)localc1).content);
        }
      }
      c.a(this.uPg, com.tencent.mm.plugin.wenote.b.c.ahl(localStringBuilder.toString()));
      c.b(this.uPg, i);
      AppMethodBeat.o(26716);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.c.3
 * JD-Core Version:    0.6.2
 */