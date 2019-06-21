package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class BizTimeLineHotView$7
  implements MessageQueue.IdleHandler
{
  BizTimeLineHotView$7(BizTimeLineHotView paramBizTimeLineHotView)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(14312);
    Looper.myQueue().removeIdleHandler(BizTimeLineHotView.g(this.jQt));
    if ((this.jQt.jQk.get() == null) || (((Activity)this.jQt.jQk.get()).isFinishing()))
      AppMethodBeat.o(14312);
    while (true)
    {
      return false;
      BizTimeLineHotView.f(this.jQt).aZ(BizTimeLineHotView.a(this.jQt));
      AppMethodBeat.o(14312);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView.7
 * JD-Core Version:    0.6.2
 */