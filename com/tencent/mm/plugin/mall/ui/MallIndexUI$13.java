package com.tencent.mm.plugin.mall.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MallIndexUI$13
  implements Runnable
{
  MallIndexUI$13(MallIndexUI paramMallIndexUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43218);
    int i = a.ge(this.onu.mController.ylL);
    int j = a.fromDPToPix(this.onu.mController.ylL, 53);
    int[] arrayOfInt = new int[2];
    this.onu.omu.getLocationInWindow(arrayOfInt);
    int k = this.onu.omE.getBottom() + arrayOfInt[1] - i;
    int m = this.onu.omu.getHeight() - this.onu.omE.getHeight() + arrayOfInt[1];
    int n = m;
    if (k > 0)
      n = m + k;
    m = i - n - j;
    j = a.fromDPToPix(this.onu.mController.ylL, 33);
    ab.d("MicorMsg.MallIndexUI", "winHeight: %d, height: %d, footerHeight: %s, Y: %d, scrollDiff: %d, diff: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(n), Integer.valueOf(this.onu.omE.getHeight()), Integer.valueOf(arrayOfInt[1]), Integer.valueOf(k), Integer.valueOf(m) });
    if (m > j)
    {
      this.onu.omE.setPadding(0, m, 0, j);
      AppMethodBeat.o(43218);
    }
    while (true)
    {
      return;
      this.onu.omE.setPadding(0, j, 0, j);
      AppMethodBeat.o(43218);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.13
 * JD-Core Version:    0.6.2
 */