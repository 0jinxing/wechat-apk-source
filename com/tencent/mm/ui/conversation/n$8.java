package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.go;
import com.tencent.mm.sdk.b.a;

final class n$8
  implements Runnable
{
  n$8(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34603);
    go localgo = new go();
    localgo.cBl.data = "MAIN_UI_EVENT_UPDATE_VIEW";
    a.xxA.m(localgo);
    AppMethodBeat.o(34603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n.8
 * JD-Core Version:    0.6.2
 */