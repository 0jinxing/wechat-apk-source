package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;

final class GestureGuardLogicUI$26
  implements w.a
{
  GestureGuardLogicUI$26(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(51612);
    if (paramInt2 == 0)
      Toast.makeText(this.tVW, this.tVW.getString(2131300405), 0).show();
    while (true)
    {
      GestureGuardLogicUI.a(this.tVW, null);
      this.tVW.finish();
      AppMethodBeat.o(51612);
      return 0;
      Toast.makeText(this.tVW, this.tVW.getString(2131300387), 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.26
 * JD-Core Version:    0.6.2
 */