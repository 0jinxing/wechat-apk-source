package com.tencent.mm.plugin.notification.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.ArrayList;

final class a$5
  implements ap.a
{
  a$5(a parama)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(23107);
    if (this.oVP.oVI)
    {
      ab.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, before check msgList.size:%d, successList.size:%d, failedList.size:%d", new Object[] { Integer.valueOf(this.oVP.oVG.oVR.size()), Integer.valueOf(this.oVP.oVJ.size()), Integer.valueOf(this.oVP.oVK.size()) });
      a.c(this.oVP);
      ab.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, after check msgList.size:%d, successList.size:%d, failedList.size:%d", new Object[] { Integer.valueOf(this.oVP.oVG.oVR.size()), Integer.valueOf(this.oVP.oVJ.size()), Integer.valueOf(this.oVP.oVK.size()) });
      if (this.oVP.oVG.oVR.size() > 0)
      {
        a.d(this.oVP);
        AppMethodBeat.o(23107);
      }
    }
    while (true)
    {
      return bool;
      a.e(this.oVP);
      break;
      AppMethodBeat.o(23107);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.c.a.5
 * JD-Core Version:    0.6.2
 */