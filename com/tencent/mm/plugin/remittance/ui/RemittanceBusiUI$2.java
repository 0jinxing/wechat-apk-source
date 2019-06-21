package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class RemittanceBusiUI$2
  implements View.OnClickListener
{
  RemittanceBusiUI$2(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44894);
    h.pYm.e(15235, new Object[] { Integer.valueOf(3) });
    RemittanceBusiUI.z(this.pUd);
    AppMethodBeat.o(44894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.2
 * JD-Core Version:    0.6.2
 */