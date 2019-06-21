package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import java.util.Iterator;
import java.util.Set;

final class SnsMsgUI$a$1
  implements MMSlideDelView.d
{
  SnsMsgUI$a$1(SnsMsgUI.a parama)
  {
  }

  public final void a(MMSlideDelView paramMMSlideDelView, boolean paramBoolean)
  {
    AppMethodBeat.i(39084);
    if (paramBoolean)
    {
      nDv.add(paramMMSlideDelView);
      AppMethodBeat.o(39084);
    }
    while (true)
    {
      return;
      nDv.remove(paramMMSlideDelView);
      AppMethodBeat.o(39084);
    }
  }

  public final boolean bIo()
  {
    AppMethodBeat.i(39085);
    boolean bool;
    if (nDv.size() > 0)
    {
      bool = true;
      AppMethodBeat.o(39085);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39085);
    }
  }

  public final void bIp()
  {
    AppMethodBeat.i(39086);
    Iterator localIterator = nDv.iterator();
    while (localIterator.hasNext())
    {
      MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
      if (localMMSlideDelView != null)
        localMMSlideDelView.dzZ();
    }
    nDv.clear();
    AppMethodBeat.o(39086);
  }

  public final void bIq()
  {
    AppMethodBeat.i(39087);
    Iterator localIterator = nDv.iterator();
    while (localIterator.hasNext())
    {
      MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
      if (localMMSlideDelView != null)
        localMMSlideDelView.dzY();
    }
    nDv.clear();
    AppMethodBeat.o(39087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.a.1
 * JD-Core Version:    0.6.2
 */