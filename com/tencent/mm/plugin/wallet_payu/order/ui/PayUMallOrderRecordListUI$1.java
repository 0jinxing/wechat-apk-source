package com.tencent.mm.plugin.wallet_payu.order.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMLoadMoreListView;

final class PayUMallOrderRecordListUI$1
  implements Runnable
{
  PayUMallOrderRecordListUI$1(PayUMallOrderRecordListUI paramPayUMallOrderRecordListUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(48430);
    if (PayUMallOrderRecordListUI.a(this.tTP))
    {
      ab.v("MicroMsg.PayUMallOrderRecordListUI", "has more");
      if (!PayUMallOrderRecordListUI.b(this.tTP))
      {
        PayUMallOrderRecordListUI.c(this.tTP).dzN();
        PayUMallOrderRecordListUI.e(this.tTP).setAdapter(PayUMallOrderRecordListUI.d(this.tTP));
        PayUMallOrderRecordListUI.f(this.tTP);
      }
    }
    while (true)
    {
      PayUMallOrderRecordListUI.h(this.tTP).notifyDataSetChanged();
      AppMethodBeat.o(48430);
      return;
      ab.v("MicroMsg.PayUMallOrderRecordListUI", "no more! dismiss footer view!");
      PayUMallOrderRecordListUI.g(this.tTP).dzO();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI.1
 * JD-Core Version:    0.6.2
 */