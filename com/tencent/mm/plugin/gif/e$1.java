package com.tencent.mm.plugin.gif;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements Runnable
{
  e$1(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(62408);
    if (SystemClock.uptimeMillis() >= e.a(this.npn))
      this.npn.invalidateSelf();
    AppMethodBeat.o(62408);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.e.1
 * JD-Core Version:    0.6.2
 */