package com.tencent.mm.plugin.collect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bbj;
import com.tencent.mm.ui.widget.a.e.c;

final class CollectMainUI$6
  implements e.c
{
  CollectMainUI$6(CollectMainUI paramCollectMainUI)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(41257);
    if (CollectMainUI.d(this.kHl) != null)
    {
      CollectMainUI.dB(CollectMainUI.d(this.kHl).username, CollectMainUI.d(this.kHl).iAb);
      h.pYm.e(15387, new Object[] { Integer.valueOf(3) });
    }
    AppMethodBeat.o(41257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.6
 * JD-Core Version:    0.6.2
 */