package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class WelcomeActivity$5
  implements n.c
{
  WelcomeActivity$5(WelcomeActivity paramWelcomeActivity, List paramList)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(125642);
    if (paraml.dzR())
    {
      Iterator localIterator = this.gCz.iterator();
      while (localIterator.hasNext())
        paraml.i((m)localIterator.next());
    }
    AppMethodBeat.o(125642);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity.5
 * JD-Core Version:    0.6.2
 */