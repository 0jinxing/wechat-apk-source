package com.tencent.mm.ui.chatting.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.e.a.b;

final class e$7$1
  implements Runnable
{
  e$7$1(e.7 param7, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32565);
    this.yZs.yZo.yZl.kuX = false;
    if (e.c(this.yZs.yZo) != null)
      e.c(this.yZs.yZo).p(this.yZs.kve, this.kvp);
    AppMethodBeat.o(32565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.7.1
 * JD-Core Version:    0.6.2
 */