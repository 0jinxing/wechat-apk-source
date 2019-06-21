package com.bumptech.glide.c.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class p$a
  implements Lock
{
  public final void lock()
  {
  }

  public final void lockInterruptibly()
  {
  }

  public final Condition newCondition()
  {
    AppMethodBeat.i(92265);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Should not be called");
    AppMethodBeat.o(92265);
    throw localUnsupportedOperationException;
  }

  public final boolean tryLock()
  {
    return true;
  }

  public final boolean tryLock(long paramLong, TimeUnit paramTimeUnit)
  {
    return true;
  }

  public final void unlock()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.p.a
 * JD-Core Version:    0.6.2
 */