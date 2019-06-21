package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;

final class Sort3rdAppUI$2
  implements DragSortListView.h
{
  Sort3rdAppUI$2(Sort3rdAppUI paramSort3rdAppUI)
  {
  }

  public final void dm(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29898);
    f localf = (f)Sort3rdAppUI.a(this.yqp).getItem(paramInt1);
    Sort3rdAppUI.a(this.yqp).remove(localf);
    Sort3rdAppUI.a(this.yqp).insert(localf, paramInt2);
    AppMethodBeat.o(29898);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.Sort3rdAppUI.2
 * JD-Core Version:    0.6.2
 */