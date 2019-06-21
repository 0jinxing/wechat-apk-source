package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GridHeadersGridView$1 extends DataSetObserver
{
  GridHeadersGridView$1(GridHeadersGridView paramGridHeadersGridView)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(107360);
    GridHeadersGridView.a(this.zyQ);
    AppMethodBeat.o(107360);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(107361);
    GridHeadersGridView.a(this.zyQ);
    AppMethodBeat.o(107361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.1
 * JD-Core Version:    0.6.2
 */