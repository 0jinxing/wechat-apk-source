package com.tencent.mm.plugin.address.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.address.e.e;
import com.tencent.mm.plugin.j.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class InvoiceListUI$2
  implements AdapterView.OnItemClickListener
{
  InvoiceListUI$2(InvoiceListUI paramInvoiceListUI)
  {
  }

  public final void onItemClick(AdapterView<?> arg1, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(16858);
    ab.d("MicroMsg.InvoiceListUI", "select pos ".concat(String.valueOf(paramInt)));
    synchronized (InvoiceListUI.b(this.gKj))
    {
      if (paramInt < InvoiceListUI.c(this.gKj).size())
      {
        InvoiceListUI.a(this.gKj, (b)InvoiceListUI.c(this.gKj).get(paramInt));
        if ((InvoiceListUI.d(this.gKj)) || (InvoiceListUI.e(this.gKj) == null))
          break label122;
        InvoiceListUI.a(this.gKj, InvoiceListUI.e(this.gKj).nuH);
      }
      label122: 
      while ((InvoiceListUI.e(this.gKj) == null) || (InvoiceListUI.e(this.gKj).nuH == 0))
      {
        InvoiceListUI.f(this.gKj).notifyDataSetChanged();
        AppMethodBeat.o(16858);
        return;
      }
      paramView = new android/content/Intent;
      paramView.<init>();
      paramView.putExtra("choose_invoice_title_info", e.a(InvoiceListUI.e(this.gKj)));
      this.gKj.setResult(-1, paramView);
      this.gKj.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceListUI.2
 * JD-Core Version:    0.6.2
 */