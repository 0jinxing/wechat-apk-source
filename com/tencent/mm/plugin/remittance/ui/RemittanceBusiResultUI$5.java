package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceBusiResultUI$5
  implements View.OnClickListener
{
  RemittanceBusiResultUI$5(RemittanceBusiResultUI paramRemittanceBusiResultUI, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(44873);
    if (RemittanceBusiResultUI.b(this.pSU))
    {
      this.pSX.setVisibility(8);
      RemittanceBusiResultUI.c(this.pSU).setVisibility(0);
      RemittanceBusiResultUI.a(this.pSU, RemittanceBusiResultUI.d(this.pSU));
    }
    while (true)
    {
      paramView = this.pSU;
      if (!RemittanceBusiResultUI.b(this.pSU))
        bool = true;
      RemittanceBusiResultUI.a(paramView, bool);
      AppMethodBeat.o(44873);
      return;
      this.pSX.setVisibility(0);
      RemittanceBusiResultUI.c(this.pSU).setVisibility(8);
      RemittanceBusiResultUI.a(this.pSU, this.pSX);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.5
 * JD-Core Version:    0.6.2
 */