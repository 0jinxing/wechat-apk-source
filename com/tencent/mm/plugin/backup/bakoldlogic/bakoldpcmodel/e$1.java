package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b.a;
import com.tencent.mm.plugin.backup.i.s;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1 extends b.a
{
  e$1(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17838);
    s locals = new s();
    if (this.jBa)
    {
      locals.jBP = this.dbSize;
      locals.jCn = (this.jBc - this.dbSize);
      locals.jCm = this.jBb;
      e locale = this.jzN;
      e.a(6, 0, locals);
      com.tencent.mm.plugin.backup.g.b.a(3, new e.2(locale));
      ab.i("MicroMsg.BakPcProcessMgr", "send restore info cmd");
      new com.tencent.mm.plugin.backup.bakoldlogic.c.b(2).aUc();
      AppMethodBeat.o(17838);
    }
    while (true)
    {
      return;
      if ((this.dbSize > this.jBc) && (this.jBc > 0L))
      {
        locals.jBP = this.dbSize;
        locals.jCn = (this.jBc - this.dbSize);
      }
      e.a(6, 14, locals);
      ab.e("MicroMsg.BakPcProcessMgr", "init TempDB error");
      AppMethodBeat.o(17838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.1
 * JD-Core Version:    0.6.2
 */