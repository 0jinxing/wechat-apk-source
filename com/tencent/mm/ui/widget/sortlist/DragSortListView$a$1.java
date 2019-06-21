package com.tencent.mm.ui.widget.sortlist;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DragSortListView$a$1 extends DataSetObserver
{
  DragSortListView$a$1(DragSortListView.a parama, DragSortListView paramDragSortListView)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(113028);
    this.zVE.notifyDataSetChanged();
    AppMethodBeat.o(113028);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(113029);
    this.zVE.notifyDataSetInvalidated();
    AppMethodBeat.o(113029);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView.a.1
 * JD-Core Version:    0.6.2
 */