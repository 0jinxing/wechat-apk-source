package com.tencent.mm.booter;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CoreService$3
  implements Runnable
{
  CoreService$3(CoreService paramCoreService)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57727);
    if (Build.VERSION.SDK_INT > 23)
      ab.i("MicroMsg.CoreService", "KeepAliveService.scheduleKeepAliveJob() flag:%s", new Object[] { Boolean.valueOf(KeepAliveService.Ik()) });
    AppMethodBeat.o(57727);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.CoreService.3
 * JD-Core Version:    0.6.2
 */