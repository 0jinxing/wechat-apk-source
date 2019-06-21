package com.tencent.mm.ui.base.sortview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseSortView$4
  implements AdapterView.OnItemSelectedListener
{
  BaseSortView$4(BaseSortView paramBaseSortView)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107307);
    if (BaseSortView.e(this.yDB) != null)
      BaseSortView.e(this.yDB).onItemSelected(paramAdapterView, paramView, paramInt, paramLong);
    AppMethodBeat.o(107307);
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    AppMethodBeat.i(107308);
    if (BaseSortView.e(this.yDB) != null)
      BaseSortView.e(this.yDB).onNothingSelected(paramAdapterView);
    AppMethodBeat.o(107308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.BaseSortView.4
 * JD-Core Version:    0.6.2
 */