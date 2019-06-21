package com.tencent.mm.plugin.order.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;

final class MallOrderRecordListUI$3
  implements MMLoadMoreListView.a
{
  MallOrderRecordListUI$3(MallOrderRecordListUI paramMallOrderRecordListUI)
  {
  }

  public final void KB()
  {
    AppMethodBeat.i(43852);
    if (!this.pee.isLoading)
    {
      this.pee.isLoading = true;
      MallOrderRecordListUI localMallOrderRecordListUI = this.pee;
      localMallOrderRecordListUI.Lp += 10;
      this.pee.bZh();
    }
    AppMethodBeat.o(43852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.3
 * JD-Core Version:    0.6.2
 */