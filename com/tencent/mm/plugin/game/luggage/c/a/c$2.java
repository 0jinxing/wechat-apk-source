package com.tencent.mm.plugin.game.luggage.c.a;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.c;
import com.tencent.mm.protocal.protobuf.bbb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class c$2
  implements b.c
{
  c$2(c paramc)
  {
  }

  public final void f(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(135895);
    Object localObject1 = this.mUp;
    Object localObject2 = ((c)localObject1).mUn;
    Context localContext = ((c)localObject1).mUm.mContext;
    localObject1 = ((c)localObject1).mUm;
    a locala = (a)((b)localObject2).mUk.get(Integer.valueOf(paramMenuItem.getItemId()));
    Iterator localIterator = ((b)localObject2).mUj.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localObject2 = (bbb)localIterator.next();
    }
    while ((localObject2 == null) || (((bbb)localObject2).wkB != paramMenuItem.getItemId()));
    for (paramMenuItem = (MenuItem)localObject2; ; paramMenuItem = null)
    {
      if ((locala != null) && (paramMenuItem != null))
        locala.a(localContext, (com.tencent.mm.plugin.webview.luggage.d)localObject1, paramMenuItem);
      this.mUp.mUo.cpE();
      AppMethodBeat.o(135895);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.c.2
 * JD-Core Version:    0.6.2
 */