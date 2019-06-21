package com.tencent.mm.plugin.location.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMHorList;

final class h$2
  implements Runnable
{
  h$2(h paramh, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113493);
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "scrollToTalker pos=%d", new Object[] { Integer.valueOf(this.nMC) });
    this.nMB.nMx.NI(this.nMC);
    AppMethodBeat.o(113493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.h.2
 * JD-Core Version:    0.6.2
 */