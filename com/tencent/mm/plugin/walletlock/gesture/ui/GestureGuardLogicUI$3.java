package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import java.util.List;

final class GestureGuardLogicUI$3
  implements w.a
{
  GestureGuardLogicUI$3(GestureGuardLogicUI paramGestureGuardLogicUI, List paramList)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(51588);
    if (paramInt2 == 0)
    {
      GestureGuardLogicUI.i(this.tVW);
      GestureGuardLogicUI.j(this.tVW);
      d.cTI();
      d.cTC();
      d.cTE();
      GestureGuardLogicUI.a(this.tVW, this.tVY);
      GestureGuardLogicUI.a(this.tVW, 1);
      GestureGuardLogicUI.h(this.tVW);
    }
    while (true)
    {
      AppMethodBeat.o(51588);
      return 0;
      if (paramInt2 == -3)
      {
        GestureGuardLogicUI.k(this.tVW);
        GestureGuardLogicUI.a(this.tVW, 2);
        GestureGuardLogicUI.h(this.tVW);
      }
      else
      {
        Toast.makeText(this.tVW, this.tVW.getString(2131300388), 0).show();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.3
 * JD-Core Version:    0.6.2
 */