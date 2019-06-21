package com.tencent.mm.plugin.fav.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74676);
    if ((c.a(this.mpQ) == 1) || (c.a(this.mpQ) == 3))
    {
      ab.i("MicroMsg.FavHeaderView", "click clear fav item");
      if (c.b(this.mpQ) != null)
        c.b(this.mpQ).bvR();
    }
    AppMethodBeat.o(74676);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.c.1
 * JD-Core Version:    0.6.2
 */