package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.p.a;

final class SnsTagPartlyUI$4
  implements p.a
{
  SnsTagPartlyUI$4(SnsTagPartlyUI paramSnsTagPartlyUI)
  {
  }

  public final void apt()
  {
    boolean bool = true;
    AppMethodBeat.i(39379);
    SnsTagPartlyUI localSnsTagPartlyUI = this.rxH;
    if (SnsTagPartlyUI.a(this.rxH).getCount() > 1);
    while (true)
    {
      localSnsTagPartlyUI.enableOptionMenu(bool);
      AppMethodBeat.o(39379);
      return;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.4
 * JD-Core Version:    0.6.2
 */