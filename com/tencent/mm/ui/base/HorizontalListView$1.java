package com.tencent.mm.ui.base;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HorizontalListView$1 extends DataSetObserver
{
  HorizontalListView$1(HorizontalListView paramHorizontalListView)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(106309);
    synchronized (this.ysO)
    {
      HorizontalListView.a(this.ysO);
      this.ysO.invalidate();
      this.ysO.requestLayout();
      AppMethodBeat.o(106309);
      return;
    }
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(106310);
    HorizontalListView.b(this.ysO);
    this.ysO.invalidate();
    this.ysO.requestLayout();
    AppMethodBeat.o(106310);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListView.1
 * JD-Core Version:    0.6.2
 */