package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.menu.n;
import com.tencent.mm.plugin.appbrand.weishi.e;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;

public final class p extends o
{
  p(w paramw, List<n> paramList)
  {
    super(paramw, paramList);
  }

  protected final void a(d paramd)
  {
    boolean bool1 = false;
    AppMethodBeat.i(132338);
    super.a(paramd);
    w localw = (w)this.hTn;
    if (e.E(localw.getRuntime()))
    {
      paramd.uEO = true;
      paramd.uEP = true;
    }
    while (true)
    {
      localw.a(new p.1(this, localw));
      localw.a(new p.2(this, localw));
      AppMethodBeat.o(132338);
      return;
      if (localw.getRuntime().xy())
      {
        if ((localw.isFullScreen()) || (localw.aJQ()));
        for (boolean bool2 = true; ; bool2 = false)
        {
          paramd.uEO = bool2;
          if (!localw.isFullScreen())
          {
            bool2 = bool1;
            if (!localw.aJQ());
          }
          else
          {
            bool2 = true;
          }
          paramd.uEP = bool2;
          break;
        }
      }
      paramd.uEO = localw.isFullScreen();
      paramd.uEP = localw.isFullScreen();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.p
 * JD-Core Version:    0.6.2
 */