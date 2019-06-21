package com.tencent.mm.plugin.music.model.notification;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import junit.framework.Assert;

final class b$2
  implements ServiceConnection
{
  b$2(b paramb)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(104988);
    ab.i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceConnected");
    if (!(paramIBinder instanceof MMMusicPlayerService.a))
    {
      ab.e("MicroMsg.Music.MMMusicNotificationHelper", "service %s isn't MMMusicPlayerService, err, return", new Object[] { paramIBinder.getClass().getName() });
      Assert.assertTrue(false);
      AppMethodBeat.o(104988);
    }
    while (true)
    {
      return;
      this.oMR.oMQ = false;
      this.oMR.oMK = ((MMMusicPlayerService.a)paramIBinder).oMU;
      AppMethodBeat.o(104988);
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(104989);
    ab.i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceDisconnected");
    this.oMR.oMQ = false;
    this.oMR.oMK = null;
    AppMethodBeat.o(104989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.b.2
 * JD-Core Version:    0.6.2
 */