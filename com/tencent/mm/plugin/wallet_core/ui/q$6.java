package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.c.ad;

final class q$6
  implements View.OnClickListener
{
  q$6(q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(47592);
    if (this.tKq.tJX == 0)
      if (this.tKq.tKn == 0)
        q.b(this.tKq);
    while (true)
    {
      if (this.tKq.tJX == 1)
      {
        q.cRS();
        if (q.e(this.tKq))
          q.f(this.tKq);
      }
      AppMethodBeat.o(47592);
      return;
      q.c(this.tKq);
      continue;
      if (this.tKq.tJX == 1)
      {
        if (this.tKq.pGr == null)
          label102: if (this.tKq.pGr != null)
            break label148;
        label148: for (paramView = ""; ; paramView = this.tKq.pGr.czZ)
        {
          ad.e(i, paramView, 19, "");
          q.d(this.tKq);
          break;
          i = this.tKq.pGr.cIf;
          break label102;
        }
      }
      if (this.tKq.tJX == 2)
      {
        q.d(this.tKq);
        h.pYm.e(15817, new Object[] { Integer.valueOf(4) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.6
 * JD-Core Version:    0.6.2
 */