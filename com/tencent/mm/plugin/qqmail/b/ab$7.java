package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import java.util.ArrayList;
import java.util.HashMap;

final class ab$7
  implements com.tencent.mm.ai.g
{
  ab$7(ab paramab)
  {
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(68043);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "currentSendFile: %s, offset: %d, totalLen: %d, filesInfo.size: %d", new Object[] { this.pvy.pvr, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.pvy.pvq.size()) });
    if (paramInt1 >= paramInt2)
    {
      this.pvy.pvt.put(this.pvy.pvs, ((u)paramm).ccv().ptE);
      paramm = ((u)paramm).ccv();
      if (this.pvy.pvv != null)
        this.pvy.pvv.e(this.pvy.pvw - this.pvy.pvq.size(), this.pvy.pvw, this.pvy.pvs, paramm.ptE);
      if (this.pvy.pvq.isEmpty())
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "finished send all files");
        if (this.pvy.pvu != null)
          this.pvy.pvu.ccz();
        AppMethodBeat.o(68043);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareModeMailAppService", "finished send one file, continue to send another one");
      paramm = (ab.g)this.pvy.pvq.remove(0);
      this.pvy.pvr = paramm.fileId;
      this.pvy.pvs = paramm.fileName;
      paramm = new u(this.pvy.pvs, this.pvy.pvr, this);
      com.tencent.mm.kernel.g.RO().eJo.a(paramm, 0);
      AppMethodBeat.o(68043);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ab.7
 * JD-Core Version:    0.6.2
 */