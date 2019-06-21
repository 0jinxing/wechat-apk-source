package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandMainProcessService$3 extends Handler
{
  AppBrandMainProcessService$3(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(90985);
    MainProcessTask localMainProcessTask = AppBrandMainProcessService.b(paramMessage.getData(), false);
    if (localMainProcessTask == null)
      AppMethodBeat.o(90985);
    while (true)
    {
      return;
      paramMessage = AppBrandMainProcessService.AE(localMainProcessTask.hvr);
      if (paramMessage == null)
      {
        ab.e("MicroMsg.AppBrandMainProcessService", "receive client msg, get null task by id %s", new Object[] { localMainProcessTask.hvr });
        AppMethodBeat.o(90985);
      }
      else
      {
        AppBrandMainProcessService.b(localMainProcessTask, paramMessage);
        paramMessage.asQ();
        AppMethodBeat.o(90985);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.3
 * JD-Core Version:    0.6.2
 */