package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class mg
  implements lz
{
  private LinkedList<lz> a;
  private volatile boolean b;
  private final ReentrantLock c;

  public mg()
  {
    AppMethodBeat.i(100505);
    this.c = new ReentrantLock();
    AppMethodBeat.o(100505);
  }

  private static void a(Collection<lz> paramCollection)
  {
    AppMethodBeat.i(100507);
    if (paramCollection == null)
    {
      AppMethodBeat.o(100507);
      return;
    }
    lz locallz = null;
    Iterator localIterator = paramCollection.iterator();
    paramCollection = locallz;
    while (true)
    {
      label26: if (!localIterator.hasNext())
        break label78;
      locallz = (lz)localIterator.next();
      try
      {
        locallz.b();
      }
      catch (Throwable localThrowable)
      {
        if (paramCollection != null)
          break label90;
      }
    }
    paramCollection = new ArrayList();
    label78: label90: 
    while (true)
    {
      paramCollection.add(localThrowable);
      break label26;
      mb.a(paramCollection);
      AppMethodBeat.o(100507);
      break;
    }
  }

  public final boolean a()
  {
    return this.b;
  }

  public final void b()
  {
    AppMethodBeat.i(100506);
    if (!this.b)
      this.c.lock();
    try
    {
      boolean bool = this.b;
      if (bool);
      while (true)
      {
        return;
        this.b = true;
        LinkedList localLinkedList = this.a;
        this.a = null;
        this.c.unlock();
        a(localLinkedList);
        AppMethodBeat.o(100506);
      }
    }
    finally
    {
      this.c.unlock();
      AppMethodBeat.o(100506);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.mg
 * JD-Core Version:    0.6.2
 */