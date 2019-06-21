package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$1
  implements AdapterView.OnItemClickListener
{
  DynamicGridView$1(DynamicGridView paramDynamicGridView)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(40343);
    if ((!this.rLT.lBk) && (this.rLT.isEnabled()) && (DynamicGridView.a(this.rLT) != null))
      DynamicGridView.a(this.rLT).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    AppMethodBeat.o(40343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.1
 * JD-Core Version:    0.6.2
 */