package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class x$2
  implements ap.a
{
  x$2(AtomicReference paramAtomicReference, CountDownLatch paramCountDownLatch)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(58314);
    this.fuB.set(new x.a());
    this.val$latch.countDown();
    AppMethodBeat.o(58314);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.x.2
 * JD-Core Version:    0.6.2
 */