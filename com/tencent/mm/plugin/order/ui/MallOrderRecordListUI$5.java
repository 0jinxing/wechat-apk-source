package com.tencent.mm.plugin.order.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMLoadMoreListView;

final class MallOrderRecordListUI$5
  implements Runnable
{
  MallOrderRecordListUI$5(MallOrderRecordListUI paramMallOrderRecordListUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43854);
    if (this.pee.ocG)
    {
      ab.v("MicroMsg.WalletOrderListUI", "has more");
      if (!this.pee.pec)
      {
        this.pee.emT.dzN();
        this.pee.emT.setAdapter(this.pee.pdZ);
        this.pee.pec = true;
      }
    }
    while (true)
    {
      this.pee.pdZ.notifyDataSetChanged();
      AppMethodBeat.o(43854);
      return;
      ab.v("MicroMsg.WalletOrderListUI", "no more! dismiss footer view!");
      this.pee.emT.dzO();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.5
 * JD-Core Version:    0.6.2
 */