package com.tencent.mm.plugin.clean.ui.newui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.c;

final class b$2
  implements GridHeadersGridView.c
{
  b$2(b paramb)
  {
  }

  public final void de(View paramView)
  {
    AppMethodBeat.i(18848);
    paramView = (b.a)paramView.getTag();
    b.a(this.kyI, paramView);
    this.kyI.notifyDataSetChanged();
    AppMethodBeat.o(18848);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.b.2
 * JD-Core Version:    0.6.2
 */