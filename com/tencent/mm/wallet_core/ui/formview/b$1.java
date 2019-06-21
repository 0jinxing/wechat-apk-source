package com.tencent.mm.wallet_core.ui.formview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.picker.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$1
  implements View.OnClickListener
{
  int Aie = -1;
  int year = -1;

  b$1(MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49402);
    this.lvu.aqX();
    if ((this.lvu instanceof WalletBaseUI))
      ((WalletBaseUI)this.lvu).aoB();
    paramView = new a(this.lvu);
    paramView.al(true, false);
    paramView.zSj = new b.1.1(this, paramView);
    if ((this.year >= b.access$000()) && (this.Aie >= b.access$100()))
      paramView.aB(this.year, this.Aie + 1, 1);
    paramView.show();
    AppMethodBeat.o(49402);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.b.1
 * JD-Core Version:    0.6.2
 */