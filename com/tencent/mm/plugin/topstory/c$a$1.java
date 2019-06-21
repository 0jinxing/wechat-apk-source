package com.tencent.mm.plugin.topstory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.w;
import com.tencent.mm.protocal.protobuf.bsj;

final class c$a$1
  implements Runnable
{
  c$a$1(c.a parama, bsj parambsj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(65493);
    w localw = new w(this.sAA);
    g.Rg().a(localw, 0);
    AppMethodBeat.o(65493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.c.a.1
 * JD-Core Version:    0.6.2
 */