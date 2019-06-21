package com.tencent.mm.ui.base.sortview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseSortView$2
  implements AdapterView.OnItemClickListener
{
  BaseSortView$2(BaseSortView paramBaseSortView)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107305);
    if (BaseSortView.c(this.yDB) != null)
      BaseSortView.c(this.yDB).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    AppMethodBeat.o(107305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.BaseSortView.2
 * JD-Core Version:    0.6.2
 */