package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;

final class GestureGuardLogicUI$23
  implements w.a
{
  GestureGuardLogicUI$23(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(51608);
    GestureGuardLogicUI.b(this.tVW);
    GestureGuardLogicUI.d(this.tVW);
    if (paramInt2 == 0)
    {
      Toast.makeText(this.tVW, this.tVW.getString(2131300406), 0).show();
      GestureGuardLogicUI.a(this.tVW, -1, 0, "open gesture ok");
    }
    while (true)
    {
      AppMethodBeat.o(51608);
      return 0;
      Toast.makeText(this.tVW, this.tVW.getString(2131300387), 0).show();
      GestureGuardLogicUI.a(this.tVW, -1, -1, "open gesture failed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.23
 * JD-Core Version:    0.6.2
 */