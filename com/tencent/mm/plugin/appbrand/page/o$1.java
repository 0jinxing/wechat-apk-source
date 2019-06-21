package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.menu.n;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class o$1
  implements n.c
{
  o$1(o paramo)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(87071);
    Iterator localIterator = this.irE.irD.iterator();
    while (localIterator.hasNext())
    {
      n localn = (n)localIterator.next();
      if ((localn != null) && (!localn.imK))
      {
        Context localContext = this.irE.hTn.mContext;
        u localu = this.irE.hTn;
        String str = this.irE.mAppId;
        if (localn != null)
          localn.imL.a(localContext, localu, paraml, str);
      }
    }
    AppMethodBeat.o(87071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.o.1
 * JD-Core Version:    0.6.2
 */