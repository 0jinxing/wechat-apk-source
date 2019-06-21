package com.tencent.mm.plugin.clean.ui.newui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;

final class CleanMsgUI$6
  implements h.d
{
  CleanMsgUI$6(CleanMsgUI paramCleanMsgUI)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18893);
    switch (paramInt2)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(18893);
      while (true)
      {
        return;
        long l = CleanMsgUI.bgm();
        if (l <= 0L)
          break;
        h.d(this.kyS, this.kyS.getString(2131298320, new Object[] { bo.ga(l) }), "", this.kyS.getString(2131298862), this.kyS.getString(2131297773), new CleanMsgUI.6.1(this), null);
        AppMethodBeat.o(18893);
      }
      Toast.makeText(this.kyS, 2131301734, 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanMsgUI.6
 * JD-Core Version:    0.6.2
 */