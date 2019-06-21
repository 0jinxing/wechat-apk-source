package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.o;

final class q$b$2
  implements ap.a
{
  q$b$2(q.b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(30697);
    if ((q.b.d(this.yJH) != null) && (q.b.e(this.yJH) != null))
      q.b.e(this.yJH).showAsDropDown(q.b.d(this.yJH), q.b.f(this.yJH), q.b.g(this.yJH));
    AppMethodBeat.o(30697);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.q.b.2
 * JD-Core Version:    0.6.2
 */