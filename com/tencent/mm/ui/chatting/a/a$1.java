package com.tencent.mm.ui.chatting.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$1
  implements ap.a
{
  a$1(a parama)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(31095);
    if ((a.a(this.yNz) != null) && (a.a(this.yNz).caA))
    {
      ab.i("MicroMsg.ChattingDataAdapter", "[onTimerExpired]");
      this.yNz.dCT();
    }
    AppMethodBeat.o(31095);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.a.1
 * JD-Core Version:    0.6.2
 */