package com.bumptech.glide.c.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Queue;

final class c$b
{
  final Queue<c.a> aDb;

  c$b()
  {
    AppMethodBeat.i(91976);
    this.aDb = new ArrayDeque();
    AppMethodBeat.o(91976);
  }

  final c.a mV()
  {
    AppMethodBeat.i(91977);
    synchronized (this.aDb)
    {
      c.a locala = (c.a)this.aDb.poll();
      ??? = locala;
      if (locala == null)
        ??? = new c.a();
      AppMethodBeat.o(91977);
      return ???;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.c.b
 * JD-Core Version:    0.6.2
 */