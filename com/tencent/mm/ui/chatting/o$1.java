package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class o$1
  implements MenuItem.OnMenuItemClickListener
{
  o$1(o paramo)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30620);
    paramMenuItem = new Intent();
    Object localObject1 = ((h)this.yJb.cgL.aF(h.class)).dCQ();
    if (localObject1 != null)
    {
      Object localObject2 = new ArrayList();
      Iterator localIterator = ((Set)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (Long)localIterator.next();
        if (localObject1 != null)
          ((List)localObject2).add(localObject1);
      }
      localObject1 = new long[((List)localObject2).size()];
      localObject2 = ((List)localObject2).iterator();
      for (int i = 0; ((Iterator)localObject2).hasNext(); i++)
        localObject1[i] = ((Long)((Iterator)localObject2).next()).longValue();
      paramMenuItem.putExtra("k_outside_expose_proof_item_list", (long[])localObject1);
      this.yJb.cgL.yTx.getContext().setResult(-1, paramMenuItem);
    }
    while (true)
    {
      paramMenuItem.putExtra("k_is_group_chat", this.yJb.cgL.dFx());
      this.yJb.cgL.yTx.dBP();
      AppMethodBeat.o(30620);
      return false;
      this.yJb.cgL.yTx.getContext().setResult(0, paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.o.1
 * JD-Core Version:    0.6.2
 */