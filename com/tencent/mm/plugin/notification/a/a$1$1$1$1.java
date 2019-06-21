package com.tencent.mm.plugin.notification.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;

final class a$1$1$1$1
  implements Runnable
{
  a$1$1$1$1(a.1.1.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23091);
    aw.getNotification().k(this.oVu.oVr, this.oVu.oVt.oVp);
    if (this.oVu.oVt.oVq.oVo.oVn)
    {
      this.oVu.oVt.oVq.oVo.oVn = false;
      aw.getNotification().bw(false);
    }
    AppMethodBeat.o(23091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.a.a.1.1.1.1
 * JD-Core Version:    0.6.2
 */