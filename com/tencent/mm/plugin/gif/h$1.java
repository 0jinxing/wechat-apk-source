package com.tencent.mm.plugin.gif;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$1
  implements Runnable
{
  h$1(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62425);
    if ((!h.a(this.npu)) && ((this.npu.isRunning()) || (h.b(this.npu) == 0)) && (SystemClock.uptimeMillis() >= h.c(this.npu)))
    {
      h.a(this.npu, System.currentTimeMillis());
      h.d(this.npu);
      this.npu.invalidateSelf();
    }
    AppMethodBeat.o(62425);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.h.1
 * JD-Core Version:    0.6.2
 */