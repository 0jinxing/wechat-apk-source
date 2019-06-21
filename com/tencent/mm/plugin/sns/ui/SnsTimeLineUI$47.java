package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class SnsTimeLineUI$47
  implements n.c
{
  SnsTimeLineUI$47(SnsTimeLineUI paramSnsTimeLineUI, List paramList)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(39521);
    Iterator localIterator = this.gCz.iterator();
    while (localIterator.hasNext())
      paraml.i((m)localIterator.next());
    AppMethodBeat.o(39521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.47
 * JD-Core Version:    0.6.2
 */