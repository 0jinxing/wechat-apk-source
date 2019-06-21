package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.b.a;

final class RemittanceResultNewUI$5
  implements View.OnLongClickListener
{
  RemittanceResultNewUI$5(RemittanceResultNewUI paramRemittanceResultNewUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(45119);
    ab.d("MicroMsg.RemittanceResultNewUI", "onLongClick");
    if (RemittanceResultNewUI.f(this.pWO) == null)
      RemittanceResultNewUI.a(this.pWO, new a(this.pWO.mController.ylL));
    RemittanceResultNewUI.f(this.pWO).a(paramView, this.pWO, RemittanceResultNewUI.g(this.pWO), RemittanceResultNewUI.h(this.pWO), RemittanceResultNewUI.i(this.pWO));
    RemittanceResultNewUI.c(this.pWO, paramView.getId());
    AppMethodBeat.o(45119);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.5
 * JD-Core Version:    0.6.2
 */