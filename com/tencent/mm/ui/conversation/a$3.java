package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$3 extends n.a
{
  private final ap zqC;

  a$3(a parama)
  {
    AppMethodBeat.i(34030);
    this.zqC = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(34029);
        a.3.this.zqB.dIn();
        AppMethodBeat.o(34029);
        return false;
      }
    }
    , false);
    AppMethodBeat.o(34030);
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(34031);
    if (this.zqC != null)
      this.zqC.ae(10L, 10L);
    AppMethodBeat.o(34031);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.3
 * JD-Core Version:    0.6.2
 */