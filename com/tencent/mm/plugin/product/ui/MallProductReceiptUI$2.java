package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class MallProductReceiptUI$2
  implements AdapterView.OnItemClickListener
{
  MallProductReceiptUI$2(MallProductReceiptUI paramMallProductReceiptUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44091);
    paramAdapterView = MallProductReceiptUI.c(this.pjd);
    if ((paramAdapterView.phg != null) && (paramInt < paramAdapterView.phg.size()));
    for (paramAdapterView = (String)paramAdapterView.phg.get(paramInt); ; paramAdapterView = null)
    {
      ab.d("MicroMsg.MallProductReceiptUI", "onItemClick receipt = ".concat(String.valueOf(paramAdapterView)));
      if (!bo.isNullOrNil(paramAdapterView))
        MallProductReceiptUI.a(this.pjd).setText(paramAdapterView);
      AppMethodBeat.o(44091);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductReceiptUI.2
 * JD-Core Version:    0.6.2
 */