package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.c;

final class MallProductSubmitUI$8
  implements AdapterView.OnItemClickListener
{
  MallProductSubmitUI$8(MallProductSubmitUI paramMallProductSubmitUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44146);
    this.pjU.dismissDialog(1);
    MallProductSubmitUI.b(this.pjU).AL(paramInt);
    MallProductSubmitUI.a(this.pjU);
    AppMethodBeat.o(44146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSubmitUI.8
 * JD-Core Version:    0.6.2
 */