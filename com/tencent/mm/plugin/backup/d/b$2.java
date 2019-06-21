package com.tencent.mm.plugin.backup.d;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17236);
    try
    {
      if (b.a(this.jth) == null)
      {
        PowerManager localPowerManager = (PowerManager)ah.getContext().getSystemService("power");
        b.a(this.jth, localPowerManager.newWakeLock(26, "BackupMove Lock"));
      }
      if (!b.a(this.jth).isHeld())
        b.a(this.jth).acquire();
      AppMethodBeat.o(17236);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(17236);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.b.2
 * JD-Core Version:    0.6.2
 */