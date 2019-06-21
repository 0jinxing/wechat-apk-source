package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceBusiResultUI$2
  implements View.OnClickListener
{
  RemittanceBusiResultUI$2(RemittanceBusiResultUI paramRemittanceBusiResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44870);
    this.pSU.finish();
    AppMethodBeat.o(44870);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.2
 * JD-Core Version:    0.6.2
 */