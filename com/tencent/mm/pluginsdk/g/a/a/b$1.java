package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;

final class b$1
  implements Runnable
{
  b$1(b paramb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79467);
    s locals = q.a.diy().ajg(i.gN(this.nWD, this.nWE));
    if ((locals != null) && ((-1 == this.gSl) || (String.valueOf(this.gSl).equals(locals.field_fileVersion))))
      if (this.vdQ)
        break label79;
    label79: for (boolean bool = true; ; bool = false)
    {
      locals.field_needRetry = bool;
      q.a.diy().h(locals);
      AppMethodBeat.o(79467);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b.1
 * JD-Core Version:    0.6.2
 */