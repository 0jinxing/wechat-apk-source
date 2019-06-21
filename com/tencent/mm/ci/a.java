package com.tencent.mm.ci;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.b.b;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import java.util.Iterator;
import java.util.LinkedList;

public class a<_Callback> extends com.tencent.mm.vending.b.a<_Callback>
{
  public a()
  {
    super(new e());
    AppMethodBeat.i(123360);
    AppMethodBeat.o(123360);
  }

  public a(d paramd)
  {
    super(paramd);
  }

  public final void a(final a<_Callback> parama)
  {
    AppMethodBeat.i(123361);
    Iterator localIterator = dMf().iterator();
    while (localIterator.hasNext())
    {
      final b localb = (b)localIterator.next();
      if (localb != null)
        if (localb.zXD != null)
        {
          this.zXB.c(localb.zXD);
          this.zXB.a(new com.tencent.mm.vending.c.a()
          {
          }
          , com.tencent.mm.vending.c.a.zXH, true);
        }
        else
        {
          parama.ax(localb.d);
        }
    }
    AppMethodBeat.o(123361);
  }

  public b<_Callback> aD(_Callback param_Callback)
  {
    AppMethodBeat.i(123362);
    param_Callback = super.a(new b(param_Callback, this));
    AppMethodBeat.o(123362);
    return param_Callback;
  }

  public final void remove(_Callback param_Callback)
  {
    AppMethodBeat.i(123363);
    super.b(new b(param_Callback, this));
    AppMethodBeat.o(123363);
  }

  public static abstract interface a<_Callback>
  {
    public abstract void ax(_Callback param_Callback);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ci.a
 * JD-Core Version:    0.6.2
 */