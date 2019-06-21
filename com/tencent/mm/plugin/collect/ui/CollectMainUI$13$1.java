package com.tencent.mm.plugin.collect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.a.a;
import com.tencent.mm.protocal.protobuf.bbc;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class CollectMainUI$13$1
  implements n.c
{
  CollectMainUI$13$1(CollectMainUI.13 param13)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(41265);
    a.bgv();
    if (a.bgx())
      paraml.add(0, 1, 0, 2131298365);
    while (this.kHr.gCz != null)
    {
      for (int i = 0; i < this.kHr.gCz.size(); i++)
      {
        bbc localbbc = (bbc)this.kHr.gCz.get(i);
        if (!bo.isNullOrNil(localbbc.cEh))
          paraml.add(0, i + 1 + 1, 0, localbbc.cEh);
      }
      paraml.add(0, 1, 0, 2131298375);
    }
    AppMethodBeat.o(41265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.13.1
 * JD-Core Version:    0.6.2
 */