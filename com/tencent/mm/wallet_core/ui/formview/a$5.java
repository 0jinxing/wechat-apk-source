package com.tencent.mm.wallet_core.ui.formview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.ae;

final class a$5
  implements View.OnClickListener
{
  a$5(WalletFormView paramWalletFormView, MMActivity paramMMActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49360);
    this.AhR.getContext();
    int i = ae.dOg();
    b.a(this.lvu, i, 2131298821);
    AppMethodBeat.o(49360);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.a.5
 * JD-Core Version:    0.6.2
 */