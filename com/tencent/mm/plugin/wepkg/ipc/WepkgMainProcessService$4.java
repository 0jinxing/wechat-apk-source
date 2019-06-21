package com.tencent.mm.plugin.wepkg.ipc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class WepkgMainProcessService$4
  implements ServiceConnection
{
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(63484);
    WepkgMainProcessService.a(a.a.I(paramIBinder));
    WepkgMainProcessService.aLT();
    ab.i("MicroMsg.Wepkg.WepkgMainProcessService", "onServiceConnected(%s)", new Object[] { ah.getProcessName() });
    AppMethodBeat.o(63484);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(63485);
    WepkgMainProcessService.a(null);
    WepkgMainProcessService.access$600();
    ab.i("MicroMsg.Wepkg.WepkgMainProcessService", "onServiceDisconnected(%s)", new Object[] { ah.getProcessName() });
    AppMethodBeat.o(63485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService.4
 * JD-Core Version:    0.6.2
 */