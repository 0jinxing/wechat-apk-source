package com.tencent.mm.plugin.fav.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

final class c$2
  implements View.OnClickListener
{
  c$2(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74677);
    ab.i("MicroMsg.FavHeaderView", "click retry item");
    paramView = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buX();
    if ((paramView == null) || (paramView.isEmpty()))
      AppMethodBeat.o(74677);
    while (true)
    {
      return;
      paramView = paramView.iterator();
      while (paramView.hasNext())
      {
        com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)paramView.next();
        if (!localg.bux())
          ab.w("MicroMsg.FavHeaderView", "item id is %d, status is not upload fail", new Object[] { Integer.valueOf(localg.field_id) });
        else
          b.l(localg);
      }
      c.c(this.mpQ).setVisibility(8);
      c.d(this.mpQ).setVisibility(8);
      AppMethodBeat.o(74677);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.c.2
 * JD-Core Version:    0.6.2
 */