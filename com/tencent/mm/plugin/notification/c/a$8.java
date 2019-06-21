package com.tencent.mm.plugin.notification.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.ArrayList;

final class a$8
  implements ap.a
{
  a$8(a parama, long paramLong)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(23110);
    if ((!this.oVP.oVJ.contains(Long.valueOf(this.cgB))) && (!this.oVP.oVK.contains(Long.valueOf(this.cgB))) && (this.oVP.oVG.contains(this.cgB)))
    {
      ab.i("MicroMsg.AbstractSendMsgFailNotification", "msg:%d send timeout, move this message to fail list, continue send next message", new Object[] { Long.valueOf(this.cgB) });
      this.oVP.oVK.add(Long.valueOf(this.cgB));
      this.oVP.oVL.add(Long.valueOf(this.cgB));
      if (this.oVP.oVJ.size() + this.oVP.oVK.size() < this.oVP.oVG.oVR.size())
        break label172;
      a.e(this.oVP);
    }
    while (true)
    {
      AppMethodBeat.o(23110);
      return true;
      label172: long l = this.oVP.oVG.bWJ();
      this.oVP.jp(l);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.c.a.8
 * JD-Core Version:    0.6.2
 */