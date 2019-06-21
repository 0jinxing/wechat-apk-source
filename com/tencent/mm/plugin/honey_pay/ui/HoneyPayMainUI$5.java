package com.tencent.mm.plugin.honey_pay.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class HoneyPayMainUI$5
  implements Runnable
{
  HoneyPayMainUI$5(HoneyPayMainUI paramHoneyPayMainUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41885);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
    {
      ab.i(this.nsB.TAG, "show notice banner");
      e.a((TextView)this.nsB.findViewById(2131821634), this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
    }
    AppMethodBeat.o(41885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.5
 * JD-Core Version:    0.6.2
 */