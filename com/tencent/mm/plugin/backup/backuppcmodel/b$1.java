package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17488);
    try
    {
      if (b.a(this.jvZ) == null)
      {
        PowerManager localPowerManager = (PowerManager)ah.getContext().getSystemService("power");
        b.a(this.jvZ, localPowerManager.newWakeLock(26, "BackupPc Lock"));
      }
      if (!b.a(this.jvZ).isHeld())
        b.a(this.jvZ).acquire();
      AppMethodBeat.o(17488);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(17488);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.b.1
 * JD-Core Version:    0.6.2
 */