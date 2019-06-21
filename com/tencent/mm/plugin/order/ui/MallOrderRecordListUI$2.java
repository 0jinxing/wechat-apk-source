package com.tencent.mm.plugin.order.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import java.util.List;

final class MallOrderRecordListUI$2
  implements AdapterView.OnItemLongClickListener
{
  MallOrderRecordListUI$2(MallOrderRecordListUI paramMallOrderRecordListUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(43851);
    if (paramInt >= this.pee.pea.size())
      AppMethodBeat.o(43851);
    while (true)
    {
      return true;
      h.a(this.pee, this.pee.getResources().getString(2131305084), null, this.pee.getResources().getString(2131296881), new MallOrderRecordListUI.2.1(this, paramInt));
      AppMethodBeat.o(43851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.2
 * JD-Core Version:    0.6.2
 */