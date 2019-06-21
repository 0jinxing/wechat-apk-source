package com.tencent.mm.plugin.clean.ui.newui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CleanNewUI$3
  implements View.OnClickListener
{
  CleanNewUI$3(CleanNewUI paramCleanNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18913);
    ab.i("MicroMsg.CleanNewUI", "clean wechat cache");
    AppMethodBeat.o(18913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanNewUI.3
 * JD-Core Version:    0.6.2
 */