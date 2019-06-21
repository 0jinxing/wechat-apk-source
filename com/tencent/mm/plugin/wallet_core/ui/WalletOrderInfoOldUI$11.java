package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletOrderInfoOldUI$11
  implements View.OnLongClickListener
{
  WalletOrderInfoOldUI$11(WalletOrderInfoOldUI paramWalletOrderInfoOldUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(47484);
    if ((paramView.getId() == 2131828930) || (paramView.getId() == 2131828940));
    try
    {
      paramView = (String)paramView.getTag();
      Toast.makeText(this.tIW, 2131305039, 0).show();
      a.b(paramView, paramView);
      AppMethodBeat.o(47484);
      return true;
    }
    catch (Exception paramView)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletOrderInfoOldUI", paramView, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.11
 * JD-Core Version:    0.6.2
 */