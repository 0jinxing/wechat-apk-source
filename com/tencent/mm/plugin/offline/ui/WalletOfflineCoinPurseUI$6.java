package com.tencent.mm.plugin.offline.ui;

import android.graphics.Point;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;

final class WalletOfflineCoinPurseUI$6
  implements Runnable
{
  WalletOfflineCoinPurseUI$6(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43509);
    ScrollView localScrollView = (ScrollView)this.pav.findViewById(2131828904);
    if (localScrollView == null)
    {
      AppMethodBeat.o(43509);
      return;
    }
    int[] arrayOfInt = new int[2];
    localScrollView.getLocationInWindow(arrayOfInt);
    int i = ae.hy(this.pav.mController.ylL).y;
    int j = i;
    if (ae.hw(this.pav.mController.ylL))
    {
      ab.d("MicroMsg.WalletOfflineCoinPurseUI", "has navi");
      j = i - ae.fr(this.pav.mController.ylL);
    }
    if (this.paw);
    for (i = arrayOfInt[1] + WalletOfflineCoinPurseUI.h(this.pav).getBottom(); ; i = 0)
    {
      if (this.pax)
        i = arrayOfInt[1] + WalletOfflineCoinPurseUI.i(this.pav).getBottom();
      if (this.pay)
        i = arrayOfInt[1] + WalletOfflineCoinPurseUI.j(this.pav).getBottom();
      if (this.paz)
        i = arrayOfInt[1] + WalletOfflineCoinPurseUI.k(this.pav).getBottom();
      if (this.paA)
        i = arrayOfInt[1] + WalletOfflineCoinPurseUI.l(this.pav).getBottom();
      ab.d("MicroMsg.WalletOfflineCoinPurseUI", "f2f: %s, screen: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      i -= j;
      if (i > 0)
        localScrollView.scrollBy(0, i);
      g.RP().Ry().set(ac.a.xTP, Boolean.TRUE);
      AppMethodBeat.o(43509);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.6
 * JD-Core Version:    0.6.2
 */