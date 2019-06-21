package com.tencent.mm.plugin.notification.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.plugin.notification.ui.b;
import com.tencent.mm.plugin.report.service.h;

final class a$3
  implements b
{
  a$3(a parama)
  {
  }

  public final void bWI()
  {
    AppMethodBeat.i(23105);
    h.pYm.e(11425, new Object[] { Integer.valueOf(this.oVP.getType()), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
    this.oVP.bWD();
    this.oVP.bWF();
    if (!this.oVP.oVI)
      this.oVP.oVH.dismiss();
    AppMethodBeat.o(23105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.c.a.3
 * JD-Core Version:    0.6.2
 */