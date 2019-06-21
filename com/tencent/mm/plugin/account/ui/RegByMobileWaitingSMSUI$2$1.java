package com.tencent.mm.plugin.account.ui;

import android.os.Build.VERSION;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileWaitingSMSUI$2$1
  implements Runnable
{
  RegByMobileWaitingSMSUI$2$1(RegByMobileWaitingSMSUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125474);
    if (Build.VERSION.SDK_INT >= 8)
    {
      RegByMobileWaitingSMSUI.f(this.gHe.gHd).smoothScrollToPosition(RegByMobileWaitingSMSUI.e(this.gHe.gHd).getCount() - 1);
      AppMethodBeat.o(125474);
    }
    while (true)
    {
      return;
      RegByMobileWaitingSMSUI.f(this.gHe.gHd).setSelection(RegByMobileWaitingSMSUI.e(this.gHe.gHd).getCount() - 1);
      AppMethodBeat.o(125474);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileWaitingSMSUI.2.1
 * JD-Core Version:    0.6.2
 */