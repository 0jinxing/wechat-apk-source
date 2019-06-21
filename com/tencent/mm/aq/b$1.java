package com.tencent.mm.aq;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.LinkedList;

final class b$1
  implements ap.a
{
  b$1(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(16444);
    ab.i("MicroMsg.GetChatroomMsgFetcher", "timeoutHandler onTimerExpired");
    if (b.a(this.fCq) != null)
    {
      w.c(b.a(this.fCq));
      b.b(this.fCq);
    }
    b.a(this.fCq, new LinkedList());
    AppMethodBeat.o(16444);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aq.b.1
 * JD-Core Version:    0.6.2
 */