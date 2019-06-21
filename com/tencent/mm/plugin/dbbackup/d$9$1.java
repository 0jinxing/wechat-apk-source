package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;

final class d$9$1
  implements b
{
  d$9$1(d.9 param9, boolean paramBoolean)
  {
  }

  public final void tL(int paramInt)
  {
    AppMethodBeat.i(18979);
    d.d(this.kJa.kIO, false);
    aw.ZK();
    z localz = c.Ry();
    d.c(this.kJa.kIO, System.currentTimeMillis());
    if (paramInt == 0)
    {
      localz.setLong(237569, d.l(this.kJa.kIO));
      if (this.kHS)
      {
        d.n(this.kJa.kIO);
        localz.setInt(237570, d.m(this.kJa.kIO));
      }
    }
    while (true)
    {
      localz.dsb();
      do
      {
        AppMethodBeat.o(18979);
        return;
        d.a(this.kJa.kIO, 0);
        break;
      }
      while (paramInt == 1);
      localz.setLong(237569, d.l(this.kJa.kIO));
      if (this.kHS)
      {
        d.a(this.kJa.kIO, 10);
        localz.setInt(237570, d.m(this.kJa.kIO));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.9.1
 * JD-Core Version:    0.6.2
 */