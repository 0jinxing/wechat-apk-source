package com.tencent.mm.ipcinvoker.wx_extension.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  private final List<b.b<a>> eGN;
  private final List<Object> eGO;

  private b()
  {
    AppMethodBeat.i(126214);
    this.eGN = new LinkedList();
    this.eGO = new LinkedList();
    AppMethodBeat.o(126214);
  }

  private void PX()
  {
    try
    {
      AppMethodBeat.i(126219);
      Iterator localIterator = this.eGO.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    finally
    {
    }
    AppMethodBeat.o(126219);
  }

  private void PY()
  {
    try
    {
      AppMethodBeat.i(126220);
      Iterator localIterator = this.eGO.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    finally
    {
    }
    AppMethodBeat.o(126220);
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(126215);
    boolean bool;
    if (c(parama))
    {
      bool = false;
      AppMethodBeat.o(126215);
    }
    while (true)
    {
      return bool;
      synchronized (this.eGN)
      {
        List localList2 = this.eGN;
        b.b localb = new com/tencent/mm/ipcinvoker/wx_extension/b/b$b;
        localb.<init>(parama);
        localList2.add(localb);
        PX();
        bool = true;
        AppMethodBeat.o(126215);
      }
    }
  }

  public final boolean b(a parama)
  {
    AppMethodBeat.i(126216);
    boolean bool;
    if (parama == null)
    {
      bool = false;
      AppMethodBeat.o(126216);
    }
    while (true)
    {
      return bool;
      synchronized (this.eGN)
      {
        List localList2 = this.eGN;
        b.b localb = new com/tencent/mm/ipcinvoker/wx_extension/b/b$b;
        localb.<init>(parama);
        bool = localList2.remove(localb);
        PY();
        AppMethodBeat.o(126216);
      }
    }
  }

  public final boolean c(a parama)
  {
    AppMethodBeat.i(126217);
    boolean bool;
    if (parama == null)
    {
      AppMethodBeat.o(126217);
      bool = false;
    }
    while (true)
    {
      return bool;
      synchronized (this.eGN)
      {
        Iterator localIterator = this.eGN.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            Object localObject = (b.b)localIterator.next();
            if (localObject != null)
            {
              localObject = (a)((b.b)localObject).get();
              if ((localObject != null) && (parama.equals(localObject)))
              {
                bool = true;
                AppMethodBeat.o(126217);
                break;
              }
            }
          }
        AppMethodBeat.o(126217);
        bool = false;
      }
    }
  }

  public final int size()
  {
    AppMethodBeat.i(126218);
    synchronized (this.eGN)
    {
      int i = this.eGN.size();
      AppMethodBeat.o(126218);
      return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.b.b
 * JD-Core Version:    0.6.2
 */