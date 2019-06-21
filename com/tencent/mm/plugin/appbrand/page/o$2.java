package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.menu.n;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;
import java.util.Iterator;
import java.util.List;

final class o$2
  implements n.d
{
  o$2(o paramo)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(87072);
    Object localObject = this.irE.irD;
    paramInt = paramMenuItem.getItemId();
    localObject = ((List)localObject).iterator();
    Context localContext;
    String str;
    while (((Iterator)localObject).hasNext())
    {
      paramMenuItem = (n)((Iterator)localObject).next();
      if (paramMenuItem.id == paramInt)
      {
        localContext = this.irE.hTn.mContext;
        localObject = this.irE.hTn;
        str = this.irE.mAppId;
        if (paramMenuItem != null)
          break label114;
      }
    }
    for (paramInt = 0; ; paramInt = 1)
    {
      if (paramInt != 0)
        this.irE.irC.cpE();
      AppMethodBeat.o(87072);
      return;
      paramMenuItem = null;
      break;
      label114: paramMenuItem.imL.a(localContext, (u)localObject, str, paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.o.2
 * JD-Core Version:    0.6.2
 */