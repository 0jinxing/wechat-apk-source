package com.tencent.mm.pluginsdk.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class b
{
  private CountDownLatch vaN = null;

  public final void b(long paramLong, Runnable paramRunnable)
  {
    AppMethodBeat.i(27231);
    ab.i("MicroMsg.SyncJob", "doAsSyncJob");
    if (this.vaN == null)
      this.vaN = new CountDownLatch(1);
    al.d(paramRunnable);
    ab.i("MicroMsg.SyncJob", "doAsSyncJob postToMainThread");
    if (this.vaN != null);
    while (true)
    {
      try
      {
        this.vaN.await(paramLong, TimeUnit.MILLISECONDS);
        AppMethodBeat.o(27231);
        return;
      }
      catch (InterruptedException paramRunnable)
      {
        ab.w("MicroMsg.SyncJob", paramRunnable.getMessage());
        ab.printErrStackTrace("MicroMsg.SyncJob", paramRunnable, "", new Object[0]);
      }
      AppMethodBeat.o(27231);
    }
  }

  public final void countDown()
  {
    AppMethodBeat.i(27230);
    if (this.vaN != null)
    {
      this.vaN.countDown();
      this.vaN = null;
    }
    AppMethodBeat.o(27230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.d.a.b
 * JD-Core Version:    0.6.2
 */