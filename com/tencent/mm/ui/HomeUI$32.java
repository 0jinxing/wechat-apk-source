package com.tencent.mm.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class HomeUI$32
  implements Runnable
{
  HomeUI$32(HomeUI paramHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29379);
    ab.d("MicroMsg.LauncherUI.HomeUI", "onMainTabCreate, send refresh broadcast");
    HomeUI.b(this.yjm).sendBroadcast(new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_REFRESH_WXAPP"));
    AppMethodBeat.o(29379);
  }

  public final String toString()
  {
    AppMethodBeat.i(29380);
    String str = super.toString() + "|sendBroadcast";
    AppMethodBeat.o(29380);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.32
 * JD-Core Version:    0.6.2
 */