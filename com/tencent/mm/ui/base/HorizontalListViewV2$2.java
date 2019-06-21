package com.tencent.mm.ui.base;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HorizontalListViewV2$2 extends DataSetObserver
{
  HorizontalListViewV2$2(HorizontalListViewV2 paramHorizontalListViewV2)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(106329);
    HorizontalListViewV2.b(this.ytj);
    HorizontalListViewV2.c(this.ytj);
    HorizontalListViewV2.d(this.ytj);
    this.ytj.invalidate();
    this.ytj.requestLayout();
    AppMethodBeat.o(106329);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(106330);
    HorizontalListViewV2.c(this.ytj);
    HorizontalListViewV2.d(this.ytj);
    HorizontalListViewV2.e(this.ytj);
    this.ytj.invalidate();
    this.ytj.requestLayout();
    AppMethodBeat.o(106330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListViewV2.2
 * JD-Core Version:    0.6.2
 */