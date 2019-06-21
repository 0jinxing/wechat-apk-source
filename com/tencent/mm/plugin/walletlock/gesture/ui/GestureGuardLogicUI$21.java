package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.report.service.h;

final class GestureGuardLogicUI$21
  implements w.a
{
  GestureGuardLogicUI$21(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(51606);
    if (paramInt2 == 0)
    {
      Toast.makeText(this.tVW, this.tVW.getString(2131300407), 0).show();
      h.pYm.e(11474, new Object[0]);
    }
    while (true)
    {
      GestureGuardLogicUI.b(this.tVW);
      GestureGuardLogicUI.d(this.tVW);
      this.tVW.finish();
      AppMethodBeat.o(51606);
      return 0;
      Toast.makeText(this.tVW, this.tVW.getString(2131300387), 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.21
 * JD-Core Version:    0.6.2
 */