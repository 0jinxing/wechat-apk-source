package com.tencent.mm.vending.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class c<_Target extends a>
  implements a, b<_Target>
{
  private List<WeakReference<_Target>> a;
  private boolean b;

  public c()
  {
    AppMethodBeat.i(126111);
    this.a = new ArrayList();
    this.b = true;
    AppMethodBeat.o(126111);
  }

  public final void dead()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(126113);
        if (!this.b)
        {
          AppMethodBeat.o(126113);
          return;
        }
        Iterator localIterator = this.a.iterator();
        if (localIterator.hasNext())
        {
          a locala = (a)((WeakReference)localIterator.next()).get();
          if (locala == null)
            continue;
          locala.dead();
          continue;
        }
      }
      finally
      {
      }
      this.a.clear();
      this.b = false;
      AppMethodBeat.o(126113);
    }
  }

  public final void keep(_Target param_Target)
  {
    try
    {
      AppMethodBeat.i(126112);
      if (!this.b)
      {
        Assert.assertNotNull(param_Target);
        param_Target.dead();
        AppMethodBeat.o(126112);
      }
      while (true)
      {
        return;
        List localList = this.a;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(param_Target);
        localList.add(localWeakReference);
        AppMethodBeat.o(126112);
      }
    }
    finally
    {
    }
    throw param_Target;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.e.c
 * JD-Core Version:    0.6.2
 */