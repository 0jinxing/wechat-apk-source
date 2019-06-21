package com.tencent.mm.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MoreTabUI$10$1
  implements Runnable
{
  MoreTabUI$10$1(MoreTabUI.10 param10)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29703);
    MoreTabUI.p(this.yoJ.yoD);
    MoreTabUI.a(this.yoJ.yoD, 0);
    MoreTabUI.b(this.yoJ.yoD, MoreTabUI.m(this.yoJ.yoD));
    if (MoreTabUI.q(this.yoJ.yoD) != null)
      MoreTabUI.q(this.yoJ.yoD).setTranslationY(0.0F);
    AppMethodBeat.o(29703);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.10.1
 * JD-Core Version:    0.6.2
 */