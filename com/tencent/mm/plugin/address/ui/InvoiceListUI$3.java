package com.tencent.mm.plugin.address.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class InvoiceListUI$3
  implements AdapterView.OnItemLongClickListener
{
  InvoiceListUI$3(InvoiceListUI paramInvoiceListUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(16860);
    paramAdapterView = this.gKj.getResources().getStringArray(2131755021);
    h.a(this.gKj.mController.ylL, null, paramAdapterView, null, new InvoiceListUI.3.1(this, paramInt));
    AppMethodBeat.o(16860);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceListUI.3
 * JD-Core Version:    0.6.2
 */