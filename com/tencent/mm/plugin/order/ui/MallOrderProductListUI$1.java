package com.tencent.mm.plugin.order.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.c;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import java.util.List;

final class MallOrderProductListUI$1
  implements AdapterView.OnItemClickListener
{
  MallOrderProductListUI$1(MallOrderProductListUI paramMallOrderProductListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(43835);
    paramAdapterView = (ProductSectionItem)MallOrderProductListUI.a(this.pdS).get(paramInt);
    if (paramAdapterView != null)
    {
      MallOrderProductListUI.a(this.pdS, paramAdapterView);
      c.a(Boolean.FALSE, MallOrderProductListUI.b(this.pdS), MallOrderProductListUI.c(this.pdS), paramAdapterView.name, paramAdapterView.pdA);
    }
    AppMethodBeat.o(43835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderProductListUI.1
 * JD-Core Version:    0.6.2
 */