package com.tencent.mm.ui.base.sortview;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseSortView$1 extends DataSetObserver
{
  BaseSortView$1(BaseSortView paramBaseSortView)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(107304);
    if (BaseSortView.a(this.yDB) != null)
      BaseSortView.a(this.yDB).aW(BaseSortView.b(this.yDB).yDx);
    AppMethodBeat.o(107304);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.BaseSortView.1
 * JD-Core Version:    0.6.2
 */