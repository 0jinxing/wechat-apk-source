package com.tencent.mm.plugin.backup.backuppcmodel;

import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17489);
    try
    {
      if ((b.a(this.jvZ) != null) && (b.a(this.jvZ).isHeld()))
        b.a(this.jvZ).release();
      AppMethodBeat.o(17489);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(17489);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.b.2
 * JD-Core Version:    0.6.2
 */