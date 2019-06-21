package com.tencent.mm.plugin.readerapp.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.j;

final class ReaderItemListView$a$1
  implements View.OnLongClickListener
{
  ReaderItemListView$a$1(ReaderItemListView.a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(76857);
    new j(this.pFF.pFE.getContext()).b(paramView, ReaderItemListView.c(this.pFF.pFE), ReaderItemListView.e(this.pFF.pFE));
    AppMethodBeat.o(76857);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderItemListView.a.1
 * JD-Core Version:    0.6.2
 */