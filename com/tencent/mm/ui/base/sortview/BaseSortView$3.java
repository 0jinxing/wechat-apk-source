package com.tencent.mm.ui.base.sortview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseSortView$3
  implements AdapterView.OnItemLongClickListener
{
  BaseSortView$3(BaseSortView paramBaseSortView)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107306);
    boolean bool;
    if (BaseSortView.d(this.yDB) != null)
    {
      bool = BaseSortView.d(this.yDB).onItemLongClick(paramAdapterView, paramView, paramInt, paramLong);
      AppMethodBeat.o(107306);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107306);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.BaseSortView.3
 * JD-Core Version:    0.6.2
 */