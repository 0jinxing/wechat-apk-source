package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.bakoldlogic.c.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;

final class f$3
  implements com.tencent.mm.ai.f
{
  f$3(f paramf)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String arg3, m paramm)
  {
    AppMethodBeat.i(17864);
    paramm = (d)paramm;
    ab.i("MicroMsg.RecoverPCServer", "onSceneEnd %s, %d, %d", new Object[] { paramm.id, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    synchronized (this.jzZ.lock)
    {
      this.jzZ.jzr.remove(paramm.id);
      ab.i("MicroMsg.RecoverPCServer", "onSceneEnd left: size:%d", new Object[] { Integer.valueOf(this.jzZ.jzr.size()) });
      if (this.jzZ.jzr.size() <= 10)
        this.jzZ.lock.notifyAll();
      ??? = this.jzZ;
      ???.jzy += 1;
      if (this.jzZ.jzy % 300 == 0)
        this.jzZ.aUT();
      this.jzZ.aUS();
      AppMethodBeat.o(17864);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f.3
 * JD-Core Version:    0.6.2
 */