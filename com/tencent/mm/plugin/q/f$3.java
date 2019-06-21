package com.tencent.mm.plugin.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class f$3
  implements com.tencent.mm.ai.f
{
  f$3(f paramf, d paramd)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22905);
    aw.Rg().b(222, this);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize appmsg.  errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      this.oFL.cancel();
      if (this.oFr.action.equals(b.oFb))
        h.pYm.a(466L, 3L, 1L, false);
      while (true)
      {
        b.a(0L, 0L, 0L, 0L, 2, this.oFL.cFu, this.oFr.action);
        AppMethodBeat.o(22905);
        return;
        if (this.oFr.action.equals(b.oFc))
          h.pYm.a(466L, 18L, 1L, false);
        else if (this.oFr.action.equals(b.oFd))
          h.pYm.a(466L, 34L, 1L, false);
      }
    }
    ab.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize success. ");
    e.N(g.bQY(), true);
    e.N(g.bQZ(), true);
    this.oFL.oFK = false;
    long l = bo.gb(this.oFL.oFI);
    if (this.oFr.action.equals(b.oFb))
    {
      h.pYm.a(466L, 1L, 1L, false);
      h.pYm.a(466L, 5L, this.oFr.oFx, false);
      h.pYm.a(466L, 7L, l, false);
      h.pYm.a(466L, 11L, this.oFr.oFw, false);
      h.pYm.a(466L, 12L, this.oFr.oFv, false);
    }
    while (true)
    {
      b.a(this.oFr.oFx, l, this.oFr.oFw, this.oFr.oFv, 0, this.oFL.cFu, this.oFr.action);
      AppMethodBeat.o(22905);
      break;
      if (this.oFr.action.equals(b.oFc))
      {
        h.pYm.a(466L, 16L, 1L, false);
        h.pYm.a(466L, 20L, this.oFr.oFx, false);
        h.pYm.a(466L, 22L, l, false);
        h.pYm.a(466L, 26L, this.oFr.oFw, false);
        h.pYm.a(466L, 27L, this.oFr.oFv, false);
      }
      else if (this.oFr.action.equals(b.oFd))
      {
        h.pYm.a(466L, 32L, 1L, false);
        h.pYm.a(466L, 36L, this.oFr.oFx, false);
        h.pYm.a(466L, 38L, l, false);
        h.pYm.a(466L, 42L, this.oFr.oFw, false);
        h.pYm.a(466L, 43L, this.oFr.oFv, false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.f.3
 * JD-Core Version:    0.6.2
 */