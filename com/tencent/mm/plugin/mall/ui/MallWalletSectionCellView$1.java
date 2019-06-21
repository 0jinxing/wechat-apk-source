package com.tencent.mm.plugin.mall.ui;

import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MallWalletSectionCellView$1
  implements Runnable
{
  MallWalletSectionCellView$1(MallWalletSectionCellView paramMallWalletSectionCellView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43249);
    ab.d("MicroMsg.MallWalletSectionCellView", "x: %s, left: %s", new Object[] { Float.valueOf(this.onJ.onA.getX()), Integer.valueOf(this.onJ.onA.getLeft()) });
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 1);
    localLayoutParams.leftMargin = this.onJ.onA.getLeft();
    this.onJ.kiH.setLayoutParams(localLayoutParams);
    this.onJ.kiH.setVisibility(0);
    AppMethodBeat.o(43249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView.1
 * JD-Core Version:    0.6.2
 */