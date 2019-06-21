package com.tencent.mm.plugin.shake.ui;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;

final class ShakeReportUI$6
  implements MessageQueue.IdleHandler
{
  ShakeReportUI$6(ShakeReportUI paramShakeReportUI)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(24781);
    t.a(this.qwj, 0, this.qwj.getString(2131303461));
    aw.ZK();
    c.Ry().set(4117, Boolean.TRUE);
    AppMethodBeat.o(24781);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.6
 * JD-Core Version:    0.6.2
 */