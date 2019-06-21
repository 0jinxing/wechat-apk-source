package com.tencent.mm.plugin.wepkg.ipc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WepkgMainProcessService$1 extends Handler
{
  WepkgMainProcessService$1(WepkgMainProcessService paramWepkgMainProcessService, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(63480);
    WepkgMainProcessTask localWepkgMainProcessTask = WepkgMainProcessService.as(paramMessage.getData());
    Messenger localMessenger = paramMessage.replyTo;
    int i = paramMessage.what;
    localWepkgMainProcessTask.hvF = localMessenger;
    localWepkgMainProcessTask.mTaskId = i;
    localWepkgMainProcessTask.asP();
    AppMethodBeat.o(63480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService.1
 * JD-Core Version:    0.6.2
 */