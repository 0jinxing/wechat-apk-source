package com.bumptech.glide.c.b.b;

import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

final class c
{
  final Map<String, c.a> aCX;
  final c.b aCY;

  c()
  {
    AppMethodBeat.i(91978);
    this.aCX = new HashMap();
    this.aCY = new c.b();
    AppMethodBeat.o(91978);
  }

  final void release(String arg1)
  {
    AppMethodBeat.i(91979);
    c.a locala;
    Object localObject2;
    Object localObject3;
    try
    {
      locala = (c.a)i.d(this.aCX.get(???), "Argument must not be null");
      if (locala.aDa <= 0)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Cannot release a lock that is not held, safeKey: ");
        ((IllegalStateException)localObject2).<init>(??? + ", interestedThreads: " + locala.aDa);
        AppMethodBeat.o(91979);
        throw ((Throwable)localObject2);
      }
    }
    finally
    {
      AppMethodBeat.o(91979);
    }
    locala.aDa -= 1;
    if (locala.aDa == 0)
    {
      localObject3 = (c.a)this.aCX.remove(???);
      if (!localObject3.equals(locala))
      {
        localObject2 = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Removed the wrong lock, expected to remove: ");
        ((IllegalStateException)localObject2).<init>(locala + ", but actually removed: " + localObject3 + ", safeKey: " + ???);
        AppMethodBeat.o(91979);
        throw ((Throwable)localObject2);
      }
      localObject2 = this.aCY;
    }
    synchronized (((c.b)localObject2).aDb)
    {
      if (((c.b)localObject2).aDb.size() < 10)
        ((c.b)localObject2).aDb.offer(localObject3);
      locala.aCZ.unlock();
      AppMethodBeat.o(91979);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.c
 * JD-Core Version:    0.6.2
 */