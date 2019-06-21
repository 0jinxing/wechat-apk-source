package com.tencent.xweb.xwalk;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkV8;

final class h$2
  implements Runnable
{
  h$2(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(85238);
    if (this.ASe.ASa == null)
      AppMethodBeat.o(85238);
    while (true)
    {
      return;
      this.ASe.ASa.cleanup();
      this.ASe.ASa = null;
      this.ASe.ASb.getLooper().quit();
      this.ASe.ASb = null;
      AppMethodBeat.o(85238);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.h.2
 * JD-Core Version:    0.6.2
 */