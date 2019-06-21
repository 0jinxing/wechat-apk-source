package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMLoadMoreListView;

final class c$16
  implements View.OnClickListener
{
  c$16(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113612);
    if (!c.q(this.nQa))
      c.u(this.nQa);
    c.v(this.nQa).clean();
    c.w(this.nQa).setAdapter(c.v(this.nQa));
    c.v(this.nQa).notifyDataSetChanged();
    c.x(this.nQa).setVisibility(8);
    AppMethodBeat.o(113612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.16
 * JD-Core Version:    0.6.2
 */