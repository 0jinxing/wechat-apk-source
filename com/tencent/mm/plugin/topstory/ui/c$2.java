package com.tencent.mm.plugin.topstory.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.ui.home.d;
import com.tencent.mm.protocal.protobuf.chn;

final class c$2
  implements Runnable
{
  c$2(chn paramchn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1530);
    ((a)g.M(a.class)).getWebViewMgr().a(this.sBo, true);
    AppMethodBeat.o(1530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.c.2
 * JD-Core Version:    0.6.2
 */