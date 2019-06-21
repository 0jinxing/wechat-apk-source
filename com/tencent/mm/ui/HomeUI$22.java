package com.tencent.mm.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.b;

final class HomeUI$22
  implements Runnable
{
  HomeUI$22(HomeUI paramHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29368);
    String str = HomeUI.b(this.yjm).getString(2131305901, new Object[] { aa.dor() });
    if (!g.RP().Ry().getBoolean(ac.a.xVg, false))
    {
      ab.i("MicroMsg.LauncherUI.HomeUI", "needconfirm false");
      Bundle localBundle = new Bundle();
      localBundle.putString("close_dialog_msg", HomeUI.y(this.yjm));
      localBundle.putString("close_dialog_cancel", HomeUI.z(this.yjm));
      localBundle.putString("close_dialog_ok", HomeUI.A(this.yjm));
      localBundle.putBoolean("close_dialog_ok_close", false);
      HomeUI.a(this.yjm, str, 22723, localBundle);
    }
    while (true)
    {
      b.hN(HomeUI.b(this.yjm));
      AppMethodBeat.o(29368);
      return;
      HomeUI.a(this.yjm, str, 22723, HomeUI.b(this.yjm).getString(2131305903, new Object[] { aa.dor() }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.22
 * JD-Core Version:    0.6.2
 */