package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.chatting.d.a;

final class t$3
  implements d.a
{
  t$3(t paramt)
  {
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(31477);
    a.dFz().removeCallbacks(t.d(this.yQA));
    a.dFz().postDelayed(t.a(this.yQA, new t.3.1(this, paramString)), 1000L);
    AppMethodBeat.o(31477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t.3
 * JD-Core Version:    0.6.2
 */