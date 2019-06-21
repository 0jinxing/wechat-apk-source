package com.tencent.mm.wallet_core.ui.formview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.ae;

final class a$4
  implements View.OnClickListener
{
  a$4(WalletFormView paramWalletFormView, MMActivity paramMMActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49359);
    this.AhR.getContext();
    int i = ae.dOe();
    this.AhR.getContext();
    int j = ae.dOf();
    b.a(this.lvu, i, j);
    AppMethodBeat.o(49359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.a.4
 * JD-Core Version:    0.6.2
 */