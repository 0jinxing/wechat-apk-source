package com.tencent.mm.plugin.appbrand.dynamic.k;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.g;
import java.util.concurrent.CountDownLatch;

final class a$1
  implements g
{
  a$1(CountDownLatch paramCountDownLatch)
  {
  }

  public final void BR()
  {
    AppMethodBeat.i(11034);
    this.val$latch.countDown();
    AppMethodBeat.o(11034);
  }

  public final void bi(boolean paramBoolean)
  {
    AppMethodBeat.i(11035);
    this.val$latch.countDown();
    AppMethodBeat.o(11035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.k.a.1
 * JD-Core Version:    0.6.2
 */