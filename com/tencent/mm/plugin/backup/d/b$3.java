package com.tencent.mm.plugin.backup.d;

import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3
  implements Runnable
{
  b$3(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17237);
    try
    {
      if ((b.a(this.jth) != null) && (b.a(this.jth).isHeld()))
        b.a(this.jth).release();
      AppMethodBeat.o(17237);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(17237);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.b.3
 * JD-Core Version:    0.6.2
 */