package com.tencent.mm.plugin.remittance.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class RemittanceUI$4
  implements Runnable
{
  RemittanceUI$4(RemittanceUI paramRemittanceUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45163);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
    {
      e.a((TextView)this.pWU.findViewById(2131821634), this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
      AppMethodBeat.o(45163);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.RemittanceUI", "no bulletin data");
      AppMethodBeat.o(45163);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceUI.4
 * JD-Core Version:    0.6.2
 */