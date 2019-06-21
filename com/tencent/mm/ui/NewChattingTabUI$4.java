package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.platformtools.ah;

final class NewChattingTabUI$4
  implements Runnable
{
  NewChattingTabUI$4(NewChattingTabUI paramNewChattingTabUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29796);
    d.b(this.yjx, "ChattingUI" + NewChattingTabUI.h(this.ypr), hashCode());
    if (this.yjx == 4)
      d.h("ChattingUI" + NewChattingTabUI.h(this.ypr), NewChattingTabUI.i(this.ypr), ah.anT());
    AppMethodBeat.o(29796);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.4
 * JD-Core Version:    0.6.2
 */