package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.picker.b;
import java.util.ArrayList;
import java.util.List;

final class WalletCardElementUI$12
  implements View.OnClickListener
{
  WalletCardElementUI$12(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47227);
    paramView = new ArrayList();
    paramView.add(this.tGf.getString(2131304780));
    paramView.add(this.tGf.getString(2131304760));
    ElementQuery localElementQuery;
    if (WalletCardElementUI.d(this.tGf).size() == 1)
    {
      localElementQuery = (ElementQuery)WalletCardElementUI.d(this.tGf).get(0);
      if (!localElementQuery.cPr())
        break label160;
      paramView.remove(1);
    }
    while (true)
    {
      paramView = new b(this.tGf.mController.ylL, paramView);
      paramView.Qq(WalletCardElementUI.e(this.tGf));
      paramView.zSq = new WalletCardElementUI.12.1(this, paramView);
      paramView.Qp(a.fromDPToPix(this.tGf.mController.ylL, 288));
      paramView.show();
      AppMethodBeat.o(47227);
      return;
      label160: if (localElementQuery.cPe())
        paramView.remove(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.12
 * JD-Core Version:    0.6.2
 */