package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.os.SystemClock;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.walletlock.gesture.a.d;

final class GestureGuardLogicUI$24
  implements w.a
{
  GestureGuardLogicUI$24(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(51609);
    if (paramInt2 == 0)
    {
      d.lK(SystemClock.elapsedRealtime());
      Toast.makeText(this.tVW, this.tVW.getString(2131300407), 0).show();
      GestureGuardLogicUI.e(this.tVW);
    }
    while (true)
    {
      GestureGuardLogicUI.b(this.tVW);
      GestureGuardLogicUI.d(this.tVW);
      AppMethodBeat.o(51609);
      return 0;
      Toast.makeText(this.tVW, this.tVW.getString(2131300387), 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.24
 * JD-Core Version:    0.6.2
 */