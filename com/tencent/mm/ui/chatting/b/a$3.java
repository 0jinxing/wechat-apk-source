package com.tencent.mm.ui.chatting.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.g;
import com.tencent.mm.ai.m;
import com.tencent.mm.choosemsgfile.compat.b.a;

final class a$3
  implements g
{
  a$3(a parama, b.a parama1)
  {
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(31162);
    if (this.yNQ != null)
      this.yNQ.bQ(paramInt1, paramInt2);
    if ((paramInt1 >= paramInt2) && (this.yNQ != null))
      this.yNQ.m(0, "");
    AppMethodBeat.o(31162);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.b.a.3
 * JD-Core Version:    0.6.2
 */