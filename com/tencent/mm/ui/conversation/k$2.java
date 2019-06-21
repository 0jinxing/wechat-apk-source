package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.go;
import com.tencent.mm.sdk.b.a;

final class k$2
  implements Runnable
{
  k$2(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34463);
    go localgo = new go();
    localgo.cBl.data = "MAIN_UI_EVENT_INIT_FINALLY";
    a.xxA.m(localgo);
    AppMethodBeat.o(34463);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.2
 * JD-Core Version:    0.6.2
 */