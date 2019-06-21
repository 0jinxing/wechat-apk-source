package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class ShakeSayHiListUI$10
  implements View.OnClickListener
{
  ShakeSayHiListUI$10(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24883);
    BackwardSupportUtil.c.a(ShakeSayHiListUI.d(this.qwt));
    AppMethodBeat.o(24883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.10
 * JD-Core Version:    0.6.2
 */