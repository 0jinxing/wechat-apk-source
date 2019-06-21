package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.c.ad;

final class q$9
  implements View.OnClickListener
{
  q$9(q paramq, Context paramContext, Orders paramOrders)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47602);
    this.tKq.tJK.setVisibility(8);
    int i;
    if (this.tKq.pGr == null)
    {
      i = 0;
      if (this.tKq.pGr != null)
        break label102;
    }
    label102: for (paramView = ""; ; paramView = this.tKq.pGr.czZ)
    {
      ad.e(i, paramView, 12, "");
      l.a(this.val$context, this.tKv, this.tKq.toH.tzb, new q.9.1(this), null);
      AppMethodBeat.o(47602);
      return;
      i = this.tKq.pGr.cIf;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.9
 * JD-Core Version:    0.6.2
 */