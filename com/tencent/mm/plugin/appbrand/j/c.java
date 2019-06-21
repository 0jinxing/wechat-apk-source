package com.tencent.mm.plugin.appbrand.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class c
{
  private volatile int count;
  private final LinkedList<Runnable> inL;

  c()
  {
    AppMethodBeat.i(102143);
    this.inL = new LinkedList();
    this.count = 2;
    AppMethodBeat.o(102143);
  }

  public final void K(Runnable paramRunnable)
  {
    AppMethodBeat.i(102144);
    Object localObject = null;
    if (paramRunnable != null);
    try
    {
      this.inL.addLast(paramRunnable);
      int i = this.count - 1;
      this.count = i;
      paramRunnable = localObject;
      if (i <= 0)
      {
        paramRunnable = localObject;
        if (this.inL.size() > 0)
        {
          paramRunnable = new java/util/LinkedList;
          paramRunnable.<init>();
          paramRunnable.addAll(this.inL);
          this.inL.clear();
        }
      }
      if (paramRunnable != null)
      {
        paramRunnable = paramRunnable.iterator();
        while (paramRunnable.hasNext())
          ((Runnable)paramRunnable.next()).run();
      }
    }
    finally
    {
      AppMethodBeat.o(102144);
    }
    AppMethodBeat.o(102144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.c
 * JD-Core Version:    0.6.2
 */