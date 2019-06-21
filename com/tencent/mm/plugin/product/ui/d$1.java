package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1
  implements AdapterView.OnItemClickListener
{
  d$1(AdapterView.OnItemClickListener paramOnItemClickListener, d.a parama)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44049);
    if (this.piA != null)
      this.piA.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    this.piB.piC = paramInt;
    this.piB.notifyDataSetChanged();
    AppMethodBeat.o(44049);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.d.1
 * JD-Core Version:    0.6.2
 */