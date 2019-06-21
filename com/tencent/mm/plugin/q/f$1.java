package com.tencent.mm.plugin.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.as;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements as
{
  f$1(f paramf, d paramd)
  {
  }

  public final void ZB()
  {
    AppMethodBeat.i(22903);
    ab.i("MicroMsg.MsgSynchronizeServer", "receive onNotifyUserStatusChange, needWaitExtLoginCallback[%b], isWebWXOnline:[%b]", new Object[] { Boolean.valueOf(this.oFL.oFJ), Boolean.valueOf(a.jP(g.RN().eIV)) });
    if ((this.oFL.oFJ) && (a.jP(g.RN().eIV)))
    {
      ab.i("MicroMsg.MsgSynchronizeServer", "onNotifyUserStatusChange need send msgSynchronize appMsg.");
      aw.ZK();
      c.b(this);
      this.oFL.oFJ = false;
      this.oFL.a(this.oFr, false);
    }
    AppMethodBeat.o(22903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.f.1
 * JD-Core Version:    0.6.2
 */