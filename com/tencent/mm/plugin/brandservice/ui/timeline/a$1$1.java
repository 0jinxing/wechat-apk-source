package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.r.a;

final class a$1$1
  implements MessageQueue.IdleHandler
{
  a$1$1(a.1 param1, Object paramObject, r.a parama)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(14097);
    Looper.myQueue().removeIdleHandler(this);
    if ((a.a(this.jNJ.jNG) == null) || (a.a(this.jNJ.jNG).isFinishing()))
      AppMethodBeat.o(14097);
    while (true)
    {
      return false;
      a.a(this.jNJ.jNG, this.jNI);
      AppMethodBeat.o(14097);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.1.1
 * JD-Core Version:    0.6.2
 */