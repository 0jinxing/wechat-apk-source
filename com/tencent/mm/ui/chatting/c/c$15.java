package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

final class c$15
  implements Runnable
{
  c$15(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31207);
    if (this.yOi.cgL == null)
      AppMethodBeat.o(31207);
    while (true)
    {
      return;
      boolean bool = ((h)this.yOi.cgL.aF(h.class)).isInEditMode();
      if ((this.yOi.mgP) && (!bool))
        e.d(this.yOi.yDI);
      AppMethodBeat.o(31207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.15
 * JD-Core Version:    0.6.2
 */