package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class k$8$1
  implements Runnable
{
  k$8$1(k.8 param8)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34474);
    z localz = g.RP().Ry();
    localz.set(89, Integer.valueOf(2));
    localz.dsb();
    AppMethodBeat.o(34474);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.8.1
 * JD-Core Version:    0.6.2
 */