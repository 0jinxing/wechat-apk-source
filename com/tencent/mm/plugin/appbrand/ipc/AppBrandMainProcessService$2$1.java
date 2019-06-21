package com.tencent.mm.plugin.appbrand.ipc;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class AppBrandMainProcessService$2$1
  implements IBinder.DeathRecipient
{
  AppBrandMainProcessService$2$1(AppBrandMainProcessService.2 param2, String paramString, IBinder paramIBinder)
  {
  }

  public final void binderDied()
  {
    AppMethodBeat.i(90981);
    IBinder.DeathRecipient localDeathRecipient = (IBinder.DeathRecipient)AppBrandMainProcessService.b(this.huQ.huO).get(this.eFP);
    if (localDeathRecipient == null)
      AppMethodBeat.o(90981);
    while (true)
    {
      return;
      this.huP.unlinkToDeath(localDeathRecipient, 0);
      AppBrandMainProcessService.b(this.huQ.huO).remove(this.eFP);
      AppBrandMainProcessService.aBN();
      ab.e("MicroMsg.AppBrandMainProcessService", "Client Process Died: %s", new Object[] { this.eFP });
      AppMethodBeat.o(90981);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.2.1
 * JD-Core Version:    0.6.2
 */