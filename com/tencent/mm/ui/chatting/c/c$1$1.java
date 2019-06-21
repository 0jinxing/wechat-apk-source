package com.tencent.mm.ui.chatting.c;

import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.d.a;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31194);
    if ((c.a(this.yOj.yOi) != null) && (c.a(this.yOj.yOi).getVisibility() != 8))
      c.a(this.yOj.yOi).setVisibility(8);
    if (this.yOj.yOi.cgL == null)
    {
      ab.e("MicroMsg.ChattingUI.BizComponent", "[onProcecssClick] mChattingContext is null!");
      AppMethodBeat.o(31194);
    }
    while (true)
    {
      return;
      ((r)this.yOj.yOi.cgL.aF(r.class)).dEm();
      this.yOj.yOi.cgL.aWv();
      AppMethodBeat.o(31194);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.1.1
 * JD-Core Version:    0.6.2
 */