package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.b.a;

final class RemittanceDetailUI$13
  implements View.OnLongClickListener
{
  RemittanceDetailUI$13(RemittanceDetailUI paramRemittanceDetailUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(45011);
    ab.d("MicroMsg.RemittanceDetailUI", "onLongClick");
    if (RemittanceDetailUI.s(this.pVw) == null)
      RemittanceDetailUI.a(this.pVw, new a(this.pVw.mController.ylL));
    RemittanceDetailUI.s(this.pVw).a(paramView, this.pVw, RemittanceDetailUI.t(this.pVw), RemittanceDetailUI.u(this.pVw), RemittanceDetailUI.v(this.pVw));
    RemittanceDetailUI.c(this.pVw, paramView.getId());
    AppMethodBeat.o(45011);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.13
 * JD-Core Version:    0.6.2
 */