package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import java.util.HashMap;

final class q$2
  implements View.OnClickListener
{
  q$2(PayInfo paramPayInfo, View.OnClickListener paramOnClickListener, q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47588);
    q.cRT().put(this.oZr.czZ, Boolean.TRUE);
    this.tKr.onClick(paramView);
    if (this.tKs.tKf)
      h.pYm.e(14530, new Object[] { Integer.valueOf(2) });
    AppMethodBeat.o(47588);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.2
 * JD-Core Version:    0.6.2
 */