package com.tencent.mm.plugin.gallery.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class h<E> extends LinkedList<E>
{
  private byte[] eMl;

  public h()
  {
    AppMethodBeat.i(21297);
    this.eMl = new byte[0];
    AppMethodBeat.o(21297);
  }

  public final boolean add(E paramE)
  {
    AppMethodBeat.i(21301);
    synchronized (this.eMl)
    {
      boolean bool = super.add(paramE);
      AppMethodBeat.o(21301);
      return bool;
    }
  }

  public final boolean aj(E paramE)
  {
    AppMethodBeat.i(21299);
    synchronized (this.eMl)
    {
      boolean bool = super.contains(paramE);
      AppMethodBeat.o(21299);
      return bool;
    }
  }

  public final E bCr()
  {
    AppMethodBeat.i(21298);
    synchronized (this.eMl)
    {
      if (size() > 0)
      {
        localObject1 = super.poll();
        AppMethodBeat.o(21298);
        return localObject1;
      }
      Object localObject1 = null;
      AppMethodBeat.o(21298);
    }
  }

  public final void bV(E paramE)
  {
    AppMethodBeat.i(21300);
    synchronized (this.eMl)
    {
      if (aj(paramE))
        super.remove(paramE);
      AppMethodBeat.o(21300);
      return;
    }
  }

  public final int size()
  {
    AppMethodBeat.i(21302);
    synchronized (this.eMl)
    {
      int i = super.size();
      AppMethodBeat.o(21302);
      return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.h
 * JD-Core Version:    0.6.2
 */