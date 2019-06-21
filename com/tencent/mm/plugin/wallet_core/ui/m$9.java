package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lt;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.e;
import java.lang.ref.WeakReference;

final class m$9
  implements View.OnClickListener
{
  m$9(ECardInfo paramECardInfo, Context paramContext, Dialog paramDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47400);
    ab.i("MicroMsg.WalletIdCardTip", "go to: %s", new Object[] { Integer.valueOf(this.tHP.tyo) });
    if (this.tHP.tyo == 1)
      e.n(this.val$context, this.tHP.cRf, false);
    while (true)
    {
      if ((this.qHc != null) && (this.qHc.isShowing()))
        this.qHc.dismiss();
      AppMethodBeat.o(47400);
      return;
      paramView = new lt();
      paramView.cHB.aIq = new WeakReference(this.val$context);
      a.xxA.m(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m.9
 * JD-Core Version:    0.6.2
 */