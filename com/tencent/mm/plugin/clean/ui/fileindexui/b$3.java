package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.c;

final class b$3
  implements GridHeadersGridView.c
{
  b$3(b paramb)
  {
  }

  public final void de(View paramView)
  {
    AppMethodBeat.i(18748);
    paramView = (b.a)paramView.getTag();
    b.a(this.kxq, paramView);
    this.kxq.notifyDataSetChanged();
    AppMethodBeat.o(18748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.b.3
 * JD-Core Version:    0.6.2
 */