package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.l;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicBoolean;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$run$1", "Landroid/os/MessageQueue$IdleHandler;", "queueIdle", "", "plugin-brandservice_release"})
public final class PreloadLogic$t
  implements MessageQueue.IdleHandler
{
  PreloadLogic$t(int paramInt)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(14910);
    Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler)this);
    PreloadLogic localPreloadLogic = PreloadLogic.jSS;
    PreloadLogic.sp(this.jKl);
    localPreloadLogic = PreloadLogic.jSS;
    PreloadLogic.aXt().set(false);
    AppMethodBeat.o(14910);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.t
 * JD-Core Version:    0.6.2
 */