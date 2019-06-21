package com.tencent.magicbrush.handler.glfont;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class c$a
{
  public Queue<c.b> aDb;

  public c$a()
  {
    AppMethodBeat.i(115905);
    this.aDb = new LinkedList();
    AppMethodBeat.o(115905);
  }

  public final void a(c.b paramb)
  {
    AppMethodBeat.i(115907);
    this.aDb.offer(paramb);
    AppMethodBeat.o(115907);
  }

  public final void d(ArrayList<c.b> paramArrayList)
  {
    AppMethodBeat.i(115908);
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      AppMethodBeat.o(115908);
    while (true)
    {
      return;
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        c.b localb = (c.b)localIterator.next();
        this.aDb.offer(localb);
      }
      paramArrayList.clear();
      AppMethodBeat.o(115908);
    }
  }

  public final c.b yG()
  {
    AppMethodBeat.i(115906);
    c.b localb = (c.b)this.aDb.poll();
    if (localb == null)
    {
      localb = new c.b();
      AppMethodBeat.o(115906);
    }
    while (true)
    {
      return localb;
      AppMethodBeat.o(115906);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.c.a
 * JD-Core Version:    0.6.2
 */