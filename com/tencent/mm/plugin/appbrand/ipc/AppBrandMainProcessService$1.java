package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandMainProcessService$1 extends Handler
{
  AppBrandMainProcessService$1(AppBrandMainProcessService paramAppBrandMainProcessService, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(90980);
    paramMessage = AppBrandMainProcessService.b(paramMessage.getData(), true);
    if (paramMessage != null)
      paramMessage.asP();
    AppMethodBeat.o(90980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.1
 * JD-Core Version:    0.6.2
 */