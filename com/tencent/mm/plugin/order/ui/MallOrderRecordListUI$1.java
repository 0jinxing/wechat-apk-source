package com.tencent.mm.plugin.order.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.e;

final class MallOrderRecordListUI$1
  implements AdapterView.OnItemClickListener
{
  MallOrderRecordListUI$1(MallOrderRecordListUI paramMallOrderRecordListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(43849);
    this.pee.AH(paramInt);
    e.QS(26);
    AppMethodBeat.o(43849);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.1
 * JD-Core Version:    0.6.2
 */