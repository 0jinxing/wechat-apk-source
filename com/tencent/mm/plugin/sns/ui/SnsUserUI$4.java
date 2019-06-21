package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.statusbar.c.a;
import com.tencent.mm.ui.statusbar.d;

final class SnsUserUI$4
  implements c.a
{
  SnsUserUI$4(SnsUserUI paramSnsUserUI)
  {
  }

  public final void pO(int paramInt)
  {
    AppMethodBeat.i(39788);
    SnsUserUI.n(this.rDa).setPadding(0, paramInt, 0, 0);
    d.a(this.rDa.getWindow());
    AppMethodBeat.o(39788);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.4
 * JD-Core Version:    0.6.2
 */