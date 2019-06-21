package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.al;

final class d$1
  implements Runnable
{
  d$1(d paramd, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26754);
    d.b(this.uPv).a(this.fED, d.a(this.uPv));
    if ((d.c(this.uPv)) || (this.rcK != -50006))
      aw.RS().m(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(26753);
          d.b(d.1.this.uPv).b(d.d(d.1.this.uPv), d.a(d.1.this.uPv));
          AppMethodBeat.o(26753);
        }
      }
      , 80L);
    AppMethodBeat.o(26754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.d.1
 * JD-Core Version:    0.6.2
 */