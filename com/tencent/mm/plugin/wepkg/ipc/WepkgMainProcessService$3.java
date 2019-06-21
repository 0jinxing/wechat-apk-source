package com.tencent.mm.plugin.wepkg.ipc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WepkgMainProcessService$3 extends Handler
{
  WepkgMainProcessService$3(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(63483);
    int i = paramMessage.what;
    paramMessage = WepkgMainProcessService.as(paramMessage.getData());
    WepkgMainProcessTask localWepkgMainProcessTask = WepkgMainProcessService.Kk(i);
    if (localWepkgMainProcessTask == null)
    {
      ab.e("MicroMsg.Wepkg.WepkgMainProcessService", "receive client msg, get null task by id %s", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(63483);
    }
    while (true)
    {
      return;
      WepkgMainProcessService.b(paramMessage, localWepkgMainProcessTask);
      localWepkgMainProcessTask.asQ();
      AppMethodBeat.o(63483);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService.3
 * JD-Core Version:    0.6.2
 */