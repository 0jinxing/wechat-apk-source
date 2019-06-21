package com.tencent.mm.plugin.notification.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class a$2
  implements com.tencent.mm.plugin.notification.ui.a
{
  a$2(a parama)
  {
  }

  public final void bWG()
  {
    AppMethodBeat.i(23103);
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "onClickResendButton");
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(23101);
        h.pYm.e(11425, new Object[] { Integer.valueOf(a.2.this.oVP.getType()), Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0) });
        a.2.this.oVP.bWD();
        a.a(a.2.this.oVP);
        a.2.this.oVP.bWu();
        AppMethodBeat.o(23101);
      }
    });
    AppMethodBeat.o(23103);
  }

  public final void bWH()
  {
    AppMethodBeat.i(23104);
    ab.d("MicroMsg.AbstractSendMsgFailNotification", "onClickOmitButton");
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(23102);
        h.pYm.e(11425, new Object[] { Integer.valueOf(a.2.this.oVP.getType()), Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0) });
        a.2.this.oVP.bWD();
        a.2.this.oVP.bWz();
        a.b(a.2.this.oVP);
        a.2.this.oVP.oVH.dismiss();
        AppMethodBeat.o(23102);
      }
    });
    AppMethodBeat.o(23104);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.c.a.2
 * JD-Core Version:    0.6.2
 */