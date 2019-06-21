package com.tencent.mm.media.d;

import a.l;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class f$c
  implements Runnable
{
  f$c(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(12958);
    try
    {
      this.eVQ.eSP.quitSafely();
      AppMethodBeat.o(12958);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.eVQ.TAG, (Throwable)localException, "release error:" + localException.getMessage(), new Object[0]);
        AppMethodBeat.o(12958);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.f.c
 * JD-Core Version:    0.6.2
 */