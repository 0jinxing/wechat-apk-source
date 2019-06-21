package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements MessageQueue.IdleHandler
{
  c$1(c paramc)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(14362);
    this.jQX.KB();
    AppMethodBeat.o(14362);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.c.1
 * JD-Core Version:    0.6.2
 */