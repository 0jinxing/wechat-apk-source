package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallAcitivityUI$1
  implements View.OnClickListener
{
  IPCallAcitivityUI$1(IPCallAcitivityUI paramIPCallAcitivityUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21986);
    this.nAv.finish();
    AppMethodBeat.o(21986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI.1
 * JD-Core Version:    0.6.2
 */