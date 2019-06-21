package com.tencent.mm.plugin.remittance.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.d;
import com.tencent.mm.plugin.remittance.model.g;
import com.tencent.mm.protocal.protobuf.lr;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;

final class RemittanceBusiUI$5
  implements d
{
  RemittanceBusiUI$5(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, g paramg)
  {
    AppMethodBeat.i(44897);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramg.pOL.kdT == 0)
        break label79;
      t.makeText(this.pUd.mController.ylL, paramg.pOL.kdU, 0).show();
      AppMethodBeat.o(44897);
    }
    while (true)
    {
      return;
      t.makeText(this.pUd.mController.ylL, this.pUd.getString(2131304763), 0).show();
      label79: AppMethodBeat.o(44897);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.5
 * JD-Core Version:    0.6.2
 */