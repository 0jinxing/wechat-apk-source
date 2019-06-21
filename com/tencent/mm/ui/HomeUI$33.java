package com.tencent.mm.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class HomeUI$33
  implements Runnable
{
  HomeUI$33(HomeUI paramHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29381);
    ab.i("MicroMsg.LauncherUI.HomeUI", "contentView.post, padding: %s", new Object[] { Integer.valueOf(HomeUI.h(this.yjm).getPaddingTop()) });
    AppMethodBeat.o(29381);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.33
 * JD-Core Version:    0.6.2
 */