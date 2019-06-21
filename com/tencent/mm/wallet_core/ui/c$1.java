package com.tencent.mm.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49227);
    if (((paramView.getId() == 2131822257) || (paramView.getId() == 2131822263)) && (this.Ahp.gKG != null) && (this.Ahp.gKG.isShowing()))
      this.Ahp.gKG.dismiss();
    AppMethodBeat.o(49227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.c.1
 * JD-Core Version:    0.6.2
 */