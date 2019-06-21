package com.tencent.mm.plugin.order.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class MallOrderRecordListUI$4
  implements Runnable
{
  MallOrderRecordListUI$4(MallOrderRecordListUI paramMallOrderRecordListUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43853);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
    {
      e.a((TextView)this.pee.findViewById(2131821634), this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
      AppMethodBeat.o(43853);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletOrderListUI", "no bulletin data");
      AppMethodBeat.o(43853);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.4
 * JD-Core Version:    0.6.2
 */