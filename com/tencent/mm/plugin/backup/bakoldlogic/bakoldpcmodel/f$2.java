package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.i.ac;
import com.tencent.mm.plugin.backup.i.r;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class f$2
  implements com.tencent.mm.ai.f
{
  f$2(f paramf)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17863);
    paramString = (ac)((com.tencent.mm.plugin.backup.g.b)paramm).aTS();
    if (paramString.jBh != 2)
      AppMethodBeat.o(17863);
    while (true)
    {
      return;
      paramString = paramString.jCN;
      this.jzZ.jzT.addAll(paramString.jCl);
      this.jzZ.jzS.addAll(paramString.jCk);
      ab.i("MicroMsg.RecoverPCServer", "MediaSize:[%d / %d], digestSize: [%d / %d]", new Object[] { Integer.valueOf(this.jzZ.jzT.size()), Integer.valueOf(this.jzZ.jzS.size()), Integer.valueOf(paramString.jBX), Integer.valueOf(paramString.jBW) });
      if ((this.jzZ.jzT.size() < paramString.jBX) || (this.jzZ.jzS.size() < paramString.jBW))
      {
        ab.i("MicroMsg.RecoverPCServer", "send restore info cmd again~");
        new com.tencent.mm.plugin.backup.bakoldlogic.c.b(2).aUc();
        AppMethodBeat.o(17863);
      }
      else
      {
        this.jzZ.jzW = paramString.jBS;
        ab.i("MicroMsg.RecoverPCServer", "down RestoreInfo complete, convDataSize:%d", new Object[] { Long.valueOf(this.jzZ.jzW) });
        com.tencent.mm.plugin.backup.g.b.b(3, this);
        d.post(new f.2.1(this), "RecoverPCServer_recover_getIDList");
        AppMethodBeat.o(17863);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f.2
 * JD-Core Version:    0.6.2
 */