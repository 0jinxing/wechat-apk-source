package com.tencent.mm.plugin.location.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class k$1
  implements ap.a
{
  k$1(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(113530);
    ab.i("MicroMsg.TalkMgr", "onSeizeMicSuccess expired to execute");
    this.nNE.bJZ();
    AppMethodBeat.o(113530);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.k.1
 * JD-Core Version:    0.6.2
 */