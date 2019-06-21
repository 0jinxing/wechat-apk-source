package com.tencent.mm.plugin.remittance.ui;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceBusiResultUI$3
  implements Runnable
{
  RemittanceBusiResultUI$3(RemittanceBusiResultUI paramRemittanceBusiResultUI, ImageView paramImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44871);
    ViewGroup localViewGroup = (ViewGroup)this.pSU.findViewById(2131826966);
    ViewGroup.LayoutParams localLayoutParams = this.pSV.getLayoutParams();
    localLayoutParams.width = localViewGroup.getWidth();
    localLayoutParams.height = localViewGroup.getHeight();
    this.pSV.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(44871);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.3
 * JD-Core Version:    0.6.2
 */